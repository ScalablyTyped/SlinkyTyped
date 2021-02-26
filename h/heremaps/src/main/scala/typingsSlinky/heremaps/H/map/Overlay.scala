package typingsSlinky.heremaps.H.map

import org.scalajs.dom.raw.HTMLCanvasElement
import org.scalajs.dom.raw.HTMLImageElement
import typingsSlinky.heremaps.H.map.provider.Provider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This class represents an overlay, which offers a bitmap that covers a geographical reactangular area on the map.
  */
@js.native
trait Overlay extends Object {
  
  /**
    * Returns this overlay's current bitmap.
    * @returns {?(HTMLImageElement | HTMLCanvasElement)} - the bitmap of this Overlay or null if it isn't ready yet
    */
  def getBitmap(): HTMLImageElement | HTMLCanvasElement = js.native
  
  /**
    * This method returns this overlay's current bounds.
    * @returns {H.geo.Rect}
    */
  def getBounds(): typingsSlinky.heremaps.H.geo.Rect = js.native
  
  /**
    * Returns this overlay's current opacity.
    * @returns {number}
    */
  def getOpacity(): Double = js.native
  
  /**
    * Sets the overlay's current bitmap.
    * @param bitmap {!(string | HTMLImageElement | HTMLCanvasElement)} - Either an image URL, a SVG markup, an image or a canvas.
    * @returns {H.map.Overlay} - the overlay itself
    */
  def setBitmap(bitmap: String): Overlay = js.native
  def setBitmap(bitmap: HTMLCanvasElement): Overlay = js.native
  def setBitmap(bitmap: HTMLImageElement): Overlay = js.native
  
  /**
    * This method sets the overlay's current bounds.
    * @param bounds {H.geo.Rect}
    * @returns {H.map.Overlay} - the overlay itself
    */
  def setBounds(bounds: typingsSlinky.heremaps.H.geo.Rect): Overlay = js.native
  
  /**
    * Sets the overlay's current opacity.
    * @param opacity {number} - The opacity in range from 0 (transparent) to 1 (opaque).
    * @returns {H.map.Overlay} - the overlay itself
    */
  def setOpacity(opacity: Double): Overlay = js.native
}
object Overlay {
  
  /**
    * Options used to initialize an Overlay
    * @property min {number=} - The minimum zoom level for which the object is visible, default is -Infinity
    * @property max {number=} - The maximum zoom level for which the object is visible, default is Infinity
    * @property opacity {number=} - The opacity of the object in range from 0 (transparent) to 1 (opaque), default is 1.
    * @property visibility {boolean=} - Indicates whether the map object is visible at all, default is true.
    * @property zIndex {number=} - The z-index value of the map object, default is 0
    * @property provider {(H.map.provider.Provider | null)=} - The provider of this object. This property is only needed if a customized Implementation of ObjectProvider wants to instantiate
    * an object.
    * @property data {*} - Optional arbitrary data to be stored with this map object. This data can be retrieved by calling getData.
    */
  @js.native
  trait Options extends StObject {
    
    var data: js.UndefOr[js.Any] = js.native
    
    var max: js.UndefOr[Double] = js.native
    
    var min: js.UndefOr[Double] = js.native
    
    var opacity: js.UndefOr[Double] = js.native
    
    var provider: js.UndefOr[Provider] = js.native
    
    var visibility: js.UndefOr[Boolean] = js.native
    
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
      def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      @scala.inline
      def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
      
      @scala.inline
      def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      @scala.inline
      def setProvider(value: Provider): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProviderUndefined: Self = StObject.set(x, "provider", js.undefined)
      
      @scala.inline
      def setVisibility(value: Boolean): Self = StObject.set(x, "visibility", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisibilityUndefined: Self = StObject.set(x, "visibility", js.undefined)
      
      @scala.inline
      def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
    }
  }
}
