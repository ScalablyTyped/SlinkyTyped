package typingsSlinky.extenso.mod.Extenso

import typingsSlinky.extenso.extensoStrings.br
import typingsSlinky.extenso.extensoStrings.formal
import typingsSlinky.extenso.extensoStrings.informal
import typingsSlinky.extenso.extensoStrings.long
import typingsSlinky.extenso.extensoStrings.pt
import typingsSlinky.extenso.extensoStrings.short
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BaseOptions extends js.Object {
  
  var locale: js.UndefOr[br | pt] = js.native
  
  var negative: js.UndefOr[formal | informal] = js.native
  
  var scale: js.UndefOr[short | long] = js.native
}
object BaseOptions {
  
  @scala.inline
  def apply(): BaseOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseOptions]
  }
  
  @scala.inline
  implicit class BaseOptionsOps[Self <: BaseOptions] (val x: Self) extends AnyVal {
    
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
    def setLocale(value: br | pt): Self = this.set("locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocale: Self = this.set("locale", js.undefined)
    
    @scala.inline
    def setNegative(value: formal | informal): Self = this.set("negative", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNegative: Self = this.set("negative", js.undefined)
    
    @scala.inline
    def setScale(value: short | long): Self = this.set("scale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScale: Self = this.set("scale", js.undefined)
  }
}
