package typingsSlinky.ol

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.ol.coordinateMod.Coordinate
import typingsSlinky.ol.olFeatureMod.FeatureLike
import typingsSlinky.ol.renderMod.State
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object styleStyleMod {
  
  @JSImport("ol/style/Style", JSImport.Default)
  @js.native
  class default () extends Style {
    def this(opt_options: Options) = this()
  }
  
  @JSImport("ol/style/Style", "createDefaultStyle")
  @js.native
  def createDefaultStyle(feature: FeatureLike, resolution: Double): js.Array[Style] = js.native
  
  @JSImport("ol/style/Style", "createEditingStyle")
  @js.native
  def createEditingStyle(): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in ol.ol/geom/GeometryType.GeometryType ]: std.Array<ol.ol/style/Style.Style>}
    */ typingsSlinky.ol.olStrings.createEditingStyle with TopLevel[js.Any] = js.native
  
  @JSImport("ol/style/Style", "toFunction")
  @js.native
  def toFunction(obj: js.Array[Style]): StyleFunction = js.native
  @JSImport("ol/style/Style", "toFunction")
  @js.native
  def toFunction(obj: Style): StyleFunction = js.native
  @JSImport("ol/style/Style", "toFunction")
  @js.native
  def toFunction(obj: StyleFunction): StyleFunction = js.native
  
  type GeometryFunction = js.Function1[
    /* p0 */ FeatureLike, 
    js.UndefOr[typingsSlinky.ol.geometryMod.default | typingsSlinky.ol.renderFeatureMod.default]
  ]
  
  @js.native
  trait Options extends StObject {
    
    var fill: js.UndefOr[typingsSlinky.ol.fillMod.default] = js.native
    
    var geometry: js.UndefOr[String | typingsSlinky.ol.geometryMod.default | GeometryFunction] = js.native
    
    var image: js.UndefOr[typingsSlinky.ol.styleImageMod.default] = js.native
    
    var renderer: js.UndefOr[RenderFunction] = js.native
    
    var stroke: js.UndefOr[typingsSlinky.ol.strokeMod.default] = js.native
    
    var text: js.UndefOr[typingsSlinky.ol.textMod.default] = js.native
    
    var zIndex: js.UndefOr[Double] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFill(value: typingsSlinky.ol.fillMod.default): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      @scala.inline
      def setGeometry(value: String | typingsSlinky.ol.geometryMod.default | GeometryFunction): Self = StObject.set(x, "geometry", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGeometryFunction1(
        value: /* p0 */ FeatureLike => js.UndefOr[typingsSlinky.ol.geometryMod.default | typingsSlinky.ol.renderFeatureMod.default]
      ): Self = StObject.set(x, "geometry", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGeometryUndefined: Self = StObject.set(x, "geometry", js.undefined)
      
      @scala.inline
      def setImage(value: typingsSlinky.ol.styleImageMod.default): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
      
      @scala.inline
      def setRenderer(
        value: (/* p0 */ Coordinate | (js.Array[js.Array[Coordinate] | Coordinate]), /* p1 */ State) => Unit
      ): Self = StObject.set(x, "renderer", js.Any.fromFunction2(value))
      
      @scala.inline
      def setRendererUndefined: Self = StObject.set(x, "renderer", js.undefined)
      
      @scala.inline
      def setStroke(value: typingsSlinky.ol.strokeMod.default): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrokeUndefined: Self = StObject.set(x, "stroke", js.undefined)
      
      @scala.inline
      def setText(value: typingsSlinky.ol.textMod.default): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      @scala.inline
      def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
    }
  }
  
  type RenderFunction = js.Function2[
    /* p0 */ Coordinate | (js.Array[js.Array[Coordinate] | Coordinate]), 
    /* p1 */ State, 
    Unit
  ]
  
  @js.native
  trait Style extends StObject {
    
    /**
      * Get the fill style.
      */
    def getFill(): typingsSlinky.ol.fillMod.default = js.native
    
    /**
      * Get the geometry to be rendered.
      */
    def getGeometry(): String | typingsSlinky.ol.geometryMod.default | GeometryFunction = js.native
    
    /**
      * Get the function used to generate a geometry for rendering.
      */
    def getGeometryFunction(): GeometryFunction = js.native
    
    /**
      * Get the image style.
      */
    def getImage(): typingsSlinky.ol.styleImageMod.default = js.native
    
    /**
      * Get the custom renderer function that was configured with
      * {@link #setRenderer} or the renderer constructor option.
      */
    def getRenderer(): RenderFunction | Null = js.native
    
    /**
      * Get the stroke style.
      */
    def getStroke(): typingsSlinky.ol.strokeMod.default = js.native
    
    /**
      * Get the text style.
      */
    def getText(): typingsSlinky.ol.textMod.default = js.native
    
    /**
      * Get the z-index for the style.
      */
    def getZIndex(): js.UndefOr[Double] = js.native
    
    /**
      * Set the fill style.
      */
    def setFill(fill: typingsSlinky.ol.fillMod.default): Unit = js.native
    
    /**
      * Set a geometry that is rendered instead of the feature's geometry.
      */
    def setGeometry(geometry: String): Unit = js.native
    def setGeometry(geometry: typingsSlinky.ol.geometryMod.default): Unit = js.native
    def setGeometry(geometry: GeometryFunction): Unit = js.native
    
    /**
      * Set the image style.
      */
    def setImage(image: typingsSlinky.ol.styleImageMod.default): Unit = js.native
    
    /**
      * Sets a custom renderer function for this style. When set, fill, stroke
      * and image options of the style will be ignored.
      */
    def setRenderer(): Unit = js.native
    def setRenderer(renderer: RenderFunction): Unit = js.native
    
    /**
      * Set the stroke style.
      */
    def setStroke(stroke: typingsSlinky.ol.strokeMod.default): Unit = js.native
    
    /**
      * Set the text style.
      */
    def setText(text: typingsSlinky.ol.textMod.default): Unit = js.native
    
    /**
      * Set the z-index.
      */
    def setZIndex(): Unit = js.native
    def setZIndex(zIndex: Double): Unit = js.native
  }
  
  type StyleFunction = js.Function2[/* p0 */ FeatureLike, /* p1 */ Double, Style | js.Array[Style]]
  
  type StyleLike = Style | js.Array[Style] | StyleFunction
}
