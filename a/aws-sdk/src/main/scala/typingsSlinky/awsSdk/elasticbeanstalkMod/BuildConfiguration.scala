package typingsSlinky.awsSdk.elasticbeanstalkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BuildConfiguration extends StObject {
  
  /**
    * The name of the artifact of the CodeBuild build. If provided, Elastic Beanstalk stores the build artifact in the S3 location S3-bucket/resources/application-name/codebuild/codebuild-version-label-artifact-name.zip. If not provided, Elastic Beanstalk stores the build artifact in the S3 location S3-bucket/resources/application-name/codebuild/codebuild-version-label.zip. 
    */
  var ArtifactName: js.UndefOr[String] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the AWS Identity and Access Management (IAM) role that enables AWS CodeBuild to interact with dependent AWS services on behalf of the AWS account.
    */
  var CodeBuildServiceRole: NonEmptyString = js.native
  
  /**
    * Information about the compute resources the build project will use.    BUILD_GENERAL1_SMALL: Use up to 3 GB memory and 2 vCPUs for builds     BUILD_GENERAL1_MEDIUM: Use up to 7 GB memory and 4 vCPUs for builds     BUILD_GENERAL1_LARGE: Use up to 15 GB memory and 8 vCPUs for builds   
    */
  var ComputeType: js.UndefOr[typingsSlinky.awsSdk.elasticbeanstalkMod.ComputeType] = js.native
  
  /**
    * The ID of the Docker image to use for this build project.
    */
  var Image: NonEmptyString = js.native
  
  /**
    * How long in minutes, from 5 to 480 (8 hours), for AWS CodeBuild to wait until timing out any related build that does not get marked as completed. The default is 60 minutes.
    */
  var TimeoutInMinutes: js.UndefOr[BoxedInt] = js.native
}
object BuildConfiguration {
  
  @scala.inline
  def apply(CodeBuildServiceRole: NonEmptyString, Image: NonEmptyString): BuildConfiguration = {
    val __obj = js.Dynamic.literal(CodeBuildServiceRole = CodeBuildServiceRole.asInstanceOf[js.Any], Image = Image.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuildConfiguration]
  }
  
  @scala.inline
  implicit class BuildConfigurationMutableBuilder[Self <: BuildConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArtifactName(value: String): Self = StObject.set(x, "ArtifactName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArtifactNameUndefined: Self = StObject.set(x, "ArtifactName", js.undefined)
    
    @scala.inline
    def setCodeBuildServiceRole(value: NonEmptyString): Self = StObject.set(x, "CodeBuildServiceRole", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComputeType(value: ComputeType): Self = StObject.set(x, "ComputeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComputeTypeUndefined: Self = StObject.set(x, "ComputeType", js.undefined)
    
    @scala.inline
    def setImage(value: NonEmptyString): Self = StObject.set(x, "Image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutInMinutes(value: BoxedInt): Self = StObject.set(x, "TimeoutInMinutes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutInMinutesUndefined: Self = StObject.set(x, "TimeoutInMinutes", js.undefined)
  }
}
