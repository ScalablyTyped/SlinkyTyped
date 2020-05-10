package typingsSlinky.officeUiFabricReact.baseFloatingPickerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IBaseFloatingPickerState extends js.Object {
  var didBind: Boolean = js.native
  var queryString: String = js.native
  var suggestionsVisible: js.UndefOr[Boolean] = js.native
}

object IBaseFloatingPickerState {
  @scala.inline
  def apply(didBind: Boolean, queryString: String): IBaseFloatingPickerState = {
    val __obj = js.Dynamic.literal(didBind = didBind.asInstanceOf[js.Any], queryString = queryString.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBaseFloatingPickerState]
  }
  @scala.inline
  implicit class IBaseFloatingPickerStateOps[Self <: IBaseFloatingPickerState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDidBind(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("didBind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQueryString(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryString")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSuggestionsVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suggestionsVisible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuggestionsVisible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suggestionsVisible")(js.undefined)
        ret
    }
  }
  
}

