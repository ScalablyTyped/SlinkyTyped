package typingsSlinky.arangodb.ArangoDB

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.arangodb.ArangoDB.DocumentCollectionType
  - typingsSlinky.arangodb.ArangoDB.EdgeCollectionType
*/
trait CollectionType extends js.Object

object CollectionType {
  @scala.inline
  implicit def apply(value: DocumentCollectionType): CollectionType = value.asInstanceOf[CollectionType]
  @scala.inline
  implicit def apply(value: EdgeCollectionType): CollectionType = value.asInstanceOf[CollectionType]
}

