package typingsSlinky.antd.listMod

import slinky.core.TagMod
import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListLocale extends js.Object {
  var emptyText: TagMod[Any] | js.Function0[TagMod[Any]]
}

object ListLocale {
  @scala.inline
  def apply(): ListLocale = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListLocale]
  }
  @scala.inline
  implicit class ListLocaleOps[Self <: ListLocale] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setEmptyTextReactElement(value: ReactElement): Self = this.set("emptyText", value.asInstanceOf[js.Any])
    @scala.inline
    def setEmptyTextFunction0(value: () => TagMod[Any]): Self = this.set("emptyText", js.Any.fromFunction0(value))
    @scala.inline
    def setEmptyText(value: TagMod[Any] | js.Function0[TagMod[Any]]): Self = this.set("emptyText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmptyText: Self = this.set("emptyText", js.undefined)
  }
  
}

