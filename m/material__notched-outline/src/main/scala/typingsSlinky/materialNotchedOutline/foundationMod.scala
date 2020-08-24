package typingsSlinky.materialNotchedOutline

import typingsSlinky.materialBase.foundationMod.MDCFoundation
import typingsSlinky.materialNotchedOutline.adapterMod.MDCNotchedOutlineAdapter
import typingsSlinky.materialNotchedOutline.anon.NOLABEL
import typingsSlinky.materialNotchedOutline.anon.NOTCHELEMENTPADDING
import typingsSlinky.materialNotchedOutline.anon.NOTCHELEMENTSELECTOR
import typingsSlinky.materialNotchedOutline.anon.PartialMDCNotchedOutlineA
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/notched-outline/foundation", JSImport.Namespace)
@js.native
object foundationMod extends js.Object {
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
  
  @js.native
  class default () extends MDCNotchedOutlineFoundation {
    def this(adapter: PartialMDCNotchedOutlineA) = this()
  }
  
  /* static members */
  @js.native
  object MDCNotchedOutlineFoundation extends js.Object {
    def cssClasses: NOLABEL = js.native
    /**
      * See {@link MDCNotchedOutlineAdapter} for typing information on parameters and return types.
      */
    def defaultAdapter: MDCNotchedOutlineAdapter = js.native
    def numbers: NOTCHELEMENTPADDING = js.native
    def strings: NOTCHELEMENTSELECTOR = js.native
  }
  
  /* static members */
  @js.native
  object default extends js.Object {
    def cssClasses: NOLABEL = js.native
    /**
      * See {@link MDCNotchedOutlineAdapter} for typing information on parameters and return types.
      */
    def defaultAdapter: MDCNotchedOutlineAdapter = js.native
    def numbers: NOTCHELEMENTPADDING = js.native
    def strings: NOTCHELEMENTSELECTOR = js.native
  }
  
}

