package typingsSlinky.edtrIoMathquill.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MathField extends js.Object {
  def blur(): MQ = js.native
  def clearSelection(): MQ = js.native
  def cmd(latex: String): MQ = js.native
  def config(config: Config): MQ = js.native
  def focus(): MQ = js.native
  def keystroke(keys: String): MQ = js.native
  def moveToDirEnd(direction: Double): MQ = js.native
  def moveToLeftEnd(): MQ = js.native
  def moveToRightEnd(): MQ = js.native
  def select(): MQ = js.native
  def typedText(text: String): MQ = js.native
  def write(latex: String): MQ = js.native
}

object MathField {
  @scala.inline
  def apply(
    blur: () => MQ,
    clearSelection: () => MQ,
    cmd: String => MQ,
    config: Config => MQ,
    focus: () => MQ,
    keystroke: String => MQ,
    moveToDirEnd: Double => MQ,
    moveToLeftEnd: () => MQ,
    moveToRightEnd: () => MQ,
    select: () => MQ,
    typedText: String => MQ,
    write: String => MQ
  ): MathField = {
    val __obj = js.Dynamic.literal(blur = js.Any.fromFunction0(blur), clearSelection = js.Any.fromFunction0(clearSelection), cmd = js.Any.fromFunction1(cmd), config = js.Any.fromFunction1(config), focus = js.Any.fromFunction0(focus), keystroke = js.Any.fromFunction1(keystroke), moveToDirEnd = js.Any.fromFunction1(moveToDirEnd), moveToLeftEnd = js.Any.fromFunction0(moveToLeftEnd), moveToRightEnd = js.Any.fromFunction0(moveToRightEnd), select = js.Any.fromFunction0(select), typedText = js.Any.fromFunction1(typedText), write = js.Any.fromFunction1(write))
    __obj.asInstanceOf[MathField]
  }
  @scala.inline
  implicit class MathFieldOps[Self <: MathField] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBlur(value: () => MQ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blur")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withClearSelection(value: () => MQ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearSelection")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCmd(value: String => MQ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cmd")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withConfig(value: Config => MQ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("config")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFocus(value: () => MQ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focus")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withKeystroke(value: String => MQ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keystroke")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withMoveToDirEnd(value: Double => MQ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moveToDirEnd")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withMoveToLeftEnd(value: () => MQ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moveToLeftEnd")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withMoveToRightEnd(value: () => MQ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moveToRightEnd")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSelect(value: () => MQ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("select")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withTypedText(value: String => MQ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typedText")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withWrite(value: String => MQ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("write")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

