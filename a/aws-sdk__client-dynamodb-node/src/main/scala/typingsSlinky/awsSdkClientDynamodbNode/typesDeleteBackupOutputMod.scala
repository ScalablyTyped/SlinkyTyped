package typingsSlinky.awsSdkClientDynamodbNode

import typingsSlinky.awsSdkClientDynamodbNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientDynamodbNode.typesBackupDescriptionMod.UnmarshalledBackupDescription
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesDeleteBackupOutputMod {
  
  @js.native
  trait DeleteBackupOutput extends OutputTypesUnion {
    
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata = js.native
    
    /**
      * <p>Contains the description of the backup created for the table.</p>
      */
    var BackupDescription: js.UndefOr[UnmarshalledBackupDescription] = js.native
  }
  object DeleteBackupOutput {
    
    @scala.inline
    def apply($metadata: ResponseMetadata): DeleteBackupOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[DeleteBackupOutput]
    }
    
    @scala.inline
    implicit class DeleteBackupOutputMutableBuilder[Self <: DeleteBackupOutput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackupDescription(value: UnmarshalledBackupDescription): Self = StObject.set(x, "BackupDescription", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackupDescriptionUndefined: Self = StObject.set(x, "BackupDescription", js.undefined)
    }
  }
}
