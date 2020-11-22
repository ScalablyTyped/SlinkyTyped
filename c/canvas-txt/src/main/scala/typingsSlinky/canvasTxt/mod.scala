package typingsSlinky.canvasTxt

import org.scalajs.dom.raw.CanvasRenderingContext2D
import typingsSlinky.canvasTxt.canvasTxtStrings.bottom
import typingsSlinky.canvasTxt.canvasTxtStrings.center
import typingsSlinky.canvasTxt.canvasTxtStrings.left
import typingsSlinky.canvasTxt.canvasTxtStrings.middle
import typingsSlinky.canvasTxt.canvasTxtStrings.right
import typingsSlinky.canvasTxt.canvasTxtStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("canvas-txt", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  var align: center | left | right = js.native
  
  var debug: Boolean = js.native
  
  def drawText(ctx: CanvasRenderingContext2D, text: String, x: Double, y: Double, width: Double, height: Double): js.Any = js.native
  
  var font: String = js.native
  
  var fontSize: Double = js.native
  
  var fontStyle: String = js.native
  
  var fontVariant: String = js.native
  
  var fontWeight: String | Double = js.native
  
  var justify: Boolean = js.native
  
  var lineHeight: Double | Null = js.native
  
  var vAlign: middle | top | bottom = js.native
}
