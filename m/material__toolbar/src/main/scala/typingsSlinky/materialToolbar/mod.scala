package typingsSlinky.materialToolbar

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.materialBase.mod.MDCComponent
import typingsSlinky.materialToolbar.adapterMod.MDCToolbarAdapter
import typingsSlinky.materialToolbar.foundationMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/toolbar", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class MDCToolbar () extends MDCComponent[MDCToolbarAdapter, default] {
    var fixedAdjustElement: HTMLElement = js.native
  }
  
  @js.native
  class MDCToolbarFoundation () extends default
  
  /* static members */
  @js.native
  object MDCToolbar extends js.Object {
    def attachTo(root: Element): MDCToolbar = js.native
  }
  
  /* static members */
  @js.native
  object MDCToolbarFoundation extends js.Object {
    val cssClasses: typingsSlinky.materialToolbar.constantsMod.cssClasses = js.native
    val defaultAdapter: MDCToolbarAdapter = js.native
    val numbers: typingsSlinky.materialToolbar.constantsMod.numbers = js.native
    val strings: typingsSlinky.materialToolbar.constantsMod.strings = js.native
  }
  
}

