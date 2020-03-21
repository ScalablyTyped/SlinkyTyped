package typingsSlinky.nivoGeo.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.ReactComponentClass
import slinky.web.SyntheticMouseEvent
import slinky.web.html.`*`.tag
import typingsSlinky.nivoCore.mod.Dimensions
import typingsSlinky.nivoGeo.AnonFeatureChoroplethBoundFeature
import typingsSlinky.nivoGeo.PartialBox
import typingsSlinky.nivoGeo.PartialTheme
import typingsSlinky.nivoGeo.mod.ChoroplethBoundFeature
import typingsSlinky.nivoGeo.mod.ChoroplethCanvasProps
import typingsSlinky.nivoGeo.mod.DatumMatcher
import typingsSlinky.nivoGeo.mod.FeatureAccessor
import typingsSlinky.nivoGeo.mod.GeoProjectionType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ChoroplethCanvas
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.nivoGeo.mod.ChoroplethCanvas] {
  @JSImport("@nivo/geo", "ChoroplethCanvas")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    data: js.Array[_],
    domain: js.Array[Double],
    features: js.Array[_],
    height: Double,
    width: Double,
    borderColor: String | (FeatureAccessor[ChoroplethBoundFeature, Double]) = null,
    borderWidth: Double | (FeatureAccessor[ChoroplethBoundFeature, Double]) = null,
    colors: String | js.Array[String] | (FeatureAccessor[_, String]) = null,
    enableGraticule: js.UndefOr[Boolean] = js.undefined,
    fillColor: String | (FeatureAccessor[ChoroplethBoundFeature, String]) = null,
    graticuleLineColor: String = null,
    graticuleLineWidth: Int | Double = null,
    isInteractive: js.UndefOr[Boolean] = js.undefined,
    label: String | (FeatureAccessor[_, String]) = null,
    margin: PartialBox = null,
    `match`: String | DatumMatcher = null,
    onClick: (/* feature */ ChoroplethBoundFeature, /* event */ SyntheticMouseEvent[js.Any]) => Unit = null,
    onMouseEnter: (/* feature */ ChoroplethBoundFeature, /* event */ SyntheticMouseEvent[js.Any]) => Unit = null,
    onMouseLeave: (/* feature */ ChoroplethBoundFeature, /* event */ SyntheticMouseEvent[js.Any]) => Unit = null,
    onMouseMove: (/* feature */ ChoroplethBoundFeature, /* event */ SyntheticMouseEvent[js.Any]) => Unit = null,
    pixelRatio: Int | Double = null,
    projectionRotation: js.Tuple3[Double, Double, Double] = null,
    projectionScale: Int | Double = null,
    projectionTranslation: js.Tuple2[Double, Double] = null,
    projectionType: GeoProjectionType = null,
    theme: PartialTheme = null,
    tooltip: ReactComponentClass[AnonFeatureChoroplethBoundFeature] = null,
    unknownColor: String = null,
    value: String | (FeatureAccessor[_, Double]) = null,
    valueFormat: String | (FeatureAccessor[_, String | Double]) = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.nivoGeo.mod.ChoroplethCanvas] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], domain = domain.asInstanceOf[js.Any], features = features.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    if (borderColor != null) __obj.updateDynamic("borderColor")(borderColor.asInstanceOf[js.Any])
    if (borderWidth != null) __obj.updateDynamic("borderWidth")(borderWidth.asInstanceOf[js.Any])
    if (colors != null) __obj.updateDynamic("colors")(colors.asInstanceOf[js.Any])
    if (!js.isUndefined(enableGraticule)) __obj.updateDynamic("enableGraticule")(enableGraticule.asInstanceOf[js.Any])
    if (fillColor != null) __obj.updateDynamic("fillColor")(fillColor.asInstanceOf[js.Any])
    if (graticuleLineColor != null) __obj.updateDynamic("graticuleLineColor")(graticuleLineColor.asInstanceOf[js.Any])
    if (graticuleLineWidth != null) __obj.updateDynamic("graticuleLineWidth")(graticuleLineWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(isInteractive)) __obj.updateDynamic("isInteractive")(isInteractive.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (`match` != null) __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction2(onClick))
    if (onMouseEnter != null) __obj.updateDynamic("onMouseEnter")(js.Any.fromFunction2(onMouseEnter))
    if (onMouseLeave != null) __obj.updateDynamic("onMouseLeave")(js.Any.fromFunction2(onMouseLeave))
    if (onMouseMove != null) __obj.updateDynamic("onMouseMove")(js.Any.fromFunction2(onMouseMove))
    if (pixelRatio != null) __obj.updateDynamic("pixelRatio")(pixelRatio.asInstanceOf[js.Any])
    if (projectionRotation != null) __obj.updateDynamic("projectionRotation")(projectionRotation.asInstanceOf[js.Any])
    if (projectionScale != null) __obj.updateDynamic("projectionScale")(projectionScale.asInstanceOf[js.Any])
    if (projectionTranslation != null) __obj.updateDynamic("projectionTranslation")(projectionTranslation.asInstanceOf[js.Any])
    if (projectionType != null) __obj.updateDynamic("projectionType")(projectionType.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    if (unknownColor != null) __obj.updateDynamic("unknownColor")(unknownColor.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (valueFormat != null) __obj.updateDynamic("valueFormat")(valueFormat.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = ChoroplethCanvasProps with Dimensions
}

