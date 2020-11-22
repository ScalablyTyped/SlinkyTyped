package typingsSlinky.contentfulManagement.entryFieldsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Symbol extends js.Object {
  
  var `type`: typingsSlinky.contentfulManagement.contentfulManagementStrings.Symbol = js.native
}
object Symbol {
  
  @scala.inline
  def apply(`type`: typingsSlinky.contentfulManagement.contentfulManagementStrings.Symbol): Symbol = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Symbol]
  }
  
  @scala.inline
  implicit class SymbolOps[Self <: Symbol] (val x: Self) extends AnyVal {
    
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
    def setType(value: typingsSlinky.contentfulManagement.contentfulManagementStrings.Symbol): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
