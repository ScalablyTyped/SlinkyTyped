package typingsSlinky.ecmarkdown

import typingsSlinky.ecmarkdown.nodeTypesMod.AlgorithmNode
import typingsSlinky.ecmarkdown.nodeTypesMod.CommentNode
import typingsSlinky.ecmarkdown.nodeTypesMod.Node
import typingsSlinky.ecmarkdown.nodeTypesMod.OpaqueTagNode
import typingsSlinky.ecmarkdown.nodeTypesMod.OrderedListItemNode
import typingsSlinky.ecmarkdown.nodeTypesMod.OrderedListNode
import typingsSlinky.ecmarkdown.nodeTypesMod.PipeNode
import typingsSlinky.ecmarkdown.nodeTypesMod.StarNode
import typingsSlinky.ecmarkdown.nodeTypesMod.TagNode
import typingsSlinky.ecmarkdown.nodeTypesMod.TextNode
import typingsSlinky.ecmarkdown.nodeTypesMod.TickNode
import typingsSlinky.ecmarkdown.nodeTypesMod.TildeNode
import typingsSlinky.ecmarkdown.nodeTypesMod.UnderscoreNode
import typingsSlinky.ecmarkdown.nodeTypesMod.UnorderedListItemNode
import typingsSlinky.ecmarkdown.nodeTypesMod.UnorderedListNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object emitterMod {
  
  @JSImport("ecmarkdown/dist/emitter", "Emitter")
  @js.native
  class Emitter () extends StObject {
    
    def emit(node: js.Array[Node]): String = js.native
    def emit(node: Node): String = js.native
    
    def emitAlgorithm(algorithm: AlgorithmNode): Unit = js.native
    
    def emitFragment(fragment: js.Array[Node]): Unit = js.native
    
    def emitListItem(li: OrderedListItemNode): Unit = js.native
    def emitListItem(li: UnorderedListItemNode): Unit = js.native
    
    def emitNode(node: js.Array[Node]): Unit = js.native
    def emitNode(node: Node): Unit = js.native
    
    def emitOrderedList(ol: OrderedListNode): Unit = js.native
    
    def emitPipe(pipe: PipeNode): Unit = js.native
    
    def emitStar(node: StarNode): Unit = js.native
    
    def emitTag(tag: CommentNode): Unit = js.native
    def emitTag(tag: OpaqueTagNode): Unit = js.native
    def emitTag(tag: TagNode): Unit = js.native
    
    def emitText(text: TextNode): Unit = js.native
    
    def emitTick(node: TickNode): Unit = js.native
    
    def emitTilde(node: TildeNode): Unit = js.native
    
    def emitUnderscore(node: UnderscoreNode): Unit = js.native
    
    def emitUnorderedList(ul: UnorderedListNode): Unit = js.native
    
    var str: String = js.native
    
    def wrapFragment(wrapping: String, fragment: js.Array[Node]): Unit = js.native
  }
  /* static members */
  object Emitter {
    
    @JSImport("ecmarkdown/dist/emitter", "Emitter.emit")
    @js.native
    def emit(node: js.Array[Node]): String = js.native
    @JSImport("ecmarkdown/dist/emitter", "Emitter.emit")
    @js.native
    def emit(node: Node): String = js.native
  }
}
