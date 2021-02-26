package typingsSlinky.materialSwitch

import org.scalajs.dom.raw.Event
import typingsSlinky.materialBase.foundationMod.MDCFoundation
import typingsSlinky.materialSwitch.adapterMod.MDCSwitchAdapter
import typingsSlinky.materialSwitch.anon.PartialMDCSwitchAdapter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object foundationMod {
  
  @JSImport("@material/switch/foundation", JSImport.Default)
  @js.native
  class default () extends MDCSwitchFoundation {
    def this(adapter: PartialMDCSwitchAdapter) = this()
  }
  
  @JSImport("@material/switch/foundation", "MDCSwitchFoundation")
  @js.native
  class MDCSwitchFoundation () extends MDCFoundation[MDCSwitchAdapter] {
    def this(adapter: PartialMDCSwitchAdapter) = this()
    
    /** Handles the change event for the switch native control. */
    def handleChange(evt: Event): Unit = js.native
    
    /** Sets the checked state of the switch. */
    def setChecked(checked: Boolean): Unit = js.native
    
    /** Sets the disabled state of the switch. */
    def setDisabled(disabled: Boolean): Unit = js.native
  }
}
