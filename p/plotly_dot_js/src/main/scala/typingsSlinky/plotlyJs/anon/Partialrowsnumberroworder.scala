package typingsSlinky.plotlyJs.anon

import typingsSlinky.plotlyJs.plotlyJsStrings.`bottom plot`
import typingsSlinky.plotlyJs.plotlyJsStrings.`bottom to top`
import typingsSlinky.plotlyJs.plotlyJsStrings.`left plot`
import typingsSlinky.plotlyJs.plotlyJsStrings.`right plot`
import typingsSlinky.plotlyJs.plotlyJsStrings.`top plot`
import typingsSlinky.plotlyJs.plotlyJsStrings.`top to bottom`
import typingsSlinky.plotlyJs.plotlyJsStrings.bottom
import typingsSlinky.plotlyJs.plotlyJsStrings.coupled
import typingsSlinky.plotlyJs.plotlyJsStrings.independent
import typingsSlinky.plotlyJs.plotlyJsStrings.left
import typingsSlinky.plotlyJs.plotlyJsStrings.right
import typingsSlinky.plotlyJs.plotlyJsStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<{  rows  :number,   roworder  :'top to bottom' | 'bottom to top',   columns  :number,   subplots  :std.Array<string>,   xaxes  :std.Array<string>,   yaxes  :std.Array<string>,   pattern  :'independent' | 'coupled',   xgap  :number,   ygap  :number,   domain  :std.Partial<{  x  :std.Array<number>,   y  :std.Array<number>}>,   xside  :'bottom' | 'bottom plot' | 'top plot' | 'top',   yside  :'left' | 'left plot' | 'right plot' | 'right'}> */
@js.native
trait Partialrowsnumberroworder extends js.Object {
  var columns: js.UndefOr[Double] = js.native
  var domain: js.UndefOr[PartialxArraynumberyArray] = js.native
  var pattern: js.UndefOr[independent | coupled] = js.native
  var roworder: js.UndefOr[(`top to bottom`) | (`bottom to top`)] = js.native
  var rows: js.UndefOr[Double] = js.native
  var subplots: js.UndefOr[js.Array[String]] = js.native
  var xaxes: js.UndefOr[js.Array[String]] = js.native
  var xgap: js.UndefOr[Double] = js.native
  var xside: js.UndefOr[bottom | (`bottom plot`) | (`top plot`) | top] = js.native
  var yaxes: js.UndefOr[js.Array[String]] = js.native
  var ygap: js.UndefOr[Double] = js.native
  var yside: js.UndefOr[left | (`left plot`) | (`right plot`) | right] = js.native
}

object Partialrowsnumberroworder {
  @scala.inline
  def apply(): Partialrowsnumberroworder = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Partialrowsnumberroworder]
  }
  @scala.inline
  implicit class PartialrowsnumberroworderOps[Self <: Partialrowsnumberroworder] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColumns(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columns")(js.undefined)
        ret
    }
    @scala.inline
    def withDomain(value: PartialxArraynumberyArray): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDomain: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domain")(js.undefined)
        ret
    }
    @scala.inline
    def withPattern(value: independent | coupled): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pattern")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPattern: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pattern")(js.undefined)
        ret
    }
    @scala.inline
    def withRoworder(value: (`top to bottom`) | (`bottom to top`)): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roworder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoworder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roworder")(js.undefined)
        ret
    }
    @scala.inline
    def withRows(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRows: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rows")(js.undefined)
        ret
    }
    @scala.inline
    def withSubplots(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subplots")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubplots: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subplots")(js.undefined)
        ret
    }
    @scala.inline
    def withXaxes(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xaxes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXaxes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xaxes")(js.undefined)
        ret
    }
    @scala.inline
    def withXgap(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xgap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXgap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xgap")(js.undefined)
        ret
    }
    @scala.inline
    def withXside(value: bottom | (`bottom plot`) | (`top plot`) | top): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xside")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXside: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xside")(js.undefined)
        ret
    }
    @scala.inline
    def withYaxes(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yaxes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutYaxes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yaxes")(js.undefined)
        ret
    }
    @scala.inline
    def withYgap(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ygap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutYgap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ygap")(js.undefined)
        ret
    }
    @scala.inline
    def withYside(value: left | (`left plot`) | (`right plot`) | right): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yside")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutYside: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yside")(js.undefined)
        ret
    }
  }
  
}

