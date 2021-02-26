package typingsSlinky.gatsbyCli

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object constantsMod {
  
  @js.native
  sealed trait Actions extends StObject
  @JSImport("gatsby-cli/lib/reporter/constants", "Actions")
  @js.native
  object Actions extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[Actions with String] = js.native
    
    @js.native
    sealed trait ActivityErrored extends Actions
    /* "ACTIVITY_ERRORED" */ val ActivityErrored: typingsSlinky.gatsbyCli.constantsMod.Actions.ActivityErrored with String = js.native
    
    @js.native
    sealed trait CancelActivity extends Actions
    /* "ACTIVITY_CANCEL" */ val CancelActivity: typingsSlinky.gatsbyCli.constantsMod.Actions.CancelActivity with String = js.native
    
    @js.native
    sealed trait EndActivity extends Actions
    /* "ACTIVITY_END" */ val EndActivity: typingsSlinky.gatsbyCli.constantsMod.Actions.EndActivity with String = js.native
    
    @js.native
    sealed trait Log extends Actions
    /* "LOG" */ val Log: typingsSlinky.gatsbyCli.constantsMod.Actions.Log with String = js.native
    
    @js.native
    sealed trait LogAction extends Actions
    /* "LOG_ACTION" */ val LogAction: typingsSlinky.gatsbyCli.constantsMod.Actions.LogAction with String = js.native
    
    @js.native
    sealed trait PendingActivity extends Actions
    /* "ACTIVITY_PENDING" */ val PendingActivity: typingsSlinky.gatsbyCli.constantsMod.Actions.PendingActivity with String = js.native
    
    @js.native
    sealed trait SetLogs extends Actions
    /* "SET_LOGS" */ val SetLogs: typingsSlinky.gatsbyCli.constantsMod.Actions.SetLogs with String = js.native
    
    @js.native
    sealed trait SetStatus extends Actions
    /* "SET_STATUS" */ val SetStatus: typingsSlinky.gatsbyCli.constantsMod.Actions.SetStatus with String = js.native
    
    @js.native
    sealed trait StartActivity extends Actions
    /* "ACTIVITY_START" */ val StartActivity: typingsSlinky.gatsbyCli.constantsMod.Actions.StartActivity with String = js.native
    
    @js.native
    sealed trait UpdateActivity extends Actions
    /* "ACTIVITY_UPDATE" */ val UpdateActivity: typingsSlinky.gatsbyCli.constantsMod.Actions.UpdateActivity with String = js.native
  }
  
  @js.native
  sealed trait ActivityLogLevels extends StObject
  @JSImport("gatsby-cli/lib/reporter/constants", "ActivityLogLevels")
  @js.native
  object ActivityLogLevels extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[ActivityLogLevels with String] = js.native
    
    @js.native
    sealed trait Failed extends ActivityLogLevels
    /* "ACTIVITY_FAILED" */ val Failed: typingsSlinky.gatsbyCli.constantsMod.ActivityLogLevels.Failed with String = js.native
    
    @js.native
    sealed trait Interrupted extends ActivityLogLevels
    /* "ACTIVITY_INTERRUPTED" */ val Interrupted: typingsSlinky.gatsbyCli.constantsMod.ActivityLogLevels.Interrupted with String = js.native
    
    @js.native
    sealed trait Success extends ActivityLogLevels
    /* "ACTIVITY_SUCCESS" */ val Success: typingsSlinky.gatsbyCli.constantsMod.ActivityLogLevels.Success with String = js.native
  }
  
  @js.native
  sealed trait ActivityStatuses extends StObject
  @JSImport("gatsby-cli/lib/reporter/constants", "ActivityStatuses")
  @js.native
  object ActivityStatuses extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[ActivityStatuses with String] = js.native
    
    @js.native
    sealed trait Cancelled extends ActivityStatuses
    /* "CANCELLED" */ val Cancelled: typingsSlinky.gatsbyCli.constantsMod.ActivityStatuses.Cancelled with String = js.native
    
    @js.native
    sealed trait Failed extends ActivityStatuses
    /* "FAILED" */ val Failed: typingsSlinky.gatsbyCli.constantsMod.ActivityStatuses.Failed with String = js.native
    
    @js.native
    sealed trait InProgress extends ActivityStatuses
    /* "IN_PROGRESS" */ val InProgress: typingsSlinky.gatsbyCli.constantsMod.ActivityStatuses.InProgress with String = js.native
    
    @js.native
    sealed trait Interrupted extends ActivityStatuses
    /* "INTERRUPTED" */ val Interrupted: typingsSlinky.gatsbyCli.constantsMod.ActivityStatuses.Interrupted with String = js.native
    
    @js.native
    sealed trait NotStarted extends ActivityStatuses
    /* "NOT_STARTED" */ val NotStarted: typingsSlinky.gatsbyCli.constantsMod.ActivityStatuses.NotStarted with String = js.native
    
    @js.native
    sealed trait Success extends ActivityStatuses
    /* "SUCCESS" */ val Success: typingsSlinky.gatsbyCli.constantsMod.ActivityStatuses.Success with String = js.native
  }
  
  @js.native
  sealed trait ActivityTypes extends StObject
  @JSImport("gatsby-cli/lib/reporter/constants", "ActivityTypes")
  @js.native
  object ActivityTypes extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[ActivityTypes with String] = js.native
    
    @js.native
    sealed trait Hidden extends ActivityTypes
    /* "hidden" */ val Hidden: typingsSlinky.gatsbyCli.constantsMod.ActivityTypes.Hidden with String = js.native
    
    @js.native
    sealed trait Pending extends ActivityTypes
    /* "pending" */ val Pending: typingsSlinky.gatsbyCli.constantsMod.ActivityTypes.Pending with String = js.native
    
    @js.native
    sealed trait Progress extends ActivityTypes
    /* "progress" */ val Progress: typingsSlinky.gatsbyCli.constantsMod.ActivityTypes.Progress with String = js.native
    
    @js.native
    sealed trait Spinner extends ActivityTypes
    /* "spinner" */ val Spinner: typingsSlinky.gatsbyCli.constantsMod.ActivityTypes.Spinner with String = js.native
  }
  
  @js.native
  sealed trait LogLevels extends StObject
  @JSImport("gatsby-cli/lib/reporter/constants", "LogLevels")
  @js.native
  object LogLevels extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[LogLevels with String] = js.native
    
    @js.native
    sealed trait Debug extends LogLevels
    /* "DEBUG" */ val Debug: typingsSlinky.gatsbyCli.constantsMod.LogLevels.Debug with String = js.native
    
    @js.native
    sealed trait Error extends LogLevels
    /* "ERROR" */ val Error: typingsSlinky.gatsbyCli.constantsMod.LogLevels.Error with String = js.native
    
    @js.native
    sealed trait Info extends LogLevels
    /* "INFO" */ val Info: typingsSlinky.gatsbyCli.constantsMod.LogLevels.Info with String = js.native
    
    @js.native
    sealed trait Log extends LogLevels
    /* "LOG" */ val Log: typingsSlinky.gatsbyCli.constantsMod.LogLevels.Log with String = js.native
    
    @js.native
    sealed trait Success extends LogLevels
    /* "SUCCESS" */ val Success: typingsSlinky.gatsbyCli.constantsMod.LogLevels.Success with String = js.native
    
    @js.native
    sealed trait Warning extends LogLevels
    /* "WARNING" */ val Warning: typingsSlinky.gatsbyCli.constantsMod.LogLevels.Warning with String = js.native
  }
}
