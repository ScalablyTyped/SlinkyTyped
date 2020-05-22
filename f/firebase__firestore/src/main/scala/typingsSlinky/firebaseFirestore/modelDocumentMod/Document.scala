package typingsSlinky.firebaseFirestore.modelDocumentMod

import typingsSlinky.firebaseFirestore.anon.MapValueMapValue
import typingsSlinky.firebaseFirestore.coreSnapshotVersionMod.SnapshotVersion
import typingsSlinky.firebaseFirestore.firestoreProtoApiMod.Value
import typingsSlinky.firebaseFirestore.modelDocumentKeyMod.DocumentKey
import typingsSlinky.firebaseFirestore.modelObjectValueMod.ObjectValue
import typingsSlinky.firebaseFirestore.modelPathMod.FieldPath
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/src/model/document", "Document")
@js.native
class Document protected () extends MaybeDocument {
  def this(key: DocumentKey, version: SnapshotVersion, objectValue: ObjectValue, options: DocumentOptions) = this()
  val hasCommittedMutations: Boolean = js.native
  val hasLocalMutations: Boolean = js.native
  val objectValue: js.Any = js.native
  def data(): ObjectValue = js.native
  def field(path: FieldPath): Value | Null = js.native
  def toProto(): MapValueMapValue = js.native
}

