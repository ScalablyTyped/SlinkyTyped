package typingsSlinky.backoff

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type FunctionCallAny = typingsSlinky.backoff.mod.FunctionCall[js.Array[_]] with typingsSlinky.backoff.mod.FunctionCallArgsAny
  
  type TypedFunctionCall[T, E, R1, R2, R3] = typingsSlinky.backoff.mod.FunctionCall[T] with (typingsSlinky.backoff.mod.FunctionCallArgs[E, R1, R2, R3])
}
