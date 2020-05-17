package typingsSlinky.oracleOraclejet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FilterFurther extends js.Object {
  var filterFurther: js.UndefOr[String] = js.native
  var noMatchesFound: js.UndefOr[String] = js.native
  var required: js.UndefOr[Hint] = js.native
}

object FilterFurther {
  @scala.inline
  def apply(): FilterFurther = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FilterFurther]
  }
  @scala.inline
  implicit class FilterFurtherOps[Self <: FilterFurther] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFilterFurther(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterFurther")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilterFurther: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterFurther")(js.undefined)
        ret
    }
    @scala.inline
    def withNoMatchesFound(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noMatchesFound")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoMatchesFound: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noMatchesFound")(js.undefined)
        ret
    }
    @scala.inline
    def withRequired(value: Hint): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("required")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequired: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("required")(js.undefined)
        ret
    }
  }
  
}

