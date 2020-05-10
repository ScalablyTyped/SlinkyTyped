package typingsSlinky.ejWebAll.ej.FileExplorer

import typingsSlinky.ejWebAll.ej.FilterType_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FilterSettings extends js.Object {
  /** It allows to search the text given in search Textbox in every keyup event. When this property was set as false, searching will works only on Enter key and searchbar blur.
    * @Default {true}
    */
  var allowSearchOnTyping: js.UndefOr[Boolean] = js.native
  /** Enables or disables to perform the filter operation with case sensitive.
    * @Default {false}
    */
  var caseSensitiveSearch: js.UndefOr[Boolean] = js.native
  /** Sets the search filter type. There are several filter types available such as &quot;startswith&quot;, &quot;contains&quot;, &quot;endswith&quot;. See filterType.
    * @Default {ej.FileExplorer.filterType.Contains}
    */
  var filterType: js.UndefOr[FilterType_ | String] = js.native
}

object FilterSettings {
  @scala.inline
  def apply(): FilterSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FilterSettings]
  }
  @scala.inline
  implicit class FilterSettingsOps[Self <: FilterSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowSearchOnTyping(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowSearchOnTyping")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowSearchOnTyping: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowSearchOnTyping")(js.undefined)
        ret
    }
    @scala.inline
    def withCaseSensitiveSearch(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("caseSensitiveSearch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCaseSensitiveSearch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("caseSensitiveSearch")(js.undefined)
        ret
    }
    @scala.inline
    def withFilterType(value: FilterType_ | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilterType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterType")(js.undefined)
        ret
    }
  }
  
}

