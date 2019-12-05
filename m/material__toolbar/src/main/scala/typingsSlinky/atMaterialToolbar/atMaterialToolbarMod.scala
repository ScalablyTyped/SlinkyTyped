package typingsSlinky.atMaterialToolbar

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.atMaterialBase.atMaterialBaseMod.MDCComponent
import typingsSlinky.atMaterialToolbar.adapterMod.MDCToolbarAdapter
import typingsSlinky.atMaterialToolbar.atMaterialToolbarMod.MDCToolbar
import typingsSlinky.atMaterialToolbar.foundationMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/toolbar", JSImport.Namespace)
@js.native
object atMaterialToolbarMod extends js.Object {
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
    val cssClasses: typingsSlinky.atMaterialToolbar.constantsMod.cssClasses = js.native
    val defaultAdapter: MDCToolbarAdapter = js.native
    val numbers: typingsSlinky.atMaterialToolbar.constantsMod.numbers = js.native
    val strings: typingsSlinky.atMaterialToolbar.constantsMod.strings = js.native
  }
  
}

