package typingsSlinky.ol

import typingsSlinky.ol.renderCanvasMod.DeclutterGroup
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/render/VectorContext", JSImport.Namespace)
@js.native
object renderVectorContextMod extends js.Object {
  @js.native
  trait VectorContext extends js.Object {
    def drawCircle(
      circleGeometry: typingsSlinky.ol.geomCircleMod.default,
      feature: typingsSlinky.ol.featureMod.default
    ): Unit = js.native
    def drawCustom(
      geometry: typingsSlinky.ol.geomSimpleGeometryMod.default,
      feature: typingsSlinky.ol.featureMod.default,
      renderer: js.Function0[Unit]
    ): Unit = js.native
    def drawCustom(
      geometry: typingsSlinky.ol.geomSimpleGeometryMod.default,
      feature: typingsSlinky.ol.renderFeatureMod.default,
      renderer: js.Function0[Unit]
    ): Unit = js.native
    def drawFeature(feature: typingsSlinky.ol.featureMod.default, style: typingsSlinky.ol.styleStyleMod.default): Unit = js.native
    def drawGeometry(geometry: typingsSlinky.ol.geomGeometryMod.default): Unit = js.native
    def drawGeometryCollection(
      geometryCollectionGeometry: typingsSlinky.ol.geomGeometryCollectionMod.default,
      feature: typingsSlinky.ol.featureMod.default
    ): Unit = js.native
    def drawLineString(
      lineStringGeometry: typingsSlinky.ol.geomLineStringMod.default,
      feature: typingsSlinky.ol.featureMod.default
    ): Unit = js.native
    def drawLineString(
      lineStringGeometry: typingsSlinky.ol.geomLineStringMod.default,
      feature: typingsSlinky.ol.renderFeatureMod.default
    ): Unit = js.native
    def drawLineString(
      lineStringGeometry: typingsSlinky.ol.renderFeatureMod.default,
      feature: typingsSlinky.ol.featureMod.default
    ): Unit = js.native
    def drawLineString(
      lineStringGeometry: typingsSlinky.ol.renderFeatureMod.default,
      feature: typingsSlinky.ol.renderFeatureMod.default
    ): Unit = js.native
    def drawMultiLineString(
      multiLineStringGeometry: typingsSlinky.ol.geomMultiLineStringMod.default,
      feature: typingsSlinky.ol.featureMod.default
    ): Unit = js.native
    def drawMultiLineString(
      multiLineStringGeometry: typingsSlinky.ol.geomMultiLineStringMod.default,
      feature: typingsSlinky.ol.renderFeatureMod.default
    ): Unit = js.native
    def drawMultiLineString(
      multiLineStringGeometry: typingsSlinky.ol.renderFeatureMod.default,
      feature: typingsSlinky.ol.featureMod.default
    ): Unit = js.native
    def drawMultiLineString(
      multiLineStringGeometry: typingsSlinky.ol.renderFeatureMod.default,
      feature: typingsSlinky.ol.renderFeatureMod.default
    ): Unit = js.native
    def drawMultiPoint(
      multiPointGeometry: typingsSlinky.ol.geomMultiPointMod.default,
      feature: typingsSlinky.ol.featureMod.default
    ): Unit = js.native
    def drawMultiPoint(
      multiPointGeometry: typingsSlinky.ol.geomMultiPointMod.default,
      feature: typingsSlinky.ol.renderFeatureMod.default
    ): Unit = js.native
    def drawMultiPoint(
      multiPointGeometry: typingsSlinky.ol.renderFeatureMod.default,
      feature: typingsSlinky.ol.featureMod.default
    ): Unit = js.native
    def drawMultiPoint(
      multiPointGeometry: typingsSlinky.ol.renderFeatureMod.default,
      feature: typingsSlinky.ol.renderFeatureMod.default
    ): Unit = js.native
    def drawMultiPolygon(
      multiPolygonGeometry: typingsSlinky.ol.geomMultiPolygonMod.default,
      feature: typingsSlinky.ol.featureMod.default
    ): Unit = js.native
    def drawMultiPolygon(
      multiPolygonGeometry: typingsSlinky.ol.geomMultiPolygonMod.default,
      feature: typingsSlinky.ol.renderFeatureMod.default
    ): Unit = js.native
    def drawPoint(pointGeometry: typingsSlinky.ol.geomPointMod.default, feature: typingsSlinky.ol.featureMod.default): Unit = js.native
    def drawPoint(
      pointGeometry: typingsSlinky.ol.geomPointMod.default,
      feature: typingsSlinky.ol.renderFeatureMod.default
    ): Unit = js.native
    def drawPoint(
      pointGeometry: typingsSlinky.ol.renderFeatureMod.default,
      feature: typingsSlinky.ol.featureMod.default
    ): Unit = js.native
    def drawPoint(
      pointGeometry: typingsSlinky.ol.renderFeatureMod.default,
      feature: typingsSlinky.ol.renderFeatureMod.default
    ): Unit = js.native
    def drawPolygon(
      polygonGeometry: typingsSlinky.ol.geomPolygonMod.default,
      feature: typingsSlinky.ol.featureMod.default
    ): Unit = js.native
    def drawPolygon(
      polygonGeometry: typingsSlinky.ol.geomPolygonMod.default,
      feature: typingsSlinky.ol.renderFeatureMod.default
    ): Unit = js.native
    def drawPolygon(
      polygonGeometry: typingsSlinky.ol.renderFeatureMod.default,
      feature: typingsSlinky.ol.featureMod.default
    ): Unit = js.native
    def drawPolygon(
      polygonGeometry: typingsSlinky.ol.renderFeatureMod.default,
      feature: typingsSlinky.ol.renderFeatureMod.default
    ): Unit = js.native
    def drawText(geometry: typingsSlinky.ol.geomGeometryMod.default, feature: typingsSlinky.ol.featureMod.default): Unit = js.native
    def drawText(
      geometry: typingsSlinky.ol.geomGeometryMod.default,
      feature: typingsSlinky.ol.renderFeatureMod.default
    ): Unit = js.native
    def drawText(geometry: typingsSlinky.ol.renderFeatureMod.default, feature: typingsSlinky.ol.featureMod.default): Unit = js.native
    def drawText(
      geometry: typingsSlinky.ol.renderFeatureMod.default,
      feature: typingsSlinky.ol.renderFeatureMod.default
    ): Unit = js.native
    def setFillStrokeStyle(
      fillStyle: typingsSlinky.ol.styleFillMod.default,
      strokeStyle: typingsSlinky.ol.styleStrokeMod.default
    ): Unit = js.native
    def setImageStyle(imageStyle: typingsSlinky.ol.styleImageMod.default): Unit = js.native
    def setImageStyle(imageStyle: typingsSlinky.ol.styleImageMod.default, opt_declutterGroup: DeclutterGroup): Unit = js.native
    def setStyle(style: typingsSlinky.ol.styleStyleMod.default): Unit = js.native
    def setTextStyle(textStyle: typingsSlinky.ol.styleTextMod.default): Unit = js.native
    def setTextStyle(textStyle: typingsSlinky.ol.styleTextMod.default, opt_declutterGroup: DeclutterGroup): Unit = js.native
  }
  
  @js.native
  class default () extends VectorContext
  
}

