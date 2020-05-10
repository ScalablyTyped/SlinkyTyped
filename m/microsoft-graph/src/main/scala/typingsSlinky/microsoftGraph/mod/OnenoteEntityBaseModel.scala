package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnenoteEntityBaseModel extends Entity {
  // The endpoint where you can get details about the page. Read-only.
  var self: js.UndefOr[String] = js.native
}

object OnenoteEntityBaseModel {
  @scala.inline
  def apply(): OnenoteEntityBaseModel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OnenoteEntityBaseModel]
  }
  @scala.inline
  implicit class OnenoteEntityBaseModelOps[Self <: OnenoteEntityBaseModel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSelf(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("self")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelf: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("self")(js.undefined)
        ret
    }
  }
  
}

