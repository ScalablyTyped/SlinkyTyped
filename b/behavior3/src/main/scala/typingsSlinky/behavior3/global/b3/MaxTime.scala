package typingsSlinky.behavior3.global.b3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The MaxTime decorator limits the maximum time the node child can execute.
  * Notice that it does not interrupt the execution itself (i.e., the child
  * must be non-preemptive), it only interrupts the node after a `RUNNING`
  * status.
  *
  */
@JSGlobal("b3.MaxTime")
@js.native
/**
  * Creates an instance of MaxTime.
  *
  * - **maxTime** (*Integer*) Maximum time a child can execute.
  * - **child** (*BaseNode*) The child node.
  *
  */
class MaxTime ()
  extends typingsSlinky.behavior3.b3.MaxTime {
  def this(hasMaxTimeChild: typingsSlinky.behavior3.anon.MaxTime) = this()
}
