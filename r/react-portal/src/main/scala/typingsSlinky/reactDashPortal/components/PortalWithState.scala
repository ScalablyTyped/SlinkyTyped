package typingsSlinky.reactDashPortal.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashPortal.reactDashPortalMod.PortalWithStateProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object PortalWithState
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reactDashPortal.reactDashPortalMod.PortalWithState] {
  @JSImport("react-portal", "PortalWithState")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    closeOnEsc: js.UndefOr[Boolean] = js.undefined,
    closeOnOutsideClick: js.UndefOr[Boolean] = js.undefined,
    defaultOpen: js.UndefOr[Boolean] = js.undefined,
    node: org.scalajs.dom.raw.Element = null,
    onClose: () => Unit = null,
    onOpen: () => Unit = null,
    openByClickOn: ReactElement = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.reactDashPortal.reactDashPortalMod.PortalWithState] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(closeOnEsc)) __obj.updateDynamic("closeOnEsc")(closeOnEsc.asInstanceOf[js.Any])
    if (!js.isUndefined(closeOnOutsideClick)) __obj.updateDynamic("closeOnOutsideClick")(closeOnOutsideClick.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultOpen)) __obj.updateDynamic("defaultOpen")(defaultOpen.asInstanceOf[js.Any])
    if (node != null) __obj.updateDynamic("node")(node.asInstanceOf[js.Any])
    if (onClose != null) __obj.updateDynamic("onClose")(js.Any.fromFunction0(onClose))
    if (onOpen != null) __obj.updateDynamic("onOpen")(js.Any.fromFunction0(onOpen))
    if (openByClickOn != null) __obj.updateDynamic("openByClickOn")(openByClickOn.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.reactDashPortal.reactDashPortalMod.PortalWithState] = new slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typingsSlinky.reactDashPortal.reactDashPortalMod.PortalWithState](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = PortalWithStateProps
}

