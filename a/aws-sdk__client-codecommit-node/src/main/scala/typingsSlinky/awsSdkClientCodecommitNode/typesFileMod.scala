package typingsSlinky.awsSdkClientCodecommitNode

import typingsSlinky.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.EXECUTABLE
import typingsSlinky.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.NORMAL
import typingsSlinky.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.SYMLINK
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesFileMod {
  
  @js.native
  trait File extends StObject {
    
    /**
      * <p>The fully-qualified path to the file in the repository.</p>
      */
    var absolutePath: js.UndefOr[String] = js.native
    
    /**
      * <p>The blob ID that contains the file information.</p>
      */
    var blobId: js.UndefOr[String] = js.native
    
    /**
      * <p>The extrapolated file mode permissions for the file. Valid values include EXECUTABLE and NORMAL.</p>
      */
    var fileMode: js.UndefOr[EXECUTABLE | NORMAL | SYMLINK | String] = js.native
    
    /**
      * <p>The relative path of the file from the folder where the query originated.</p>
      */
    var relativePath: js.UndefOr[String] = js.native
  }
  object File {
    
    @scala.inline
    def apply(): File = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[File]
    }
    
    @scala.inline
    implicit class FileMutableBuilder[Self <: File] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAbsolutePath(value: String): Self = StObject.set(x, "absolutePath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAbsolutePathUndefined: Self = StObject.set(x, "absolutePath", js.undefined)
      
      @scala.inline
      def setBlobId(value: String): Self = StObject.set(x, "blobId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBlobIdUndefined: Self = StObject.set(x, "blobId", js.undefined)
      
      @scala.inline
      def setFileMode(value: EXECUTABLE | NORMAL | SYMLINK | String): Self = StObject.set(x, "fileMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFileModeUndefined: Self = StObject.set(x, "fileMode", js.undefined)
      
      @scala.inline
      def setRelativePath(value: String): Self = StObject.set(x, "relativePath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRelativePathUndefined: Self = StObject.set(x, "relativePath", js.undefined)
    }
  }
  
  type UnmarshalledFile = File
}
