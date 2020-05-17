package typingsSlinky.cliTable2.mod

import typingsSlinky.cliTable2.anon.Border
import typingsSlinky.cliTable2.anon.PartialRecordCharNamestri
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Partial<cli-table2.cli-table2.TableOptions> */
@js.native
trait TableConstructorOptions extends js.Object {
  var chars: js.UndefOr[PartialRecordCharNamestri] = js.native
  var colAligns: js.UndefOr[js.Array[HorizontalAlignment]] = js.native
  var colWidths: js.UndefOr[js.Array[Double | Null]] = js.native
  var head: js.UndefOr[js.Array[Cell]] = js.native
  var rowAligns: js.UndefOr[js.Array[VerticalAlignment]] = js.native
  var rowHeights: js.UndefOr[js.Array[Double | Null]] = js.native
  var style: js.UndefOr[Partial[Border]] = js.native
  var truncate: js.UndefOr[String] = js.native
  var wordWrap: js.UndefOr[Boolean] = js.native
}

object TableConstructorOptions {
  @scala.inline
  def apply(): TableConstructorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableConstructorOptions]
  }
  @scala.inline
  implicit class TableConstructorOptionsOps[Self <: TableConstructorOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChars(value: PartialRecordCharNamestri): Self = {
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
    def withColAligns(value: js.Array[HorizontalAlignment]): Self = {
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
    def withColWidths(value: js.Array[Double | Null]): Self = {
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
    def withHead(value: js.Array[Cell]): Self = {
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
    def withRowAligns(value: js.Array[VerticalAlignment]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowAligns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRowAligns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowAligns")(js.undefined)
        ret
    }
    @scala.inline
    def withRowHeights(value: js.Array[Double | Null]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowHeights")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRowHeights: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowHeights")(js.undefined)
        ret
    }
    @scala.inline
    def withStyle(value: Partial[Border]): Self = {
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
    @scala.inline
    def withWordWrap(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wordWrap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWordWrap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wordWrap")(js.undefined)
        ret
    }
  }
  
}

