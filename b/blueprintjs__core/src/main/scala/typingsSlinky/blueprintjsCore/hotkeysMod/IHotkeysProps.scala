package typingsSlinky.blueprintjsCore.hotkeysMod

import typingsSlinky.blueprintjsCore.propsMod.IProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IHotkeysProps extends IProps {
  /**
    * In order to make local hotkeys work on elements that are not normally
    * focusable, such as `<div>`s or `<span>`s, we add a `tabIndex` attribute
    * to the hotkey target, which makes it focusable. By default, we use `0`,
    * but you can override this value to change the tab navigation behavior
    * of the component. You may even set this value to `null`, which will omit
    * the `tabIndex` from the component decorated by `HotkeysTarget`.
    */
  var tabIndex: js.UndefOr[Double] = js.native
}

object IHotkeysProps {
  @scala.inline
  def apply(): IHotkeysProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IHotkeysProps]
  }
  @scala.inline
  implicit class IHotkeysPropsOps[Self <: IHotkeysProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTabIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTabIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabIndex")(js.undefined)
        ret
    }
  }
  
}

