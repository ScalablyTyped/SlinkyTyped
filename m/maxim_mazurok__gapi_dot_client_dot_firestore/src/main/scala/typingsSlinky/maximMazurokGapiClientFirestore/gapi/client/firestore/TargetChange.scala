package typingsSlinky.maximMazurokGapiClientFirestore.gapi.client.firestore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TargetChange extends StObject {
  
  /** The error that resulted in this change, if applicable. */
  var cause: js.UndefOr[Status] = js.native
  
  /**
    * The consistent `read_time` for the given `target_ids` (omitted when the target_ids are not at a consistent snapshot). The stream is guaranteed to send a `read_time` with
    * `target_ids` empty whenever the entire stream reaches a new consistent snapshot. ADD, CURRENT, and RESET messages are guaranteed to (eventually) result in a new consistent snapshot
    * (while NO_CHANGE and REMOVE messages are not). For a given stream, `read_time` is guaranteed to be monotonically increasing.
    */
  var readTime: js.UndefOr[String] = js.native
  
  /** A token that can be used to resume the stream for the given `target_ids`, or all targets if `target_ids` is empty. Not set on every target change. */
  var resumeToken: js.UndefOr[String] = js.native
  
  /** The type of change that occurred. */
  var targetChangeType: js.UndefOr[String] = js.native
  
  /** The target IDs of targets that have changed. If empty, the change applies to all targets. The order of the target IDs is not defined. */
  var targetIds: js.UndefOr[js.Array[Double]] = js.native
}
object TargetChange {
  
  @scala.inline
  def apply(): TargetChange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TargetChange]
  }
  
  @scala.inline
  implicit class TargetChangeMutableBuilder[Self <: TargetChange] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCause(value: Status): Self = StObject.set(x, "cause", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCauseUndefined: Self = StObject.set(x, "cause", js.undefined)
    
    @scala.inline
    def setReadTime(value: String): Self = StObject.set(x, "readTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadTimeUndefined: Self = StObject.set(x, "readTime", js.undefined)
    
    @scala.inline
    def setResumeToken(value: String): Self = StObject.set(x, "resumeToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResumeTokenUndefined: Self = StObject.set(x, "resumeToken", js.undefined)
    
    @scala.inline
    def setTargetChangeType(value: String): Self = StObject.set(x, "targetChangeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetChangeTypeUndefined: Self = StObject.set(x, "targetChangeType", js.undefined)
    
    @scala.inline
    def setTargetIds(value: js.Array[Double]): Self = StObject.set(x, "targetIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetIdsUndefined: Self = StObject.set(x, "targetIds", js.undefined)
    
    @scala.inline
    def setTargetIdsVarargs(value: Double*): Self = StObject.set(x, "targetIds", js.Array(value :_*))
  }
}
