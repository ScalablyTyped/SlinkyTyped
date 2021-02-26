package typingsSlinky.ol

import org.scalajs.dom.raw.CanvasRenderingContext2D
import typingsSlinky.ol.extentMod.Extent
import typingsSlinky.ol.olMod.Transform
import typingsSlinky.ol.projMod.TransformFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object immediateMod {
  
  @JSImport("ol/render/canvas/Immediate", JSImport.Default)
  @js.native
  class default protected () extends CanvasImmediateRenderer {
    def this(
      context: CanvasRenderingContext2D,
      pixelRatio: Double,
      extent: Extent,
      transform: Transform,
      viewRotation: Double
    ) = this()
    def this(
      context: CanvasRenderingContext2D,
      pixelRatio: Double,
      extent: Extent,
      transform: Transform,
      viewRotation: Double,
      opt_squaredTolerance: Double
    ) = this()
    def this(
      context: CanvasRenderingContext2D,
      pixelRatio: Double,
      extent: Extent,
      transform: Transform,
      viewRotation: Double,
      opt_squaredTolerance: js.UndefOr[scala.Nothing],
      opt_userTransform: TransformFunction
    ) = this()
    def this(
      context: CanvasRenderingContext2D,
      pixelRatio: Double,
      extent: Extent,
      transform: Transform,
      viewRotation: Double,
      opt_squaredTolerance: Double,
      opt_userTransform: TransformFunction
    ) = this()
  }
  
  @js.native
  trait CanvasImmediateRenderer
    extends typingsSlinky.ol.vectorContextMod.default {
    
    /**
      * Render a circle geometry into the canvas.  Rendering is immediate and uses
      * the current fill and stroke styles.
      */
    def drawCircle(geometry: typingsSlinky.ol.circleMod.default): Unit = js.native
    
    def drawGeometry(geometry: typingsSlinky.ol.renderFeatureMod.default): Unit = js.native
    
    /**
      * Render a GeometryCollection to the canvas.  Rendering is immediate and
      * uses the current styles appropriate for each geometry in the collection.
      */
    def drawGeometryCollection(geometry: typingsSlinky.ol.geometryCollectionMod.default): Unit = js.native
    
    /**
      * Render a LineString into the canvas.  Rendering is immediate and uses
      * the current style.
      */
    def drawLineString(geometry: typingsSlinky.ol.lineStringMod.default): Unit = js.native
    def drawLineString(geometry: typingsSlinky.ol.renderFeatureMod.default): Unit = js.native
    
    /**
      * Render a MultiLineString geometry into the canvas.  Rendering is immediate
      * and uses the current style.
      */
    def drawMultiLineString(geometry: typingsSlinky.ol.multiLineStringMod.default): Unit = js.native
    def drawMultiLineString(geometry: typingsSlinky.ol.renderFeatureMod.default): Unit = js.native
    
    /**
      * Render a MultiPoint geometry  into the canvas.  Rendering is immediate and
      * uses the current style.
      */
    def drawMultiPoint(geometry: typingsSlinky.ol.multiPointMod.default): Unit = js.native
    def drawMultiPoint(geometry: typingsSlinky.ol.renderFeatureMod.default): Unit = js.native
    
    /**
      * Render MultiPolygon geometry into the canvas.  Rendering is immediate and
      * uses the current style.
      */
    def drawMultiPolygon(geometry: typingsSlinky.ol.multiPolygonMod.default): Unit = js.native
    
    /**
      * Render a Point geometry into the canvas.  Rendering is immediate and uses
      * the current style.
      */
    def drawPoint(geometry: typingsSlinky.ol.pointMod.default): Unit = js.native
    def drawPoint(geometry: typingsSlinky.ol.renderFeatureMod.default): Unit = js.native
    
    /**
      * Render a Polygon geometry into the canvas.  Rendering is immediate and uses
      * the current style.
      */
    def drawPolygon(geometry: typingsSlinky.ol.polygonMod.default): Unit = js.native
    def drawPolygon(geometry: typingsSlinky.ol.renderFeatureMod.default): Unit = js.native
    
    def setTransform(transform: Transform): Unit = js.native
  }
}
