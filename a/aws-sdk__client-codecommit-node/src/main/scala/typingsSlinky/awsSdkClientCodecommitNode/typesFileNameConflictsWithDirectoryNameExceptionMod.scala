package typingsSlinky.awsSdkClientCodecommitNode

import typingsSlinky.awsSdkClientCodecommitNode.putFileExceptionsUnionMod.PutFileExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesFileNameConflictsWithDirectoryNameExceptionMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_FileNameConflictsWithDirectoryNameExceptionDetails> * / any */ @js.native
  trait FileNameConflictsWithDirectoryNameException extends PutFileExceptionsUnion {
    
    var name: typingsSlinky.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.FileNameConflictsWithDirectoryNameException = js.native
  }
  object FileNameConflictsWithDirectoryNameException {
    
    @scala.inline
    def apply(
      name: typingsSlinky.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.FileNameConflictsWithDirectoryNameException
    ): FileNameConflictsWithDirectoryNameException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[FileNameConflictsWithDirectoryNameException]
    }
    
    @scala.inline
    implicit class FileNameConflictsWithDirectoryNameExceptionMutableBuilder[Self <: FileNameConflictsWithDirectoryNameException] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(
        value: typingsSlinky.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.FileNameConflictsWithDirectoryNameException
      ): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait FileNameConflictsWithDirectoryNameExceptionDetails extends StObject
}
