package typingsSlinky.materialIconButton

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.materialIconButton.adapterMod.MDCIconButtonToggleAdapter
import typingsSlinky.materialIconButton.anon.ARIALABEL
import typingsSlinky.materialIconButton.anon.ICONBUTTONON
import typingsSlinky.materialIconButton.anon.PartialMDCIconButtonToggl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@material/icon-button", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  @js.native
  class MDCIconButtonToggle ()
    extends typingsSlinky.materialIconButton.componentMod.MDCIconButtonToggle
  /* static members */
  @js.native
  object MDCIconButtonToggle extends js.Object {
    
    def attachTo(root: HTMLElement): typingsSlinky.materialIconButton.componentMod.MDCIconButtonToggle = js.native
  }
  
  @js.native
  class MDCIconButtonToggleFoundation ()
    extends typingsSlinky.materialIconButton.foundationMod.MDCIconButtonToggleFoundation {
    def this(adapter: PartialMDCIconButtonToggl) = this()
  }
  /* static members */
  @js.native
  object MDCIconButtonToggleFoundation extends js.Object {
    
    def cssClasses: ICONBUTTONON = js.native
    
    def defaultAdapter: MDCIconButtonToggleAdapter = js.native
    
    def strings: ARIALABEL = js.native
  }
  
  @js.native
  object cssClasses extends js.Object {
    
    var ICON_BUTTON_ON: String = js.native
    
    var ROOT: String = js.native
  }
  
  @js.native
  object strings extends js.Object {
    
    var ARIA_LABEL: String = js.native
    
    var ARIA_PRESSED: String = js.native
    
    var CHANGE_EVENT: String = js.native
    
    var DATA_ARIA_LABEL_OFF: String = js.native
    
    var DATA_ARIA_LABEL_ON: String = js.native
  }
}
