package typingsSlinky.reactOverlays.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.SyntheticEvent
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.reactOverlays.reactOverlaysStrings.click
import typingsSlinky.reactOverlays.reactOverlaysStrings.mousedown
import typingsSlinky.reactOverlays.rootCloseWrapperMod.RootCloseWrapperProps
import typingsSlinky.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object RootCloseWrapper
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reactOverlays.mod.RootCloseWrapper] {
  @JSImport("react-overlays", "RootCloseWrapper")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: disabled */
  def apply(
    event: click | mousedown = null,
    onRootClose: /* e */ SyntheticEvent[Event_, _] => Unit = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.reactOverlays.mod.RootCloseWrapper] = {
    val __obj = js.Dynamic.literal()
    if (event != null) __obj.updateDynamic("event")(event.asInstanceOf[js.Any])
    if (onRootClose != null) __obj.updateDynamic("onRootClose")(js.Any.fromFunction1(onRootClose))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.reactOverlays.mod.RootCloseWrapper] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.reactOverlays.mod.RootCloseWrapper](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = RootCloseWrapperProps
}

