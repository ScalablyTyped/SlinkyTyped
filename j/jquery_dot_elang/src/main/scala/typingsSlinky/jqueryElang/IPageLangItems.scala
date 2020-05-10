package typingsSlinky.jqueryElang

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPageLangItems extends js.Object {
  var en: js.UndefOr[IPageLabels] = js.native
  var hu: js.UndefOr[IPageLabels] = js.native
}

object IPageLangItems {
  @scala.inline
  def apply(): IPageLangItems = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPageLangItems]
  }
  @scala.inline
  implicit class IPageLangItemsOps[Self <: IPageLangItems] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEn(value: IPageLabels): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("en")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("en")(js.undefined)
        ret
    }
    @scala.inline
    def withHu(value: IPageLabels): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hu")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHu: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hu")(js.undefined)
        ret
    }
  }
  
}

