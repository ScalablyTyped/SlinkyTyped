package typingsSlinky.materialComponentsWeb.mod

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.materialSwitch.anon.PartialMDCSwitchAdapter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object switchControl {
  
  @JSImport("material-components-web", "switchControl.MDCSwitch")
  @js.native
  class MDCSwitch protected ()
    extends typingsSlinky.materialSwitch.mod.MDCSwitch {
    def this(root: Element, foundation: js.UndefOr[scala.Nothing], args: js.Any*) = this()
    def this(
      root: Element,
      foundation: typingsSlinky.materialSwitch.foundationMod.MDCSwitchFoundation,
      args: js.Any*
    ) = this()
  }
  /* static members */
  object MDCSwitch {
    
    @JSImport("material-components-web", "switchControl.MDCSwitch.attachTo")
    @js.native
    def attachTo(root: HTMLElement): typingsSlinky.materialSwitch.componentMod.MDCSwitch = js.native
  }
  
  @JSImport("material-components-web", "switchControl.MDCSwitchFoundation")
  @js.native
  class MDCSwitchFoundation ()
    extends typingsSlinky.materialSwitch.mod.MDCSwitchFoundation {
    def this(adapter: PartialMDCSwitchAdapter) = this()
  }
  
  /** CSS classes used by the switch. */
  object cssClasses {
    
    @JSImport("material-components-web", "switchControl.cssClasses")
    @js.native
    val ^ : js.Any = js.native
    
    /** Class used for a switch that is in the "checked" (on) position. */
    @JSImport("material-components-web", "switchControl.cssClasses.CHECKED")
    @js.native
    def CHECKED: String = js.native
    @scala.inline
    def CHECKED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CHECKED")(x.asInstanceOf[js.Any])
    
    /** Class used for a switch that is disabled. */
    @JSImport("material-components-web", "switchControl.cssClasses.DISABLED")
    @js.native
    def DISABLED: String = js.native
    @scala.inline
    def DISABLED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DISABLED")(x.asInstanceOf[js.Any])
  }
  
  /** String constants used by the switch. */
  object strings {
    
    @JSImport("material-components-web", "switchControl.strings")
    @js.native
    val ^ : js.Any = js.native
    
    /** Aria attribute for checked or unchecked state of switch */
    @JSImport("material-components-web", "switchControl.strings.ARIA_CHECKED_ATTR")
    @js.native
    def ARIA_CHECKED_ATTR: String = js.native
    @scala.inline
    def ARIA_CHECKED_ATTR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ARIA_CHECKED_ATTR")(x.asInstanceOf[js.Any])
    
    /** A CSS selector used to locate the native HTML control for the switch.  */
    @JSImport("material-components-web", "switchControl.strings.NATIVE_CONTROL_SELECTOR")
    @js.native
    def NATIVE_CONTROL_SELECTOR: String = js.native
    @scala.inline
    def NATIVE_CONTROL_SELECTOR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NATIVE_CONTROL_SELECTOR")(x.asInstanceOf[js.Any])
    
    /** A CSS selector used to locate the ripple surface element for the switch. */
    @JSImport("material-components-web", "switchControl.strings.RIPPLE_SURFACE_SELECTOR")
    @js.native
    def RIPPLE_SURFACE_SELECTOR: String = js.native
    @scala.inline
    def RIPPLE_SURFACE_SELECTOR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RIPPLE_SURFACE_SELECTOR")(x.asInstanceOf[js.Any])
  }
}
