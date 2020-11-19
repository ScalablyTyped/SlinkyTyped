package typingsSlinky.doctrine.mod.`type`

import typingsSlinky.doctrine.mod.Type_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NullableLiteral extends Type_ {
  
  var `type`: typingsSlinky.doctrine.doctrineStrings.NullableLiteral = js.native
}
object NullableLiteral {
  
  @scala.inline
  def apply(`type`: typingsSlinky.doctrine.doctrineStrings.NullableLiteral): NullableLiteral = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NullableLiteral]
  }
  
  @scala.inline
  implicit class NullableLiteralOps[Self <: NullableLiteral] (val x: Self) extends AnyVal {
    
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
    def setType(value: typingsSlinky.doctrine.doctrineStrings.NullableLiteral): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
