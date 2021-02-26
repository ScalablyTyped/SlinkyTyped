package typingsSlinky.azureSb.mod.Azure.ServiceBus

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IQueueOptions extends CreateOptions {
  
  var AutoDeleteOnIdle: String = js.native
  
  var DeadLetteringOnMessageExpiration: Boolean = js.native
  
  var LockDuration: String = js.native
  
  var RequiresSession: Boolean = js.native
}
object IQueueOptions {
  
  @scala.inline
  def apply(
    AutoDeleteOnIdle: String,
    DeadLetteringOnMessageExpiration: Boolean,
    DefaultMessageTimeToLive: String,
    DuplicateDetectionHistoryTimeWindow: String,
    EnablePartitioning: Boolean,
    LockDuration: String,
    MaxSizeInMegabytes: Double,
    RequiresDuplicateDetection: Boolean,
    RequiresSession: Boolean
  ): IQueueOptions = {
    val __obj = js.Dynamic.literal(AutoDeleteOnIdle = AutoDeleteOnIdle.asInstanceOf[js.Any], DeadLetteringOnMessageExpiration = DeadLetteringOnMessageExpiration.asInstanceOf[js.Any], DefaultMessageTimeToLive = DefaultMessageTimeToLive.asInstanceOf[js.Any], DuplicateDetectionHistoryTimeWindow = DuplicateDetectionHistoryTimeWindow.asInstanceOf[js.Any], EnablePartitioning = EnablePartitioning.asInstanceOf[js.Any], LockDuration = LockDuration.asInstanceOf[js.Any], MaxSizeInMegabytes = MaxSizeInMegabytes.asInstanceOf[js.Any], RequiresDuplicateDetection = RequiresDuplicateDetection.asInstanceOf[js.Any], RequiresSession = RequiresSession.asInstanceOf[js.Any])
    __obj.asInstanceOf[IQueueOptions]
  }
  
  @scala.inline
  implicit class IQueueOptionsMutableBuilder[Self <: IQueueOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoDeleteOnIdle(value: String): Self = StObject.set(x, "AutoDeleteOnIdle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeadLetteringOnMessageExpiration(value: Boolean): Self = StObject.set(x, "DeadLetteringOnMessageExpiration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLockDuration(value: String): Self = StObject.set(x, "LockDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequiresSession(value: Boolean): Self = StObject.set(x, "RequiresSession", value.asInstanceOf[js.Any])
  }
}
