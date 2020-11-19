package typingsSlinky.baconjs

import typingsSlinky.baconjs.observableMod.Observable
import typingsSlinky.baconjs.observableMod.Property
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("baconjs/types/decode", JSImport.Namespace)
@js.native
object decodeMod extends js.Object {
  
  def decode[T /* <: Record[_, _] */](src: Observable[/* keyof T */ String], cases: T): Property[DecodedValueOf[T]] = js.native
  
  def default[T /* <: Record[_, _] */](src: Observable[/* keyof T */ String], cases: T): Property[DecodedValueOf[T]] = js.native
  
  type DecodedValueOf[O] = FlattenedObservable[
    /* import warning: importer.ImportType#apply Failed type conversion: O[keyof O] */ js.Any
  ]
  
  type FlattenedObservable[O] = O
}
