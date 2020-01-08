package typingsSlinky.reactDashSparklines.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.react.reactMod.CSSProperties
import typingsSlinky.reactDashSparklines.reactDashSparklinesMod.SparklinesSpotsProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object SparklinesSpots
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reactDashSparklines.reactDashSparklinesMod.SparklinesSpots] {
  @JSImport("react-sparklines", "SparklinesSpots")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: size */
  def apply(
    spotColors: StringDictionary[String] = null,
    style: CSSProperties = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.reactDashSparklines.reactDashSparklinesMod.SparklinesSpots] = {
    val __obj = js.Dynamic.literal()
    if (spotColors != null) __obj.updateDynamic("spotColors")(spotColors.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.reactDashSparklines.reactDashSparklinesMod.SparklinesSpots] = new slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typingsSlinky.reactDashSparklines.reactDashSparklinesMod.SparklinesSpots](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = SparklinesSpotsProps
}

