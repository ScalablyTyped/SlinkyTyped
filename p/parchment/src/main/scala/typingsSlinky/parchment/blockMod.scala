package typingsSlinky.parchment

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.parchment.registryMod.Scope
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("parchment/dist/src/blot/block", JSImport.Namespace)
@js.native
object blockMod extends js.Object {
  @js.native
  trait BlockBlot
    extends typingsSlinky.parchment.formatMod.default
  
  @js.native
  class default () extends BlockBlot
  
  /* static members */
  @js.native
  object default extends js.Object {
    var blotName: String = js.native
    var scope: Scope = js.native
    var tagName: String = js.native
    def formats(domNode: HTMLElement): js.Any = js.native
  }
  
}

