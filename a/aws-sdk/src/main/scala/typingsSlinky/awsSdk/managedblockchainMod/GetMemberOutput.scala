package typingsSlinky.awsSdk.managedblockchainMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetMemberOutput extends StObject {
  
  /**
    * The properties of a member.
    */
  var Member: js.UndefOr[typingsSlinky.awsSdk.managedblockchainMod.Member] = js.native
}
object GetMemberOutput {
  
  @scala.inline
  def apply(): GetMemberOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetMemberOutput]
  }
  
  @scala.inline
  implicit class GetMemberOutputMutableBuilder[Self <: GetMemberOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMember(value: Member): Self = StObject.set(x, "Member", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMemberUndefined: Self = StObject.set(x, "Member", js.undefined)
  }
}
