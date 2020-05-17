package typingsSlinky.behavior3.global.b3

import typingsSlinky.behavior3.anon.ChildBaseNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The Inverter decorator inverts the result of the child, returning `SUCCESS`
  * for `FAILURE` and `FAILURE` for `SUCCESS`.
  *
  */
@JSGlobal("b3.Inverter")
@js.native
/**
  * Creates an instance of Inverter.
  */
class Inverter ()
  extends typingsSlinky.behavior3.b3.Inverter {
  def this(hasChild: ChildBaseNode) = this()
}

