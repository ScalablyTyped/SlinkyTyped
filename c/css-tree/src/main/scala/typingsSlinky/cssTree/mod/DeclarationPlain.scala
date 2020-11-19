package typingsSlinky.cssTree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeclarationPlain
  extends CssNodeCommon
     with CssNodePlain {
  
  var important: Boolean | String = js.native
  
  var property: String = js.native
  
  @JSName("type")
  var type_DeclarationPlain: typingsSlinky.cssTree.cssTreeStrings.Declaration = js.native
  
  var value: ValuePlain | Raw = js.native
}
object DeclarationPlain {
  
  @scala.inline
  def apply(
    important: Boolean | String,
    property: String,
    `type`: typingsSlinky.cssTree.cssTreeStrings.Declaration,
    value: ValuePlain | Raw
  ): DeclarationPlain = {
    val __obj = js.Dynamic.literal(important = important.asInstanceOf[js.Any], property = property.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeclarationPlain]
  }
  
  @scala.inline
  implicit class DeclarationPlainOps[Self <: DeclarationPlain] (val x: Self) extends AnyVal {
    
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
    def setImportant(value: Boolean | String): Self = this.set("important", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProperty(value: String): Self = this.set("property", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: typingsSlinky.cssTree.cssTreeStrings.Declaration): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: ValuePlain | Raw): Self = this.set("value", value.asInstanceOf[js.Any])
  }
}
