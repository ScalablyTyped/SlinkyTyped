package typingsSlinky.materialRadio

import typingsSlinky.materialBase.foundationMod.MDCFoundation
import typingsSlinky.materialRadio.adapterMod.MDCRadioAdapter
import typingsSlinky.materialRadio.anon.DISABLED
import typingsSlinky.materialRadio.anon.NATIVECONTROLSELECTOR
import typingsSlinky.materialRadio.anon.PartialMDCRadioAdapter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/radio/foundation", JSImport.Namespace)
@js.native
object foundationMod extends js.Object {
  @js.native
  class MDCRadioFoundation () extends MDCFoundation[MDCRadioAdapter] {
    def this(adapter: PartialMDCRadioAdapter) = this()
    def setDisabled(disabled: Boolean): Unit = js.native
  }
  
  @js.native
  class default () extends MDCRadioFoundation {
    def this(adapter: PartialMDCRadioAdapter) = this()
  }
  
  /* static members */
  @js.native
  object MDCRadioFoundation extends js.Object {
    def cssClasses: DISABLED = js.native
    def defaultAdapter: MDCRadioAdapter = js.native
    def strings: NATIVECONTROLSELECTOR = js.native
  }
  
  /* static members */
  @js.native
  object default extends js.Object {
    def cssClasses: DISABLED = js.native
    def defaultAdapter: MDCRadioAdapter = js.native
    def strings: NATIVECONTROLSELECTOR = js.native
  }
  
}

