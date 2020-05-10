package typingsSlinky.oracleOraclejet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCategoriesLabelCloseIcon extends js.Object {
  var categories: js.UndefOr[AnonConfirmation] = js.native
  var labelCloseIcon: js.UndefOr[String] = js.native
}

object AnonCategoriesLabelCloseIcon {
  @scala.inline
  def apply(): AnonCategoriesLabelCloseIcon = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonCategoriesLabelCloseIcon]
  }
  @scala.inline
  implicit class AnonCategoriesLabelCloseIconOps[Self <: AnonCategoriesLabelCloseIcon] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCategories(value: AnonConfirmation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("categories")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCategories: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("categories")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelCloseIcon(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelCloseIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelCloseIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelCloseIcon")(js.undefined)
        ret
    }
  }
  
}

