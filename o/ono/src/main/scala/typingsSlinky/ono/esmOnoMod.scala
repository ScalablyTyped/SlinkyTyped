package typingsSlinky.ono

import typingsSlinky.ono.esmTypesMod.ErrorLike
import typingsSlinky.ono.esmTypesMod.ErrorLikeConstructor
import typingsSlinky.ono.esmTypesMod.OnoConstructor
import typingsSlinky.ono.esmTypesMod.OnoSingleton
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ono/esm/ono", JSImport.Namespace)
@js.native
object esmOnoMod extends js.Object {
  @js.native
  class Ono[T /* <: ErrorLike */] protected ()
    extends typingsSlinky.ono.esmTypesMod.Ono[T] {
    def this(constructor: ErrorLikeConstructor[T]) = this()
  }
  
  val Ono: OnoConstructor = js.native
  val ono: OnoSingleton = js.native
}

