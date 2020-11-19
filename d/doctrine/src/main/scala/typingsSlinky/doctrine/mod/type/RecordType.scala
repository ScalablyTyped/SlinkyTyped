package typingsSlinky.doctrine.mod.`type`

import typingsSlinky.doctrine.mod.Type_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RecordType extends Type_ {
  
  var fields: js.Array[Type_] = js.native
  
  var `type`: typingsSlinky.doctrine.doctrineStrings.RecordType = js.native
}
object RecordType {
  
  @scala.inline
  def apply(fields: js.Array[Type_], `type`: typingsSlinky.doctrine.doctrineStrings.RecordType): RecordType = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecordType]
  }
  
  @scala.inline
  implicit class RecordTypeOps[Self <: RecordType] (val x: Self) extends AnyVal {
    
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
    def setFieldsVarargs(value: Type_ *): Self = this.set("fields", js.Array(value :_*))
    
    @scala.inline
    def setFields(value: js.Array[Type_]): Self = this.set("fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: typingsSlinky.doctrine.doctrineStrings.RecordType): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
