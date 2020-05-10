package typingsSlinky.officeUiFabricReact.searchBoxBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISearchBoxState extends js.Object {
  var hasFocus: js.UndefOr[Boolean] = js.native
  var value: js.UndefOr[String] = js.native
}

object ISearchBoxState {
  @scala.inline
  def apply(): ISearchBoxState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISearchBoxState]
  }
  @scala.inline
  implicit class ISearchBoxStateOps[Self <: ISearchBoxState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHasFocus(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasFocus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHasFocus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasFocus")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
        ret
    }
  }
  
}

