package typingsSlinky.materialBanner

import org.scalajs.dom.raw.Element
import typingsSlinky.materialBanner.adapterMod.MDCBannerAdapter
import typingsSlinky.materialBanner.anon.PartialMDCBannerAdapter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@material/banner", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  @js.native
  object CloseReason extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.materialBanner.constantsMod.CloseReason with Double] = js.native
    
    /* 0 */ val PRIMARY: typingsSlinky.materialBanner.constantsMod.CloseReason.PRIMARY with Double = js.native
    
    /* 1 */ val SECONDARY: typingsSlinky.materialBanner.constantsMod.CloseReason.SECONDARY with Double = js.native
    
    /* 2 */ val UNSPECIFIED: typingsSlinky.materialBanner.constantsMod.CloseReason.UNSPECIFIED with Double = js.native
  }
  
  @js.native
  class MDCBanner ()
    extends typingsSlinky.materialBanner.componentMod.MDCBanner
  /* static members */
  @js.native
  object MDCBanner extends js.Object {
    
    def attachTo(root: Element): typingsSlinky.materialBanner.componentMod.MDCBanner = js.native
  }
  
  @js.native
  class MDCBannerFoundation ()
    extends typingsSlinky.materialBanner.foundationMod.MDCBannerFoundation {
    def this(adapter: PartialMDCBannerAdapter) = this()
  }
  /* static members */
  @js.native
  object MDCBannerFoundation extends js.Object {
    
    def defaultAdapter: MDCBannerAdapter = js.native
  }
  
  @js.native
  object cssClasses extends js.Object {
    
    var CLOSING: String = js.native
    
    var OPEN: String = js.native
    
    var OPENING: String = js.native
  }
  
  @js.native
  object events extends js.Object {
    
    var CLOSED: String = js.native
    
    var CLOSING: String = js.native
    
    var OPENED: String = js.native
    
    var OPENING: String = js.native
  }
  
  @js.native
  object numbers extends js.Object {
    
    var BANNER_ANIMATION_CLOSE_TIME_MS: Double = js.native
    
    var BANNER_ANIMATION_OPEN_TIME_MS: Double = js.native
  }
  
  @js.native
  object selectors extends js.Object {
    
    var CONTENT: String = js.native
    
    var PRIMARY_ACTION: String = js.native
    
    var SECONDARY_ACTION: String = js.native
    
    var TEXT: String = js.native
  }
}
