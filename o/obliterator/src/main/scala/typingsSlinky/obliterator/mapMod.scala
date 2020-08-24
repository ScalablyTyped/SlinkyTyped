package typingsSlinky.obliterator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("obliterator/map", JSImport.Namespace)
@js.native
object mapMod extends js.Object {
  def default[S, T](predicate: MapFunction[S, T], iterator: js.Iterator[S]): typingsSlinky.obliterator.iteratorMod.default[T] = js.native
  type MapFunction[S, T] = js.Function1[/* item */ S, T]
}

