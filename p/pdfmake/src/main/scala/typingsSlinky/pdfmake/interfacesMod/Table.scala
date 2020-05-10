package typingsSlinky.pdfmake.interfacesMod

import typingsSlinky.pdfmake.pdfmakeStrings.Asterisk
import typingsSlinky.pdfmake.pdfmakeStrings.auto
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Table extends js.Object {
  var body: js.Array[js.Array[TableCell]] = js.native
  var dontBreakRows: js.UndefOr[Boolean] = js.native
  var headerRows: js.UndefOr[Double] = js.native
  var heights: js.UndefOr[Double | js.Array[Double] | DynamicRowSize] = js.native
  var keepWithHeaderRows: js.UndefOr[Double] = js.native
  var layout: js.UndefOr[TableLayout] = js.native
  var widths: js.UndefOr[Asterisk | auto | js.Array[Size]] = js.native
}

object Table {
  @scala.inline
  def apply(body: js.Array[js.Array[TableCell]]): Table = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.asInstanceOf[Table]
  }
  @scala.inline
  implicit class TableOps[Self <: Table] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBody(value: js.Array[js.Array[TableCell]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDontBreakRows(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dontBreakRows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDontBreakRows: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dontBreakRows")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaderRows(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerRows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaderRows: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerRows")(js.undefined)
        ret
    }
    @scala.inline
    def withHeightsFunction1(value: /* row */ Double => Double | auto): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("heights")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withHeights(value: Double | js.Array[Double] | DynamicRowSize): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("heights")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeights: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("heights")(js.undefined)
        ret
    }
    @scala.inline
    def withKeepWithHeaderRows(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepWithHeaderRows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeepWithHeaderRows: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepWithHeaderRows")(js.undefined)
        ret
    }
    @scala.inline
    def withLayout(value: TableLayout): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLayout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layout")(js.undefined)
        ret
    }
    @scala.inline
    def withWidths(value: Asterisk | auto | js.Array[Size]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("widths")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidths: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("widths")(js.undefined)
        ret
    }
  }
  
}

