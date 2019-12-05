package typingsSlinky.baconjs

import typingsSlinky.baconjs.typesDecodeMod.DecodedValueOf
import typingsSlinky.baconjs.typesDecodeMod.FlattenedObservable
import typingsSlinky.baconjs.typesObservableMod.Observable
import typingsSlinky.baconjs.typesObservableMod.Property
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baconjs/types/decode", JSImport.Namespace)
@js.native
object typesDecodeMod extends js.Object {
  def decode[T /* <: Record[_, _] */](src: Observable[String], cases: T): Property[DecodedValueOf[T]] = js.native
  def default[T /* <: Record[_, _] */](src: Observable[String], cases: T): Property[DecodedValueOf[T]] = js.native
  type DecodedValueOf[O] = FlattenedObservable[
    /* import warning: importer.ImportType#apply Failed type conversion: O[keyof O] */ js.Any
  ]
  type FlattenedObservable[O] = O
}

