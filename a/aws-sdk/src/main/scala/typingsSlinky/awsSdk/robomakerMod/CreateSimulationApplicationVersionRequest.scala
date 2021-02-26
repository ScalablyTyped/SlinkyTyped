package typingsSlinky.awsSdk.robomakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateSimulationApplicationVersionRequest extends StObject {
  
  /**
    * The application information for the simulation application.
    */
  var application: Arn = js.native
  
  /**
    * The current revision id for the simulation application. If you provide a value and it matches the latest revision ID, a new version will be created.
    */
  var currentRevisionId: js.UndefOr[RevisionId] = js.native
}
object CreateSimulationApplicationVersionRequest {
  
  @scala.inline
  def apply(application: Arn): CreateSimulationApplicationVersionRequest = {
    val __obj = js.Dynamic.literal(application = application.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateSimulationApplicationVersionRequest]
  }
  
  @scala.inline
  implicit class CreateSimulationApplicationVersionRequestMutableBuilder[Self <: CreateSimulationApplicationVersionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: Arn): Self = StObject.set(x, "application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentRevisionId(value: RevisionId): Self = StObject.set(x, "currentRevisionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentRevisionIdUndefined: Self = StObject.set(x, "currentRevisionId", js.undefined)
  }
}
