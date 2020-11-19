package typingsSlinky.materialTopAppBar

import typingsSlinky.materialBase.foundationMod.MDCFoundation
import typingsSlinky.materialTopAppBar.adapterMod.MDCTopAppBarAdapter
import typingsSlinky.materialTopAppBar.anon.ACTIONITEMSELECTOR
import typingsSlinky.materialTopAppBar.anon.DEBOUNCETHROTTLERESIZETIMEMS
import typingsSlinky.materialTopAppBar.anon.FIXEDCLASS
import typingsSlinky.materialTopAppBar.anon.PartialMDCTopAppBarAdapte
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@material/top-app-bar/foundation", JSImport.Namespace)
@js.native
object materialTopAppBarMod extends js.Object {
  
  @js.native
  class MDCTopAppBarBaseFoundation () extends MDCFoundation[MDCTopAppBarAdapter] {
    def this(adapter: PartialMDCTopAppBarAdapte) = this()
    
    def handleNavigationClick(): Unit = js.native
    
    /** Other variants of TopAppBar foundation overrides this method */
    def handleTargetScroll(): Unit = js.native
    
    /** Other variants of TopAppBar foundation overrides this method */
    def handleWindowResize(): Unit = js.native
  }
  /* static members */
  @js.native
  object MDCTopAppBarBaseFoundation extends js.Object {
    
    def cssClasses: FIXEDCLASS = js.native
    
    /**
      * See {@link MDCTopAppBarAdapter} for typing information on parameters and return types.
      */
    def defaultAdapter: MDCTopAppBarAdapter = js.native
    
    def numbers: DEBOUNCETHROTTLERESIZETIMEMS = js.native
    
    def strings: ACTIONITEMSELECTOR = js.native
  }
  
  @js.native
  class default () extends MDCTopAppBarBaseFoundation {
    def this(adapter: PartialMDCTopAppBarAdapte) = this()
  }
  /* static members */
  @js.native
  object default extends js.Object {
    
    def cssClasses: FIXEDCLASS = js.native
    
    /**
      * See {@link MDCTopAppBarAdapter} for typing information on parameters and return types.
      */
    def defaultAdapter: MDCTopAppBarAdapter = js.native
    
    def numbers: DEBOUNCETHROTTLERESIZETIMEMS = js.native
    
    def strings: ACTIONITEMSELECTOR = js.native
  }
}
