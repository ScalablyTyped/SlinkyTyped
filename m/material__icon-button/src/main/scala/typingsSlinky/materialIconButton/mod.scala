package typingsSlinky.materialIconButton

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.materialIconButton.anon.PartialMDCIconButtonToggl
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@material/icon-button", "MDCIconButtonToggle")
  @js.native
  class MDCIconButtonToggle protected ()
    extends typingsSlinky.materialIconButton.componentMod.MDCIconButtonToggle {
    def this(root: Element, foundation: js.UndefOr[scala.Nothing], args: js.Any*) = this()
    def this(
      root: Element,
      foundation: typingsSlinky.materialIconButton.foundationMod.MDCIconButtonToggleFoundation,
      args: js.Any*
    ) = this()
  }
  /* static members */
  object MDCIconButtonToggle {
    
    @JSImport("@material/icon-button", "MDCIconButtonToggle.attachTo")
    @js.native
    def attachTo(root: HTMLElement): typingsSlinky.materialIconButton.componentMod.MDCIconButtonToggle = js.native
  }
  
  @JSImport("@material/icon-button", "MDCIconButtonToggleFoundation")
  @js.native
  class MDCIconButtonToggleFoundation ()
    extends typingsSlinky.materialIconButton.foundationMod.MDCIconButtonToggleFoundation {
    def this(adapter: PartialMDCIconButtonToggl) = this()
  }
  
  object cssClasses {
    
    @JSImport("@material/icon-button", "cssClasses")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@material/icon-button", "cssClasses.ICON_BUTTON_ON")
    @js.native
    def ICON_BUTTON_ON: String = js.native
    @scala.inline
    def ICON_BUTTON_ON_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ICON_BUTTON_ON")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/icon-button", "cssClasses.ROOT")
    @js.native
    def ROOT: String = js.native
    @scala.inline
    def ROOT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ROOT")(x.asInstanceOf[js.Any])
  }
  
  object strings {
    
    @JSImport("@material/icon-button", "strings")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@material/icon-button", "strings.ARIA_LABEL")
    @js.native
    def ARIA_LABEL: String = js.native
    @scala.inline
    def ARIA_LABEL_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ARIA_LABEL")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/icon-button", "strings.ARIA_PRESSED")
    @js.native
    def ARIA_PRESSED: String = js.native
    @scala.inline
    def ARIA_PRESSED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ARIA_PRESSED")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/icon-button", "strings.CHANGE_EVENT")
    @js.native
    def CHANGE_EVENT: String = js.native
    @scala.inline
    def CHANGE_EVENT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CHANGE_EVENT")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/icon-button", "strings.DATA_ARIA_LABEL_OFF")
    @js.native
    def DATA_ARIA_LABEL_OFF: String = js.native
    @scala.inline
    def DATA_ARIA_LABEL_OFF_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DATA_ARIA_LABEL_OFF")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/icon-button", "strings.DATA_ARIA_LABEL_ON")
    @js.native
    def DATA_ARIA_LABEL_ON: String = js.native
    @scala.inline
    def DATA_ARIA_LABEL_ON_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DATA_ARIA_LABEL_ON")(x.asInstanceOf[js.Any])
  }
}
