package typingsSlinky.fabric

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonGraphemeLines extends js.Object {
  var _unwrappedLines: js.Array[String] = js.native
  var graphemeLines: js.Array[String] = js.native
  var graphemeText: js.Array[String] = js.native
  var lines: js.Array[String] = js.native
}

object AnonGraphemeLines {
  @scala.inline
  def apply(
    _unwrappedLines: js.Array[String],
    graphemeLines: js.Array[String],
    graphemeText: js.Array[String],
    lines: js.Array[String]
  ): AnonGraphemeLines = {
    val __obj = js.Dynamic.literal(_unwrappedLines = _unwrappedLines.asInstanceOf[js.Any], graphemeLines = graphemeLines.asInstanceOf[js.Any], graphemeText = graphemeText.asInstanceOf[js.Any], lines = lines.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonGraphemeLines]
  }
  @scala.inline
  implicit class AnonGraphemeLinesOps[Self <: AnonGraphemeLines] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_unwrappedLines(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_unwrappedLines")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGraphemeLines(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("graphemeLines")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGraphemeText(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("graphemeText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLines(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lines")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

