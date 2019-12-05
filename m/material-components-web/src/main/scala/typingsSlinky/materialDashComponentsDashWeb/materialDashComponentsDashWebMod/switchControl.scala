package typingsSlinky.materialDashComponentsDashWeb.materialDashComponentsDashWebMod

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.atMaterialSwitch.Anon_CHECKED
import typingsSlinky.atMaterialSwitch.Anon_NATIVECONTROLSELECTOR
import typingsSlinky.atMaterialSwitch.adapterMod.MDCSwitchAdapter
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("material-components-web", "switchControl")
@js.native
object switchControl extends js.Object {
  @js.native
  class MDCSwitch ()
    extends typingsSlinky.atMaterialSwitch.atMaterialSwitchMod.MDCSwitch
  
  @js.native
  class MDCSwitchFoundation ()
    extends typingsSlinky.atMaterialSwitch.atMaterialSwitchMod.MDCSwitchFoundation {
    def this(adapter: Partial[MDCSwitchAdapter]) = this()
  }
  
  /* static members */
  @js.native
  object MDCSwitch extends js.Object {
    def attachTo(root: HTMLElement): typingsSlinky.atMaterialSwitch.componentMod.MDCSwitch = js.native
  }
  
  /* static members */
  @js.native
  object MDCSwitchFoundation extends js.Object {
    /** The CSS classes used by the switch. */
    val cssClasses: Anon_CHECKED = js.native
    /** The default Adapter for the switch. */
    val defaultAdapter: MDCSwitchAdapter = js.native
    /** The string constants used by the switch. */
    val strings: Anon_NATIVECONTROLSELECTOR = js.native
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

