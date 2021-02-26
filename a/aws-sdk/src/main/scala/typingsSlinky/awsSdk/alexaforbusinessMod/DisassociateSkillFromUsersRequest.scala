package typingsSlinky.awsSdk.alexaforbusinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DisassociateSkillFromUsersRequest extends StObject {
  
  /**
    *  The private skill ID you want to make unavailable for enrolled users.
    */
  var SkillId: typingsSlinky.awsSdk.alexaforbusinessMod.SkillId = js.native
}
object DisassociateSkillFromUsersRequest {
  
  @scala.inline
  def apply(SkillId: SkillId): DisassociateSkillFromUsersRequest = {
    val __obj = js.Dynamic.literal(SkillId = SkillId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisassociateSkillFromUsersRequest]
  }
  
  @scala.inline
  implicit class DisassociateSkillFromUsersRequestMutableBuilder[Self <: DisassociateSkillFromUsersRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSkillId(value: SkillId): Self = StObject.set(x, "SkillId", value.asInstanceOf[js.Any])
  }
}
