package typingsSlinky.materialNotchedOutline

import typingsSlinky.materialBase.foundationMod.MDCFoundation
import typingsSlinky.materialNotchedOutline.adapterMod.MDCNotchedOutlineAdapter
import typingsSlinky.materialNotchedOutline.anon.PartialMDCNotchedOutlineA
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object foundationMod {
  
  @JSImport("@material/notched-outline/foundation", JSImport.Default)
  @js.native
  class default () extends MDCNotchedOutlineFoundation {
    def this(adapter: PartialMDCNotchedOutlineA) = this()
  }
  
  @JSImport("@material/notched-outline/foundation", "MDCNotchedOutlineFoundation")
  @js.native
  class MDCNotchedOutlineFoundation () extends MDCFoundation[MDCNotchedOutlineAdapter] {
    def this(adapter: PartialMDCNotchedOutlineA) = this()
    
    /**
      * Removes notched outline selector to close the notch in the outline.
      */
    def closeNotch(): Unit = js.native
    
    /**
      * Adds the outline notched selector and updates the notch width calculated based off of notchWidth.
      */
    def notch(notchWidth: Double): Unit = js.native
  }
}
