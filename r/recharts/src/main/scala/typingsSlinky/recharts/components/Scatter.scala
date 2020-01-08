package typingsSlinky.recharts.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.recharts.rechartsMod.AnimationEasingType
import typingsSlinky.recharts.rechartsMod.ContentRenderer
import typingsSlinky.recharts.rechartsMod.DataKey
import typingsSlinky.recharts.rechartsMod.LegendType
import typingsSlinky.recharts.rechartsMod.LineType
import typingsSlinky.recharts.rechartsMod.RechartsFunction
import typingsSlinky.recharts.rechartsMod.ScatterPoint
import typingsSlinky.recharts.rechartsMod.ScatterProps
import typingsSlinky.recharts.rechartsStrings.circle
import typingsSlinky.recharts.rechartsStrings.cross
import typingsSlinky.recharts.rechartsStrings.diamond
import typingsSlinky.recharts.rechartsStrings.fitting
import typingsSlinky.recharts.rechartsStrings.joint
import typingsSlinky.recharts.rechartsStrings.square
import typingsSlinky.recharts.rechartsStrings.star
import typingsSlinky.recharts.rechartsStrings.triangle
import typingsSlinky.recharts.rechartsStrings.wye
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Scatter
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.recharts.rechartsMod.Scatter] {
  @JSImport("recharts", "Scatter")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: id, onAnimationEnd, onAnimationStart, onClick, onMouseDown, onMouseEnter, onMouseLeave, onMouseMove, onMouseOut, onMouseOver, onMouseUp, onTouchCancel, onTouchEnd, onTouchMove, onTouchStart */
  def apply(
    activeIndex: Int | Double = null,
    activeShape: js.Object | RechartsFunction | ReactElement = null,
    animationBegin: Int | Double = null,
    animationDuration: Int | Double = null,
    animationEasing: AnimationEasingType = null,
    animationId: Int | Double = null,
    data: js.Array[js.Object] = null,
    dataKey: DataKey = null,
    hide: js.UndefOr[Boolean] = js.undefined,
    isAnimationActive: js.UndefOr[Boolean] = js.undefined,
    isUpdateAnimationActive: js.UndefOr[Boolean] = js.undefined,
    legendType: LegendType = null,
    line: Boolean | js.Object | RechartsFunction | ReactElement = null,
    lineJointType: LineType = null,
    lineType: joint | fitting = null,
    name: String | Double = null,
    points: js.Array[ScatterPoint] = null,
    shape: circle | cross | diamond | square | star | triangle | wye | ReactElement | ContentRenderer[_] = null,
    xAxisId: String | Double = null,
    yAxisId: String | Double = null,
    zAxisId: String | Double = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.recharts.rechartsMod.Scatter] = {
    val __obj = js.Dynamic.literal()
    if (activeIndex != null) __obj.updateDynamic("activeIndex")(activeIndex.asInstanceOf[js.Any])
    if (activeShape != null) __obj.updateDynamic("activeShape")(activeShape.asInstanceOf[js.Any])
    if (animationBegin != null) __obj.updateDynamic("animationBegin")(animationBegin.asInstanceOf[js.Any])
    if (animationDuration != null) __obj.updateDynamic("animationDuration")(animationDuration.asInstanceOf[js.Any])
    if (animationEasing != null) __obj.updateDynamic("animationEasing")(animationEasing.asInstanceOf[js.Any])
    if (animationId != null) __obj.updateDynamic("animationId")(animationId.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (dataKey != null) __obj.updateDynamic("dataKey")(dataKey.asInstanceOf[js.Any])
    if (!js.isUndefined(hide)) __obj.updateDynamic("hide")(hide.asInstanceOf[js.Any])
    if (!js.isUndefined(isAnimationActive)) __obj.updateDynamic("isAnimationActive")(isAnimationActive.asInstanceOf[js.Any])
    if (!js.isUndefined(isUpdateAnimationActive)) __obj.updateDynamic("isUpdateAnimationActive")(isUpdateAnimationActive.asInstanceOf[js.Any])
    if (legendType != null) __obj.updateDynamic("legendType")(legendType.asInstanceOf[js.Any])
    if (line != null) __obj.updateDynamic("line")(line.asInstanceOf[js.Any])
    if (lineJointType != null) __obj.updateDynamic("lineJointType")(lineJointType.asInstanceOf[js.Any])
    if (lineType != null) __obj.updateDynamic("lineType")(lineType.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (points != null) __obj.updateDynamic("points")(points.asInstanceOf[js.Any])
    if (shape != null) __obj.updateDynamic("shape")(shape.asInstanceOf[js.Any])
    if (xAxisId != null) __obj.updateDynamic("xAxisId")(xAxisId.asInstanceOf[js.Any])
    if (yAxisId != null) __obj.updateDynamic("yAxisId")(yAxisId.asInstanceOf[js.Any])
    if (zAxisId != null) __obj.updateDynamic("zAxisId")(zAxisId.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.recharts.rechartsMod.Scatter] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.recharts.rechartsMod.Scatter](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = ScatterProps
}

