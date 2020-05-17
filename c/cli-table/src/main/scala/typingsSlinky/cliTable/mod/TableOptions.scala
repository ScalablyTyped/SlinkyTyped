package typingsSlinky.cliTable.mod

import typingsSlinky.cliTable.anon.PartialRecordtoptopmidtop
import typingsSlinky.cliTable.anon.Partialpaddingleftnumberp
import typingsSlinky.cliTable.cliTableStrings.left
import typingsSlinky.cliTable.cliTableStrings.middle
import typingsSlinky.cliTable.cliTableStrings.right
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TableOptions extends js.Object {
  var chars: PartialRecordtoptopmidtop = js.native
  var colAligns: js.Array[left | middle | right] = js.native
  var colWidths: js.Array[Double] = js.native
  var colors: Boolean = js.native
  var head: js.Array[String] = js.native
  var style: Partialpaddingleftnumberp = js.native
  var truncate: String = js.native
}

object TableOptions {
  @scala.inline
  def apply(
    chars: PartialRecordtoptopmidtop,
    colAligns: js.Array[left | middle | right],
    colWidths: js.Array[Double],
    colors: Boolean,
    head: js.Array[String],
    style: Partialpaddingleftnumberp,
    truncate: String
  ): TableOptions = {
    val __obj = js.Dynamic.literal(chars = chars.asInstanceOf[js.Any], colAligns = colAligns.asInstanceOf[js.Any], colWidths = colWidths.asInstanceOf[js.Any], colors = colors.asInstanceOf[js.Any], head = head.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], truncate = truncate.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableOptions]
  }
  @scala.inline
  implicit class TableOptionsOps[Self <: TableOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChars(value: PartialRecordtoptopmidtop): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chars")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColAligns(value: js.Array[left | middle | right]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colAligns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColWidths(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colWidths")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColors(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHead(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("head")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStyle(value: Partialpaddingleftnumberp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTruncate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("truncate")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

