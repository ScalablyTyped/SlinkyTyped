package typingsSlinky.reactVerticalTimelineComponent.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.reactVerticalTimelineComponent.mod.VerticalTimelineProps
import typingsSlinky.reactVerticalTimelineComponent.reactVerticalTimelineComponentStrings.`1-column`
import typingsSlinky.reactVerticalTimelineComponent.reactVerticalTimelineComponentStrings.`2-columns`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object VerticalTimeline
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reactVerticalTimelineComponent.mod.VerticalTimeline] {
  @JSImport("react-vertical-timeline-component", "VerticalTimeline")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className */
  def apply(
    animate: js.UndefOr[Boolean] = js.undefined,
    layout: `1-column` | `2-columns` = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.reactVerticalTimelineComponent.mod.VerticalTimeline] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(animate)) __obj.updateDynamic("animate")(animate.asInstanceOf[js.Any])
    if (layout != null) __obj.updateDynamic("layout")(layout.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.reactVerticalTimelineComponent.mod.VerticalTimeline] = new slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typingsSlinky.reactVerticalTimelineComponent.mod.VerticalTimeline](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = VerticalTimelineProps
}

