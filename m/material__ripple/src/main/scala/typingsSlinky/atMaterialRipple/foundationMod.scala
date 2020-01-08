package typingsSlinky.atMaterialRipple

import org.scalajs.dom.raw.Event
import typingsSlinky.atMaterialRipple.adapterMod.MDCRippleAdapter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/ripple/foundation", JSImport.Namespace)
@js.native
object foundationMod extends js.Object {
  @js.native
  trait MDCRippleFoundation
    extends typingsSlinky.atMaterialBase.foundationMod.default[MDCRippleAdapter] {
    def activate(): Unit = js.native
    def activate(event: Event): Unit = js.native
    def deactivate(): Unit = js.native
    def deactivate(event: Event): Unit = js.native
    def layout(): Unit = js.native
    def setUnbounded(unbounded: Boolean): Unit = js.native
  }
  
  @js.native
  class default () extends MDCRippleFoundation
  
  /* static members */
  @js.native
  object default extends js.Object {
    val cssClasses: typingsSlinky.atMaterialRipple.constantsMod.cssClasses = js.native
    val defaultAdapter: MDCRippleAdapter = js.native
    val numbers: typingsSlinky.atMaterialRipple.constantsMod.numbers = js.native
    val strings: typingsSlinky.atMaterialRipple.constantsMod.strings = js.native
  }
  
}

