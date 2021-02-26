package typingsSlinky.awsSdk.elasticbeanstalkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RetrieveEnvironmentInfoMessage extends StObject {
  
  /**
    * The ID of the data's environment. If no such environment is found, returns an InvalidParameterValue error. Condition: You must specify either this or an EnvironmentName, or both. If you do not specify either, AWS Elastic Beanstalk returns MissingRequiredParameter error.
    */
  var EnvironmentId: js.UndefOr[typingsSlinky.awsSdk.elasticbeanstalkMod.EnvironmentId] = js.native
  
  /**
    * The name of the data's environment.  If no such environment is found, returns an InvalidParameterValue error.   Condition: You must specify either this or an EnvironmentId, or both. If you do not specify either, AWS Elastic Beanstalk returns MissingRequiredParameter error. 
    */
  var EnvironmentName: js.UndefOr[typingsSlinky.awsSdk.elasticbeanstalkMod.EnvironmentName] = js.native
  
  /**
    * The type of information to retrieve.
    */
  var InfoType: EnvironmentInfoType = js.native
}
object RetrieveEnvironmentInfoMessage {
  
  @scala.inline
  def apply(InfoType: EnvironmentInfoType): RetrieveEnvironmentInfoMessage = {
    val __obj = js.Dynamic.literal(InfoType = InfoType.asInstanceOf[js.Any])
    __obj.asInstanceOf[RetrieveEnvironmentInfoMessage]
  }
  
  @scala.inline
  implicit class RetrieveEnvironmentInfoMessageMutableBuilder[Self <: RetrieveEnvironmentInfoMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnvironmentId(value: EnvironmentId): Self = StObject.set(x, "EnvironmentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvironmentIdUndefined: Self = StObject.set(x, "EnvironmentId", js.undefined)
    
    @scala.inline
    def setEnvironmentName(value: EnvironmentName): Self = StObject.set(x, "EnvironmentName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvironmentNameUndefined: Self = StObject.set(x, "EnvironmentName", js.undefined)
    
    @scala.inline
    def setInfoType(value: EnvironmentInfoType): Self = StObject.set(x, "InfoType", value.asInstanceOf[js.Any])
  }
}
