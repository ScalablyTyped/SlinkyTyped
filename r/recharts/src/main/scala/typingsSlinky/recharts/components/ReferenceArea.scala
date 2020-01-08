package typingsSlinky.recharts.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.recharts.rechartsMod.ContentRenderer
import typingsSlinky.recharts.rechartsMod.IfOverflowType
import typingsSlinky.recharts.rechartsMod.RectangleProps
import typingsSlinky.recharts.rechartsMod.ReferenceAreaProps
import typingsSlinky.recharts.rechartsMod.ViewBox
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReferenceArea
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.recharts.rechartsMod.ReferenceArea] {
  @JSImport("recharts", "ReferenceArea")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    alwaysShow: js.UndefOr[Boolean] = js.undefined,
    className: Double | String = null,
    ifOverflow: IfOverflowType = null,
    isFront: js.UndefOr[Boolean] = js.undefined,
    shape: (ContentRenderer[ReferenceAreaProps with RectangleProps]) | ReactElement = null,
    viewBox: ViewBox = null,
    x1: Double | String = null,
    x2: Double | String = null,
    xAxis: js.Object = null,
    xAxisId: String | Double = null,
    y1: Double | String = null,
    y2: Double | String = null,
    yAxis: js.Object = null,
    yAxisId: String | Double = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.recharts.rechartsMod.ReferenceArea] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(alwaysShow)) __obj.updateDynamic("alwaysShow")(alwaysShow.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (ifOverflow != null) __obj.updateDynamic("ifOverflow")(ifOverflow.asInstanceOf[js.Any])
    if (!js.isUndefined(isFront)) __obj.updateDynamic("isFront")(isFront.asInstanceOf[js.Any])
    if (shape != null) __obj.updateDynamic("shape")(shape.asInstanceOf[js.Any])
    if (viewBox != null) __obj.updateDynamic("viewBox")(viewBox.asInstanceOf[js.Any])
    if (x1 != null) __obj.updateDynamic("x1")(x1.asInstanceOf[js.Any])
    if (x2 != null) __obj.updateDynamic("x2")(x2.asInstanceOf[js.Any])
    if (xAxis != null) __obj.updateDynamic("xAxis")(xAxis.asInstanceOf[js.Any])
    if (xAxisId != null) __obj.updateDynamic("xAxisId")(xAxisId.asInstanceOf[js.Any])
    if (y1 != null) __obj.updateDynamic("y1")(y1.asInstanceOf[js.Any])
    if (y2 != null) __obj.updateDynamic("y2")(y2.asInstanceOf[js.Any])
    if (yAxis != null) __obj.updateDynamic("yAxis")(yAxis.asInstanceOf[js.Any])
    if (yAxisId != null) __obj.updateDynamic("yAxisId")(yAxisId.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.recharts.rechartsMod.ReferenceArea] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.recharts.rechartsMod.ReferenceArea](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = ReferenceAreaProps
}

