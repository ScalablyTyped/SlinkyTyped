package typingsSlinky.arangodb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ArangoDB {
  type Document[T /* <: js.Object */] = typingsSlinky.arangodb.anon.From with typingsSlinky.arangodb.arangodbStrings.Document with org.scalablytyped.runtime.TopLevel[T] with typingsSlinky.arangodb.ArangoDB.DocumentMetadata
  // Collection
  type DocumentCollectionType = typingsSlinky.arangodb.arangodbNumbers.`2`
  type DocumentIterator[T /* <: js.Object */] = js.Function2[
    /* document */ typingsSlinky.arangodb.ArangoDB.Document[T], 
    /* number */ scala.Double, 
    scala.Unit
  ]
  type Edge[T /* <: js.Object */] = typingsSlinky.arangodb.ArangoDB.Document[T] with typingsSlinky.arangodb.anon.To
  type EdgeCollectionType = typingsSlinky.arangodb.arangodbNumbers.`3`
  type Patch[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]:? T[K] | / * import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias arangodb.ArangoDB.Patch<T[K]> * / object}
    */ typingsSlinky.arangodb.arangodbStrings.Patch_ with org.scalablytyped.runtime.TopLevel[T]
  type ViewType = typingsSlinky.arangodb.arangodbStrings.arangosearch
}
