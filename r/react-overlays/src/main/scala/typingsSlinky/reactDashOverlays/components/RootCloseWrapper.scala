package typingsSlinky.reactDashOverlays.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Event
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.SyntheticEvent
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashOverlays.libRootCloseWrapperMod.RootCloseWrapperProps
import typingsSlinky.reactDashOverlays.reactDashOverlaysStrings.click
import typingsSlinky.reactDashOverlays.reactDashOverlaysStrings.mousedown
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object RootCloseWrapper
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reactDashOverlays.libMod.RootCloseWrapper] {
  @JSImport("react-overlays/lib", "RootCloseWrapper")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: disabled */
  def apply(
    event: click | mousedown = null,
    onRootClose: /* e */ SyntheticEvent[Event, _] => Unit = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.reactDashOverlays.libMod.RootCloseWrapper] = {
    val __obj = js.Dynamic.literal()
    if (event != null) __obj.updateDynamic("event")(event.asInstanceOf[js.Any])
    if (onRootClose != null) __obj.updateDynamic("onRootClose")(js.Any.fromFunction1(onRootClose))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = RootCloseWrapperProps
}

