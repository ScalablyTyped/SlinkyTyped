package typingsSlinky.arcgisJsApi.esri

import org.scalablytyped.runtime.Instantiable1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ColorConstructor
  extends Instantiable1[
      (/* color */ js.Any) | (/* color */ js.Array[Double]) | (/* color */ String), 
      Color_
    ] {
  
  /**
    * Creates a new color object by passing either a hex, rgb(a), hsl(a) or [named color value](https://www.w3.org/wiki/CSS/Properties/color/keywords).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-Color.html)
    */
  /**
    * Creates a Color instance by blending two colors using a weight factor.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-Color.html#blendColors)
    */
  def blendColors(start: Color_, end: Color_, weight: Double): Color_ = js.native
  def blendColors(start: Color_, end: Color_, weight: Double, out: Color_): Color_ = js.native
  
  /**
    * Creates a Color instance using a 3 or 4 element array, mapping each element in sequence to the rgb(a) values of the color.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-Color.html#fromArray)
    */
  def fromArray(a: js.Array[Double]): Color_ = js.native
  def fromArray(a: js.Array[Double], obj: Color_): Color_ = js.native
  
  /**
    * Creates a Color instance from a hex string with a '#' prefix.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-Color.html#fromHex)
    */
  def fromHex(color: String): Color_ = js.native
  def fromHex(color: String, obj: Color_): Color_ = js.native
  
  /**
    * Creates a new Color instance, and initializes it with values from a JSON object.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-Color.html#fromJSON)
    */
  def fromJSON(json: js.Any): Color_ = js.native
  
  /**
    * Creates a Color instance from a string of the form "rgb()" or "rgba()".
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-Color.html#fromRgb)
    */
  def fromRgb(color: String): Color_ = js.native
  def fromRgb(color: String, out: Color_): Color_ = js.native
  
  /**
    * Creates a Color instance by parsing a generic string.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-Color.html#fromString)
    */
  def fromString(str: String): Color_ = js.native
  def fromString(str: String, obj: Color_): Color_ = js.native
}
