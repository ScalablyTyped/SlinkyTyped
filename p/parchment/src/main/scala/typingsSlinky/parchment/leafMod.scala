package typingsSlinky.parchment

import org.scalajs.dom.raw.Node
import typingsSlinky.parchment.registryMod.Scope
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("parchment/dist/src/blot/abstract/leaf", JSImport.Namespace)
@js.native
object leafMod extends js.Object {
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typingsSlinky.parchment.linkedNodeMod.LinkedNode because Already inherited
  - typingsSlinky.parchment.blotMod.Blot because Already inherited
  - typingsSlinky.parchment.blotMod.Leaf because var conflicts: domNode, next, parent, prev, scroll. Inlined index, position, value */ @js.native
  trait LeafBlot
    extends typingsSlinky.parchment.shadowMod.default {
    def index(node: Node, offset: Double): Double = js.native
    def position(index: Double): js.Tuple2[Node, Double] = js.native
    def position(index: Double, inclusive: Boolean): js.Tuple2[Node, Double] = js.native
    def value(): js.Any = js.native
  }
  
  @js.native
  class default () extends LeafBlot
  
  /* static members */
  @js.native
  object default extends js.Object {
    var scope: Scope = js.native
    def value(domNode: Node): js.Any = js.native
  }
  
}

