package typingsSlinky.reactBeforeunload.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.reactBeforeunload.AnonChildren
import typingsSlinky.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Beforeunload
  extends ExternalComponentWithAttributesWithRefType[tag.type, js.Object] {
  @JSImport("react-beforeunload", "Beforeunload")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    onBeforeunload: /* arg */ Event_ => js.UndefOr[String | Unit],
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, js.Object] = {
    val __obj = js.Dynamic.literal(onBeforeunload = js.Any.fromFunction1(onBeforeunload))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = AnonChildren
}

