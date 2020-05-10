package typingsSlinky.googleAppsScript.GoogleAppsScript.Sites

import typingsSlinky.googleAppsScript.GoogleAppsScript.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PageAdvancedParameters extends js.Object {
  /** whether to include deleted pages (default false) */
  var includeDeleted: js.UndefOr[Boolean] = js.native
  /** whether to include draft pages (default false) */
  var includeDrafts: js.UndefOr[Boolean] = js.native
  /** the max number of results (default 200) */
  var max: js.UndefOr[Integer] = js.native
  /** only return pages matching this query */
  var search: js.UndefOr[String] = js.native
  /** start the results here */
  var start: js.UndefOr[Integer] = js.native
  /** only get pages of this type */
  var `type`: js.UndefOr[js.Array[PageType]] = js.native
}

object PageAdvancedParameters {
  @scala.inline
  def apply(): PageAdvancedParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PageAdvancedParameters]
  }
  @scala.inline
  implicit class PageAdvancedParametersOps[Self <: PageAdvancedParameters] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIncludeDeleted(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeDeleted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeDeleted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeDeleted")(js.undefined)
        ret
    }
    @scala.inline
    def withIncludeDrafts(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeDrafts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeDrafts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeDrafts")(js.undefined)
        ret
    }
    @scala.inline
    def withMax(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMax: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max")(js.undefined)
        ret
    }
    @scala.inline
    def withSearch(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("search")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSearch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("search")(js.undefined)
        ret
    }
    @scala.inline
    def withStart(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: js.Array[PageType]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

