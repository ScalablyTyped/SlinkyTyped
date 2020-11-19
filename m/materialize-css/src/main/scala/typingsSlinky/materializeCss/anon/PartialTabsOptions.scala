package typingsSlinky.materializeCss.anon

import org.scalajs.dom.raw.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<materialize-css.M.TabsOptions> */
@js.native
trait PartialTabsOptions extends js.Object {
  
  var duration: js.UndefOr[Double] = js.native
  
  var onShow: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* newContent */ Element, Unit]] = js.native
  
  var responsiveThreshold: js.UndefOr[Double] = js.native
  
  var swipeable: js.UndefOr[Boolean] = js.native
}
object PartialTabsOptions {
  
  @scala.inline
  def apply(): PartialTabsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialTabsOptions]
  }
  
  @scala.inline
  implicit class PartialTabsOptionsOps[Self <: PartialTabsOptions] (val x: Self) extends AnyVal {
    
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
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDuration: Self = this.set("duration", js.undefined)
    
    @scala.inline
    def setOnShow(value: js.ThisFunction1[PartialTabsOptions, /* newContent */ Element, Unit]): Self = this.set("onShow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnShow: Self = this.set("onShow", js.undefined)
    
    @scala.inline
    def setResponsiveThreshold(value: Double): Self = this.set("responsiveThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResponsiveThreshold: Self = this.set("responsiveThreshold", js.undefined)
    
    @scala.inline
    def setSwipeable(value: Boolean): Self = this.set("swipeable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSwipeable: Self = this.set("swipeable", js.undefined)
  }
}
