package typingsSlinky.firefoxWebextBrowser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCaseSensitive extends js.Object {
  /** Find only ranges with case sensitive match. */
  var caseSensitive: js.UndefOr[Boolean] = js.native
  /** Find only ranges that match entire word. */
  var entireWord: js.UndefOr[Boolean] = js.native
  /** Return range data which provides range data in a serializable form. */
  var includeRangeData: js.UndefOr[Boolean] = js.native
  /** Return rectangle data which describes visual position of search results. */
  var includeRectData: js.UndefOr[Boolean] = js.native
  /** Tab to query. Defaults to the active tab. */
  var tabId: js.UndefOr[Double] = js.native
}

object AnonCaseSensitive {
  @scala.inline
  def apply(): AnonCaseSensitive = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonCaseSensitive]
  }
  @scala.inline
  implicit class AnonCaseSensitiveOps[Self <: AnonCaseSensitive] (val x: Self) extends AnyVal {
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
    def withEntireWord(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entireWord")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEntireWord: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entireWord")(js.undefined)
        ret
    }
    @scala.inline
    def withIncludeRangeData(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeRangeData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeRangeData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeRangeData")(js.undefined)
        ret
    }
    @scala.inline
    def withIncludeRectData(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeRectData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeRectData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeRectData")(js.undefined)
        ret
    }
    @scala.inline
    def withTabId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTabId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabId")(js.undefined)
        ret
    }
  }
  
}

