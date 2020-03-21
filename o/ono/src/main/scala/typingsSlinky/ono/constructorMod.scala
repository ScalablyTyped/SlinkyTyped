package typingsSlinky.ono

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.ono.typesMod.ErrorLike
import typingsSlinky.ono.typesMod.ErrorLikeConstructor
import typingsSlinky.ono.typesMod.OnoConstructor
import typingsSlinky.ono.typesMod.OnoOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ono/esm/constructor", JSImport.Namespace)
@js.native
object constructorMod extends js.Object {
  @js.native
  class Ono[T /* <: ErrorLike */] protected ()
    extends typingsSlinky.ono.typesMod.Ono[T] {
    def this(constructor: ErrorLikeConstructor[T]) = this()
    def this(constructor: ErrorLikeConstructor[T], options: OnoOptions) = this()
  }
  
  @js.native
  object Ono extends TopLevel[OnoConstructor]
  
}

