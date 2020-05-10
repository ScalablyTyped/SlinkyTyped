package typingsSlinky.googleapis.computeV1Mod.computeV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaUrlMapReference extends js.Object {
  var urlMap: js.UndefOr[String] = js.native
}

object SchemaUrlMapReference {
  @scala.inline
  def apply(): SchemaUrlMapReference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUrlMapReference]
  }
  @scala.inline
  implicit class SchemaUrlMapReferenceOps[Self <: SchemaUrlMapReference] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUrlMap(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("urlMap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrlMap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("urlMap")(js.undefined)
        ret
    }
  }
  
}

