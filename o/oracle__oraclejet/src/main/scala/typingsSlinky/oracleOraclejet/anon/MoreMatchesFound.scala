package typingsSlinky.oracleOraclejet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MoreMatchesFound extends js.Object {
  var filterFurther: js.UndefOr[String] = js.native
  var moreMatchesFound: js.UndefOr[String] = js.native
  var noMatchesFound: js.UndefOr[String] = js.native
  var oneMatchesFound: js.UndefOr[String] = js.native
  var required: js.UndefOr[Hint] = js.native
  var searchField: js.UndefOr[String] = js.native
}

object MoreMatchesFound {
  @scala.inline
  def apply(): MoreMatchesFound = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MoreMatchesFound]
  }
  @scala.inline
  implicit class MoreMatchesFoundOps[Self <: MoreMatchesFound] (val x: Self) extends AnyVal {
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
    def withMoreMatchesFound(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moreMatchesFound")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMoreMatchesFound: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moreMatchesFound")(js.undefined)
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
    def withOneMatchesFound(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oneMatchesFound")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOneMatchesFound: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oneMatchesFound")(js.undefined)
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
    @scala.inline
    def withSearchField(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSearchField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchField")(js.undefined)
        ret
    }
  }
  
}

