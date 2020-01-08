package typingsSlinky.parchment

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.parchment.distSrcRegistryMod.Scope
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("parchment/dist/src/blot/inline", JSImport.Namespace)
@js.native
object distSrcBlotInlineMod extends js.Object {
  @js.native
  trait InlineBlot
    extends typingsSlinky.parchment.distSrcBlotAbstractFormatMod.default
  
  @js.native
  class default () extends InlineBlot
  
  /* static members */
  @js.native
  object default extends js.Object {
    var blotName: String = js.native
    var scope: Scope = js.native
    var tagName: String = js.native
    def formats(domNode: HTMLElement): js.Any = js.native
  }
  
}

