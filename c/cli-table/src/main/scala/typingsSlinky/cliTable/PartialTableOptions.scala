package typingsSlinky.cliTable

import typingsSlinky.cliTable.cliTableStrings.left
import typingsSlinky.cliTable.cliTableStrings.middle
import typingsSlinky.cliTable.cliTableStrings.right
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<cli-table.cli-table.TableOptions> */
@js.native
trait PartialTableOptions extends js.Object {
  var chars: js.UndefOr[PartialRecordtoptopmidtop] = js.native
  var colAligns: js.UndefOr[js.Array[left | middle | right]] = js.native
  var colWidths: js.UndefOr[js.Array[Double]] = js.native
  var colors: js.UndefOr[Boolean] = js.native
  var head: js.UndefOr[js.Array[String]] = js.native
  var style: js.UndefOr[Partialpaddingleftnumberp] = js.native
  var truncate: js.UndefOr[String] = js.native
}

object PartialTableOptions {
  @scala.inline
  def apply(): PartialTableOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialTableOptions]
  }
  @scala.inline
  implicit class PartialTableOptionsOps[Self <: PartialTableOptions] (val x: Self) extends AnyVal {
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
    def withoutChars: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chars")(js.undefined)
        ret
    }
    @scala.inline
    def withColAligns(value: js.Array[left | middle | right]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colAligns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColAligns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colAligns")(js.undefined)
        ret
    }
    @scala.inline
    def withColWidths(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colWidths")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColWidths: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colWidths")(js.undefined)
        ret
    }
    @scala.inline
    def withColors(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colors")(js.undefined)
        ret
    }
    @scala.inline
    def withHead(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("head")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHead: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("head")(js.undefined)
        ret
    }
    @scala.inline
    def withStyle(value: Partialpaddingleftnumberp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(js.undefined)
        ret
    }
    @scala.inline
    def withTruncate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("truncate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTruncate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("truncate")(js.undefined)
        ret
    }
  }
  
}

