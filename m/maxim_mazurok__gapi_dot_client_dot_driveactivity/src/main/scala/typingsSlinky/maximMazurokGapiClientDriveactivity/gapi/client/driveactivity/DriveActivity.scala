package typingsSlinky.maximMazurokGapiClientDriveactivity.gapi.client.driveactivity

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DriveActivity extends StObject {
  
  /** Details on all actions in this activity. */
  var actions: js.UndefOr[js.Array[Action]] = js.native
  
  /** All actor(s) responsible for the activity. */
  var actors: js.UndefOr[js.Array[Actor]] = js.native
  
  /**
    * Key information about the primary action for this activity. This is either representative, or the most important, of all actions in the activity, according to the
    * ConsolidationStrategy in the request.
    */
  var primaryActionDetail: js.UndefOr[ActionDetail] = js.native
  
  /** All Google Drive objects this activity is about (e.g. file, folder, drive). This represents the state of the target immediately after the actions occurred. */
  var targets: js.UndefOr[js.Array[Target]] = js.native
  
  /** The activity occurred over this time range. */
  var timeRange: js.UndefOr[TimeRange] = js.native
  
  /** The activity occurred at this specific time. */
  var timestamp: js.UndefOr[String] = js.native
}
object DriveActivity {
  
  @scala.inline
  def apply(): DriveActivity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DriveActivity]
  }
  
  @scala.inline
  implicit class DriveActivityMutableBuilder[Self <: DriveActivity] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActions(value: js.Array[Action]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
    
    @scala.inline
    def setActionsVarargs(value: Action*): Self = StObject.set(x, "actions", js.Array(value :_*))
    
    @scala.inline
    def setActors(value: js.Array[Actor]): Self = StObject.set(x, "actors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActorsUndefined: Self = StObject.set(x, "actors", js.undefined)
    
    @scala.inline
    def setActorsVarargs(value: Actor*): Self = StObject.set(x, "actors", js.Array(value :_*))
    
    @scala.inline
    def setPrimaryActionDetail(value: ActionDetail): Self = StObject.set(x, "primaryActionDetail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrimaryActionDetailUndefined: Self = StObject.set(x, "primaryActionDetail", js.undefined)
    
    @scala.inline
    def setTargets(value: js.Array[Target]): Self = StObject.set(x, "targets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetsUndefined: Self = StObject.set(x, "targets", js.undefined)
    
    @scala.inline
    def setTargetsVarargs(value: Target*): Self = StObject.set(x, "targets", js.Array(value :_*))
    
    @scala.inline
    def setTimeRange(value: TimeRange): Self = StObject.set(x, "timeRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeRangeUndefined: Self = StObject.set(x, "timeRange", js.undefined)
    
    @scala.inline
    def setTimestamp(value: String): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
  }
}
