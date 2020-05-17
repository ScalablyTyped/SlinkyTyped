package typingsSlinky.materialIconButton

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.materialIconButton.adapterMod.MDCIconButtonToggleAdapter
import typingsSlinky.materialIconButton.anon.ARIAPRESSED
import typingsSlinky.materialIconButton.anon.ICONBUTTONON
import typingsSlinky.materialIconButton.anon.PartialMDCIconButtonToggl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/icon-button", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class MDCIconButtonToggle ()
    extends typingsSlinky.materialIconButton.componentMod.MDCIconButtonToggle
  
  @js.native
  class MDCIconButtonToggleFoundation ()
    extends typingsSlinky.materialIconButton.foundationMod.MDCIconButtonToggleFoundation {
    def this(adapter: PartialMDCIconButtonToggl) = this()
  }
  
  /* static members */
  @js.native
  object MDCIconButtonToggle extends js.Object {
    def attachTo(root: HTMLElement): typingsSlinky.materialIconButton.componentMod.MDCIconButtonToggle = js.native
  }
  
  /* static members */
  @js.native
  object MDCIconButtonToggleFoundation extends js.Object {
    val cssClasses: ICONBUTTONON = js.native
    val defaultAdapter: MDCIconButtonToggleAdapter = js.native
    val strings: ARIAPRESSED = js.native
  }
  
  @js.native
  object cssClasses extends js.Object {
    var ICON_BUTTON_ON: String = js.native
    var ROOT: String = js.native
  }
  
  @js.native
  object strings extends js.Object {
    var ARIA_PRESSED: String = js.native
    var CHANGE_EVENT: String = js.native
  }
  
}

