package typingsSlinky.firebaseFirestore.modelFieldValueMod

import typingsSlinky.firebaseFirestore.blobMod.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/lib/src/model/field_value", "BlobValue")
@js.native
class BlobValue protected () extends FieldValue {
  def this(internalValue: Blob) = this()
  val internalValue: Blob = js.native
}

