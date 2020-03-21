package typingsSlinky.materialSelect

import typingsSlinky.materialBase.mod.MDCFoundation
import typingsSlinky.materialSelect.adapterMod.MDCSelectAdapter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/select/foundation", JSImport.Namespace)
@js.native
object foundationMod extends js.Object {
  @js.native
  trait MDCSelectFoundation extends MDCFoundation[MDCSelectAdapter] {
    def setDisabled(disabled: Boolean): Unit = js.native
    def setSelectedIndex(index: Double): Unit = js.native
    def setValue(value: String): Unit = js.native
  }
  
  @js.native
  class default () extends MDCSelectFoundation
  
  /* static members */
  @js.native
  object default extends js.Object {
    val cssClasses: typingsSlinky.materialSelect.constantsMod.cssClasses = js.native
    val defaultAdapter: MDCSelectAdapter = js.native
    val strings: typingsSlinky.materialSelect.constantsMod.strings = js.native
  }
  
}

