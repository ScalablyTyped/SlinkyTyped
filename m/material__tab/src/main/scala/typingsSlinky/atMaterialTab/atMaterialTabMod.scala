package typingsSlinky.atMaterialTab

import org.scalajs.dom.raw.Element
import typingsSlinky.atMaterialTab.adapterMod.MDCTabAdapter
import typingsSlinky.atMaterialTab.atMaterialTabMod.MDCTab
import typingsSlinky.atMaterialTab.foundationMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/tab", JSImport.Namespace)
@js.native
object atMaterialTabMod extends js.Object {
  @js.native
  class MDCTab ()
    extends typingsSlinky.atMaterialBase.componentMod.default[MDCTabAdapter, default] {
    var active: Boolean = js.native
  }
  
  @js.native
  class MDCTabFoundation () extends default
  
  /* static members */
  @js.native
  object MDCTab extends js.Object {
    def attachTo(root: Element): MDCTab = js.native
  }
  
  /* static members */
  @js.native
  object MDCTabFoundation extends js.Object {
    val cssClasses: typingsSlinky.atMaterialTab.constantsMod.cssClasses = js.native
    val defaultAdapter: MDCTabAdapter = js.native
    val strings: typingsSlinky.atMaterialTab.constantsMod.strings = js.native
  }
  
}

