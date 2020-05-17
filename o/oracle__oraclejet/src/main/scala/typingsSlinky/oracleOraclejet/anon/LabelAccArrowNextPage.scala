package typingsSlinky.oracleOraclejet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LabelAccArrowNextPage extends js.Object {
  var labelAccArrowNextPage: js.UndefOr[String] = js.native
  var labelAccArrowPreviousPage: js.UndefOr[String] = js.native
  var labelAccFilmStrip: js.UndefOr[String] = js.native
  var tipArrowNextPage: js.UndefOr[String] = js.native
  var tipArrowPreviousPage: js.UndefOr[String] = js.native
}

object LabelAccArrowNextPage {
  @scala.inline
  def apply(): LabelAccArrowNextPage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LabelAccArrowNextPage]
  }
  @scala.inline
  implicit class LabelAccArrowNextPageOps[Self <: LabelAccArrowNextPage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLabelAccArrowNextPage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelAccArrowNextPage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelAccArrowNextPage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelAccArrowNextPage")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelAccArrowPreviousPage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelAccArrowPreviousPage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelAccArrowPreviousPage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelAccArrowPreviousPage")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelAccFilmStrip(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelAccFilmStrip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelAccFilmStrip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelAccFilmStrip")(js.undefined)
        ret
    }
    @scala.inline
    def withTipArrowNextPage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tipArrowNextPage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTipArrowNextPage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tipArrowNextPage")(js.undefined)
        ret
    }
    @scala.inline
    def withTipArrowPreviousPage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tipArrowPreviousPage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTipArrowPreviousPage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tipArrowPreviousPage")(js.undefined)
        ret
    }
  }
  
}

