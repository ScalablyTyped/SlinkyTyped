package typingsSlinky.hapiHoek.mod

import typingsSlinky.hapiHoek.mod.internals.Without
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@hapi/hoek", "ts")
@js.native
object ts extends js.Object {
  
  /**
    * Defines a type that can must be one of T or U but not both.
    */
  type XOR[T, U] = T | U | ((Without[T, U]) with U) | ((Without[U, T]) with T)
}
