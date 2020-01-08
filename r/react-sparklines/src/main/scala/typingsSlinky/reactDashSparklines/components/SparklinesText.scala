package typingsSlinky.reactDashSparklines.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashSparklines.reactDashSparklinesMod.Point
import typingsSlinky.reactDashSparklines.reactDashSparklinesMod.SparklinesTextProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object SparklinesText
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reactDashSparklines.reactDashSparklinesMod.SparklinesText] {
  @JSImport("react-sparklines", "SparklinesText")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    fontFamily: String = null,
    fontSize: Int | Double = null,
    point: Point = null,
    text: String = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.reactDashSparklines.reactDashSparklinesMod.SparklinesText] = {
    val __obj = js.Dynamic.literal()
    if (fontFamily != null) __obj.updateDynamic("fontFamily")(fontFamily.asInstanceOf[js.Any])
    if (fontSize != null) __obj.updateDynamic("fontSize")(fontSize.asInstanceOf[js.Any])
    if (point != null) __obj.updateDynamic("point")(point.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.reactDashSparklines.reactDashSparklinesMod.SparklinesText] = new slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typingsSlinky.reactDashSparklines.reactDashSparklinesMod.SparklinesText](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = SparklinesTextProps
}

