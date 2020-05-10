package typingsSlinky.magicString.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IndentOptions extends js.Object {
  var exclude: ExclusionRange | js.Array[ExclusionRange] = js.native
  var indentStart: Boolean = js.native
}

object IndentOptions {
  @scala.inline
  def apply(exclude: ExclusionRange | js.Array[ExclusionRange], indentStart: Boolean): IndentOptions = {
    val __obj = js.Dynamic.literal(exclude = exclude.asInstanceOf[js.Any], indentStart = indentStart.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndentOptions]
  }
  @scala.inline
  implicit class IndentOptionsOps[Self <: IndentOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExclude(value: ExclusionRange | js.Array[ExclusionRange]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exclude")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIndentStart(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indentStart")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

