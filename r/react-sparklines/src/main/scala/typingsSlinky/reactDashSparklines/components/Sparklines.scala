package typingsSlinky.reactDashSparklines.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.react.reactMod.CSSProperties
import typingsSlinky.reactDashSparklines.reactDashSparklinesMod.SparklinesProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Sparklines
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reactDashSparklines.reactDashSparklinesMod.Sparklines] {
  @JSImport("react-sparklines", "Sparklines")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    data: js.Array[Double] = null,
    height: Int | Double = null,
    limit: Int | Double = null,
    margin: Int | Double = null,
    max: Int | Double = null,
    min: Int | Double = null,
    preserveAspectRatio: String = null,
    style: CSSProperties = null,
    svgHeight: Double | String = null,
    svgWidth: Double | String = null,
    width: Int | Double = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.reactDashSparklines.reactDashSparklinesMod.Sparklines] = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (preserveAspectRatio != null) __obj.updateDynamic("preserveAspectRatio")(preserveAspectRatio.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (svgHeight != null) __obj.updateDynamic("svgHeight")(svgHeight.asInstanceOf[js.Any])
    if (svgWidth != null) __obj.updateDynamic("svgWidth")(svgWidth.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.reactDashSparklines.reactDashSparklinesMod.Sparklines] = new slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typingsSlinky.reactDashSparklines.reactDashSparklinesMod.Sparklines](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = SparklinesProps
}

