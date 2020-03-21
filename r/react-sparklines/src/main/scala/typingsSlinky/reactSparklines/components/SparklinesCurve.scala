package typingsSlinky.reactSparklines.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.reactSparklines.mod.SparklinesCurveProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object SparklinesCurve
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reactSparklines.mod.SparklinesCurve] {
  @JSImport("react-sparklines", "SparklinesCurve")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: style */
  def apply(color: String = null, _overrides: StringDictionary[js.Any] = null): BuildingComponent[tag.type, typingsSlinky.reactSparklines.mod.SparklinesCurve] = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.reactSparklines.mod.SparklinesCurve] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.reactSparklines.mod.SparklinesCurve](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = SparklinesCurveProps
}

