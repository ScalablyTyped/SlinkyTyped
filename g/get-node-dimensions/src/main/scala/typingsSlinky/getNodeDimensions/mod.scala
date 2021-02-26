package typingsSlinky.getNodeDimensions

import org.scalajs.dom.raw.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("get-node-dimensions", JSImport.Namespace)
  @js.native
  def apply(element: HTMLElement): NodeDimensions = js.native
  @JSImport("get-node-dimensions", JSImport.Namespace)
  @js.native
  def apply(element: HTMLElement, options: NodeDimensionsOptions): NodeDimensions = js.native
  
  @js.native
  trait NodeDimensions extends StObject {
    
    var bottom: Double = js.native
    
    var height: Double = js.native
    
    var left: Double = js.native
    
    var right: Double = js.native
    
    var top: Double = js.native
    
    var width: Double = js.native
  }
  object NodeDimensions {
    
    @scala.inline
    def apply(bottom: Double, height: Double, left: Double, right: Double, top: Double, width: Double): NodeDimensions = {
      val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[NodeDimensions]
    }
    
    @scala.inline
    implicit class NodeDimensionsMutableBuilder[Self <: NodeDimensions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBottom(value: Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRight(value: Double): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait NodeDimensionsOptions extends StObject {
    
    @JSName("clone")
    var clone_FNodeDimensionsOptions: js.UndefOr[Boolean] = js.native
    
    var display: js.UndefOr[String] = js.native
    
    var height: js.UndefOr[String] = js.native
    
    var margin: js.UndefOr[Boolean] = js.native
    
    var width: js.UndefOr[String] = js.native
  }
  object NodeDimensionsOptions {
    
    @scala.inline
    def apply(): NodeDimensionsOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NodeDimensionsOptions]
    }
    
    @scala.inline
    implicit class NodeDimensionsOptionsMutableBuilder[Self <: NodeDimensionsOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClone_(value: Boolean): Self = StObject.set(x, "clone", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClone_Undefined: Self = StObject.set(x, "clone", js.undefined)
      
      @scala.inline
      def setDisplay(value: String): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisplayUndefined: Self = StObject.set(x, "display", js.undefined)
      
      @scala.inline
      def setHeight(value: String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setMargin(value: Boolean): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
      
      @scala.inline
      def setWidth(value: String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
