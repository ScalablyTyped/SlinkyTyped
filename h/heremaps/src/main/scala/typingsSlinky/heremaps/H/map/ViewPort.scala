package typingsSlinky.heremaps.H.map

import org.scalajs.dom.raw.Element
import typingsSlinky.heremaps.H.map.ViewPort.Padding
import typingsSlinky.heremaps.H.math.Point
import typingsSlinky.heremaps.H.util.EventTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * ViewPort object holds information about the HTML element where the map is rendered. It contains information regarding the element (view port) size and triggers events when the element size
  * is changed.
  * @property element {Element} - This property holds the HTML element, which defines the viewport.
  * @property width {number} - This property holds this viewport&#x27;s current width
  * @property height {number} - This property holds this viewport&#x27;s current height
  * @property margin {number} - This property holds this viewport&#x27;s current margin value
  * @property padding {H.map.ViewPort.Padding} - This property holds this viewport&#x27;s current padding
  * @property center {H.math.Point} - This property holds this viewport&#x27;s current center point
  */
@js.native
trait ViewPort
  extends EventTarget
     with IInteraction {
  
  def addOnDisposeCallback(callback: js.Function0[Unit], opt_scope: js.Object): Unit = js.native
  
  var center: Point = js.native
  
  var element: Element = js.native
  
  var height: Double = js.native
  
  var margin: Double = js.native
  
  var padding: Padding = js.native
  
  /**
    * This method updates size of the viewport according to container size. It must be called whenever the HTML element changed size in order to update the map&#x27;s viewport values.
    */
  def resize(): Unit = js.native
  
  /**
    * This method sets the margin on the viewPort
    * @param margin {number} - margin which is used to fetch map data
    */
  def setMargin(margin: Double): Unit = js.native
  
  /**
    * This method sets the padding on the viewport. Padding will result in shifted map center which will be the visual center of the padded area.
    * @param top {number} - padding from the top
    * @param right {number} - padding from the right
    * @param bottom {number} - padding from the bottom
    * @param left {number} - padding from the left
    */
  def setPadding(top: Double, right: Double, bottom: Double, left: Double): Unit = js.native
  
  var width: Double = js.native
}
object ViewPort {
  
  /**
    * Options which may be used to initialize new ViewPort instance
    * @property margin {number=} - The size in pixel of the supplemental area to render for each side of the map
    * @property padding {H.map.ViewPort.Padding=} - The padding in pixels for each side of the map
    * @property fixedCenter {boolean=} - Indicates whether the center of the map should remain unchanged if the viewport's size or or padding has been changed, default is true
    */
  @js.native
  trait Options extends StObject {
    
    var fixedCenter: js.UndefOr[Boolean] = js.native
    
    var margin: js.UndefOr[Double] = js.native
    
    var padding: js.UndefOr[Padding] = js.native
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
      def setFixedCenter(value: Boolean): Self = StObject.set(x, "fixedCenter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFixedCenterUndefined: Self = StObject.set(x, "fixedCenter", js.undefined)
      
      @scala.inline
      def setMargin(value: Double): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
      
      @scala.inline
      def setPadding(value: Padding): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    }
  }
  
  /**
    * Represents viewport padding definition.
    * @property top {number} - the padding on the top edge (in pixels)
    * @property right {number} - the padding on the right edge (in pixels)
    * @property bottom {number} - the padding on the bottom edge (in pixels)
    * @property left {number} - the padding on the left edge (in pixels)
    */
  @js.native
  trait Padding extends StObject {
    
    var bottom: Double = js.native
    
    var left: Double = js.native
    
    var right: Double = js.native
    
    var top: Double = js.native
  }
  object Padding {
    
    @scala.inline
    def apply(bottom: Double, left: Double, right: Double, top: Double): Padding = {
      val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
      __obj.asInstanceOf[Padding]
    }
    
    @scala.inline
    implicit class PaddingMutableBuilder[Self <: Padding] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBottom(value: Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRight(value: Double): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    }
  }
}
