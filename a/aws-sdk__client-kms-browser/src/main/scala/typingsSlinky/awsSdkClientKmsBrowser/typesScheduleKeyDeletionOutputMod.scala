package typingsSlinky.awsSdkClientKmsBrowser

import typingsSlinky.awsSdkClientKmsBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesScheduleKeyDeletionOutputMod {
  
  @js.native
  trait ScheduleKeyDeletionOutput extends OutputTypesUnion {
    
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata = js.native
    
    /**
      * <p>The date and time after which AWS KMS deletes the customer master key (CMK).</p>
      */
    var DeletionDate: js.UndefOr[js.Date] = js.native
    
    /**
      * <p>The unique identifier of the customer master key (CMK) for which deletion is scheduled.</p>
      */
    var KeyId: js.UndefOr[String] = js.native
  }
  object ScheduleKeyDeletionOutput {
    
    @scala.inline
    def apply($metadata: ResponseMetadata): ScheduleKeyDeletionOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[ScheduleKeyDeletionOutput]
    }
    
    @scala.inline
    implicit class ScheduleKeyDeletionOutputMutableBuilder[Self <: ScheduleKeyDeletionOutput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeletionDate(value: js.Date): Self = StObject.set(x, "DeletionDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeletionDateUndefined: Self = StObject.set(x, "DeletionDate", js.undefined)
      
      @scala.inline
      def setKeyId(value: String): Self = StObject.set(x, "KeyId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyIdUndefined: Self = StObject.set(x, "KeyId", js.undefined)
    }
  }
}
