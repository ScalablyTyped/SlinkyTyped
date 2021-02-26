package typingsSlinky.materialRipple

import org.scalajs.dom.raw.Element
import typingsSlinky.materialBase.componentMod.MDCComponent
import typingsSlinky.materialRipple.adapterMod.MDCRippleAdapter
import typingsSlinky.materialRipple.foundationMod.MDCRippleFoundation
import typingsSlinky.materialRipple.typesMod.MDCRippleAttachOpts
import typingsSlinky.materialRipple.typesMod.MDCRippleCapableSurface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentMod {
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typingsSlinky.materialRipple.typesMod.MDCRippleCapableSurface because var conflicts: root. Inlined unbounded, disabled */ @JSImport("@material/ripple/component", "MDCRipple")
  @js.native
  class MDCRipple protected () extends MDCComponent[MDCRippleFoundation] {
    def this(root: Element, foundation: js.UndefOr[scala.Nothing], args: js.Any*) = this()
    def this(root: Element, foundation: MDCRippleFoundation, args: js.Any*) = this()
    
    def activate(): Unit = js.native
    
    def deactivate(): Unit = js.native
    
    var disabled: js.UndefOr[Boolean] = js.native
    
    def layout(): Unit = js.native
    
    def unbounded: Boolean = js.native
    def unbounded_=(unbounded: Boolean): Unit = js.native
    @JSName("unbounded")
    var unbounded_FMDCRipple: js.UndefOr[Boolean] = js.native
  }
  /* static members */
  object MDCRipple {
    
    @JSImport("@material/ripple/component", "MDCRipple.attachTo")
    @js.native
    def attachTo(root: Element): MDCRipple = js.native
    @JSImport("@material/ripple/component", "MDCRipple.attachTo")
    @js.native
    def attachTo(root: Element, opts: MDCRippleAttachOpts): MDCRipple = js.native
    
    @JSImport("@material/ripple/component", "MDCRipple.createAdapter")
    @js.native
    def createAdapter(instance: MDCRippleCapableSurface): MDCRippleAdapter = js.native
  }
  
  type MDCRippleFactory = js.Function2[/* el */ Element, /* foundation */ js.UndefOr[MDCRippleFoundation], MDCRipple]
}
