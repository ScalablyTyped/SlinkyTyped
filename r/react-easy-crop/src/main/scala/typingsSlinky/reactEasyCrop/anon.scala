package typingsSlinky.reactEasyCrop

import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.reactEasyCrop.typesMod.Area
import typingsSlinky.reactEasyCrop.typesMod.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait ContainerClassName extends StObject {
    
    var containerClassName: js.UndefOr[String] = js.native
    
    var cropAreaClassName: js.UndefOr[String] = js.native
    
    var mediaClassName: js.UndefOr[String] = js.native
  }
  object ContainerClassName {
    
    @scala.inline
    def apply(): ContainerClassName = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ContainerClassName]
    }
    
    @scala.inline
    implicit class ContainerClassNameMutableBuilder[Self <: ContainerClassName] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContainerClassName(value: String): Self = StObject.set(x, "containerClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainerClassNameUndefined: Self = StObject.set(x, "containerClassName", js.undefined)
      
      @scala.inline
      def setCropAreaClassName(value: String): Self = StObject.set(x, "cropAreaClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCropAreaClassNameUndefined: Self = StObject.set(x, "cropAreaClassName", js.undefined)
      
      @scala.inline
      def setMediaClassName(value: String): Self = StObject.set(x, "mediaClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMediaClassNameUndefined: Self = StObject.set(x, "mediaClassName", js.undefined)
    }
  }
  
  @js.native
  trait ContainerStyle extends StObject {
    
    var containerStyle: js.UndefOr[CSSProperties] = js.native
    
    var cropAreaStyle: js.UndefOr[CSSProperties] = js.native
    
    var mediaStyle: js.UndefOr[CSSProperties] = js.native
  }
  object ContainerStyle {
    
    @scala.inline
    def apply(): ContainerStyle = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ContainerStyle]
    }
    
    @scala.inline
    implicit class ContainerStyleMutableBuilder[Self <: ContainerStyle] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContainerStyle(value: CSSProperties): Self = StObject.set(x, "containerStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainerStyleUndefined: Self = StObject.set(x, "containerStyle", js.undefined)
      
      @scala.inline
      def setCropAreaStyle(value: CSSProperties): Self = StObject.set(x, "cropAreaStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCropAreaStyleUndefined: Self = StObject.set(x, "cropAreaStyle", js.undefined)
      
      @scala.inline
      def setMediaStyle(value: CSSProperties): Self = StObject.set(x, "mediaStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMediaStyleUndefined: Self = StObject.set(x, "mediaStyle", js.undefined)
    }
  }
  
  @js.native
  trait Crop extends StObject {
    
    var crop: Point = js.native
    
    var zoom: Double = js.native
  }
  object Crop {
    
    @scala.inline
    def apply(crop: Point, zoom: Double): Crop = {
      val __obj = js.Dynamic.literal(crop = crop.asInstanceOf[js.Any], zoom = zoom.asInstanceOf[js.Any])
      __obj.asInstanceOf[Crop]
    }
    
    @scala.inline
    implicit class CropMutableBuilder[Self <: Crop] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCrop(value: Point): Self = StObject.set(x, "crop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZoom(value: Double): Self = StObject.set(x, "zoom", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait CroppedAreaPercentages extends StObject {
    
    var croppedAreaPercentages: Area = js.native
    
    var croppedAreaPixels: Area = js.native
  }
  object CroppedAreaPercentages {
    
    @scala.inline
    def apply(croppedAreaPercentages: Area, croppedAreaPixels: Area): CroppedAreaPercentages = {
      val __obj = js.Dynamic.literal(croppedAreaPercentages = croppedAreaPercentages.asInstanceOf[js.Any], croppedAreaPixels = croppedAreaPixels.asInstanceOf[js.Any])
      __obj.asInstanceOf[CroppedAreaPercentages]
    }
    
    @scala.inline
    implicit class CroppedAreaPercentagesMutableBuilder[Self <: CroppedAreaPercentages] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCroppedAreaPercentages(value: Area): Self = StObject.set(x, "croppedAreaPercentages", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCroppedAreaPixels(value: Area): Self = StObject.set(x, "croppedAreaPixels", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait X extends StObject {
    
    var x: Double = js.native
    
    var y: Double = js.native
  }
  object X {
    
    @scala.inline
    def apply(x: Double, y: Double): X = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[X]
    }
    
    @scala.inline
    implicit class XMutableBuilder[Self <: X] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
}
