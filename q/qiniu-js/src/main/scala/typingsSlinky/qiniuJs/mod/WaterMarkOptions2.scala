package typingsSlinky.qiniuJs.mod

import typingsSlinky.qiniuJs.qiniuJsNumbers.`2`
import typingsSlinky.qiniuJs.qiniuJsStrings.Center
import typingsSlinky.qiniuJs.qiniuJsStrings.East
import typingsSlinky.qiniuJs.qiniuJsStrings.North
import typingsSlinky.qiniuJs.qiniuJsStrings.NorthEast
import typingsSlinky.qiniuJs.qiniuJsStrings.NorthWest
import typingsSlinky.qiniuJs.qiniuJsStrings.South
import typingsSlinky.qiniuJs.qiniuJsStrings.SouthEast
import typingsSlinky.qiniuJs.qiniuJsStrings.SouthWest
import typingsSlinky.qiniuJs.qiniuJsStrings.West
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WaterMarkOptions2 extends StObject {
  
  // 水印文字，mode = 2 时 **必需**
  var dissolve: Double = js.native
  
  // 水印文字字体
  var dx: Double = js.native
  
  // 横轴边距，单位:像素(px)
  var dy: Double = js.native
  
  // 纵轴边距，单位:像素(px)
  var fill: String = js.native
  
  // 字体大小，单位: 缇
  var font: String = js.native
  
  // 水印位置
  var fontsize: Double = js.native
  
  // 透明度，取值范围1-100，非必需，下同
  var gravity: NorthWest | North | NorthEast | West | Center | East | SouthWest | South | SouthEast = js.native
  
  var mode: `2` = js.native
  
  // 文字水印
  var text: String = js.native
}
object WaterMarkOptions2 {
  
  @scala.inline
  def apply(
    dissolve: Double,
    dx: Double,
    dy: Double,
    fill: String,
    font: String,
    fontsize: Double,
    gravity: NorthWest | North | NorthEast | West | Center | East | SouthWest | South | SouthEast,
    mode: `2`,
    text: String
  ): WaterMarkOptions2 = {
    val __obj = js.Dynamic.literal(dissolve = dissolve.asInstanceOf[js.Any], dx = dx.asInstanceOf[js.Any], dy = dy.asInstanceOf[js.Any], fill = fill.asInstanceOf[js.Any], font = font.asInstanceOf[js.Any], fontsize = fontsize.asInstanceOf[js.Any], gravity = gravity.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[WaterMarkOptions2]
  }
  
  @scala.inline
  implicit class WaterMarkOptions2MutableBuilder[Self <: WaterMarkOptions2] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDissolve(value: Double): Self = StObject.set(x, "dissolve", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDx(value: Double): Self = StObject.set(x, "dx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDy(value: Double): Self = StObject.set(x, "dy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFill(value: String): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFont(value: String): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontsize(value: Double): Self = StObject.set(x, "fontsize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGravity(value: NorthWest | North | NorthEast | West | Center | East | SouthWest | South | SouthEast): Self = StObject.set(x, "gravity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMode(value: `2`): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
