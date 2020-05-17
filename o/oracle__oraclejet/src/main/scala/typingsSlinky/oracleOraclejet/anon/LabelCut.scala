package typingsSlinky.oracleOraclejet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LabelCut extends js.Object {
  var labelCut: js.UndefOr[String] = js.native
  var labelPasteAfter: js.UndefOr[String] = js.native
  var labelPasteBefore: js.UndefOr[String] = js.native
}

object LabelCut {
  @scala.inline
  def apply(): LabelCut = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LabelCut]
  }
  @scala.inline
  implicit class LabelCutOps[Self <: LabelCut] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLabelCut(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelCut")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelCut: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelCut")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelPasteAfter(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelPasteAfter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelPasteAfter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelPasteAfter")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelPasteBefore(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelPasteBefore")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelPasteBefore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelPasteBefore")(js.undefined)
        ret
    }
  }
  
}

