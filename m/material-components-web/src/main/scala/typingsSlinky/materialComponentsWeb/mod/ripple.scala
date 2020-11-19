package typingsSlinky.materialComponentsWeb.mod

import org.scalajs.dom.raw.ClientRect
import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.Window
import typingsSlinky.materialRipple.adapterMod.MDCRippleAdapter
import typingsSlinky.materialRipple.anon.BGFOCUSED
import typingsSlinky.materialRipple.anon.DEACTIVATIONTIMEOUTMS
import typingsSlinky.materialRipple.anon.PartialMDCRippleAdapter
import typingsSlinky.materialRipple.anon.VARFGSCALE
import typingsSlinky.materialRipple.typesMod.MDCRippleAttachOpts
import typingsSlinky.materialRipple.typesMod.MDCRippleCapableSurface
import typingsSlinky.materialRipple.typesMod.MDCRipplePoint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("material-components-web", "ripple")
@js.native
object ripple extends js.Object {
  
  @js.native
  class MDCRipple ()
    extends typingsSlinky.materialRipple.mod.MDCRipple
  /* static members */
  @js.native
  object MDCRipple extends js.Object {
    
    def attachTo(root: Element): typingsSlinky.materialRipple.componentMod.MDCRipple = js.native
    def attachTo(root: Element, opts: MDCRippleAttachOpts): typingsSlinky.materialRipple.componentMod.MDCRipple = js.native
    
    def createAdapter(instance: MDCRippleCapableSurface): MDCRippleAdapter = js.native
  }
  
  @js.native
  class MDCRippleFoundation ()
    extends typingsSlinky.materialRipple.mod.MDCRippleFoundation {
    def this(adapter: PartialMDCRippleAdapter) = this()
  }
  /* static members */
  @js.native
  object MDCRippleFoundation extends js.Object {
    
    def cssClasses: BGFOCUSED = js.native
    
    def defaultAdapter: MDCRippleAdapter = js.native
    
    def numbers: DEACTIVATIONTIMEOUTMS = js.native
    
    def strings: VARFGSCALE = js.native
  }
  
  @js.native
  object cssClasses extends js.Object {
    
    var BG_FOCUSED: String = js.native
    
    var FG_ACTIVATION: String = js.native
    
    var FG_DEACTIVATION: String = js.native
    
    var ROOT: String = js.native
    
    var UNBOUNDED: String = js.native
  }
  
  @js.native
  object numbers extends js.Object {
    
    var DEACTIVATION_TIMEOUT_MS: Double = js.native
    
    var FG_DEACTIVATION_MS: Double = js.native
    
    var INITIAL_ORIGIN_SCALE: Double = js.native
    
    var PADDING: Double = js.native
    
    var TAP_DELAY_MS: Double = js.native
  }
  
  @js.native
  object strings extends js.Object {
    
    var VAR_FG_SCALE: String = js.native
    
    var VAR_FG_SIZE: String = js.native
    
    var VAR_FG_TRANSLATE_END: String = js.native
    
    var VAR_FG_TRANSLATE_START: String = js.native
    
    var VAR_LEFT: String = js.native
    
    var VAR_TOP: String = js.native
  }
  
  @js.native
  object util extends js.Object {
    
    def getNormalizedEventCoords(evt: js.UndefOr[scala.Nothing], pageOffset: MDCRipplePoint, clientRect: ClientRect): MDCRipplePoint = js.native
    def getNormalizedEventCoords(evt: Event, pageOffset: MDCRipplePoint, clientRect: ClientRect): MDCRipplePoint = js.native
    
    def supportsCssVariables(windowObj: Window): Boolean = js.native
    def supportsCssVariables(windowObj: Window, forceRefresh: Boolean): Boolean = js.native
  }
}
