package typingsSlinky.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StartThingRegistrationTaskRequest extends StObject {
  
  /**
    * The S3 bucket that contains the input file.
    */
  var inputFileBucket: RegistryS3BucketName = js.native
  
  /**
    * The name of input file within the S3 bucket. This file contains a newline delimited JSON file. Each line contains the parameter values to provision one device (thing).
    */
  var inputFileKey: RegistryS3KeyName = js.native
  
  /**
    * The IAM role ARN that grants permission the input file.
    */
  var roleArn: RoleArn = js.native
  
  /**
    * The provisioning template.
    */
  var templateBody: TemplateBody = js.native
}
object StartThingRegistrationTaskRequest {
  
  @scala.inline
  def apply(
    inputFileBucket: RegistryS3BucketName,
    inputFileKey: RegistryS3KeyName,
    roleArn: RoleArn,
    templateBody: TemplateBody
  ): StartThingRegistrationTaskRequest = {
    val __obj = js.Dynamic.literal(inputFileBucket = inputFileBucket.asInstanceOf[js.Any], inputFileKey = inputFileKey.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any], templateBody = templateBody.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartThingRegistrationTaskRequest]
  }
  
  @scala.inline
  implicit class StartThingRegistrationTaskRequestMutableBuilder[Self <: StartThingRegistrationTaskRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInputFileBucket(value: RegistryS3BucketName): Self = StObject.set(x, "inputFileBucket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputFileKey(value: RegistryS3KeyName): Self = StObject.set(x, "inputFileKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleArn(value: RoleArn): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateBody(value: TemplateBody): Self = StObject.set(x, "templateBody", value.asInstanceOf[js.Any])
  }
}
