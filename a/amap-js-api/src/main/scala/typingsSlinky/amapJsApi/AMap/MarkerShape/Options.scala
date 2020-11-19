package typingsSlinky.amapJsApi.AMap.MarkerShape

import typingsSlinky.amapJsApi.amapJsApiStrings.circle
import typingsSlinky.amapJsApi.amapJsApiStrings.poly
import typingsSlinky.amapJsApi.amapJsApiStrings.rect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.amapJsApi.AMap.MarkerShape.CircleOptions
  - typingsSlinky.amapJsApi.AMap.MarkerShape.PolyOptions
  - typingsSlinky.amapJsApi.AMap.MarkerShape.RectOptions
*/
trait Options extends js.Object
object Options {
  
  @scala.inline
  def CircleOptions(coords: js.Tuple3[Double, Double, Double], `type`: circle): Options = {
    val __obj = js.Dynamic.literal(coords = coords.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  def PolyOptions(coords: js.Array[Double], `type`: poly): Options = {
    val __obj = js.Dynamic.literal(coords = coords.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  def RectOptions(coords: js.Tuple4[Double, Double, Double, Double], `type`: rect): Options = {
    val __obj = js.Dynamic.literal(coords = coords.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}
