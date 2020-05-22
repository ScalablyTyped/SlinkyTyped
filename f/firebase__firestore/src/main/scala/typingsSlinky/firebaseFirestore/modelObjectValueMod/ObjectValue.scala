package typingsSlinky.firebaseFirestore.modelObjectValueMod

import typingsSlinky.firebaseFirestore.anon.MapValueMapValue
import typingsSlinky.firebaseFirestore.firestoreProtoApiMod.Value
import typingsSlinky.firebaseFirestore.modelPathMod.FieldPath
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/src/model/object_value", "ObjectValue")
@js.native
class ObjectValue protected () extends js.Object {
  def this(proto: MapValueMapValue) = this()
  val proto: MapValueMapValue = js.native
  /**
    * Returns the value at the given path or null.
    *
    * @param path the path to search
    * @return The value at the path or if there it doesn't exist.
    */
  def field(path: FieldPath): Value | Null = js.native
  def isEqual(other: ObjectValue): Boolean = js.native
}

/* static members */
@JSImport("@firebase/firestore/dist/src/model/object_value", "ObjectValue")
@js.native
object ObjectValue extends js.Object {
  def empty(): ObjectValue = js.native
}

