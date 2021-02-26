package typingsSlinky.awsLambda

import typingsSlinky.awsLambda.anon.Artifact
import typingsSlinky.awsLambda.awsLambdaStrings.`CodeBuild Build State Change`
import typingsSlinky.awsLambda.awsLambdaStrings.awsDotcodebuild
import typingsSlinky.awsLambda.eventbridgeMod.EventBridgeEvent
import typingsSlinky.awsLambda.eventbridgeMod.EventBridgeHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object codebuildCloudwatchStateMod {
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsLambda.awsLambdaStrings.NO_CACHE
    - typingsSlinky.awsLambda.awsLambdaStrings.LOCAL
    - typingsSlinky.awsLambda.awsLambdaStrings.S3
  */
  trait CodeBuildCacheType extends StObject
  object CodeBuildCacheType {
    
    @scala.inline
    def LOCAL: typingsSlinky.awsLambda.awsLambdaStrings.LOCAL = "LOCAL".asInstanceOf[typingsSlinky.awsLambda.awsLambdaStrings.LOCAL]
    
    @scala.inline
    def NO_CACHE: typingsSlinky.awsLambda.awsLambdaStrings.NO_CACHE = "NO_CACHE".asInstanceOf[typingsSlinky.awsLambda.awsLambdaStrings.NO_CACHE]
    
    @scala.inline
    def S3: typingsSlinky.awsLambda.awsLambdaStrings.S3 = "S3".asInstanceOf[typingsSlinky.awsLambda.awsLambdaStrings.S3]
  }
  
  @js.native
  trait CodeBuildCloudWatchStateEvent extends EventBridgeEvent[`CodeBuild Build State Change`, CodeBuildStateEventDetail] {
    
    @JSName("source")
    var source_CodeBuildCloudWatchStateEvent: awsDotcodebuild = js.native
  }
  object CodeBuildCloudWatchStateEvent {
    
    @scala.inline
    def apply(
      account: String,
      detail: CodeBuildStateEventDetail,
      `detail-type`: `CodeBuild Build State Change`,
      id: String,
      region: String,
      resources: js.Array[String],
      source: awsDotcodebuild,
      time: String,
      version: String
    ): CodeBuildCloudWatchStateEvent = {
      val __obj = js.Dynamic.literal(account = account.asInstanceOf[js.Any], detail = detail.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], resources = resources.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.updateDynamic("detail-type")(`detail-type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[CodeBuildCloudWatchStateEvent]
    }
    
    @scala.inline
    implicit class CodeBuildCloudWatchStateEventMutableBuilder[Self <: CodeBuildCloudWatchStateEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSource(value: awsDotcodebuild): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    }
  }
  
  type CodeBuildCloudWatchStateHandler = EventBridgeHandler[`CodeBuild Build State Change`, CodeBuildStateEventDetail, Unit]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsLambda.awsLambdaStrings.BUILD_GENERAL1_SMALL
    - typingsSlinky.awsLambda.awsLambdaStrings.BUILD_GENERAL1_MEDIUM
    - typingsSlinky.awsLambda.awsLambdaStrings.BUILD_GENERAL1_LARGE
    - typingsSlinky.awsLambda.awsLambdaStrings.BUILD_GENERAL1_2XLARGE
  */
  trait CodeBuildEnvironmentComputeType extends StObject
  object CodeBuildEnvironmentComputeType {
    
    @scala.inline
    def BUILD_GENERAL1_2XLARGE: typingsSlinky.awsLambda.awsLambdaStrings.BUILD_GENERAL1_2XLARGE = "BUILD_GENERAL1_2XLARGE".asInstanceOf[typingsSlinky.awsLambda.awsLambdaStrings.BUILD_GENERAL1_2XLARGE]
    
    @scala.inline
    def BUILD_GENERAL1_LARGE: typingsSlinky.awsLambda.awsLambdaStrings.BUILD_GENERAL1_LARGE = "BUILD_GENERAL1_LARGE".asInstanceOf[typingsSlinky.awsLambda.awsLambdaStrings.BUILD_GENERAL1_LARGE]
    
    @scala.inline
    def BUILD_GENERAL1_MEDIUM: typingsSlinky.awsLambda.awsLambdaStrings.BUILD_GENERAL1_MEDIUM = "BUILD_GENERAL1_MEDIUM".asInstanceOf[typingsSlinky.awsLambda.awsLambdaStrings.BUILD_GENERAL1_MEDIUM]
    
    @scala.inline
    def BUILD_GENERAL1_SMALL: typingsSlinky.awsLambda.awsLambdaStrings.BUILD_GENERAL1_SMALL = "BUILD_GENERAL1_SMALL".asInstanceOf[typingsSlinky.awsLambda.awsLambdaStrings.BUILD_GENERAL1_SMALL]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsLambda.awsLambdaStrings.CODEBUILD
    - typingsSlinky.awsLambda.awsLambdaStrings.SERVICE_ROLE
  */
  trait CodeBuildEnvironmentPullCredentialsType extends StObject
  object CodeBuildEnvironmentPullCredentialsType {
    
    @scala.inline
    def CODEBUILD: typingsSlinky.awsLambda.awsLambdaStrings.CODEBUILD = "CODEBUILD".asInstanceOf[typingsSlinky.awsLambda.awsLambdaStrings.CODEBUILD]
    
    @scala.inline
    def SERVICE_ROLE: typingsSlinky.awsLambda.awsLambdaStrings.SERVICE_ROLE = "SERVICE_ROLE".asInstanceOf[typingsSlinky.awsLambda.awsLambdaStrings.SERVICE_ROLE]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsLambda.awsLambdaStrings.LINUX_CONTAINER
    - typingsSlinky.awsLambda.awsLambdaStrings.LINUX_GPU_CONTAINER
    - typingsSlinky.awsLambda.awsLambdaStrings.WINDOWS_CONTAINER
    - typingsSlinky.awsLambda.awsLambdaStrings.ARM_CONTAINER
  */
  trait CodeBuildEnvironmentType extends StObject
  object CodeBuildEnvironmentType {
    
    @scala.inline
    def ARM_CONTAINER: typingsSlinky.awsLambda.awsLambdaStrings.ARM_CONTAINER = "ARM_CONTAINER".asInstanceOf[typingsSlinky.awsLambda.awsLambdaStrings.ARM_CONTAINER]
    
    @scala.inline
    def LINUX_CONTAINER: typingsSlinky.awsLambda.awsLambdaStrings.LINUX_CONTAINER = "LINUX_CONTAINER".asInstanceOf[typingsSlinky.awsLambda.awsLambdaStrings.LINUX_CONTAINER]
    
    @scala.inline
    def LINUX_GPU_CONTAINER: typingsSlinky.awsLambda.awsLambdaStrings.LINUX_GPU_CONTAINER = "LINUX_GPU_CONTAINER".asInstanceOf[typingsSlinky.awsLambda.awsLambdaStrings.LINUX_GPU_CONTAINER]
    
    @scala.inline
    def WINDOWS_CONTAINER: typingsSlinky.awsLambda.awsLambdaStrings.WINDOWS_CONTAINER = "WINDOWS_CONTAINER".asInstanceOf[typingsSlinky.awsLambda.awsLambdaStrings.WINDOWS_CONTAINER]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsLambda.awsLambdaStrings.PARAMETER_STORE
    - typingsSlinky.awsLambda.awsLambdaStrings.PLAINTEXT
    - typingsSlinky.awsLambda.awsLambdaStrings.SECRETS_MANAGER
  */
  trait CodeBuildEnvironmentVariableType extends StObject
  object CodeBuildEnvironmentVariableType {
    
    @scala.inline
    def PARAMETER_STORE: typingsSlinky.awsLambda.awsLambdaStrings.PARAMETER_STORE = "PARAMETER_STORE".asInstanceOf[typingsSlinky.awsLambda.awsLambdaStrings.PARAMETER_STORE]
    
    @scala.inline
    def PLAINTEXT: typingsSlinky.awsLambda.awsLambdaStrings.PLAINTEXT = "PLAINTEXT".asInstanceOf[typingsSlinky.awsLambda.awsLambdaStrings.PLAINTEXT]
    
    @scala.inline
    def SECRETS_MANAGER: typingsSlinky.awsLambda.awsLambdaStrings.SECRETS_MANAGER = "SECRETS_MANAGER".asInstanceOf[typingsSlinky.awsLambda.awsLambdaStrings.SECRETS_MANAGER]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsLambda.awsLambdaStrings.TIMED_OUT
    - typingsSlinky.awsLambda.awsLambdaStrings.STOPPED
    - typingsSlinky.awsLambda.awsLambdaStrings.FAILED
    - typingsSlinky.awsLambda.awsLambdaStrings.SUCCEEDED
    - typingsSlinky.awsLambda.awsLambdaStrings.FAULT
    - typingsSlinky.awsLambda.awsLambdaStrings.CLIENT_ERROR
  */
  trait CodeBuildPhaseStatusType extends StObject
  object CodeBuildPhaseStatusType {
    
    @scala.inline
    def CLIENT_ERROR: typingsSlinky.awsLambda.awsLambdaStrings.CLIENT_ERROR = "CLIENT_ERROR".asInstanceOf[typingsSlinky.awsLambda.awsLambdaStrings.CLIENT_ERROR]
    
    @scala.inline
    def FAILED: typingsSlinky.awsLambda.awsLambdaStrings.FAILED = "FAILED".asInstanceOf[typingsSlinky.awsLambda.awsLambdaStrings.FAILED]
    
    @scala.inline
    def FAULT: typingsSlinky.awsLambda.awsLambdaStrings.FAULT = "FAULT".asInstanceOf[typingsSlinky.awsLambda.awsLambdaStrings.FAULT]
    
    @scala.inline
    def STOPPED: typingsSlinky.awsLambda.awsLambdaStrings.STOPPED = "STOPPED".asInstanceOf[typingsSlinky.awsLambda.awsLambdaStrings.STOPPED]
    
    @scala.inline
    def SUCCEEDED: typingsSlinky.awsLambda.awsLambdaStrings.SUCCEEDED = "SUCCEEDED".asInstanceOf[typingsSlinky.awsLambda.awsLambdaStrings.SUCCEEDED]
    
    @scala.inline
    def TIMED_OUT: typingsSlinky.awsLambda.awsLambdaStrings.TIMED_OUT = "TIMED_OUT".asInstanceOf[typingsSlinky.awsLambda.awsLambdaStrings.TIMED_OUT]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsLambda.awsLambdaStrings.COMPLETED
    - typingsSlinky.awsLambda.awsLambdaStrings.FINALIZING
    - typingsSlinky.awsLambda.awsLambdaStrings.UPLOAD_ARTIFACTS
    - typingsSlinky.awsLambda.awsLambdaStrings.POST_BUILD
    - typingsSlinky.awsLambda.awsLambdaStrings.BUILD
    - typingsSlinky.awsLambda.awsLambdaStrings.PRE_BUILD
    - typingsSlinky.awsLambda.awsLambdaStrings.INSTALL
    - typingsSlinky.awsLambda.awsLambdaStrings.QUEUED
    - typingsSlinky.awsLambda.awsLambdaStrings.DOWNLOAD_SOURCE
    - typingsSlinky.awsLambda.awsLambdaStrings.PROVISIONING
    - typingsSlinky.awsLambda.awsLambdaStrings.SUBMITTED
  */
  trait CodeBuildPhaseType extends StObject
  object CodeBuildPhaseType {
    
    @scala.inline
    def BUILD: typingsSlinky.awsLambda.awsLambdaStrings.BUILD = "BUILD".asInstanceOf[typingsSlinky.awsLambda.awsLambdaStrings.BUILD]
    
    @scala.inline
    def COMPLETED: typingsSlinky.awsLambda.awsLambdaStrings.COMPLETED = "COMPLETED".asInstanceOf[typingsSlinky.awsLambda.awsLambdaStrings.COMPLETED]
    
    @scala.inline
    def DOWNLOAD_SOURCE: typingsSlinky.awsLambda.awsLambdaStrings.DOWNLOAD_SOURCE = "DOWNLOAD_SOURCE".asInstanceOf[typingsSlinky.awsLambda.awsLambdaStrings.DOWNLOAD_SOURCE]
    
    @scala.inline
    def FINALIZING: typingsSlinky.awsLambda.awsLambdaStrings.FINALIZING = "FINALIZING".asInstanceOf[typingsSlinky.awsLambda.awsLambdaStrings.FINALIZING]
    
    @scala.inline
    def INSTALL: typingsSlinky.awsLambda.awsLambdaStrings.INSTALL = "INSTALL".asInstanceOf[typingsSlinky.awsLambda.awsLambdaStrings.INSTALL]
    
    @scala.inline
    def POST_BUILD: typingsSlinky.awsLambda.awsLambdaStrings.POST_BUILD = "POST_BUILD".asInstanceOf[typingsSlinky.awsLambda.awsLambdaStrings.POST_BUILD]
    
    @scala.inline
    def PRE_BUILD: typingsSlinky.awsLambda.awsLambdaStrings.PRE_BUILD = "PRE_BUILD".asInstanceOf[typingsSlinky.awsLambda.awsLambdaStrings.PRE_BUILD]
    
    @scala.inline
    def PROVISIONING: typingsSlinky.awsLambda.awsLambdaStrings.PROVISIONING = "PROVISIONING".asInstanceOf[typingsSlinky.awsLambda.awsLambdaStrings.PROVISIONING]
    
    @scala.inline
    def QUEUED: typingsSlinky.awsLambda.awsLambdaStrings.QUEUED = "QUEUED".asInstanceOf[typingsSlinky.awsLambda.awsLambdaStrings.QUEUED]
    
    @scala.inline
    def SUBMITTED: typingsSlinky.awsLambda.awsLambdaStrings.SUBMITTED = "SUBMITTED".asInstanceOf[typingsSlinky.awsLambda.awsLambdaStrings.SUBMITTED]
    
    @scala.inline
    def UPLOAD_ARTIFACTS: typingsSlinky.awsLambda.awsLambdaStrings.UPLOAD_ARTIFACTS = "UPLOAD_ARTIFACTS".asInstanceOf[typingsSlinky.awsLambda.awsLambdaStrings.UPLOAD_ARTIFACTS]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsLambda.awsLambdaStrings.CODECOMMIT
    - typingsSlinky.awsLambda.awsLambdaStrings.CODEPIPELINE
    - typingsSlinky.awsLambda.awsLambdaStrings.GITHUB
    - typingsSlinky.awsLambda.awsLambdaStrings.GITHUB_ENTERPRISE
    - typingsSlinky.awsLambda.awsLambdaStrings.BITBUCKET
    - typingsSlinky.awsLambda.awsLambdaStrings.S3
    - typingsSlinky.awsLambda.awsLambdaStrings.NO_SOURCE
  */
  trait CodeBuildSourceLocationType extends StObject
  object CodeBuildSourceLocationType {
    
    @scala.inline
    def BITBUCKET: typingsSlinky.awsLambda.awsLambdaStrings.BITBUCKET = "BITBUCKET".asInstanceOf[typingsSlinky.awsLambda.awsLambdaStrings.BITBUCKET]
    
    @scala.inline
    def CODECOMMIT: typingsSlinky.awsLambda.awsLambdaStrings.CODECOMMIT = "CODECOMMIT".asInstanceOf[typingsSlinky.awsLambda.awsLambdaStrings.CODECOMMIT]
    
    @scala.inline
    def CODEPIPELINE: typingsSlinky.awsLambda.awsLambdaStrings.CODEPIPELINE = "CODEPIPELINE".asInstanceOf[typingsSlinky.awsLambda.awsLambdaStrings.CODEPIPELINE]
    
    @scala.inline
    def GITHUB: typingsSlinky.awsLambda.awsLambdaStrings.GITHUB = "GITHUB".asInstanceOf[typingsSlinky.awsLambda.awsLambdaStrings.GITHUB]
    
    @scala.inline
    def GITHUB_ENTERPRISE: typingsSlinky.awsLambda.awsLambdaStrings.GITHUB_ENTERPRISE = "GITHUB_ENTERPRISE".asInstanceOf[typingsSlinky.awsLambda.awsLambdaStrings.GITHUB_ENTERPRISE]
    
    @scala.inline
    def NO_SOURCE: typingsSlinky.awsLambda.awsLambdaStrings.NO_SOURCE = "NO_SOURCE".asInstanceOf[typingsSlinky.awsLambda.awsLambdaStrings.NO_SOURCE]
    
    @scala.inline
    def S3: typingsSlinky.awsLambda.awsLambdaStrings.S3 = "S3".asInstanceOf[typingsSlinky.awsLambda.awsLambdaStrings.S3]
  }
  
  @js.native
  trait CodeBuildStateEventDetail extends StObject {
    
    var `additional-information`: Artifact = js.native
    
    var `build-id`: String = js.native
    
    var `build-status`: CodeBuildStateType = js.native
    
    var `current-phase`: CodeBuildPhaseType = js.native
    
    var `current-phase-context`: String = js.native
    
    var `project-name`: String = js.native
    
    var version: String = js.native
  }
  object CodeBuildStateEventDetail {
    
    @scala.inline
    def apply(
      `additional-information`: Artifact,
      `build-id`: String,
      `build-status`: CodeBuildStateType,
      `current-phase`: CodeBuildPhaseType,
      `current-phase-context`: String,
      `project-name`: String,
      version: String
    ): CodeBuildStateEventDetail = {
      val __obj = js.Dynamic.literal(version = version.asInstanceOf[js.Any])
      __obj.updateDynamic("additional-information")(`additional-information`.asInstanceOf[js.Any])
      __obj.updateDynamic("build-id")(`build-id`.asInstanceOf[js.Any])
      __obj.updateDynamic("build-status")(`build-status`.asInstanceOf[js.Any])
      __obj.updateDynamic("current-phase")(`current-phase`.asInstanceOf[js.Any])
      __obj.updateDynamic("current-phase-context")(`current-phase-context`.asInstanceOf[js.Any])
      __obj.updateDynamic("project-name")(`project-name`.asInstanceOf[js.Any])
      __obj.asInstanceOf[CodeBuildStateEventDetail]
    }
    
    @scala.inline
    implicit class CodeBuildStateEventDetailMutableBuilder[Self <: CodeBuildStateEventDetail] (val x: Self) extends AnyVal {
      
      @scala.inline
      def `setAdditional-information`(value: Artifact): Self = StObject.set(x, "additional-information", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setBuild-id`(value: String): Self = StObject.set(x, "build-id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setBuild-status`(value: CodeBuildStateType): Self = StObject.set(x, "build-status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setCurrent-phase`(value: CodeBuildPhaseType): Self = StObject.set(x, "current-phase", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setCurrent-phase-context`(value: String): Self = StObject.set(x, "current-phase-context", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setProject-name`(value: String): Self = StObject.set(x, "project-name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsLambda.awsLambdaStrings.IN_PROGRESS
    - typingsSlinky.awsLambda.awsLambdaStrings.SUCCEEDED
    - typingsSlinky.awsLambda.awsLambdaStrings.FAILED
    - typingsSlinky.awsLambda.awsLambdaStrings.STOPPED
  */
  trait CodeBuildStateType extends StObject
  object CodeBuildStateType {
    
    @scala.inline
    def FAILED: typingsSlinky.awsLambda.awsLambdaStrings.FAILED = "FAILED".asInstanceOf[typingsSlinky.awsLambda.awsLambdaStrings.FAILED]
    
    @scala.inline
    def IN_PROGRESS: typingsSlinky.awsLambda.awsLambdaStrings.IN_PROGRESS = "IN_PROGRESS".asInstanceOf[typingsSlinky.awsLambda.awsLambdaStrings.IN_PROGRESS]
    
    @scala.inline
    def STOPPED: typingsSlinky.awsLambda.awsLambdaStrings.STOPPED = "STOPPED".asInstanceOf[typingsSlinky.awsLambda.awsLambdaStrings.STOPPED]
    
    @scala.inline
    def SUCCEEDED: typingsSlinky.awsLambda.awsLambdaStrings.SUCCEEDED = "SUCCEEDED".asInstanceOf[typingsSlinky.awsLambda.awsLambdaStrings.SUCCEEDED]
  }
}
