package typingsSlinky.awsSdk.cloudwatcheventsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PutTargetsResultEntry extends StObject {
  
  /**
    * The error code that indicates why the target addition failed. If the value is ConcurrentModificationException, too many requests were made at the same time.
    */
  var ErrorCode: js.UndefOr[typingsSlinky.awsSdk.cloudwatcheventsMod.ErrorCode] = js.native
  
  /**
    * The error message that explains why the target addition failed.
    */
  var ErrorMessage: js.UndefOr[typingsSlinky.awsSdk.cloudwatcheventsMod.ErrorMessage] = js.native
  
  /**
    * The ID of the target.
    */
  var TargetId: js.UndefOr[typingsSlinky.awsSdk.cloudwatcheventsMod.TargetId] = js.native
}
object PutTargetsResultEntry {
  
  @scala.inline
  def apply(): PutTargetsResultEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutTargetsResultEntry]
  }
  
  @scala.inline
  implicit class PutTargetsResultEntryMutableBuilder[Self <: PutTargetsResultEntry] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrorCode(value: ErrorCode): Self = StObject.set(x, "ErrorCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorCodeUndefined: Self = StObject.set(x, "ErrorCode", js.undefined)
    
    @scala.inline
    def setErrorMessage(value: ErrorMessage): Self = StObject.set(x, "ErrorMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorMessageUndefined: Self = StObject.set(x, "ErrorMessage", js.undefined)
    
    @scala.inline
    def setTargetId(value: TargetId): Self = StObject.set(x, "TargetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetIdUndefined: Self = StObject.set(x, "TargetId", js.undefined)
  }
}
