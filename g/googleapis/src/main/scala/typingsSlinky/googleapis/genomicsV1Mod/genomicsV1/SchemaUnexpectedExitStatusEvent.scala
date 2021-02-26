package typingsSlinky.googleapis.genomicsV1Mod.genomicsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An event generated when the execution of a container results in a non-zero
  * exit status that was not otherwise ignored. Execution will continue, but
  * only actions that are flagged as `ALWAYS_RUN` will be executed. Other
  * actions will be skipped.
  */
@js.native
trait SchemaUnexpectedExitStatusEvent extends StObject {
  
  /**
    * The numeric ID of the action that started the container.
    */
  var actionId: js.UndefOr[Double] = js.native
  
  /**
    * The exit status of the container.
    */
  var exitStatus: js.UndefOr[Double] = js.native
}
object SchemaUnexpectedExitStatusEvent {
  
  @scala.inline
  def apply(): SchemaUnexpectedExitStatusEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUnexpectedExitStatusEvent]
  }
  
  @scala.inline
  implicit class SchemaUnexpectedExitStatusEventMutableBuilder[Self <: SchemaUnexpectedExitStatusEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActionId(value: Double): Self = StObject.set(x, "actionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionIdUndefined: Self = StObject.set(x, "actionId", js.undefined)
    
    @scala.inline
    def setExitStatus(value: Double): Self = StObject.set(x, "exitStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExitStatusUndefined: Self = StObject.set(x, "exitStatus", js.undefined)
  }
}
