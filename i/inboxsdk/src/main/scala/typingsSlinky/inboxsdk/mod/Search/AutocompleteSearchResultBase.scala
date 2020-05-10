package typingsSlinky.inboxsdk.mod.Search

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AutocompleteSearchResultBase extends js.Object {
  var externalURL: js.UndefOr[String] = js.native
  var iconHTML: js.UndefOr[String] = js.native
  var iconUrl: js.UndefOr[String] = js.native
  var onClick: js.UndefOr[js.Function0[Unit]] = js.native
  var routeName: js.UndefOr[String] = js.native
  var routeParams: js.UndefOr[js.Array[String]] = js.native
}

object AutocompleteSearchResultBase {
  @scala.inline
  def apply(): AutocompleteSearchResultBase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutocompleteSearchResultBase]
  }
  @scala.inline
  implicit class AutocompleteSearchResultBaseOps[Self <: AutocompleteSearchResultBase] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExternalURL(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("externalURL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExternalURL: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("externalURL")(js.undefined)
        ret
    }
    @scala.inline
    def withIconHTML(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconHTML")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIconHTML: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconHTML")(js.undefined)
        ret
    }
    @scala.inline
    def withIconUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIconUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withOnClick(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClick")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClick")(js.undefined)
        ret
    }
    @scala.inline
    def withRouteName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("routeName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRouteName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("routeName")(js.undefined)
        ret
    }
    @scala.inline
    def withRouteParams(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("routeParams")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRouteParams: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("routeParams")(js.undefined)
        ret
    }
  }
  
}

