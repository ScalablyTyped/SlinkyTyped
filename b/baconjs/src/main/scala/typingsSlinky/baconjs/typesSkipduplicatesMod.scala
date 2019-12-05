package typingsSlinky.baconjs

import typingsSlinky.baconjs.typesSkipduplicatesMod.Equals
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baconjs/types/skipduplicates", JSImport.Namespace)
@js.native
object typesSkipduplicatesMod extends js.Object {
  def default[A](src: typingsSlinky.baconjs.typesObservableMod.default[A]): typingsSlinky.baconjs.typesObservableMod.default[A] = js.native
  def default[A](src: typingsSlinky.baconjs.typesObservableMod.default[A], isEqual: Equals[A]): typingsSlinky.baconjs.typesObservableMod.default[A] = js.native
  def equals[A](a: A, b: A): Boolean = js.native
  type Equals[A] = js.Function2[/* left */ A, /* right */ A, Boolean]
}

