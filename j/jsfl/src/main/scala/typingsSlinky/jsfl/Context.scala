package typingsSlinky.jsfl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Context extends js.Object {
  var elements: js.Array[FlashElement] = js.native
  var frame: FlashFrame = js.native
  var keyframes: js.Array[FlashFrame] = js.native
  var layer: FlashLayer = js.native
  def goto(): js.Any = js.native
  def setLayer(index: Double): js.Any = js.native
  def update(): js.Any = js.native
}

object Context {
  @scala.inline
  def apply(
    elements: js.Array[FlashElement],
    frame: FlashFrame,
    goto: () => js.Any,
    keyframes: js.Array[FlashFrame],
    layer: FlashLayer,
    setLayer: Double => js.Any,
    update: () => js.Any
  ): Context = {
    val __obj = js.Dynamic.literal(elements = elements.asInstanceOf[js.Any], frame = frame.asInstanceOf[js.Any], goto = js.Any.fromFunction0(goto), keyframes = keyframes.asInstanceOf[js.Any], layer = layer.asInstanceOf[js.Any], setLayer = js.Any.fromFunction1(setLayer), update = js.Any.fromFunction0(update))
    __obj.asInstanceOf[Context]
  }
  @scala.inline
  implicit class ContextOps[Self <: Context] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withElements(value: js.Array[FlashElement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elements")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFrame(value: FlashFrame): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frame")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGoto(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("goto")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withKeyframes(value: js.Array[FlashFrame]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyframes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLayer(value: FlashLayer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSetLayer(value: Double => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setLayer")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdate(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

