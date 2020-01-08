package typingsSlinky.atMaterialNotchedDashOutline

import org.scalajs.dom.raw.Element
import typingsSlinky.atMaterialNotchedDashOutline.adapterMod.MDCNotchedOutlineAdapter
import typingsSlinky.atMaterialNotchedDashOutline.foundationMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/notched-outline", JSImport.Namespace)
@js.native
object atMaterialNotchedDashOutlineMod extends js.Object {
  @js.native
  class MDCNotchedOutline ()
    extends typingsSlinky.atMaterialBase.componentMod.default[MDCNotchedOutlineAdapter, default] {
    /**
      * Updates the outline selectors to close notch and return it to idle state.
      */
    def closeNotch(): Unit = js.native
    /**
      * Updates outline selectors and SVG path to open notch.
      */
    def notch(notchWidth: Double): Unit = js.native
    def notch(notchWidth: Double, isRtl: Boolean): Unit = js.native
  }
  
  @js.native
  class MDCNotchedOutlineFoundation () extends default
  
  /* static members */
  @js.native
  object MDCNotchedOutline extends js.Object {
    def attachTo(root: Element): MDCNotchedOutline = js.native
  }
  
  /* static members */
  @js.native
  object MDCNotchedOutlineFoundation extends js.Object {
    val cssClasses: typingsSlinky.atMaterialNotchedDashOutline.constantsMod.cssClasses = js.native
    val defaultAdapter: MDCNotchedOutlineAdapter = js.native
    val strings: typingsSlinky.atMaterialNotchedDashOutline.constantsMod.strings = js.native
  }
  
}

