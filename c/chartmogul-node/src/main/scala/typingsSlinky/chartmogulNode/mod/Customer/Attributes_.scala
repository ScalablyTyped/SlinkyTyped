package typingsSlinky.chartmogulNode.mod.Customer

import typingsSlinky.chartmogulNode.commonMod.Map
import typingsSlinky.chartmogulNode.commonMod.Strings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Attributes_ extends js.Object {
  
  var clearbit: js.UndefOr[Map] = js.native
  
  var custom: js.UndefOr[Map] = js.native
  
  var stripe: js.UndefOr[Map] = js.native
  
  var tags: js.UndefOr[Strings] = js.native
}
object Attributes_ {
  
  @scala.inline
  def apply(): Attributes_ = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Attributes_]
  }
  
  @scala.inline
  implicit class Attributes_Ops[Self <: Attributes_] (val x: Self) extends AnyVal {
    
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
    def setClearbit(value: Map): Self = this.set("clearbit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClearbit: Self = this.set("clearbit", js.undefined)
    
    @scala.inline
    def setCustom(value: Map): Self = this.set("custom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustom: Self = this.set("custom", js.undefined)
    
    @scala.inline
    def setStripe(value: Map): Self = this.set("stripe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStripe: Self = this.set("stripe", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: String*): Self = this.set("tags", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: Strings): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
}
