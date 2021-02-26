package typingsSlinky.awsSdk.codecommitMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchDescribeMergeConflictsError extends StObject {
  
  /**
    * The name of the exception.
    */
  var exceptionName: ExceptionName = js.native
  
  /**
    * The path to the file.
    */
  var filePath: Path = js.native
  
  /**
    * The message provided by the exception.
    */
  var message: Message = js.native
}
object BatchDescribeMergeConflictsError {
  
  @scala.inline
  def apply(exceptionName: ExceptionName, filePath: Path, message: Message): BatchDescribeMergeConflictsError = {
    val __obj = js.Dynamic.literal(exceptionName = exceptionName.asInstanceOf[js.Any], filePath = filePath.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchDescribeMergeConflictsError]
  }
  
  @scala.inline
  implicit class BatchDescribeMergeConflictsErrorMutableBuilder[Self <: BatchDescribeMergeConflictsError] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExceptionName(value: ExceptionName): Self = StObject.set(x, "exceptionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilePath(value: Path): Self = StObject.set(x, "filePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: Message): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
  }
}
