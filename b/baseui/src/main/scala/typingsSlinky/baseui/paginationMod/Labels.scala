package typingsSlinky.baseui.paginationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Labels extends js.Object {
  var nextButton: js.UndefOr[String] = js.native
  var preposition: js.UndefOr[String] = js.native
  var prevButton: js.UndefOr[String] = js.native
}

object Labels {
  @scala.inline
  def apply(): Labels = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Labels]
  }
  @scala.inline
  implicit class LabelsOps[Self <: Labels] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNextButton(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextButton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextButton")(js.undefined)
        ret
    }
    @scala.inline
    def withPreposition(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preposition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreposition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preposition")(js.undefined)
        ret
    }
    @scala.inline
    def withPrevButton(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prevButton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrevButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prevButton")(js.undefined)
        ret
    }
  }
  
}

