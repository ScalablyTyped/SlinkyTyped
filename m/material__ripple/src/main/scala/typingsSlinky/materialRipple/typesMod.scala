package typingsSlinky.materialRipple

import org.scalajs.dom.raw.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  @js.native
  trait MDCRippleAttachOpts extends StObject {
    
    var isUnbounded: js.UndefOr[Boolean] = js.native
  }
  object MDCRippleAttachOpts {
    
    @scala.inline
    def apply(): MDCRippleAttachOpts = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MDCRippleAttachOpts]
    }
    
    @scala.inline
    implicit class MDCRippleAttachOptsMutableBuilder[Self <: MDCRippleAttachOpts] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIsUnbounded(value: Boolean): Self = StObject.set(x, "isUnbounded", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsUnboundedUndefined: Self = StObject.set(x, "isUnbounded", js.undefined)
    }
  }
  
  @js.native
  trait MDCRippleCapableSurface extends StObject {
    
    var disabled: js.UndefOr[Boolean] = js.native
    
    var root: Element = js.native
    
    var unbounded: js.UndefOr[Boolean] = js.native
  }
  object MDCRippleCapableSurface {
    
    @scala.inline
    def apply(root: Element): MDCRippleCapableSurface = {
      val __obj = js.Dynamic.literal(root = root.asInstanceOf[js.Any])
      __obj.asInstanceOf[MDCRippleCapableSurface]
    }
    
    @scala.inline
    implicit class MDCRippleCapableSurfaceMutableBuilder[Self <: MDCRippleCapableSurface] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setRoot(value: Element): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnbounded(value: Boolean): Self = StObject.set(x, "unbounded", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnboundedUndefined: Self = StObject.set(x, "unbounded", js.undefined)
    }
  }
  
  @js.native
  trait MDCRipplePoint extends StObject {
    
    var x: Double = js.native
    
    var y: Double = js.native
  }
  object MDCRipplePoint {
    
    @scala.inline
    def apply(x: Double, y: Double): MDCRipplePoint = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[MDCRipplePoint]
    }
    
    @scala.inline
    implicit class MDCRipplePointMutableBuilder[Self <: MDCRipplePoint] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
}
