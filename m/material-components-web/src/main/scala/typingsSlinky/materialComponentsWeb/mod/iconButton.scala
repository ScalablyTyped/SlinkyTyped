package typingsSlinky.materialComponentsWeb.mod

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.materialIconButton.anon.PartialMDCIconButtonToggl
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object iconButton {
  
  @JSImport("material-components-web", "iconButton.MDCIconButtonToggle")
  @js.native
  class MDCIconButtonToggle protected ()
    extends typingsSlinky.materialIconButton.mod.MDCIconButtonToggle {
    def this(root: Element, foundation: js.UndefOr[scala.Nothing], args: js.Any*) = this()
    def this(
      root: Element,
      foundation: typingsSlinky.materialIconButton.foundationMod.MDCIconButtonToggleFoundation,
      args: js.Any*
    ) = this()
  }
  /* static members */
  object MDCIconButtonToggle {
    
    @JSImport("material-components-web", "iconButton.MDCIconButtonToggle.attachTo")
    @js.native
    def attachTo(root: HTMLElement): typingsSlinky.materialIconButton.componentMod.MDCIconButtonToggle = js.native
  }
  
  @JSImport("material-components-web", "iconButton.MDCIconButtonToggleFoundation")
  @js.native
  class MDCIconButtonToggleFoundation ()
    extends typingsSlinky.materialIconButton.mod.MDCIconButtonToggleFoundation {
    def this(adapter: PartialMDCIconButtonToggl) = this()
  }
  
  object cssClasses {
    
    @JSImport("material-components-web", "iconButton.cssClasses")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("material-components-web", "iconButton.cssClasses.ICON_BUTTON_ON")
    @js.native
    def ICON_BUTTON_ON: String = js.native
    @scala.inline
    def ICON_BUTTON_ON_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ICON_BUTTON_ON")(x.asInstanceOf[js.Any])
    
    @JSImport("material-components-web", "iconButton.cssClasses.ROOT")
    @js.native
    def ROOT: String = js.native
    @scala.inline
    def ROOT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ROOT")(x.asInstanceOf[js.Any])
  }
  
  object strings {
    
    @JSImport("material-components-web", "iconButton.strings")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("material-components-web", "iconButton.strings.ARIA_LABEL")
    @js.native
    def ARIA_LABEL: String = js.native
    @scala.inline
    def ARIA_LABEL_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ARIA_LABEL")(x.asInstanceOf[js.Any])
    
    @JSImport("material-components-web", "iconButton.strings.ARIA_PRESSED")
    @js.native
    def ARIA_PRESSED: String = js.native
    @scala.inline
    def ARIA_PRESSED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ARIA_PRESSED")(x.asInstanceOf[js.Any])
    
    @JSImport("material-components-web", "iconButton.strings.CHANGE_EVENT")
    @js.native
    def CHANGE_EVENT: String = js.native
    @scala.inline
    def CHANGE_EVENT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CHANGE_EVENT")(x.asInstanceOf[js.Any])
    
    @JSImport("material-components-web", "iconButton.strings.DATA_ARIA_LABEL_OFF")
    @js.native
    def DATA_ARIA_LABEL_OFF: String = js.native
    @scala.inline
    def DATA_ARIA_LABEL_OFF_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DATA_ARIA_LABEL_OFF")(x.asInstanceOf[js.Any])
    
    @JSImport("material-components-web", "iconButton.strings.DATA_ARIA_LABEL_ON")
    @js.native
    def DATA_ARIA_LABEL_ON: String = js.native
    @scala.inline
    def DATA_ARIA_LABEL_ON_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DATA_ARIA_LABEL_ON")(x.asInstanceOf[js.Any])
  }
}
