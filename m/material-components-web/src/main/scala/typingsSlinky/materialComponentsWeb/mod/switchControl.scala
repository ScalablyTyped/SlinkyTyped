package typingsSlinky.materialComponentsWeb.mod

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.materialSwitch.AnonCHECKED
import typingsSlinky.materialSwitch.AnonNATIVECONTROLSELECTOR
import typingsSlinky.materialSwitch.PartialMDCSwitchAdapter
import typingsSlinky.materialSwitch.adapterMod.MDCSwitchAdapter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("material-components-web", "switchControl")
@js.native
object switchControl extends js.Object {
  @js.native
  class MDCSwitch ()
    extends typingsSlinky.materialSwitch.mod.MDCSwitch
  
  @js.native
  class MDCSwitchFoundation ()
    extends typingsSlinky.materialSwitch.mod.MDCSwitchFoundation {
    def this(adapter: PartialMDCSwitchAdapter) = this()
  }
  
  /* static members */
  @js.native
  object MDCSwitch extends js.Object {
    def attachTo(root: HTMLElement): typingsSlinky.materialSwitch.componentMod.MDCSwitch = js.native
  }
  
  /* static members */
  @js.native
  object MDCSwitchFoundation extends js.Object {
    /** The CSS classes used by the switch. */
    val cssClasses: AnonCHECKED = js.native
    /** The default Adapter for the switch. */
    val defaultAdapter: MDCSwitchAdapter = js.native
    /** The string constants used by the switch. */
    val strings: AnonNATIVECONTROLSELECTOR = js.native
  }
  
  /** CSS classes used by the switch. */
  @js.native
  object cssClasses extends js.Object {
    /** Class used for a switch that is in the "checked" (on) position. */
    var CHECKED: String = js.native
    /** Class used for a switch that is disabled. */
    var DISABLED: String = js.native
  }
  
  /** String constants used by the switch. */
  @js.native
  object strings extends js.Object {
    /** A CSS selector used to locate the native HTML control for the switch.  */
    var NATIVE_CONTROL_SELECTOR: String = js.native
    /** A CSS selector used to locate the ripple surface element for the switch. */
    var RIPPLE_SURFACE_SELECTOR: String = js.native
  }
  
}

