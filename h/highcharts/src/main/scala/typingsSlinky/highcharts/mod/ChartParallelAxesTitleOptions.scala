package typingsSlinky.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChartParallelAxesTitleOptions extends js.Object {
  var reserveSpace: js.UndefOr[Boolean] = js.native
  var text: js.UndefOr[String] = js.native
  /**
    * (Highcharts) Alignment of the text, can be `"left"`, `"right"` or
    * `"center"`. Default alignment depends on the title.align:
    *
    * Horizontal axes:
    *
    * - for `align` = `"low"`, `textAlign` is set to `left`
    *
    * - for `align` = `"middle"`, `textAlign` is set to `center`
    *
    * - for `align` = `"high"`, `textAlign` is set to `right`
    *
    * Vertical axes:
    *
    * - for `align` = `"low"` and `opposite` = `true`, `textAlign` is set to
    * `right`
    *
    * - for `align` = `"low"` and `opposite` = `false`, `textAlign` is set to
    * `left`
    *
    * - for `align` = `"middle"`, `textAlign` is set to `center`
    *
    * - for `align` = `"high"` and `opposite` = `true` `textAlign` is set to
    * `left`
    *
    * - for `align` = `"high"` and `opposite` = `false` `textAlign` is set to
    * `right`
    */
  var textAlign: js.UndefOr[AlignValue] = js.native
}

object ChartParallelAxesTitleOptions {
  @scala.inline
  def apply(): ChartParallelAxesTitleOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartParallelAxesTitleOptions]
  }
  @scala.inline
  implicit class ChartParallelAxesTitleOptionsOps[Self <: ChartParallelAxesTitleOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withReserveSpace(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reserveSpace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReserveSpace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reserveSpace")(js.undefined)
        ret
    }
    @scala.inline
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(js.undefined)
        ret
    }
    @scala.inline
    def withTextAlign(value: AlignValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textAlign")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextAlign: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textAlign")(js.undefined)
        ret
    }
  }
  
}

