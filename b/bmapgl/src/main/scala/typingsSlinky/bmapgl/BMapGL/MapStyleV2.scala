package typingsSlinky.bmapgl.BMapGL

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.bmapgl.anon.StyleJson
  - typingsSlinky.bmapgl.anon.StyleId
*/
trait MapStyleV2 extends js.Object
object MapStyleV2 {
  
  @scala.inline
  def StyleJson(styleJson: js.Array[MapStyleItem]): MapStyleV2 = {
    val __obj = js.Dynamic.literal(styleJson = styleJson.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapStyleV2]
  }
  
  @scala.inline
  def StyleId(styleId: String): MapStyleV2 = {
    val __obj = js.Dynamic.literal(styleId = styleId.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapStyleV2]
  }
}
