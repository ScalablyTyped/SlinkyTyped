package typingsSlinky.awsSdkClientLambdaNode

import typingsSlinky.awsSdkClientLambdaNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesPutFunctionConcurrencyOutputMod {
  
  @js.native
  trait PutFunctionConcurrencyOutput extends OutputTypesUnion {
    
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata = js.native
    
    /**
      * <p>The number of concurrent executions reserved for this function. For more information, see <a href="http://docs.aws.amazon.com/lambda/latest/dg/concurrent-executions.html">Managing Concurrency</a>.</p>
      */
    var ReservedConcurrentExecutions: js.UndefOr[Double] = js.native
  }
  object PutFunctionConcurrencyOutput {
    
    @scala.inline
    def apply($metadata: ResponseMetadata): PutFunctionConcurrencyOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[PutFunctionConcurrencyOutput]
    }
    
    @scala.inline
    implicit class PutFunctionConcurrencyOutputMutableBuilder[Self <: PutFunctionConcurrencyOutput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReservedConcurrentExecutions(value: Double): Self = StObject.set(x, "ReservedConcurrentExecutions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReservedConcurrentExecutionsUndefined: Self = StObject.set(x, "ReservedConcurrentExecutions", js.undefined)
    }
  }
}
