package typingsSlinky.googleapis.computeV1Mod.computeV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaProjectsEnableXpnResourceRequest extends js.Object {
  /**
    * Service resource (a.k.a service project) ID.
    */
  var xpnResource: js.UndefOr[SchemaXpnResourceId] = js.native
}

object SchemaProjectsEnableXpnResourceRequest {
  @scala.inline
  def apply(): SchemaProjectsEnableXpnResourceRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaProjectsEnableXpnResourceRequest]
  }
  @scala.inline
  implicit class SchemaProjectsEnableXpnResourceRequestOps[Self <: SchemaProjectsEnableXpnResourceRequest] (val x: Self) extends AnyVal {
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

