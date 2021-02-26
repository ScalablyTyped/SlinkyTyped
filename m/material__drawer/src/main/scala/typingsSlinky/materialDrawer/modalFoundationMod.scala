package typingsSlinky.materialDrawer

import typingsSlinky.materialDrawer.anon.PartialMDCDrawerAdapter
import typingsSlinky.materialDrawer.foundationMod.MDCDismissibleDrawerFoundation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object modalFoundationMod {
  
  @JSImport("@material/drawer/modal/foundation", JSImport.Default)
  @js.native
  class default () extends MDCModalDrawerFoundation {
    def this(adapter: PartialMDCDrawerAdapter) = this()
  }
  
  @JSImport("@material/drawer/modal/foundation", "MDCModalDrawerFoundation")
  @js.native
  class MDCModalDrawerFoundation () extends MDCDismissibleDrawerFoundation {
    def this(adapter: PartialMDCDrawerAdapter) = this()
    
    /**
      * Handles click event on scrim.
      */
    def handleScrimClick(): Unit = js.native
  }
}
