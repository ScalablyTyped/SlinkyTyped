package typingsSlinky.canvasGauges.CanvasGauges

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Animation extends js.Object {
  
  def animate(): js.Any = js.native
  def animate(draw: js.UndefOr[scala.Nothing], end: EndEventCallback): js.Any = js.native
  def animate(draw: DrawEventCallback): js.Any = js.native
  def animate(draw: DrawEventCallback, end: EndEventCallback): js.Any = js.native
  
  def destroy(): js.Any = js.native
  
  def draw(percent: Double): js.Any = js.native
  @JSName("draw")
  var draw_Original: DrawEventCallback = js.native
  
  var duration: Double = js.native
  
  def end(): js.Any = js.native
  @JSName("end")
  var end_Original: EndEventCallback = js.native
  
  var rule: String | AnimationRule = js.native
}
