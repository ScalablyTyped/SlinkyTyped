package typingsSlinky.magicString.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MagicStringOptions extends js.Object {
  var filename: String = js.native
  var indentExclusionRanges: ExclusionRange | js.Array[ExclusionRange] = js.native
}

object MagicStringOptions {
  @scala.inline
  def apply(filename: String, indentExclusionRanges: ExclusionRange | js.Array[ExclusionRange]): MagicStringOptions = {
    val __obj = js.Dynamic.literal(filename = filename.asInstanceOf[js.Any], indentExclusionRanges = indentExclusionRanges.asInstanceOf[js.Any])
    __obj.asInstanceOf[MagicStringOptions]
  }
  @scala.inline
  implicit class MagicStringOptionsOps[Self <: MagicStringOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFilename(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filename")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIndentExclusionRanges(value: ExclusionRange | js.Array[ExclusionRange]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indentExclusionRanges")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

