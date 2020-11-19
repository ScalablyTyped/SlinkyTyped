package typingsSlinky.jsdevtoolsOno

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.jsdevtoolsOno.typesMod.ErrorLike
import typingsSlinky.jsdevtoolsOno.typesMod.ErrorLikeConstructor
import typingsSlinky.jsdevtoolsOno.typesMod.OnoConstructor
import typingsSlinky.jsdevtoolsOno.typesMod.OnoOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@jsdevtools/ono/esm/constructor", JSImport.Namespace)
@js.native
object constructorMod extends js.Object {
  
  @js.native
  class Ono[T /* <: ErrorLike */] protected ()
    extends typingsSlinky.jsdevtoolsOno.typesMod.Ono[T] {
    def this(constructor: ErrorLikeConstructor[T]) = this()
    def this(constructor: ErrorLikeConstructor[T], options: OnoOptions) = this()
  }
  @js.native
  object Ono extends TopLevel[OnoConstructor]
}
