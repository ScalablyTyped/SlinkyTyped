package typingsSlinky.activexOutlook.Outlook

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OlkPageControl extends js.Object {
  @JSName("Outlook.OlkPageControl_typekey")
  var OutlookDotOlkPageControl_typekey: OlkPageControl = js.native
  var Page: OlPageType = js.native
}

object OlkPageControl {
  @scala.inline
  def apply(OutlookDotOlkPageControl_typekey: OlkPageControl, Page: OlPageType): OlkPageControl = {
    val __obj = js.Dynamic.literal(Page = Page.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.OlkPageControl_typekey")(OutlookDotOlkPageControl_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[OlkPageControl]
  }
  @scala.inline
  implicit class OlkPageControlOps[Self <: OlkPageControl] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOutlookDotOlkPageControl_typekey(value: OlkPageControl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Outlook.OlkPageControl_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPage(value: OlPageType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Page")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

