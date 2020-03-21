package typingsSlinky.grammarkdown

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typedObjectsMod {
  type TypeOfTypeHint[T /* <: typingsSlinky.grammarkdown.typedObjectsMod.TypeHint */] = typingsSlinky.grammarkdown.typedObjectsMod.TypedObject[T] | js.Object | scala.Null | java.lang.String | scala.Double
  type TypeOfTypeObject[T /* <: typingsSlinky.grammarkdown.typedObjectsMod.TypeObject[
    typingsSlinky.grammarkdown.typedObjectsMod.TypeHint, 
    typingsSlinky.grammarkdown.typedObjectsMod.TypeOfTypeHint[typingsSlinky.grammarkdown.typedObjectsMod.TypeHint]
  ] */] = typingsSlinky.std.ReturnType[T]
  type TypedObject[T /* <: typingsSlinky.grammarkdown.typedObjectsMod.StructureHint */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]: grammarkdown.grammarkdown/dist/typedObjects.TypeOfTypeObject<T[K]>}
    */ typingsSlinky.grammarkdown.grammarkdownStrings.TypedObject with T
}
