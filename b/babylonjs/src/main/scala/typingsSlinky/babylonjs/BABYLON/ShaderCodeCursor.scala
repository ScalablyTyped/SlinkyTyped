package typingsSlinky.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ShaderCodeCursor extends js.Object {
  var _lines: js.Any = js.native
  var lineIndex: Double = js.native
  def canRead: Boolean = js.native
  def currentLine: String = js.native
  def lines(value: js.Array[String]): js.Any = js.native
}

object ShaderCodeCursor {
  @scala.inline
  def apply(
    _lines: js.Any,
    canRead: () => Boolean,
    currentLine: () => String,
    lineIndex: Double,
    lines: js.Array[String] => js.Any
  ): ShaderCodeCursor = {
    val __obj = js.Dynamic.literal(_lines = _lines.asInstanceOf[js.Any], canRead = js.Any.fromFunction0(canRead), currentLine = js.Any.fromFunction0(currentLine), lineIndex = lineIndex.asInstanceOf[js.Any], lines = js.Any.fromFunction1(lines))
    __obj.asInstanceOf[ShaderCodeCursor]
  }
  @scala.inline
  implicit class ShaderCodeCursorOps[Self <: ShaderCodeCursor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_lines(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_lines")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCanRead(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canRead")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCurrentLine(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentLine")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withLineIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLines(value: js.Array[String] => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lines")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

