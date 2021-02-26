package typingsSlinky.awsSdkClientCodecommitNode

import typingsSlinky.awsSdkClientCodecommitNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesDeleteFileOutputMod {
  
  @js.native
  trait DeleteFileOutput extends OutputTypesUnion {
    
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata = js.native
    
    /**
      * <p>The blob ID removed from the tree as part of deleting the file.</p>
      */
    var blobId: String = js.native
    
    /**
      * <p>The full commit ID of the commit that contains the change that deletes the file.</p>
      */
    var commitId: String = js.native
    
    /**
      * <p>The fully-qualified path to the file that will be deleted, including the full name and extension of that file.</p>
      */
    var filePath: String = js.native
    
    /**
      * <p>The full SHA-1 pointer of the tree information for the commit that contains the delete file change.</p>
      */
    var treeId: String = js.native
  }
  object DeleteFileOutput {
    
    @scala.inline
    def apply($metadata: ResponseMetadata, blobId: String, commitId: String, filePath: String, treeId: String): DeleteFileOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], blobId = blobId.asInstanceOf[js.Any], commitId = commitId.asInstanceOf[js.Any], filePath = filePath.asInstanceOf[js.Any], treeId = treeId.asInstanceOf[js.Any])
      __obj.asInstanceOf[DeleteFileOutput]
    }
    
    @scala.inline
    implicit class DeleteFileOutputMutableBuilder[Self <: DeleteFileOutput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBlobId(value: String): Self = StObject.set(x, "blobId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCommitId(value: String): Self = StObject.set(x, "commitId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilePath(value: String): Self = StObject.set(x, "filePath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTreeId(value: String): Self = StObject.set(x, "treeId", value.asInstanceOf[js.Any])
    }
  }
}
