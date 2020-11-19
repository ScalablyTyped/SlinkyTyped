package typingsSlinky.awsSdk.wafMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ByteMatchSetUpdate extends js.Object {
  
  /**
    * Specifies whether to insert or delete a ByteMatchTuple.
    */
  var Action: ChangeAction = js.native
  
  /**
    * Information about the part of a web request that you want AWS WAF to inspect and the value that you want AWS WAF to search for. If you specify DELETE for the value of Action, the ByteMatchTuple values must exactly match the values in the ByteMatchTuple that you want to delete from the ByteMatchSet.
    */
  var ByteMatchTuple: typingsSlinky.awsSdk.wafMod.ByteMatchTuple = js.native
}
object ByteMatchSetUpdate {
  
  @scala.inline
  def apply(Action: ChangeAction, ByteMatchTuple: ByteMatchTuple): ByteMatchSetUpdate = {
    val __obj = js.Dynamic.literal(Action = Action.asInstanceOf[js.Any], ByteMatchTuple = ByteMatchTuple.asInstanceOf[js.Any])
    __obj.asInstanceOf[ByteMatchSetUpdate]
  }
  
  @scala.inline
  implicit class ByteMatchSetUpdateOps[Self <: ByteMatchSetUpdate] (val x: Self) extends AnyVal {
    
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
    def setAction(value: ChangeAction): Self = this.set("Action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setByteMatchTuple(value: ByteMatchTuple): Self = this.set("ByteMatchTuple", value.asInstanceOf[js.Any])
  }
}
