package typingsSlinky.bell.bellMod

import typingsSlinky.bell.bellStrings.`try`
import typingsSlinky.bell.bellStrings.bell
import typingsSlinky.bell.bellStrings.optional
import typingsSlinky.bell.bellStrings.required
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* augmented module */
@JSImport("hapi", JSImport.Namespace)
@js.native
object hapiMod extends js.Object {
  @js.native
  trait ServerAuth extends js.Object {
    def strategy(name: String, scheme: bell, mode: `try`, options: BellOptions): Unit = js.native
    def strategy(name: String, scheme: bell, mode: optional, options: BellOptions): Unit = js.native
    def strategy(name: String, scheme: bell, mode: required, options: BellOptions): Unit = js.native
    @JSName("strategy")
    def strategy_bell(name: String, scheme: bell, mode: Boolean, options: BellOptions): Unit = js.native
    @JSName("strategy")
    def strategy_bell(name: String, scheme: bell, options: BellOptions): Unit = js.native
  }
  
}

