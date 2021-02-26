package typingsSlinky.awsLambda

import typingsSlinky.awsLambda.anon.Pipeline
import typingsSlinky.awsLambda.awsLambdaStrings.`CodePipeline Pipeline Execution State Change`
import typingsSlinky.awsLambda.awsLambdaStrings.awsDotcodepipeline
import typingsSlinky.awsLambda.codepipelineCloudwatchMod.CodePipelineCloudWatchEvent
import typingsSlinky.awsLambda.handlerMod.Handler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object codepipelineCloudwatchPipelineMod {
  
  @js.native
  trait CodePipelineCloudWatchPipelineEvent extends CodePipelineCloudWatchEvent {
    
    var account: String = js.native
    
    var detail: Pipeline = js.native
    
    var `detail-type`: `CodePipeline Pipeline Execution State Change` = js.native
    
    var id: String = js.native
    
    var region: String = js.native
    
    var resources: js.Array[String] = js.native
    
    var source: awsDotcodepipeline = js.native
    
    var time: String = js.native
    
    var version: String = js.native
  }
  object CodePipelineCloudWatchPipelineEvent {
    
    @scala.inline
    def apply(
      account: String,
      detail: Pipeline,
      `detail-type`: `CodePipeline Pipeline Execution State Change`,
      id: String,
      region: String,
      resources: js.Array[String],
      source: awsDotcodepipeline,
      time: String,
      version: String
    ): CodePipelineCloudWatchPipelineEvent = {
      val __obj = js.Dynamic.literal(account = account.asInstanceOf[js.Any], detail = detail.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], resources = resources.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.updateDynamic("detail-type")(`detail-type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[CodePipelineCloudWatchPipelineEvent]
    }
    
    @scala.inline
    implicit class CodePipelineCloudWatchPipelineEventMutableBuilder[Self <: CodePipelineCloudWatchPipelineEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccount(value: String): Self = StObject.set(x, "account", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDetail(value: Pipeline): Self = StObject.set(x, "detail", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setDetail-type`(value: `CodePipeline Pipeline Execution State Change`): Self = StObject.set(x, "detail-type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResources(value: js.Array[String]): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResourcesVarargs(value: String*): Self = StObject.set(x, "resources", js.Array(value :_*))
      
      @scala.inline
      def setSource(value: awsDotcodepipeline): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTime(value: String): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  type CodePipelineCloudWatchPipelineHandler = Handler[CodePipelineCloudWatchPipelineEvent, Unit]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsLambda.awsLambdaStrings.STARTED
    - typingsSlinky.awsLambda.awsLambdaStrings.SUCCEEDED
    - typingsSlinky.awsLambda.awsLambdaStrings.RESUMED
    - typingsSlinky.awsLambda.awsLambdaStrings.FAILED
    - typingsSlinky.awsLambda.awsLambdaStrings.CANCELED
    - typingsSlinky.awsLambda.awsLambdaStrings.SUPERSEDED
  */
  trait CodePipelineState extends StObject
  object CodePipelineState {
    
    @scala.inline
    def CANCELED: typingsSlinky.awsLambda.awsLambdaStrings.CANCELED = "CANCELED".asInstanceOf[typingsSlinky.awsLambda.awsLambdaStrings.CANCELED]
    
    @scala.inline
    def FAILED: typingsSlinky.awsLambda.awsLambdaStrings.FAILED = "FAILED".asInstanceOf[typingsSlinky.awsLambda.awsLambdaStrings.FAILED]
    
    @scala.inline
    def RESUMED: typingsSlinky.awsLambda.awsLambdaStrings.RESUMED = "RESUMED".asInstanceOf[typingsSlinky.awsLambda.awsLambdaStrings.RESUMED]
    
    @scala.inline
    def STARTED: typingsSlinky.awsLambda.awsLambdaStrings.STARTED = "STARTED".asInstanceOf[typingsSlinky.awsLambda.awsLambdaStrings.STARTED]
    
    @scala.inline
    def SUCCEEDED: typingsSlinky.awsLambda.awsLambdaStrings.SUCCEEDED = "SUCCEEDED".asInstanceOf[typingsSlinky.awsLambda.awsLambdaStrings.SUCCEEDED]
    
    @scala.inline
    def SUPERSEDED: typingsSlinky.awsLambda.awsLambdaStrings.SUPERSEDED = "SUPERSEDED".asInstanceOf[typingsSlinky.awsLambda.awsLambdaStrings.SUPERSEDED]
  }
}
