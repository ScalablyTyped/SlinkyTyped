package typingsSlinky.gapiClientAnalytics.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FieldIndex extends js.Object {
  /** Determines if the filter is case sensitive. */
  var caseSensitive: js.UndefOr[Boolean] = js.native
  /** Field to use in the filter. */
  var field: js.UndefOr[String] = js.native
  /** The Index of the custom dimension. Required if field is a CUSTOM_DIMENSION. */
  var fieldIndex: js.UndefOr[Double] = js.native
  /** Term to replace the search term with. */
  var replaceString: js.UndefOr[String] = js.native
  /** Term to search. */
  var searchString: js.UndefOr[String] = js.native
}

object FieldIndex {
  @scala.inline
  def apply(): FieldIndex = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FieldIndex]
  }
  @scala.inline
  implicit class FieldIndexOps[Self <: FieldIndex] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCaseSensitive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("caseSensitive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCaseSensitive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("caseSensitive")(js.undefined)
        ret
    }
    @scala.inline
    def withField(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("field")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("field")(js.undefined)
        ret
    }
    @scala.inline
    def withFieldIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fieldIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFieldIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fieldIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withReplaceString(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replaceString")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReplaceString: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replaceString")(js.undefined)
        ret
    }
    @scala.inline
    def withSearchString(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchString")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSearchString: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchString")(js.undefined)
        ret
    }
  }
  
}

