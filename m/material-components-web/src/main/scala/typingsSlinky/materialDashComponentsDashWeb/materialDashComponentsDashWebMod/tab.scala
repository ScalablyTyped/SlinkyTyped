package typingsSlinky.materialDashComponentsDashWeb.materialDashComponentsDashWebMod

import org.scalajs.dom.raw.Element
import typingsSlinky.atMaterialTab.adapterMod.MDCTabAdapter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("material-components-web", "tab")
@js.native
object tab extends js.Object {
  @js.native
  class MDCTab ()
    extends typingsSlinky.atMaterialTab.atMaterialTabMod.MDCTab
  
  @js.native
  class MDCTabFoundation ()
    extends typingsSlinky.atMaterialTab.atMaterialTabMod.MDCTabFoundation
  
  /* static members */
  @js.native
  object MDCTab extends js.Object {
    def attachTo(root: Element): typingsSlinky.atMaterialTab.atMaterialTabMod.MDCTab = js.native
  }
  
  /* static members */
  @js.native
  object MDCTabFoundation extends js.Object {
    val cssClasses: typingsSlinky.atMaterialTab.constantsMod.cssClasses = js.native
    val defaultAdapter: MDCTabAdapter = js.native
    val strings: typingsSlinky.atMaterialTab.constantsMod.strings = js.native
  }
  
}

