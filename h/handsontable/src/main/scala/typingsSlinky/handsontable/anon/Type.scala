package typingsSlinky.handsontable.anon

import typingsSlinky.handsontable.handsontableStrings.average
import typingsSlinky.handsontable.handsontableStrings.count
import typingsSlinky.handsontable.handsontableStrings.max
import typingsSlinky.handsontable.handsontableStrings.min
import typingsSlinky.handsontable.handsontableStrings.sum
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Type extends js.Object {
  
  var `type`: sum | min | max | count | average = js.native
}
object Type {
  
  @scala.inline
  def apply(`type`: sum | min | max | count | average): Type = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Type]
  }
  
  @scala.inline
  implicit class TypeOps[Self <: Type] (val x: Self) extends AnyVal {
    
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
    def setType(value: sum | min | max | count | average): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
