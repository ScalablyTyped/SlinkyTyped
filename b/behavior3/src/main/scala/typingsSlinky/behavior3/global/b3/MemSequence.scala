package typingsSlinky.behavior3.global.b3

import typingsSlinky.behavior3.anon.`0`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * MemSequence is similar to Sequence node, but when a child returns a
  * `RUNNING` state, its index is recorded and in the next tick the
  * MemPriority call the child recorded directly, without calling previous
  * children again.
  *
  */
@JSGlobal("b3.MemSequence")
@js.native
/**
  * Creates an instance of MemSequence.
  */
class MemSequence ()
  extends typingsSlinky.behavior3.b3.MemSequence {
  def this(hasChildren: `0`) = this()
}
