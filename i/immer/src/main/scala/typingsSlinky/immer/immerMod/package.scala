package typingsSlinky.immer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object immerMod {
  import typingsSlinky.immer.Anon_Readonly
  import typingsSlinky.std.Exclude
  import typingsSlinky.std.Map
  import typingsSlinky.std.Number
  import typingsSlinky.std.Set
  import typingsSlinky.std.WeakMap
  import typingsSlinky.std.WeakSet

  type ArrayMethod = Exclude[String, Double]
  type AtomicObject = js.Function | (Map[js.Any, js.Any]) | (WeakMap[js.Any, js.Any]) | Set[js.Any] | WeakSet[js.Any] | js.Promise[js.Any] | js.Date | js.RegExp | Boolean | Number | String
  type Draft[T] = T | Anon_Readonly[T] | DraftTuple[T] | DraftArray[T]
  type DraftArray[T /* <: js.Array[_] */] = js.Array[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in immer.immer.Indices<T> ]: immer.immer.Draft<T[P]>}[immer.immer.Indices<T>] */ js.Any
  ]
  type DraftTuple[T /* <: js.Array[_] */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]: P extends immer.immer.Indices<T>? immer.immer.Draft<T[P]> : never}
    */ typingsSlinky.immer.immerStrings.DraftTuple with T
  /** Converts `nothing` into `undefined` */
  type FromNothing[T] = js.UndefOr[T | (Exclude[T, Nothing])]
  type Indices[T] = Exclude[String, ArrayMethod]
  type PatchListener = js.Function2[/* patches */ js.Array[Patch], /* inversePatches */ js.Array[Patch], Unit]
  /** The inferred return type of `produce` */
  type Produced[Base, Return] = (FromNothing[(Exclude[Return, Unit]) | Return]) | Base
}
