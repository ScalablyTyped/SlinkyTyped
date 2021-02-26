package typingsSlinky.googlemaps.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @see {@link https://developers.google.com/maps/documentation/javascript/reference/coordinates#Padding Maps JavaScript API}
  */
@js.native
trait Padding extends StObject {
  
  /**
    * Padding for the bottom, in pixels.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/coordinates#Padding.bottom Maps JavaScript API}
    */
  var bottom: js.UndefOr[Double] = js.native
  
  /**
    * Padding for the left, in pixels.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/coordinates#Padding.left Maps JavaScript API}
    */
  var left: js.UndefOr[Double] = js.native
  
  /**
    * Padding for the right, in pixels.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/coordinates#Padding.right Maps JavaScript API}
    */
  var right: js.UndefOr[Double] = js.native
  
  /**
    * Padding for the top, in pixels.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/coordinates#Padding.top Maps JavaScript API}
    */
  var top: js.UndefOr[Double] = js.native
}
object Padding {
  
  @scala.inline
  def apply(): Padding = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Padding]
  }
  
  @scala.inline
  implicit class PaddingMutableBuilder[Self <: Padding] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBottom(value: Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBottomUndefined: Self = StObject.set(x, "bottom", js.undefined)
    
    @scala.inline
    def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
    
    @scala.inline
    def setRight(value: Double): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
    
    @scala.inline
    def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
  }
}
