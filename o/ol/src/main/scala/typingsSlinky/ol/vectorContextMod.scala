package typingsSlinky.ol

import typingsSlinky.ol.canvasMod.DeclutterGroup
import typingsSlinky.ol.canvasMod.DeclutterGroups
import typingsSlinky.ol.olFeatureMod.FeatureLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object vectorContextMod {
  
  @JSImport("ol/render/VectorContext", JSImport.Default)
  @js.native
  class default () extends VectorContext
  
  @js.native
  trait VectorContext extends StObject {
    
    def drawCircle(
      circleGeometry: typingsSlinky.ol.circleMod.default,
      feature: typingsSlinky.ol.olFeatureMod.default[typingsSlinky.ol.geometryMod.default]
    ): Unit = js.native
    
    /**
      * Render a geometry with a custom renderer.
      */
    def drawCustom(
      geometry: typingsSlinky.ol.simpleGeometryMod.default,
      feature: FeatureLike,
      renderer: js.Function0[Unit]
    ): Unit = js.native
    
    def drawFeature(
      feature: typingsSlinky.ol.olFeatureMod.default[typingsSlinky.ol.geometryMod.default],
      style: typingsSlinky.ol.styleStyleMod.default
    ): Unit = js.native
    
    /**
      * Render a geometry.
      */
    def drawGeometry(geometry: typingsSlinky.ol.geometryMod.default): Unit = js.native
    
    def drawGeometryCollection(
      geometryCollectionGeometry: typingsSlinky.ol.geometryCollectionMod.default,
      feature: typingsSlinky.ol.olFeatureMod.default[typingsSlinky.ol.geometryMod.default]
    ): Unit = js.native
    
    def drawLineString(lineStringGeometry: typingsSlinky.ol.lineStringMod.default, feature: FeatureLike): Unit = js.native
    def drawLineString(lineStringGeometry: typingsSlinky.ol.renderFeatureMod.default, feature: FeatureLike): Unit = js.native
    
    def drawMultiLineString(multiLineStringGeometry: typingsSlinky.ol.multiLineStringMod.default, feature: FeatureLike): Unit = js.native
    def drawMultiLineString(multiLineStringGeometry: typingsSlinky.ol.renderFeatureMod.default, feature: FeatureLike): Unit = js.native
    
    def drawMultiPoint(multiPointGeometry: typingsSlinky.ol.multiPointMod.default, feature: FeatureLike): Unit = js.native
    def drawMultiPoint(multiPointGeometry: typingsSlinky.ol.renderFeatureMod.default, feature: FeatureLike): Unit = js.native
    
    def drawMultiPolygon(multiPolygonGeometry: typingsSlinky.ol.multiPolygonMod.default, feature: FeatureLike): Unit = js.native
    
    def drawPoint(pointGeometry: typingsSlinky.ol.pointMod.default, feature: FeatureLike): Unit = js.native
    def drawPoint(pointGeometry: typingsSlinky.ol.renderFeatureMod.default, feature: FeatureLike): Unit = js.native
    
    def drawPolygon(polygonGeometry: typingsSlinky.ol.polygonMod.default, feature: FeatureLike): Unit = js.native
    def drawPolygon(polygonGeometry: typingsSlinky.ol.renderFeatureMod.default, feature: FeatureLike): Unit = js.native
    
    def drawText(geometry: typingsSlinky.ol.renderFeatureMod.default, feature: FeatureLike): Unit = js.native
    def drawText(geometry: typingsSlinky.ol.simpleGeometryMod.default, feature: FeatureLike): Unit = js.native
    
    def setFillStrokeStyle(fillStyle: typingsSlinky.ol.fillMod.default, strokeStyle: typingsSlinky.ol.strokeMod.default): Unit = js.native
    
    def setImageStyle(imageStyle: typingsSlinky.ol.styleImageMod.default): Unit = js.native
    def setImageStyle(imageStyle: typingsSlinky.ol.styleImageMod.default, opt_declutterGroup: DeclutterGroup): Unit = js.native
    
    /**
      * Set the rendering style.
      */
    def setStyle(style: typingsSlinky.ol.styleStyleMod.default): Unit = js.native
    
    def setTextStyle(textStyle: typingsSlinky.ol.textMod.default): Unit = js.native
    def setTextStyle(textStyle: typingsSlinky.ol.textMod.default, opt_declutterGroups: DeclutterGroups): Unit = js.native
  }
}
