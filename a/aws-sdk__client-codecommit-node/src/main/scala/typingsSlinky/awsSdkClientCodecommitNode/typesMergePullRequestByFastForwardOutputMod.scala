package typingsSlinky.awsSdkClientCodecommitNode

import typingsSlinky.awsSdkClientCodecommitNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientCodecommitNode.typesPullRequestMod.UnmarshalledPullRequest
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMergePullRequestByFastForwardOutputMod {
  
  @js.native
  trait MergePullRequestByFastForwardOutput extends OutputTypesUnion {
    
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata = js.native
    
    /**
      * <p>Information about the specified pull request, including information about the merge.</p>
      */
    var pullRequest: js.UndefOr[UnmarshalledPullRequest] = js.native
  }
  object MergePullRequestByFastForwardOutput {
    
    @scala.inline
    def apply($metadata: ResponseMetadata): MergePullRequestByFastForwardOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[MergePullRequestByFastForwardOutput]
    }
    
    @scala.inline
    implicit class MergePullRequestByFastForwardOutputMutableBuilder[Self <: MergePullRequestByFastForwardOutput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPullRequest(value: UnmarshalledPullRequest): Self = StObject.set(x, "pullRequest", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPullRequestUndefined: Self = StObject.set(x, "pullRequest", js.undefined)
    }
  }
}
