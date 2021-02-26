package typingsSlinky.awsSdk.eventbridgeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateArchiveResponse extends StObject {
  
  /**
    * The ARN of the archive that was created.
    */
  var ArchiveArn: js.UndefOr[typingsSlinky.awsSdk.eventbridgeMod.ArchiveArn] = js.native
  
  /**
    * The time at which the archive was created.
    */
  var CreationTime: js.UndefOr[js.Date] = js.native
  
  /**
    * The state of the archive that was created.
    */
  var State: js.UndefOr[ArchiveState] = js.native
  
  /**
    * The reason that the archive is in the state.
    */
  var StateReason: js.UndefOr[ArchiveStateReason] = js.native
}
object CreateArchiveResponse {
  
  @scala.inline
  def apply(): CreateArchiveResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateArchiveResponse]
  }
  
  @scala.inline
  implicit class CreateArchiveResponseMutableBuilder[Self <: CreateArchiveResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArchiveArn(value: ArchiveArn): Self = StObject.set(x, "ArchiveArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArchiveArnUndefined: Self = StObject.set(x, "ArchiveArn", js.undefined)
    
    @scala.inline
    def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    @scala.inline
    def setState(value: ArchiveState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateReason(value: ArchiveStateReason): Self = StObject.set(x, "StateReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateReasonUndefined: Self = StObject.set(x, "StateReason", js.undefined)
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
  }
}
