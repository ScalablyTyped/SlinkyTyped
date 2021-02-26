package typingsSlinky.materialTopAppBar

import typingsSlinky.materialTopAppBar.anon.PartialMDCTopAppBarAdapte
import typingsSlinky.materialTopAppBar.materialTopAppBarMod.MDCTopAppBarBaseFoundation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object shortFoundationMod {
  
  @JSImport("@material/top-app-bar/short/foundation", JSImport.Default)
  @js.native
  class default () extends MDCShortTopAppBarFoundation {
    def this(adapter: PartialMDCTopAppBarAdapte) = this()
  }
  
  @JSImport("@material/top-app-bar/short/foundation", "MDCShortTopAppBarFoundation")
  @js.native
  class MDCShortTopAppBarFoundation () extends MDCTopAppBarBaseFoundation {
    def this(adapter: PartialMDCTopAppBarAdapte) = this()
    
    def getAlwaysCollapsed(): Boolean = js.native
    
    def isCollapsed: Boolean = js.native
    
    /**
      * Set if the short top app bar should always be collapsed.
      *
      * @param value When `true`, bar will always be collapsed. When `false`, bar may collapse or expand based on scroll.
      */
    def setAlwaysCollapsed(value: Boolean): Unit = js.native
  }
}
