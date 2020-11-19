package typingsSlinky.domdiff.mod

import org.scalajs.dom.raw.Node
import typingsSlinky.domdiff.domdiffNumbers.`-0`
import typingsSlinky.domdiff.domdiffNumbers.`-1`
import typingsSlinky.domdiff.domdiffNumbers.`0`
import typingsSlinky.domdiff.domdiffNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDomDiffOPtionsEachNodeCallbackFn extends js.Object {
  
  @JSName("node")
  def node_0[T](generic: T, info: `-0`): Node = js.native
  @JSName("node")
  def node_0[T](generic: T, info: `0`): Node = js.native
  /**
    * The optional function is invoked per each operation on the list of current"Nodes".
    * This can be useful to represent node through wrappers, whenever that is needed.
    * @param info
    * `1` when the item/node is being appended
    * `0` when the item/node is being used as insert _before_ reference
    * `-0` when the item/node is being used as insert _after_ reference
    * `-1` when the item/node is being removed
    */
  @JSName("node")
  def node_1[T](generic: T, info: `-1`): Node = js.native
  @JSName("node")
  def node_1[T](generic: T, info: `1`): Node = js.native
}
