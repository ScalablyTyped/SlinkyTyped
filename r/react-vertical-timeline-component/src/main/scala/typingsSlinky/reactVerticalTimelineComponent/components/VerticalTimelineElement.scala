package typingsSlinky.reactVerticalTimelineComponent.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.reactVerticalTimelineComponent.mod.VerticalTimelineElementProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object VerticalTimelineElement
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reactVerticalTimelineComponent.mod.VerticalTimelineElement] {
  @JSImport("react-vertical-timeline-component", "VerticalTimelineElement")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className, id, style */
  def apply(
    contentArrowStyle: CSSProperties = null,
    contentStyle: CSSProperties = null,
    date: String = null,
    icon: TagMod[Any] = null,
    iconOnClick: () => Unit = null,
    iconStyle: CSSProperties = null,
    position: String = null,
    visibilitySensorProps: js.Any = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.reactVerticalTimelineComponent.mod.VerticalTimelineElement] = {
    val __obj = js.Dynamic.literal()
    if (contentArrowStyle != null) __obj.updateDynamic("contentArrowStyle")(contentArrowStyle.asInstanceOf[js.Any])
    if (contentStyle != null) __obj.updateDynamic("contentStyle")(contentStyle.asInstanceOf[js.Any])
    if (date != null) __obj.updateDynamic("date")(date.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (iconOnClick != null) __obj.updateDynamic("iconOnClick")(js.Any.fromFunction0(iconOnClick))
    if (iconStyle != null) __obj.updateDynamic("iconStyle")(iconStyle.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (visibilitySensorProps != null) __obj.updateDynamic("visibilitySensorProps")(visibilitySensorProps.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.reactVerticalTimelineComponent.mod.VerticalTimelineElement] = new slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typingsSlinky.reactVerticalTimelineComponent.mod.VerticalTimelineElement](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = VerticalTimelineElementProps
}

