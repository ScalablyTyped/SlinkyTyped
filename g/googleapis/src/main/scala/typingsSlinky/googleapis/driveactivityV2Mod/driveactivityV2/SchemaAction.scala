package typingsSlinky.googleapis.driveactivityV2Mod.driveactivityV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Information about the action.
  */
@js.native
trait SchemaAction extends StObject {
  
  /**
    * The actor responsible for this action (or empty if all actors are
    * responsible).
    */
  var actor: js.UndefOr[SchemaActor] = js.native
  
  /**
    * The type and detailed information about the action.
    */
  var detail: js.UndefOr[SchemaActionDetail] = js.native
  
  /**
    * The target this action affects (or empty if affecting all targets). This
    * represents the state of the target immediately after this action
    * occurred.
    */
  var target: js.UndefOr[SchemaTarget] = js.native
  
  /**
    * The action occurred over this time range.
    */
  var timeRange: js.UndefOr[SchemaTimeRange] = js.native
  
  /**
    * The action occurred at this specific time.
    */
  var timestamp: js.UndefOr[String] = js.native
}
object SchemaAction {
  
  @scala.inline
  def apply(): SchemaAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAction]
  }
  
  @scala.inline
  implicit class SchemaActionMutableBuilder[Self <: SchemaAction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActor(value: SchemaActor): Self = StObject.set(x, "actor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActorUndefined: Self = StObject.set(x, "actor", js.undefined)
    
    @scala.inline
    def setDetail(value: SchemaActionDetail): Self = StObject.set(x, "detail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetailUndefined: Self = StObject.set(x, "detail", js.undefined)
    
    @scala.inline
    def setTarget(value: SchemaTarget): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    
    @scala.inline
    def setTimeRange(value: SchemaTimeRange): Self = StObject.set(x, "timeRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeRangeUndefined: Self = StObject.set(x, "timeRange", js.undefined)
    
    @scala.inline
    def setTimestamp(value: String): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
  }
}
