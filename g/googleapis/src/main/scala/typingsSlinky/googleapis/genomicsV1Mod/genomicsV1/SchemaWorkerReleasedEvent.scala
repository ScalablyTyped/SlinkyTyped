package typingsSlinky.googleapis.genomicsV1Mod.genomicsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An event generated when the worker VM that was assigned to the pipeline has
  * been released (deleted).
  */
@js.native
trait SchemaWorkerReleasedEvent extends StObject {
  
  /**
    * The worker&#39;s instance name.
    */
  var instance: js.UndefOr[String] = js.native
  
  /**
    * The zone the worker was running in.
    */
  var zone: js.UndefOr[String] = js.native
}
object SchemaWorkerReleasedEvent {
  
  @scala.inline
  def apply(): SchemaWorkerReleasedEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaWorkerReleasedEvent]
  }
  
  @scala.inline
  implicit class SchemaWorkerReleasedEventMutableBuilder[Self <: SchemaWorkerReleasedEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInstance(value: String): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceUndefined: Self = StObject.set(x, "instance", js.undefined)
    
    @scala.inline
    def setZone(value: String): Self = StObject.set(x, "zone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoneUndefined: Self = StObject.set(x, "zone", js.undefined)
  }
}
