package typingsSlinky.recurlyRecurlyJs.elementsMod

import typingsSlinky.recurlyRecurlyJs.anon.CommonElementStyleinvalid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CardElementOptions extends js.Object {
  
  var displayIcon: js.UndefOr[Boolean] = js.native
  
  var inputType: js.UndefOr[String] = js.native
  
  var style: js.UndefOr[CommonElementStyleinvalid] = js.native
  
  var tabIndex: js.UndefOr[String] = js.native
}
object CardElementOptions {
  
  @scala.inline
  def apply(): CardElementOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CardElementOptions]
  }
  
  @scala.inline
  implicit class CardElementOptionsOps[Self <: CardElementOptions] (val x: Self) extends AnyVal {
    
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
    def setDisplayIcon(value: Boolean): Self = this.set("displayIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayIcon: Self = this.set("displayIcon", js.undefined)
    
    @scala.inline
    def setInputType(value: String): Self = this.set("inputType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputType: Self = this.set("inputType", js.undefined)
    
    @scala.inline
    def setStyle(value: CommonElementStyleinvalid): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setTabIndex(value: String): Self = this.set("tabIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTabIndex: Self = this.set("tabIndex", js.undefined)
  }
}
