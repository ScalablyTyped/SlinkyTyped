package typingsSlinky.atMaterialIconDashToggle

import typingsSlinky.atMaterialIconDashToggle.adapterMod.MDCIconToggleAdapter
import typingsSlinky.atMaterialIconDashToggle.foundationMod.MDCIconToggleFoundation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/icon-toggle/foundation", JSImport.Namespace)
@js.native
object foundationMod extends js.Object {
  @js.native
  trait MDCIconToggleFoundation
    extends typingsSlinky.atMaterialBase.foundationMod.default[MDCIconToggleAdapter] {
    def isDisabled(): Boolean = js.native
    def isKeyboardActivated(): Boolean = js.native
    def isOn(): Boolean = js.native
    def refreshToggleData(): Unit = js.native
    def setDisabled(isDisabled: Boolean): Unit = js.native
    def toggle(): Unit = js.native
    def toggle(isOn: Boolean): Unit = js.native
  }
  
  @js.native
  class default () extends MDCIconToggleFoundation
  
  /* static members */
  @js.native
  object default extends js.Object {
    val cssClasses: typingsSlinky.atMaterialIconDashToggle.constantsMod.cssClasses = js.native
    val defaultAdapter: MDCIconToggleAdapter = js.native
    val strings: typingsSlinky.atMaterialIconDashToggle.constantsMod.strings = js.native
  }
  
}

