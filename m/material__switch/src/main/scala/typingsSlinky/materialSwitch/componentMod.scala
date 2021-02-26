package typingsSlinky.materialSwitch

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.materialBase.componentMod.MDCComponent
import typingsSlinky.materialRipple.componentMod.MDCRipple
import typingsSlinky.materialSwitch.foundationMod.MDCSwitchFoundation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentMod {
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typingsSlinky.materialRipple.typesMod.MDCRippleCapableSurface because var conflicts: root. Inlined disabled, unbounded */ @JSImport("@material/switch/component", "MDCSwitch")
  @js.native
  class MDCSwitch protected () extends MDCComponent[MDCSwitchFoundation] {
    def this(root: Element, foundation: js.UndefOr[scala.Nothing], args: js.Any*) = this()
    def this(root: Element, foundation: MDCSwitchFoundation, args: js.Any*) = this()
    
    def checked: Boolean = js.native
    def checked_=(checked: Boolean): Unit = js.native
    
    def disabled: Boolean = js.native
    def disabled_=(disabled: Boolean): Unit = js.native
    @JSName("disabled")
    var disabled_FMDCSwitch: js.UndefOr[Boolean] = js.native
    
    def ripple: MDCRipple = js.native
    
    var unbounded: js.UndefOr[Boolean] = js.native
  }
  /* static members */
  object MDCSwitch {
    
    @JSImport("@material/switch/component", "MDCSwitch.attachTo")
    @js.native
    def attachTo(root: HTMLElement): MDCSwitch = js.native
  }
}
