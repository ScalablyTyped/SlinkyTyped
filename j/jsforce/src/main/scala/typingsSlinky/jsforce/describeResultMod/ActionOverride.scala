package typingsSlinky.jsforce.describeResultMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActionOverride extends js.Object {
  var formFactor: String = js.native
  var isAvailableInTouch: Boolean = js.native
  var name: String = js.native
  var pageId: String = js.native
  var url: js.UndefOr[maybe[String]] = js.native
}

object ActionOverride {
  @scala.inline
  def apply(formFactor: String, isAvailableInTouch: Boolean, name: String, pageId: String): ActionOverride = {
    val __obj = js.Dynamic.literal(formFactor = formFactor.asInstanceOf[js.Any], isAvailableInTouch = isAvailableInTouch.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], pageId = pageId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionOverride]
  }
  @scala.inline
  implicit class ActionOverrideOps[Self <: ActionOverride] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFormFactor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formFactor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsAvailableInTouch(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isAvailableInTouch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPageId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrl(value: maybe[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(js.undefined)
        ret
    }
    @scala.inline
    def withUrlNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(null)
        ret
    }
  }
  
}

