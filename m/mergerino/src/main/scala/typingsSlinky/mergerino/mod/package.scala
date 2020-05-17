package typingsSlinky.mergerino

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ArrayPatch[T] = typingsSlinky.mergerino.mod.ObjectPatch[typingsSlinky.std.Record[scala.Double, js.Any]]
  type FunctionPatch[T] = js.Function2[/* val */ T, /* merge */ typingsSlinky.mergerino.mod.Merge[T], T]
  type Merge[S /* <: js.Object */] = js.Function2[
    /* source */ S, 
    /* repeated */ typingsSlinky.mergerino.mod.MultipleTopLevelPatch[S], 
    S
  ]
  type NestedPatch[T] = typingsSlinky.mergerino.mod.ObjectPatch[T]
  type ObjectPatch[S /* <: js.Object */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof S ]:? S[K] | mergerino.mergerino.DeletePatch | mergerino.mergerino.FunctionPatch<S[K]> | mergerino.mergerino.NestedPatch<S[K]> | mergerino.mergerino.ArrayPatch<S[K]>}
    */ typingsSlinky.mergerino.mergerinoStrings.ObjectPatch with org.scalablytyped.runtime.TopLevel[js.Any]
}
