package typingsSlinky.awsSdkClientDynamodbBrowser

import typingsSlinky.awsSdkClientDynamodbBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientDynamodbBrowser.typesGlobalTableDescriptionMod.UnmarshalledGlobalTableDescription
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesUpdateGlobalTableOutputMod {
  
  @js.native
  trait UpdateGlobalTableOutput extends OutputTypesUnion {
    
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata = js.native
    
    /**
      * <p>Contains the details of the global table.</p>
      */
    var GlobalTableDescription: js.UndefOr[UnmarshalledGlobalTableDescription] = js.native
  }
  object UpdateGlobalTableOutput {
    
    @scala.inline
    def apply($metadata: ResponseMetadata): UpdateGlobalTableOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[UpdateGlobalTableOutput]
    }
    
    @scala.inline
    implicit class UpdateGlobalTableOutputMutableBuilder[Self <: UpdateGlobalTableOutput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGlobalTableDescription(value: UnmarshalledGlobalTableDescription): Self = StObject.set(x, "GlobalTableDescription", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGlobalTableDescriptionUndefined: Self = StObject.set(x, "GlobalTableDescription", js.undefined)
    }
  }
}
