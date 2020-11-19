package typingsSlinky.ariaQuery.mod

import typingsSlinky.ariaQuery.ariaQueryStrings.boolean
import typingsSlinky.ariaQuery.ariaQueryStrings.id
import typingsSlinky.ariaQuery.ariaQueryStrings.idlist
import typingsSlinky.ariaQuery.ariaQueryStrings.integer
import typingsSlinky.ariaQuery.ariaQueryStrings.number
import typingsSlinky.ariaQuery.ariaQueryStrings.string
import typingsSlinky.ariaQuery.ariaQueryStrings.token
import typingsSlinky.ariaQuery.ariaQueryStrings.tokenlist
import typingsSlinky.ariaQuery.ariaQueryStrings.tristate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ARIAPropertyDefinition extends js.Object {
  
  var allowundefined: js.UndefOr[Boolean] = js.native
  
  var `type`: string | id | idlist | integer | number | boolean | token | tokenlist | tristate = js.native
  
  var value: js.UndefOr[js.Array[String | Boolean]] = js.native
}
object ARIAPropertyDefinition {
  
  @scala.inline
  def apply(`type`: string | id | idlist | integer | number | boolean | token | tokenlist | tristate): ARIAPropertyDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ARIAPropertyDefinition]
  }
  
  @scala.inline
  implicit class ARIAPropertyDefinitionOps[Self <: ARIAPropertyDefinition] (val x: Self) extends AnyVal {
    
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
    def setType(value: string | id | idlist | integer | number | boolean | token | tokenlist | tristate): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowundefined(value: Boolean): Self = this.set("allowundefined", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowundefined: Self = this.set("allowundefined", js.undefined)
    
    @scala.inline
    def setValueVarargs(value: (String | Boolean)*): Self = this.set("value", js.Array(value :_*))
    
    @scala.inline
    def setValue(value: js.Array[String | Boolean]): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}
