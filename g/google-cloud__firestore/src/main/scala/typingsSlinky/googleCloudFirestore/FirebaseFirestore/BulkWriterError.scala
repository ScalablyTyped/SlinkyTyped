package typingsSlinky.googleCloudFirestore.FirebaseFirestore

import typingsSlinky.googleCloudFirestore.googleCloudFirestoreStrings.create
import typingsSlinky.googleCloudFirestore.googleCloudFirestoreStrings.delete
import typingsSlinky.googleCloudFirestore.googleCloudFirestoreStrings.set
import typingsSlinky.googleCloudFirestore.googleCloudFirestoreStrings.update
import typingsSlinky.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BulkWriterError extends Error {
  
  /** The status code of the error. */
  val code: GrpcStatus = js.native
  
  /** The document reference the operation was performed on. */
  val documentRef: DocumentReference[_] = js.native
  
  /** How many times this operation has been attempted unsuccessfully. */
  val failedAttempts: Double = js.native
  
  /** The type of operation performed. */
  val operationType: create | set | update | delete = js.native
}
object BulkWriterError {
  
  @scala.inline
  def apply(
    code: GrpcStatus,
    documentRef: DocumentReference[_],
    failedAttempts: Double,
    message: String,
    name: String,
    operationType: create | set | update | delete
  ): BulkWriterError = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], documentRef = documentRef.asInstanceOf[js.Any], failedAttempts = failedAttempts.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], operationType = operationType.asInstanceOf[js.Any])
    __obj.asInstanceOf[BulkWriterError]
  }
  
  @scala.inline
  implicit class BulkWriterErrorMutableBuilder[Self <: BulkWriterError] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCode(value: GrpcStatus): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentRef(value: DocumentReference[_]): Self = StObject.set(x, "documentRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailedAttempts(value: Double): Self = StObject.set(x, "failedAttempts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperationType(value: create | set | update | delete): Self = StObject.set(x, "operationType", value.asInstanceOf[js.Any])
  }
}
