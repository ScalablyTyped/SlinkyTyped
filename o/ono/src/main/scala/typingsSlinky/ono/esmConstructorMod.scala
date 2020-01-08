package typingsSlinky.ono

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.ono.esmTypesMod.ErrorLike
import typingsSlinky.ono.esmTypesMod.ErrorLikeConstructor
import typingsSlinky.ono.esmTypesMod.OnoConstructor
import typingsSlinky.ono.esmTypesMod.OnoOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ono/esm/constructor", JSImport.Namespace)
@js.native
object esmConstructorMod extends js.Object {
  @js.native
  class Ono[T /* <: ErrorLike */] protected ()
    extends typingsSlinky.ono.esmTypesMod.Ono[T] {
    def this(constructor: ErrorLikeConstructor[T]) = this()
    def this(constructor: ErrorLikeConstructor[T], options: OnoOptions) = this()
  }
  
  @js.native
  object Ono extends TopLevel[OnoConstructor]
  
}

