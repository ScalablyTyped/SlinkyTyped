package typingsSlinky.awsSdkClientCodecommitNode

import typingsSlinky.awsSdkClientCodecommitNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientCodecommitNode.typesRepositoryTriggerExecutionFailureMod.UnmarshalledRepositoryTriggerExecutionFailure
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesTestRepositoryTriggersOutputMod {
  
  @js.native
  trait TestRepositoryTriggersOutput extends OutputTypesUnion {
    
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata = js.native
    
    /**
      * <p>The list of triggers that were not able to be tested. This list provides the names of the triggers that could not be tested, separated by commas.</p>
      */
    var failedExecutions: js.UndefOr[js.Array[UnmarshalledRepositoryTriggerExecutionFailure]] = js.native
    
    /**
      * <p>The list of triggers that were successfully tested. This list provides the names of the triggers that were successfully tested, separated by commas.</p>
      */
    var successfulExecutions: js.UndefOr[js.Array[String]] = js.native
  }
  object TestRepositoryTriggersOutput {
    
    @scala.inline
    def apply($metadata: ResponseMetadata): TestRepositoryTriggersOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[TestRepositoryTriggersOutput]
    }
    
    @scala.inline
    implicit class TestRepositoryTriggersOutputMutableBuilder[Self <: TestRepositoryTriggersOutput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFailedExecutions(value: js.Array[UnmarshalledRepositoryTriggerExecutionFailure]): Self = StObject.set(x, "failedExecutions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFailedExecutionsUndefined: Self = StObject.set(x, "failedExecutions", js.undefined)
      
      @scala.inline
      def setFailedExecutionsVarargs(value: UnmarshalledRepositoryTriggerExecutionFailure*): Self = StObject.set(x, "failedExecutions", js.Array(value :_*))
      
      @scala.inline
      def setSuccessfulExecutions(value: js.Array[String]): Self = StObject.set(x, "successfulExecutions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuccessfulExecutionsUndefined: Self = StObject.set(x, "successfulExecutions", js.undefined)
      
      @scala.inline
      def setSuccessfulExecutionsVarargs(value: String*): Self = StObject.set(x, "successfulExecutions", js.Array(value :_*))
    }
  }
}
