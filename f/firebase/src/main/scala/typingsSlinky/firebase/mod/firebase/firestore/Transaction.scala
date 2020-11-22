package typingsSlinky.firebase.mod.firebase.firestore

import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Transaction extends js.Object {
  
  /**
    * Deletes the document referred to by the provided `DocumentReference`.
    *
    * @param documentRef A reference to the document to be deleted.
    * @return This `Transaction` instance. Used for chaining method calls.
    */
  def delete(documentRef: DocumentReference[_]): Transaction = js.native
  
  /**
    * Reads the document referenced by the provided `DocumentReference.`
    *
    * @param documentRef A reference to the document to be read.
    * @return A DocumentSnapshot for the read data.
    */
  def get[T](documentRef: DocumentReference[T]): js.Promise[DocumentSnapshot[T]] = js.native
  
  /**
    * Writes to the document referred to by the provided `DocumentReference`.
    * If the document does not exist yet, it will be created. If you pass
    * `SetOptions`, the provided data can be merged into the existing document.
    *
    * @param documentRef A reference to the document to be set.
    * @param data An object of the fields and values for the document.
    * @return This `Transaction` instance. Used for chaining method calls.
    */
  def set[T](documentRef: DocumentReference[T], data: T): Transaction = js.native
  /**
    * Writes to the document referred to by the provided `DocumentReference`.
    * If the document does not exist yet, it will be created. If you pass
    * `SetOptions`, the provided data can be merged into the existing document.
    *
    * @param documentRef A reference to the document to be set.
    * @param data An object of the fields and values for the document.
    * @param options An object to configure the set behavior.
    * @return This `Transaction` instance. Used for chaining method calls.
    */
  def set[T](documentRef: DocumentReference[T], data: Partial[T], options: SetOptions): Transaction = js.native
  
  /**
    * Updates fields in the document referred to by the provided
    * `DocumentReference`. The update will fail if applied to a document that
    * does not exist.
    *
    * @param documentRef A reference to the document to be updated.
    * @param data An object containing the fields and values with which to
    * update the document. Fields can contain dots to reference nested fields
    * within the document.
    * @return This `Transaction` instance. Used for chaining method calls.
    */
  def update(documentRef: DocumentReference[_], data: UpdateData): Transaction = js.native
  /**
    * Updates fields in the document referred to by the provided
    * `DocumentReference`. The update will fail if applied to a document that
    * does not exist.
    *
    * Nested fields can be updated by providing dot-separated field path
    * strings or by providing FieldPath objects.
    *
    * @param documentRef A reference to the document to be updated.
    * @param field The first field to update.
    * @param value The first value.
    * @param moreFieldsAndValues Additional key/value pairs.
    * @return A Promise resolved once the data has been successfully written
    * to the backend (Note that it won't resolve while you're offline).
    */
  def update(documentRef: DocumentReference[_], field: String, value: js.Any, moreFieldsAndValues: js.Any*): Transaction = js.native
  def update(documentRef: DocumentReference[_], field: FieldPath, value: js.Any, moreFieldsAndValues: js.Any*): Transaction = js.native
}
