package typingsSlinky.firebaseFirestore.documentMod

import typingsSlinky.firebaseFirestore.anon.MapValue
import typingsSlinky.firebaseFirestore.documentKeyMod.DocumentKey
import typingsSlinky.firebaseFirestore.objectValueMod.ObjectValue
import typingsSlinky.firebaseFirestore.pathMod.FieldPath
import typingsSlinky.firebaseFirestore.snapshotVersionMod.SnapshotVersion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/lib/src/model/document", "Document")
@js.native
class Document protected () extends MaybeDocument {
  def this(key: DocumentKey, version: SnapshotVersion, objectValue: ObjectValue, options: DocumentOptions) = this()
  val hasCommittedMutations: Boolean = js.native
  val hasLocalMutations: Boolean = js.native
  val objectValue: js.Any = js.native
  def data(): ObjectValue = js.native
  def field(path: FieldPath): (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify api.Value */ js.Any) | Null = js.native
  def toProto(): MapValue = js.native
}

