package typingsSlinky.baconjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object combinetemplateMod {
  type ArrayTemplate[A] = js.Array[A | typingsSlinky.baconjs.combinetemplateMod.ObjectTemplate[A]]
  type ObjectTemplate[O] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof O ]: O[K] extends baconjs.baconjs/types/observable.default<infer I>? any : O[K] extends std.Record<any, any>? / * import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias baconjs.baconjs/types/combinetemplate.ObjectTemplate<O[K]> * / object : O[K] extends std.Array<infer I2>? baconjs.baconjs/types/combinetemplate.ArrayTemplate<any> : O[K]}
    */ typingsSlinky.baconjs.baconjsStrings.ObjectTemplate with org.scalablytyped.runtime.TopLevel[js.Any]
}
