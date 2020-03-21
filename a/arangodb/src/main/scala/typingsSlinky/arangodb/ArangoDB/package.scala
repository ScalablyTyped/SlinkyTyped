package typingsSlinky.arangodb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ArangoDB {
  type CollectionType = typingsSlinky.arangodb.ArangoDB.DocumentCollectionType | typingsSlinky.arangodb.ArangoDB.EdgeCollectionType
  type Document[T /* <: js.Object */] = typingsSlinky.arangodb.AnonDictkey with typingsSlinky.arangodb.arangodbStrings.Document with T with typingsSlinky.arangodb.ArangoDB.DocumentMetadata
  // Collection
  type DocumentCollectionType = typingsSlinky.arangodb.arangodbNumbers.`2`
  type DocumentIterator[T /* <: js.Object */] = js.Function2[
    /* document */ typingsSlinky.arangodb.ArangoDB.Document[T], 
    /* number */ scala.Double, 
    scala.Unit
  ]
  type Edge[T /* <: js.Object */] = typingsSlinky.arangodb.ArangoDB.Document[T] with typingsSlinky.arangodb.AnonFrom
  type EdgeCollectionType = typingsSlinky.arangodb.arangodbNumbers.`3`
  type Patch[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]:? T[K] | / * import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias arangodb.ArangoDB.Patch<T[K]> * / object}
    */ typingsSlinky.arangodb.arangodbStrings.Patch_ with T
  type ViewType = typingsSlinky.arangodb.arangodbStrings.arangosearch
}
