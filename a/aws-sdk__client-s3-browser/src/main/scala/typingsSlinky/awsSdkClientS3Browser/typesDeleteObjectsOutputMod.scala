package typingsSlinky.awsSdkClientS3Browser

import typingsSlinky.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.requester_
import typingsSlinky.awsSdkClientS3Browser.outputTypesUnionMod._OutputTypesUnion
import typingsSlinky.awsSdkClientS3Browser.typesDeletedObjectMod.UnmarshalledDeletedObject
import typingsSlinky.awsSdkClientS3Browser.typesErrorMod.UnmarshalledError
import typingsSlinky.awsSdkTypes.responseMod.MetadataBearer
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesDeleteObjectsOutputMod {
  
  @js.native
  trait DeleteObjectsOutput
    extends MetadataBearer
       with _OutputTypesUnion {
    
    /**
      * _DeletedObjects shape
      */
    var Deleted: js.UndefOr[js.Array[UnmarshalledDeletedObject]] = js.native
    
    /**
      * _Errors shape
      */
    var Errors: js.UndefOr[js.Array[UnmarshalledError]] = js.native
    
    /**
      * <p>If present, indicates that the requester was successfully charged for the request.</p>
      */
    var RequestCharged: js.UndefOr[requester_ | String] = js.native
  }
  object DeleteObjectsOutput {
    
    @scala.inline
    def apply($metadata: ResponseMetadata): DeleteObjectsOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[DeleteObjectsOutput]
    }
    
    @scala.inline
    implicit class DeleteObjectsOutputMutableBuilder[Self <: DeleteObjectsOutput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDeleted(value: js.Array[UnmarshalledDeletedObject]): Self = StObject.set(x, "Deleted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeletedUndefined: Self = StObject.set(x, "Deleted", js.undefined)
      
      @scala.inline
      def setDeletedVarargs(value: UnmarshalledDeletedObject*): Self = StObject.set(x, "Deleted", js.Array(value :_*))
      
      @scala.inline
      def setErrors(value: js.Array[UnmarshalledError]): Self = StObject.set(x, "Errors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorsUndefined: Self = StObject.set(x, "Errors", js.undefined)
      
      @scala.inline
      def setErrorsVarargs(value: UnmarshalledError*): Self = StObject.set(x, "Errors", js.Array(value :_*))
      
      @scala.inline
      def setRequestCharged(value: requester_ | String): Self = StObject.set(x, "RequestCharged", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequestChargedUndefined: Self = StObject.set(x, "RequestCharged", js.undefined)
    }
  }
}
