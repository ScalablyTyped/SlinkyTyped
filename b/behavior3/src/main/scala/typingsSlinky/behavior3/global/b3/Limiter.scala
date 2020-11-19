package typingsSlinky.behavior3.global.b3

import typingsSlinky.behavior3.anon.MaxLoop
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This decorator limit the number of times its child can be called. After a
  * certain number of times, the Limiter decorator returns `FAILURE` without
  * executing the child.
  *
  */
@JSGlobal("b3.Limiter")
@js.native
/**
  * Creates an instance of Limiter.
  *
  * Settings parameters:
  *
  * - **maxLoop** (*Integer*) Maximum number of repetitions.
  * - **child** (*BaseNode*) The child node.
  *
  */
class Limiter ()
  extends typingsSlinky.behavior3.b3.Limiter {
  def this(hasChildMaxLoop: MaxLoop) = this()
}
