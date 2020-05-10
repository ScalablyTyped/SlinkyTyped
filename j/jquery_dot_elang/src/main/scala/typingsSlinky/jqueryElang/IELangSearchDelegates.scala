package typingsSlinky.jqueryElang

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IELangSearchDelegates extends js.Object {
  var langDirectionClickHandler: js.Function = js.native
  var langDirectionHandler: js.Function = js.native
  var searchClickHandler: js.Function = js.native
  var searchHandler: js.Function = js.native
  var selectCallback: js.Function = js.native
  var selectHandler: js.Function = js.native
}

object IELangSearchDelegates {
  @scala.inline
  def apply(
    langDirectionClickHandler: js.Function,
    langDirectionHandler: js.Function,
    searchClickHandler: js.Function,
    searchHandler: js.Function,
    selectCallback: js.Function,
    selectHandler: js.Function
  ): IELangSearchDelegates = {
    val __obj = js.Dynamic.literal(langDirectionClickHandler = langDirectionClickHandler.asInstanceOf[js.Any], langDirectionHandler = langDirectionHandler.asInstanceOf[js.Any], searchClickHandler = searchClickHandler.asInstanceOf[js.Any], searchHandler = searchHandler.asInstanceOf[js.Any], selectCallback = selectCallback.asInstanceOf[js.Any], selectHandler = selectHandler.asInstanceOf[js.Any])
    __obj.asInstanceOf[IELangSearchDelegates]
  }
  @scala.inline
  implicit class IELangSearchDelegatesOps[Self <: IELangSearchDelegates] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLangDirectionClickHandler(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("langDirectionClickHandler")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLangDirectionHandler(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("langDirectionHandler")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSearchClickHandler(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchClickHandler")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSearchHandler(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchHandler")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelectCallback(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectCallback")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelectHandler(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectHandler")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

