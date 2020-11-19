package typingsSlinky.immer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type ArrayMethod = typingsSlinky.std.Exclude[/* keyof [] */ java.lang.String, scala.Double]
  
  type AtomicObject = js.Function | (typingsSlinky.std.Map[js.Any, js.Any]) | (typingsSlinky.std.WeakMap[js.Any, js.Any]) | typingsSlinky.std.Set[js.Any] | typingsSlinky.std.WeakSet[js.Any] | js.Promise[js.Any] | js.Date | js.RegExp | scala.Boolean | typingsSlinky.std.Number | java.lang.String
  
  type Draft[T] = T | (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {-readonly [ P in keyof T ]: / * import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias immer.immer.Draft<T[P]> * / object}
    */ typingsSlinky.immer.immerStrings.Draft with org.scalablytyped.runtime.TopLevel[js.Any]) | typingsSlinky.immer.mod.DraftTuple[T] | typingsSlinky.immer.mod.DraftArray[T]
  
  type DraftTuple[T /* <: js.Array[_] */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]: P extends immer.immer.Indices<T>? immer.immer.Draft<T[P]> : never}
    */ typingsSlinky.immer.immerStrings.DraftTuple with org.scalablytyped.runtime.TopLevel[T]
  
  /** Converts `nothing` into `undefined` */
  type FromNothing[T] = js.UndefOr[T | (typingsSlinky.std.Exclude[T, typingsSlinky.immer.mod.Nothing_])]
  
  type Indices[T] = typingsSlinky.std.Exclude[/* keyof T */ java.lang.String, typingsSlinky.immer.mod.ArrayMethod]
  
  type PatchListener = js.Function2[
    /* patches */ js.Array[typingsSlinky.immer.mod.Patch], 
    /* inversePatches */ js.Array[typingsSlinky.immer.mod.Patch], 
    scala.Unit
  ]
  
  /** The inferred return type of `produce` */
  type Produced[Base, Return] = (typingsSlinky.immer.mod.FromNothing[(typingsSlinky.std.Exclude[Return, scala.Unit]) | Return]) | Base
}
