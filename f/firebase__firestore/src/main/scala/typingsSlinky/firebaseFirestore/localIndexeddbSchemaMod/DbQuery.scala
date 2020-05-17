package typingsSlinky.firebaseFirestore.localIndexeddbSchemaMod

import typingsSlinky.firebaseFirestore.firestoreProtoApiMod.DocumentsTarget
import typingsSlinky.firebaseFirestore.firestoreProtoApiMod.QueryTarget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.firebaseFirestore.firestoreProtoApiMod.QueryTarget
  - typingsSlinky.firebaseFirestore.firestoreProtoApiMod.DocumentsTarget
*/
trait DbQuery extends js.Object

object DbQuery {
  @scala.inline
  implicit def apply(value: DocumentsTarget): DbQuery = value.asInstanceOf[DbQuery]
  @scala.inline
  implicit def apply(value: QueryTarget): DbQuery = value.asInstanceOf[DbQuery]
}

