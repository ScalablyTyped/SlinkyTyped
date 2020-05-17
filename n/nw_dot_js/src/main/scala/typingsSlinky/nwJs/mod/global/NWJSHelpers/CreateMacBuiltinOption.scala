package typingsSlinky.nwJs.mod.global.NWJSHelpers

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options to modify default `edit` and `window` MenuItems in Mac.
  */
@js.native
trait CreateMacBuiltinOption extends js.Object {
  /**
    * {Boolean} (Optional) do not populate the Edit menu
    */
  var hideEdit: js.UndefOr[Boolean] = js.native
  /**
    * {Boolean} (Optional) do not populate the Window menu
    */
  var hideWindow: js.UndefOr[Boolean] = js.native
}

object CreateMacBuiltinOption {
  @scala.inline
  def apply(): CreateMacBuiltinOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateMacBuiltinOption]
  }
  @scala.inline
  implicit class CreateMacBuiltinOptionOps[Self <: CreateMacBuiltinOption] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHideEdit(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideEdit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHideEdit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideEdit")(js.undefined)
        ret
    }
    @scala.inline
    def withHideWindow(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideWindow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHideWindow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideWindow")(js.undefined)
        ret
    }
  }
  
}

