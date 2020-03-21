package typingsSlinky.blueprintjsCore

import slinky.core.TagMod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined @blueprintjs/core.@blueprintjs/core/lib/esm/components/hotkeys/hotkeys.IHotkeysProps & {  children  :react.react.ReactNode} */
trait IHotkeysPropschildrenReac extends js.Object {
  var children: TagMod[Any]
  /** A space-delimited list of class names to pass along to a child element. */
  var className: js.UndefOr[String] = js.undefined
  /**
    * In order to make local hotkeys work on elements that are not normally
    * focusable, such as `<div>`s or `<span>`s, we add a `tabIndex` attribute
    * to the hotkey target, which makes it focusable. By default, we use `0`,
    * but you can override this value to change the tab navigation behavior
    * of the component. You may even set this value to `null`, which will omit
    * the `tabIndex` from the component decorated by `HotkeysTarget`.
    */
  var tabIndex: js.UndefOr[Double] = js.undefined
}

object IHotkeysPropschildrenReac {
  @scala.inline
  def apply(children: TagMod[Any], className: String = null, tabIndex: Int | Double = null): IHotkeysPropschildrenReac = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[IHotkeysPropschildrenReac]
  }
}

