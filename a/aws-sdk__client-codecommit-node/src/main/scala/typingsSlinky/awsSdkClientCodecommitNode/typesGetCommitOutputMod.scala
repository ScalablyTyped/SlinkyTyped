package typingsSlinky.awsSdkClientCodecommitNode

import typingsSlinky.awsSdkClientCodecommitNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientCodecommitNode.typesCommitMod.UnmarshalledCommit
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesGetCommitOutputMod {
  
  @js.native
  trait GetCommitOutput extends OutputTypesUnion {
    
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata = js.native
    
    /**
      * <p>A commit data type object that contains information about the specified commit.</p>
      */
    var commit: UnmarshalledCommit = js.native
  }
  object GetCommitOutput {
    
    @scala.inline
    def apply($metadata: ResponseMetadata, commit: UnmarshalledCommit): GetCommitOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], commit = commit.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetCommitOutput]
    }
    
    @scala.inline
    implicit class GetCommitOutputMutableBuilder[Self <: GetCommitOutput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCommit(value: UnmarshalledCommit): Self = StObject.set(x, "commit", value.asInstanceOf[js.Any])
    }
  }
}
