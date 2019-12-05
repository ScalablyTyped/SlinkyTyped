package typingsSlinky.atMaterialIconDashToggle

import org.scalajs.dom.raw.Element
import typingsSlinky.atMaterialIconDashToggle.adapterMod.MDCIconToggleAdapter
import typingsSlinky.atMaterialIconDashToggle.atMaterialIconDashToggleMod.MDCIconToggle
import typingsSlinky.atMaterialIconDashToggle.foundationMod.default
import typingsSlinky.atMaterialRipple.atMaterialRippleMod.MDCRipple
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/icon-toggle", JSImport.Namespace)
@js.native
object atMaterialIconDashToggleMod extends js.Object {
  @js.native
  class MDCIconToggle ()
    extends typingsSlinky.atMaterialBase.componentMod.default[MDCIconToggleAdapter, default] {
    var disabled: Boolean = js.native
    var on: Boolean = js.native
    val ripple: MDCRipple = js.native
    def refreshToggleData(): Unit = js.native
  }
  
  @js.native
  class MDCIconToggleFoundation () extends default
  
  /* static members */
  @js.native
  object MDCIconToggle extends js.Object {
    def attachTo(root: Element): MDCIconToggle = js.native
  }
  
  /* static members */
  @js.native
  object MDCIconToggleFoundation extends js.Object {
    val cssClasses: typingsSlinky.atMaterialIconDashToggle.constantsMod.cssClasses = js.native
    val defaultAdapter: MDCIconToggleAdapter = js.native
    val strings: typingsSlinky.atMaterialIconDashToggle.constantsMod.strings = js.native
  }
  
}

