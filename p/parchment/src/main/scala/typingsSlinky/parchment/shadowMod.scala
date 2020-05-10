package typingsSlinky.parchment

import org.scalajs.dom.raw.Node
import typingsSlinky.parchment.blotMod.Blot
import typingsSlinky.parchment.blotMod.Parent
import typingsSlinky.parchment.registryMod.Scope
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("parchment/dist/src/blot/abstract/shadow", JSImport.Namespace)
@js.native
object shadowMod extends js.Object {
  @js.native
  trait ShadowBlot extends Blot {
    val statics: js.Any = js.native
    def replaceWith(name: String): Blot = js.native
    def replaceWith(name: Blot, value: js.Any): Blot = js.native
    def wrap(name: String): Parent = js.native
    def wrap(name: Parent, value: js.Any): Parent = js.native
  }
  
  @js.native
  class default protected () extends ShadowBlot {
    def this(domNode: Node) = this()
  }
  
  /* static members */
  @js.native
  object default extends js.Object {
    var blotName: String = js.native
    var className: String = js.native
    var scope: Scope = js.native
    var tagName: String = js.native
    def create(value: js.Any): Node = js.native
  }
  
}

