package typingsSlinky.awsSdkClientCodecommitNode

import typingsSlinky.awsSdkClientCodecommitNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientCodecommitNode.typesRepositoryMetadataMod.UnmarshalledRepositoryMetadata
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesCreateRepositoryOutputMod {
  
  @js.native
  trait CreateRepositoryOutput extends OutputTypesUnion {
    
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata = js.native
    
    /**
      * <p>Information about the newly created repository.</p>
      */
    var repositoryMetadata: js.UndefOr[UnmarshalledRepositoryMetadata] = js.native
  }
  object CreateRepositoryOutput {
    
    @scala.inline
    def apply($metadata: ResponseMetadata): CreateRepositoryOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[CreateRepositoryOutput]
    }
    
    @scala.inline
    implicit class CreateRepositoryOutputMutableBuilder[Self <: CreateRepositoryOutput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRepositoryMetadata(value: UnmarshalledRepositoryMetadata): Self = StObject.set(x, "repositoryMetadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRepositoryMetadataUndefined: Self = StObject.set(x, "repositoryMetadata", js.undefined)
    }
  }
}
