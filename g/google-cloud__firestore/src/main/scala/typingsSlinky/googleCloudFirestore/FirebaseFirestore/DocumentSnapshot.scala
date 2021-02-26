package typingsSlinky.googleCloudFirestore.FirebaseFirestore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DocumentSnapshot[T] extends StObject {
  
  /**
    * The time the document was created. Not set for documents that don't
    * exist.
    */
  val createTime: js.UndefOr[Timestamp] = js.native
  
  /**
    * Retrieves all fields in the document as an Object. Returns 'undefined' if
    * the document doesn't exist.
    *
    * @return An Object containing all fields in the document.
    */
  def data(): js.UndefOr[T] = js.native
  
  /** True if the document exists. */
  val exists: Boolean = js.native
  
  /**
    * Retrieves the field specified by `fieldPath`.
    *
    * @param fieldPath The path (e.g. 'foo' or 'foo.bar') to a specific field.
    * @return The data at the specified field location or undefined if no such
    * field exists in the document.
    */
  def get(fieldPath: String): js.Any = js.native
  def get(fieldPath: FieldPath): js.Any = js.native
  
  /**
    * The ID of the document for which this `DocumentSnapshot` contains data.
    */
  val id: String = js.native
  
  /**
    * Returns true if the document's data and path in this `DocumentSnapshot`
    * is equal to the provided one.
    *
    * @param other The `DocumentSnapshot` to compare against.
    * @return true if this `DocumentSnapshot` is equal to the provided one.
    */
  def isEqual(other: DocumentSnapshot[T]): Boolean = js.native
  
  /**
    * The time this snapshot was read.
    */
  val readTime: Timestamp = js.native
  
  /** A `DocumentReference` to the document location. */
  val ref: DocumentReference[T] = js.native
  
  /**
    * The time the document was last updated (at the time the snapshot was
    * generated). Not set for documents that don't exist.
    */
  val updateTime: js.UndefOr[Timestamp] = js.native
}
