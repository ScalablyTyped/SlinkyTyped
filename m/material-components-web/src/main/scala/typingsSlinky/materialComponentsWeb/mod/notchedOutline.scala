package typingsSlinky.materialComponentsWeb.mod

import org.scalajs.dom.raw.Element
import typingsSlinky.materialNotchedOutline.adapterMod.MDCNotchedOutlineAdapter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("material-components-web", "notchedOutline")
@js.native
object notchedOutline extends js.Object {
  @js.native
  class MDCNotchedOutline ()
    extends typingsSlinky.materialNotchedOutline.mod.MDCNotchedOutline
  
  @js.native
  class MDCNotchedOutlineFoundation ()
    extends typingsSlinky.materialNotchedOutline.mod.MDCNotchedOutlineFoundation
  
  /* static members */
  @js.native
  object MDCNotchedOutline extends js.Object {
    def attachTo(root: Element): typingsSlinky.materialNotchedOutline.mod.MDCNotchedOutline = js.native
  }
  
  /* static members */
  @js.native
  object MDCNotchedOutlineFoundation extends js.Object {
    val cssClasses: typingsSlinky.materialNotchedOutline.constantsMod.cssClasses = js.native
    val defaultAdapter: MDCNotchedOutlineAdapter = js.native
    val strings: typingsSlinky.materialNotchedOutline.constantsMod.strings = js.native
  }
  
}

