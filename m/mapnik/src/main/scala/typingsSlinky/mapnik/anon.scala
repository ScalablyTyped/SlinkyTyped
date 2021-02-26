package typingsSlinky.mapnik

import typingsSlinky.mapnik.mapnikStrings.DEFAULT
import typingsSlinky.mapnik.mapnikStrings.FILTERED
import typingsSlinky.mapnik.mapnikStrings.FIXED
import typingsSlinky.mapnik.mapnikStrings.HUFFMAN_ONLY
import typingsSlinky.mapnik.mapnikStrings.RLE
import typingsSlinky.mapnik.mapnikStrings.jpeg
import typingsSlinky.mapnik.mapnikStrings.png
import typingsSlinky.mapnik.mapnikStrings.tiff
import typingsSlinky.mapnik.mapnikStrings.webp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Areathreshold extends StObject {
    
    var area_threshold: js.UndefOr[Double] = js.native
    
    var fill_type: js.UndefOr[Double] = js.native
    
    var multi_polygon_union: js.UndefOr[Boolean] = js.native
    
    var process_all_rings: js.UndefOr[Boolean] = js.native
    
    var simplify_distance: js.UndefOr[Double] = js.native
    
    var strictly_simple: js.UndefOr[Boolean] = js.native
  }
  object Areathreshold {
    
    @scala.inline
    def apply(): Areathreshold = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Areathreshold]
    }
    
    @scala.inline
    implicit class AreathresholdMutableBuilder[Self <: Areathreshold] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArea_threshold(value: Double): Self = StObject.set(x, "area_threshold", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArea_thresholdUndefined: Self = StObject.set(x, "area_threshold", js.undefined)
      
      @scala.inline
      def setFill_type(value: Double): Self = StObject.set(x, "fill_type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFill_typeUndefined: Self = StObject.set(x, "fill_type", js.undefined)
      
      @scala.inline
      def setMulti_polygon_union(value: Boolean): Self = StObject.set(x, "multi_polygon_union", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMulti_polygon_unionUndefined: Self = StObject.set(x, "multi_polygon_union", js.undefined)
      
      @scala.inline
      def setProcess_all_rings(value: Boolean): Self = StObject.set(x, "process_all_rings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProcess_all_ringsUndefined: Self = StObject.set(x, "process_all_rings", js.undefined)
      
      @scala.inline
      def setSimplify_distance(value: Double): Self = StObject.set(x, "simplify_distance", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSimplify_distanceUndefined: Self = StObject.set(x, "simplify_distance", js.undefined)
      
      @scala.inline
      def setStrictly_simple(value: Boolean): Self = StObject.set(x, "strictly_simple", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrictly_simpleUndefined: Self = StObject.set(x, "strictly_simple", js.undefined)
    }
  }
  
  @js.native
  trait Callback extends StObject {
    
    var area_threshold: js.UndefOr[Double] = js.native
    
    var callback: js.UndefOr[js.Function1[/* err */ js.Error, Unit]] = js.native
    
    var fill_type: js.UndefOr[Double] = js.native
    
    var image_format: js.UndefOr[webp | jpeg | png | tiff] = js.native
    
    var max_extent: js.UndefOr[js.Tuple4[Double, Double, Double, Double]] = js.native
    
    var multi_polygon_union: js.UndefOr[Boolean] = js.native
    
    var offset_x: js.UndefOr[Double] = js.native
    
    var offset_y: js.UndefOr[Double] = js.native
    
    var process_all_rings: js.UndefOr[Boolean] = js.native
    
    var reencode: js.UndefOr[Boolean] = js.native
    
    var scale_denominator: js.UndefOr[Double] = js.native
    
    var scale_factor: js.UndefOr[Double] = js.native
    
    var scaling_method: js.UndefOr[String] = js.native
    
    var simplify_distance: js.UndefOr[Double] = js.native
    
    var strictly_simple: js.UndefOr[Boolean] = js.native
    
    var threading_mode: js.UndefOr[String] = js.native
  }
  object Callback {
    
    @scala.inline
    def apply(): Callback = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Callback]
    }
    
    @scala.inline
    implicit class CallbackMutableBuilder[Self <: Callback] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArea_threshold(value: Double): Self = StObject.set(x, "area_threshold", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArea_thresholdUndefined: Self = StObject.set(x, "area_threshold", js.undefined)
      
      @scala.inline
      def setCallback(value: /* err */ js.Error => Unit): Self = StObject.set(x, "callback", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      @scala.inline
      def setFill_type(value: Double): Self = StObject.set(x, "fill_type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFill_typeUndefined: Self = StObject.set(x, "fill_type", js.undefined)
      
      @scala.inline
      def setImage_format(value: webp | jpeg | png | tiff): Self = StObject.set(x, "image_format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImage_formatUndefined: Self = StObject.set(x, "image_format", js.undefined)
      
      @scala.inline
      def setMax_extent(value: js.Tuple4[Double, Double, Double, Double]): Self = StObject.set(x, "max_extent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMax_extentUndefined: Self = StObject.set(x, "max_extent", js.undefined)
      
      @scala.inline
      def setMulti_polygon_union(value: Boolean): Self = StObject.set(x, "multi_polygon_union", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMulti_polygon_unionUndefined: Self = StObject.set(x, "multi_polygon_union", js.undefined)
      
      @scala.inline
      def setOffset_x(value: Double): Self = StObject.set(x, "offset_x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffset_xUndefined: Self = StObject.set(x, "offset_x", js.undefined)
      
      @scala.inline
      def setOffset_y(value: Double): Self = StObject.set(x, "offset_y", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffset_yUndefined: Self = StObject.set(x, "offset_y", js.undefined)
      
      @scala.inline
      def setProcess_all_rings(value: Boolean): Self = StObject.set(x, "process_all_rings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProcess_all_ringsUndefined: Self = StObject.set(x, "process_all_rings", js.undefined)
      
      @scala.inline
      def setReencode(value: Boolean): Self = StObject.set(x, "reencode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReencodeUndefined: Self = StObject.set(x, "reencode", js.undefined)
      
      @scala.inline
      def setScale_denominator(value: Double): Self = StObject.set(x, "scale_denominator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScale_denominatorUndefined: Self = StObject.set(x, "scale_denominator", js.undefined)
      
      @scala.inline
      def setScale_factor(value: Double): Self = StObject.set(x, "scale_factor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScale_factorUndefined: Self = StObject.set(x, "scale_factor", js.undefined)
      
      @scala.inline
      def setScaling_method(value: String): Self = StObject.set(x, "scaling_method", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScaling_methodUndefined: Self = StObject.set(x, "scaling_method", js.undefined)
      
      @scala.inline
      def setSimplify_distance(value: Double): Self = StObject.set(x, "simplify_distance", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSimplify_distanceUndefined: Self = StObject.set(x, "simplify_distance", js.undefined)
      
      @scala.inline
      def setStrictly_simple(value: Boolean): Self = StObject.set(x, "strictly_simple", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrictly_simpleUndefined: Self = StObject.set(x, "strictly_simple", js.undefined)
      
      @scala.inline
      def setThreading_mode(value: String): Self = StObject.set(x, "threading_mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThreading_modeUndefined: Self = StObject.set(x, "threading_mode", js.undefined)
    }
  }
  
  @js.native
  trait Compression extends StObject {
    
    var compression: js.UndefOr[Double] = js.native
    
    var level: js.UndefOr[Double] = js.native
    
    var strategy: js.UndefOr[FILTERED | HUFFMAN_ONLY | RLE | FIXED | DEFAULT] = js.native
  }
  object Compression {
    
    @scala.inline
    def apply(): Compression = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Compression]
    }
    
    @scala.inline
    implicit class CompressionMutableBuilder[Self <: Compression] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCompression(value: Double): Self = StObject.set(x, "compression", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompressionUndefined: Self = StObject.set(x, "compression", js.undefined)
      
      @scala.inline
      def setLevel(value: Double): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
      
      @scala.inline
      def setStrategy(value: FILTERED | HUFFMAN_ONLY | RLE | FIXED | DEFAULT): Self = StObject.set(x, "strategy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrategyUndefined: Self = StObject.set(x, "strategy", js.undefined)
    }
  }
  
  @js.native
  trait Filltype extends StObject {
    
    var area_threshold: js.UndefOr[Double] = js.native
    
    var fill_type: js.UndefOr[Double] = js.native
    
    var image_format: js.UndefOr[webp | jpeg | png | tiff] = js.native
    
    var max_extent: js.UndefOr[js.Tuple4[Double, Double, Double, Double]] = js.native
    
    var multi_polygon_union: js.UndefOr[Boolean] = js.native
    
    var offset_x: js.UndefOr[Double] = js.native
    
    var offset_y: js.UndefOr[Double] = js.native
    
    var process_all_rings: js.UndefOr[Boolean] = js.native
    
    var reencode: js.UndefOr[Boolean] = js.native
    
    var scale_denominator: js.UndefOr[Double] = js.native
    
    var scale_factor: js.UndefOr[Double] = js.native
    
    var scaling_method: js.UndefOr[String] = js.native
    
    var simplify_distance: js.UndefOr[Double] = js.native
    
    var strictly_simple: js.UndefOr[Boolean] = js.native
    
    var threading_mode: js.UndefOr[String] = js.native
  }
  object Filltype {
    
    @scala.inline
    def apply(): Filltype = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Filltype]
    }
    
    @scala.inline
    implicit class FilltypeMutableBuilder[Self <: Filltype] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArea_threshold(value: Double): Self = StObject.set(x, "area_threshold", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArea_thresholdUndefined: Self = StObject.set(x, "area_threshold", js.undefined)
      
      @scala.inline
      def setFill_type(value: Double): Self = StObject.set(x, "fill_type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFill_typeUndefined: Self = StObject.set(x, "fill_type", js.undefined)
      
      @scala.inline
      def setImage_format(value: webp | jpeg | png | tiff): Self = StObject.set(x, "image_format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImage_formatUndefined: Self = StObject.set(x, "image_format", js.undefined)
      
      @scala.inline
      def setMax_extent(value: js.Tuple4[Double, Double, Double, Double]): Self = StObject.set(x, "max_extent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMax_extentUndefined: Self = StObject.set(x, "max_extent", js.undefined)
      
      @scala.inline
      def setMulti_polygon_union(value: Boolean): Self = StObject.set(x, "multi_polygon_union", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMulti_polygon_unionUndefined: Self = StObject.set(x, "multi_polygon_union", js.undefined)
      
      @scala.inline
      def setOffset_x(value: Double): Self = StObject.set(x, "offset_x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffset_xUndefined: Self = StObject.set(x, "offset_x", js.undefined)
      
      @scala.inline
      def setOffset_y(value: Double): Self = StObject.set(x, "offset_y", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffset_yUndefined: Self = StObject.set(x, "offset_y", js.undefined)
      
      @scala.inline
      def setProcess_all_rings(value: Boolean): Self = StObject.set(x, "process_all_rings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProcess_all_ringsUndefined: Self = StObject.set(x, "process_all_rings", js.undefined)
      
      @scala.inline
      def setReencode(value: Boolean): Self = StObject.set(x, "reencode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReencodeUndefined: Self = StObject.set(x, "reencode", js.undefined)
      
      @scala.inline
      def setScale_denominator(value: Double): Self = StObject.set(x, "scale_denominator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScale_denominatorUndefined: Self = StObject.set(x, "scale_denominator", js.undefined)
      
      @scala.inline
      def setScale_factor(value: Double): Self = StObject.set(x, "scale_factor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScale_factorUndefined: Self = StObject.set(x, "scale_factor", js.undefined)
      
      @scala.inline
      def setScaling_method(value: String): Self = StObject.set(x, "scaling_method", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScaling_methodUndefined: Self = StObject.set(x, "scaling_method", js.undefined)
      
      @scala.inline
      def setSimplify_distance(value: Double): Self = StObject.set(x, "simplify_distance", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSimplify_distanceUndefined: Self = StObject.set(x, "simplify_distance", js.undefined)
      
      @scala.inline
      def setStrictly_simple(value: Boolean): Self = StObject.set(x, "strictly_simple", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrictly_simpleUndefined: Self = StObject.set(x, "strictly_simple", js.undefined)
      
      @scala.inline
      def setThreading_mode(value: String): Self = StObject.set(x, "threading_mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThreading_modeUndefined: Self = StObject.set(x, "threading_mode", js.undefined)
    }
  }
  
  @js.native
  trait Imageformat extends StObject {
    
    var image_format: js.UndefOr[String] = js.native
    
    var image_scaling: js.UndefOr[String] = js.native
  }
  object Imageformat {
    
    @scala.inline
    def apply(): Imageformat = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Imageformat]
    }
    
    @scala.inline
    implicit class ImageformatMutableBuilder[Self <: Imageformat] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setImage_format(value: String): Self = StObject.set(x, "image_format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImage_formatUndefined: Self = StObject.set(x, "image_format", js.undefined)
      
      @scala.inline
      def setImage_scaling(value: String): Self = StObject.set(x, "image_scaling", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImage_scalingUndefined: Self = StObject.set(x, "image_scaling", js.undefined)
    }
  }
  
  @js.native
  trait Imagescaling extends StObject {
    
    var image_format: js.UndefOr[webp | jpeg | png | tiff] = js.native
    
    var image_scaling: js.UndefOr[String] = js.native
  }
  object Imagescaling {
    
    @scala.inline
    def apply(): Imagescaling = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Imagescaling]
    }
    
    @scala.inline
    implicit class ImagescalingMutableBuilder[Self <: Imagescaling] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setImage_format(value: webp | jpeg | png | tiff): Self = StObject.set(x, "image_format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImage_formatUndefined: Self = StObject.set(x, "image_format", js.undefined)
      
      @scala.inline
      def setImage_scaling(value: String): Self = StObject.set(x, "image_scaling", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImage_scalingUndefined: Self = StObject.set(x, "image_scaling", js.undefined)
    }
  }
  
  @js.native
  trait Layer extends StObject {
    
    var layer: js.UndefOr[String] = js.native
    
    var tolerance: js.UndefOr[Double] = js.native
  }
  object Layer {
    
    @scala.inline
    def apply(): Layer = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Layer]
    }
    
    @scala.inline
    implicit class LayerMutableBuilder[Self <: Layer] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLayer(value: String): Self = StObject.set(x, "layer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLayerUndefined: Self = StObject.set(x, "layer", js.undefined)
      
      @scala.inline
      def setTolerance(value: Double): Self = StObject.set(x, "tolerance", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToleranceUndefined: Self = StObject.set(x, "tolerance", js.undefined)
    }
  }
  
  @js.native
  trait Upgrade extends StObject {
    
    var upgrade: js.UndefOr[Boolean] = js.native
    
    var validate: js.UndefOr[Boolean] = js.native
  }
  object Upgrade {
    
    @scala.inline
    def apply(): Upgrade = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Upgrade]
    }
    
    @scala.inline
    implicit class UpgradeMutableBuilder[Self <: Upgrade] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setUpgrade(value: Boolean): Self = StObject.set(x, "upgrade", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpgradeUndefined: Self = StObject.set(x, "upgrade", js.undefined)
      
      @scala.inline
      def setValidate(value: Boolean): Self = StObject.set(x, "validate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValidateUndefined: Self = StObject.set(x, "validate", js.undefined)
    }
  }
}
