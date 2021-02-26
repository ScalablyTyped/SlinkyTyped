package typingsSlinky.awsSdk.rekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProjectDescription extends StObject {
  
  /**
    * The Unix timestamp for the date and time that the project was created.
    */
  var CreationTimestamp: js.UndefOr[js.Date] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the project.
    */
  var ProjectArn: js.UndefOr[typingsSlinky.awsSdk.rekognitionMod.ProjectArn] = js.native
  
  /**
    * The current status of the project.
    */
  var Status: js.UndefOr[ProjectStatus] = js.native
}
object ProjectDescription {
  
  @scala.inline
  def apply(): ProjectDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProjectDescription]
  }
  
  @scala.inline
  implicit class ProjectDescriptionMutableBuilder[Self <: ProjectDescription] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreationTimestamp(value: js.Date): Self = StObject.set(x, "CreationTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationTimestampUndefined: Self = StObject.set(x, "CreationTimestamp", js.undefined)
    
    @scala.inline
    def setProjectArn(value: ProjectArn): Self = StObject.set(x, "ProjectArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectArnUndefined: Self = StObject.set(x, "ProjectArn", js.undefined)
    
    @scala.inline
    def setStatus(value: ProjectStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
