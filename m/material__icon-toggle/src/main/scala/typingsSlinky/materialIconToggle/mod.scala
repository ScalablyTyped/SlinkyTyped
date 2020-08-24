package typingsSlinky.materialIconToggle

import org.scalajs.dom.raw.Element
import typingsSlinky.materialBase.componentMod.default
import typingsSlinky.materialIconToggle.adapterMod.MDCIconToggleAdapter
import typingsSlinky.materialRipple.mod.MDCRipple
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/icon-toggle", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class MDCIconToggle () extends default[MDCIconToggleAdapter] {
    var disabled: Boolean = js.native
    var on: Boolean = js.native
    val ripple: MDCRipple = js.native
    def refreshToggleData(): Unit = js.native
  }
  
  @js.native
  class MDCIconToggleFoundation ()
    extends typingsSlinky.materialIconToggle.foundationMod.default
  
  /* static members */
  @js.native
  object MDCIconToggle extends js.Object {
    def attachTo(root: Element): MDCIconToggle = js.native
  }
  
  /* static members */
  @js.native
  object MDCIconToggleFoundation extends js.Object {
    val cssClasses: typingsSlinky.materialIconToggle.constantsMod.cssClasses = js.native
    val defaultAdapter: MDCIconToggleAdapter = js.native
    val strings: typingsSlinky.materialIconToggle.constantsMod.strings = js.native
  }
  
}

