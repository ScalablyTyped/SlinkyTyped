package typingsSlinky.jsfl.global

import typingsSlinky.jsfl.FlashElement
import typingsSlinky.jsfl.FlashFrame
import typingsSlinky.jsfl.FlashLayer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("_Context")
@js.native
class Context ()
  extends typingsSlinky.jsfl.Context {
  /* CompleteClass */
  override var elements: js.Array[FlashElement] = js.native
  /* CompleteClass */
  override var frame: FlashFrame = js.native
  /* CompleteClass */
  override var keyframes: js.Array[FlashFrame] = js.native
  /* CompleteClass */
  override var layer: FlashLayer = js.native
  /* CompleteClass */
  override def goto(): js.Any = js.native
  /* CompleteClass */
  override def setLayer(index: Double): js.Any = js.native
  /* CompleteClass */
  override def update(): js.Any = js.native
}

/* static members */
@JSGlobal("_Context")
@js.native
object Context extends js.Object {
  def create(): typingsSlinky.jsfl.Context = js.native
  def from(frame: FlashFrame): typingsSlinky.jsfl.Context = js.native
}

