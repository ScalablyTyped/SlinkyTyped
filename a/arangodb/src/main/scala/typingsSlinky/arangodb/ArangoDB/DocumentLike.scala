package typingsSlinky.arangodb.ArangoDB

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.arangodb.ArangoDB.ObjectWithId
  - typingsSlinky.arangodb.ArangoDB.ObjectWithKey
*/
trait DocumentLike extends js.Object

object DocumentLike {
  @scala.inline
  implicit def apply(value: ObjectWithId): DocumentLike = value.asInstanceOf[DocumentLike]
  @scala.inline
  implicit def apply(value: ObjectWithKey): DocumentLike = value.asInstanceOf[DocumentLike]
}

