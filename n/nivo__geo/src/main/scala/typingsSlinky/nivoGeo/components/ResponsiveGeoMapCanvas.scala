package typingsSlinky.nivoGeo.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.ReactComponentClass
import slinky.web.SyntheticMouseEvent
import slinky.web.html.`*`.tag
import typingsSlinky.nivoGeo.AnonFeature
import typingsSlinky.nivoGeo.PartialBox
import typingsSlinky.nivoGeo.PartialTheme
import typingsSlinky.nivoGeo.mod.FeatureAccessor
import typingsSlinky.nivoGeo.mod.GeoMapCanvasProps
import typingsSlinky.nivoGeo.mod.GeoProjectionType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ResponsiveGeoMapCanvas
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.nivoGeo.mod.ResponsiveGeoMapCanvas] {
  @JSImport("@nivo/geo", "ResponsiveGeoMapCanvas")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    features: js.Array[_],
    borderColor: String | (FeatureAccessor[_, Double]) = null,
    borderWidth: Double | (FeatureAccessor[_, Double]) = null,
    enableGraticule: js.UndefOr[Boolean] = js.undefined,
    fillColor: String | (FeatureAccessor[_, String]) = null,
    graticuleLineColor: String = null,
    graticuleLineWidth: Int | Double = null,
    isInteractive: js.UndefOr[Boolean] = js.undefined,
    margin: PartialBox = null,
    onClick: (/* feature */ js.Any, /* event */ SyntheticMouseEvent[js.Any]) => Unit = null,
    onMouseEnter: (/* feature */ js.Any, /* event */ SyntheticMouseEvent[js.Any]) => Unit = null,
    onMouseLeave: (/* feature */ js.Any, /* event */ SyntheticMouseEvent[js.Any]) => Unit = null,
    onMouseMove: (/* feature */ js.Any, /* event */ SyntheticMouseEvent[js.Any]) => Unit = null,
    pixelRatio: Int | Double = null,
    projectionRotation: js.Tuple3[Double, Double, Double] = null,
    projectionScale: Int | Double = null,
    projectionTranslation: js.Tuple2[Double, Double] = null,
    projectionType: GeoProjectionType = null,
    theme: PartialTheme = null,
    tooltip: ReactComponentClass[AnonFeature] = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.nivoGeo.mod.ResponsiveGeoMapCanvas] = {
    val __obj = js.Dynamic.literal(features = features.asInstanceOf[js.Any])
    if (borderColor != null) __obj.updateDynamic("borderColor")(borderColor.asInstanceOf[js.Any])
    if (borderWidth != null) __obj.updateDynamic("borderWidth")(borderWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(enableGraticule)) __obj.updateDynamic("enableGraticule")(enableGraticule.asInstanceOf[js.Any])
    if (fillColor != null) __obj.updateDynamic("fillColor")(fillColor.asInstanceOf[js.Any])
    if (graticuleLineColor != null) __obj.updateDynamic("graticuleLineColor")(graticuleLineColor.asInstanceOf[js.Any])
    if (graticuleLineWidth != null) __obj.updateDynamic("graticuleLineWidth")(graticuleLineWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(isInteractive)) __obj.updateDynamic("isInteractive")(isInteractive.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
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
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = GeoMapCanvasProps
}

