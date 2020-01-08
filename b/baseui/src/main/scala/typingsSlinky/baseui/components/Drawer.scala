package typingsSlinky.baseui.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.SyntheticKeyboardEvent
import slinky.web.SyntheticMouseEvent
import slinky.web.html.`*`.tag
import typingsSlinky.baseui.Anon_Backdrop
import typingsSlinky.baseui.baseuiStrings.auto
import typingsSlinky.baseui.baseuiStrings.bottom
import typingsSlinky.baseui.baseuiStrings.default_
import typingsSlinky.baseui.baseuiStrings.full
import typingsSlinky.baseui.baseuiStrings.left
import typingsSlinky.baseui.baseuiStrings.right
import typingsSlinky.baseui.baseuiStrings.top
import typingsSlinky.baseui.drawerMod.DrawerOverrides
import typingsSlinky.baseui.drawerMod.DrawerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Drawer
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.baseui.drawerMod.Drawer] {
  @JSImport("baseui/drawer", "Drawer")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: autoFocus */
  def apply(
    anchor: left | right | top | bottom | String = null,
    animate: js.UndefOr[Boolean] = js.undefined,
    closeable: js.UndefOr[Boolean] = js.undefined,
    isOpen: js.UndefOr[Boolean] = js.undefined,
    mountNode: HTMLElement = null,
    onBackdropClick: /* event */ SyntheticMouseEvent[HTMLElement] => _ = null,
    onClose: /* args */ Anon_Backdrop => _ = null,
    onEscapeKeyDown: /* event */ SyntheticKeyboardEvent[HTMLElement] => _ = null,
    overrides: DrawerOverrides = null,
    showBackdrop: js.UndefOr[Boolean] = js.undefined,
    size: default_ | full | auto | String = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.baseui.drawerMod.Drawer] = {
    val __obj = js.Dynamic.literal()
    if (anchor != null) __obj.updateDynamic("anchor")(anchor.asInstanceOf[js.Any])
    if (!js.isUndefined(animate)) __obj.updateDynamic("animate")(animate.asInstanceOf[js.Any])
    if (!js.isUndefined(closeable)) __obj.updateDynamic("closeable")(closeable.asInstanceOf[js.Any])
    if (!js.isUndefined(isOpen)) __obj.updateDynamic("isOpen")(isOpen.asInstanceOf[js.Any])
    if (mountNode != null) __obj.updateDynamic("mountNode")(mountNode.asInstanceOf[js.Any])
    if (onBackdropClick != null) __obj.updateDynamic("onBackdropClick")(js.Any.fromFunction1(onBackdropClick))
    if (onClose != null) __obj.updateDynamic("onClose")(js.Any.fromFunction1(onClose))
    if (onEscapeKeyDown != null) __obj.updateDynamic("onEscapeKeyDown")(js.Any.fromFunction1(onEscapeKeyDown))
    if (overrides != null) __obj.updateDynamic("overrides")(overrides.asInstanceOf[js.Any])
    if (!js.isUndefined(showBackdrop)) __obj.updateDynamic("showBackdrop")(showBackdrop.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.baseui.drawerMod.Drawer] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.baseui.drawerMod.Drawer](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = DrawerProps
}

