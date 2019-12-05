package typingsSlinky.grammarkdown

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distTypedObjectsMod {
  import typingsSlinky.std.ReturnType

  type TypeOfTypeHint[T /* <: TypeHint */] = TypedObject[T] | js.Object | Null | String | Double
  type TypeOfTypeObject[T /* <: TypeObject[TypeHint, TypeOfTypeHint[TypeHint]] */] = ReturnType[T]
  type TypedObject[T /* <: StructureHint */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]: grammarkdown.grammarkdown/dist/typedObjects.TypeOfTypeObject<T[K]>}
    */ typingsSlinky.grammarkdown.grammarkdownStrings.TypedObject with T
}
