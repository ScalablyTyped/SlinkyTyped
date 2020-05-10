package typingsSlinky.nwJs.mod._Global_.NWJSHelpers

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WindowOpenOption extends WindowOption {
  /**
    * (Optional) The script to be injected before document unloaded.
    */
  var inject_js_end: js.UndefOr[String] = js.native
  /**
    * (Optional) The script to be injected before document loaded.
    */
  var inject_js_start: js.UndefOr[String] = js.native
  /**
    * (Optional) Whether to open a new window in a separate render process.
    */
  var new_instance: js.UndefOr[Boolean] = js.native
}

object WindowOpenOption {
  @scala.inline
  def apply(): WindowOpenOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WindowOpenOption]
  }
  @scala.inline
  implicit class WindowOpenOptionOps[Self <: WindowOpenOption] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInject_js_end(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inject_js_end")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInject_js_end: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inject_js_end")(js.undefined)
        ret
    }
    @scala.inline
    def withInject_js_start(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inject_js_start")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInject_js_start: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inject_js_start")(js.undefined)
        ret
    }
    @scala.inline
    def withNew_instance(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("new_instance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNew_instance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("new_instance")(js.undefined)
        ret
    }
  }
  
}

