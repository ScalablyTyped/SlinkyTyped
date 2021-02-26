package typingsSlinky.awsSdk.elasticbeanstalkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnvironmentInfoDescription extends StObject {
  
  /**
    * The Amazon EC2 Instance ID for this information.
    */
  var Ec2InstanceId: js.UndefOr[typingsSlinky.awsSdk.elasticbeanstalkMod.Ec2InstanceId] = js.native
  
  /**
    * The type of information retrieved.
    */
  var InfoType: js.UndefOr[EnvironmentInfoType] = js.native
  
  /**
    * The retrieved information. Currently contains a presigned Amazon S3 URL. The files are deleted after 15 minutes. Anyone in possession of this URL can access the files before they are deleted. Make the URL available only to trusted parties.
    */
  var Message: js.UndefOr[typingsSlinky.awsSdk.elasticbeanstalkMod.Message] = js.native
  
  /**
    * The time stamp when this information was retrieved.
    */
  var SampleTimestamp: js.UndefOr[js.Date] = js.native
}
object EnvironmentInfoDescription {
  
  @scala.inline
  def apply(): EnvironmentInfoDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnvironmentInfoDescription]
  }
  
  @scala.inline
  implicit class EnvironmentInfoDescriptionMutableBuilder[Self <: EnvironmentInfoDescription] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEc2InstanceId(value: Ec2InstanceId): Self = StObject.set(x, "Ec2InstanceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEc2InstanceIdUndefined: Self = StObject.set(x, "Ec2InstanceId", js.undefined)
    
    @scala.inline
    def setInfoType(value: EnvironmentInfoType): Self = StObject.set(x, "InfoType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInfoTypeUndefined: Self = StObject.set(x, "InfoType", js.undefined)
    
    @scala.inline
    def setMessage(value: Message): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
    
    @scala.inline
    def setSampleTimestamp(value: js.Date): Self = StObject.set(x, "SampleTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSampleTimestampUndefined: Self = StObject.set(x, "SampleTimestamp", js.undefined)
  }
}
