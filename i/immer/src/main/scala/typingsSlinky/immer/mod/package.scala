package typingsSlinky.immer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ArrayMethod = typingsSlinky.std.Exclude[/* keyof [] */ java.lang.String, scala.Double]
  type DraftArray[T /* <: js.Array[_] */] = js.Array[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in immer.immer.Indices<T> ]: immer.immer.Draft<T[P]>}[immer.immer.Indices<T>] */ js.Any
  ]
  type DraftTuple[T /* <: js.Array[_] */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]: P extends immer.immer.Indices<T>? immer.immer.Draft<T[P]> : never}
    */ typingsSlinky.immer.immerStrings.DraftTuple with org.scalablytyped.runtime.TopLevel[T]
  type Indices[T] = typingsSlinky.std.Exclude[/* keyof T */ java.lang.String, typingsSlinky.immer.mod.ArrayMethod]
  type PatchListener = js.Function2[
    /* patches */ js.Array[typingsSlinky.immer.mod.Patch], 
    /* inversePatches */ js.Array[typingsSlinky.immer.mod.Patch], 
    scala.Unit
  ]
}
