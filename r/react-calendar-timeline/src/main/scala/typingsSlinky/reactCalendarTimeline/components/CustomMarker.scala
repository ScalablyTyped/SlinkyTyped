package typingsSlinky.reactCalendarTimeline.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.reactCalendarTimeline.mod.MarkerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object CustomMarker
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reactCalendarTimeline.mod.CustomMarker] {
  @JSImport("react-calendar-timeline", "CustomMarker")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(date: js.Date | Double, _overrides: StringDictionary[js.Any] = null): BuildingComponent[tag.type, typingsSlinky.reactCalendarTimeline.mod.CustomMarker] = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = MarkerProps
}

