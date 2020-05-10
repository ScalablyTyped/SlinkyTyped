package typingsSlinky.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaProjectsDisableXpnResourceRequest extends js.Object {
  /**
    * Service resource (a.k.a service project) ID.
    */
  var xpnResource: js.UndefOr[SchemaXpnResourceId] = js.native
}

object SchemaProjectsDisableXpnResourceRequest {
  @scala.inline
  def apply(): SchemaProjectsDisableXpnResourceRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaProjectsDisableXpnResourceRequest]
  }
  @scala.inline
  implicit class SchemaProjectsDisableXpnResourceRequestOps[Self <: SchemaProjectsDisableXpnResourceRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withXpnResource(value: SchemaXpnResourceId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xpnResource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXpnResource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xpnResource")(js.undefined)
        ret
    }
  }
  
}

