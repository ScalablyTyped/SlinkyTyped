package typingsSlinky.exceljs

import typingsSlinky.exceljs.mod.Cell
import typingsSlinky.exceljs.mod.CellValue
import typingsSlinky.exceljs.mod.Column
import typingsSlinky.exceljs.mod.Fill
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<exceljs.exceljs.Column> */
@js.native
trait PartialColumnAlignment extends js.Object {
  var alignment: js.UndefOr[PartialAlignment] = js.native
  var border: js.UndefOr[PartialBordersBottom] = js.native
  var collapsed: js.UndefOr[Boolean] = js.native
  var defn: js.UndefOr[js.Any] = js.native
  var eachCell: js.UndefOr[
    js.Function1[/* callback */ js.Function2[/* cell */ Cell, /* rowNumber */ Double, Unit], Unit]
  ] = js.native
  var equivalentTo: js.UndefOr[js.Function1[/* other */ Column, Boolean]] = js.native
  var fill: js.UndefOr[Fill] = js.native
  var font: js.UndefOr[PartialFont] = js.native
  var header: js.UndefOr[String | js.Array[String]] = js.native
  var headerCount: js.UndefOr[Double] = js.native
  var headers: js.UndefOr[js.Array[String]] = js.native
  var hidden: js.UndefOr[Boolean] = js.native
  var isCustomWidth: js.UndefOr[Boolean] = js.native
  var isDefault: js.UndefOr[Boolean] = js.native
  var key: js.UndefOr[String] = js.native
  var letter: js.UndefOr[String] = js.native
  var numFmt: js.UndefOr[String] = js.native
  var number: js.UndefOr[Double] = js.native
  var outlineLevel: js.UndefOr[Double] = js.native
  var protection: js.UndefOr[PartialProtection] = js.native
  var style: js.UndefOr[PartialStyleAlignment] = js.native
  @JSName("toString")
  var toString_FPartialColumnAlignment: js.UndefOr[js.Function0[String]] = js.native
  var values: js.UndefOr[js.Array[CellValue]] = js.native
  var width: js.UndefOr[Double] = js.native
  var worksheet: js.UndefOr[this.type] = js.native
}

object PartialColumnAlignment {
  @scala.inline
  def apply(): PartialColumnAlignment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialColumnAlignment]
  }
  @scala.inline
  implicit class PartialColumnAlignmentOps[Self <: PartialColumnAlignment] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlignment(value: PartialAlignment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alignment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlignment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alignment")(js.undefined)
        ret
    }
    @scala.inline
    def withBorder(value: PartialBordersBottom): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("border")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("border")(js.undefined)
        ret
    }
    @scala.inline
    def withCollapsed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapsed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCollapsed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapsed")(js.undefined)
        ret
    }
    @scala.inline
    def withDefn(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defn")(js.undefined)
        ret
    }
    @scala.inline
    def withEachCell(value: /* callback */ js.Function2[/* cell */ Cell, /* rowNumber */ Double, Unit] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eachCell")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutEachCell: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eachCell")(js.undefined)
        ret
    }
    @scala.inline
    def withEquivalentTo(value: /* other */ Column => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("equivalentTo")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutEquivalentTo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("equivalentTo")(js.undefined)
        ret
    }
    @scala.inline
    def withFill(value: Fill): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fill")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFill: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fill")(js.undefined)
        ret
    }
    @scala.inline
    def withFont(value: PartialFont): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFont: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font")(js.undefined)
        ret
    }
    @scala.inline
    def withHeader(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("header")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("header")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaderCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaderCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerCount")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaders(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(js.undefined)
        ret
    }
    @scala.inline
    def withHidden(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hidden")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHidden: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hidden")(js.undefined)
        ret
    }
    @scala.inline
    def withIsCustomWidth(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isCustomWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsCustomWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isCustomWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withIsDefault(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDefault")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsDefault: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDefault")(js.undefined)
        ret
    }
    @scala.inline
    def withKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(js.undefined)
        ret
    }
    @scala.inline
    def withLetter(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("letter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLetter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("letter")(js.undefined)
        ret
    }
    @scala.inline
    def withNumFmt(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numFmt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumFmt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numFmt")(js.undefined)
        ret
    }
    @scala.inline
    def withNumber(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("number")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("number")(js.undefined)
        ret
    }
    @scala.inline
    def withOutlineLevel(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outlineLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutlineLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outlineLevel")(js.undefined)
        ret
    }
    @scala.inline
    def withProtection(value: PartialProtection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProtection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protection")(js.undefined)
        ret
    }
    @scala.inline
    def withStyle(value: PartialStyleAlignment): Self = {
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
    def withToString(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toString")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutToString: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toString")(js.undefined)
        ret
    }
    @scala.inline
    def withValues(value: js.Array[CellValue]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("values")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValues: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("values")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
    @scala.inline
    def withWorksheet(value: PartialColumnAlignment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("worksheet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWorksheet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("worksheet")(js.undefined)
        ret
    }
  }
  
}

