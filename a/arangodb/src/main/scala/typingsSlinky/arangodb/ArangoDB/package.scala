package typingsSlinky.arangodb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ArangoDB {
  import typingsSlinky.arangodb.Anon_From
  import typingsSlinky.arangodb.Anon_FromTo
  import typingsSlinky.arangodb.arangodbNumbers.`2`
  import typingsSlinky.arangodb.arangodbNumbers.`3`
  import typingsSlinky.arangodb.arangodbStrings.Patch_
  import typingsSlinky.arangodb.arangodbStrings.arangosearch
  import typingsSlinky.std.Partial

  type CollectionType = DocumentCollectionType | EdgeCollectionType
  type Document[T /* <: js.Object */] = Anon_From with typingsSlinky.arangodb.arangodbStrings.Document with T with DocumentMetadata
  // Collection
  type DocumentCollectionType = `2`
  type DocumentData[T /* <: js.Object */] = typingsSlinky.arangodb.arangodbStrings.DocumentData with T with Partial[DocumentMetadata]
  type DocumentIterator[T /* <: js.Object */] = js.Function2[/* document */ Document[T], /* number */ Double, Unit]
  type Edge[T /* <: js.Object */] = Document[T] with Anon_FromTo
  type EdgeCollectionType = `3`
  type Patch[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]:? T[K] | / * import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias arangodb.ArangoDB.Patch<T[K]> * / object}
    */ Patch_ with T
  type ViewType = arangosearch
}
