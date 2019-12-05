package typingsSlinky.bell.bellMod

import typingsSlinky.bell.bellStrings.`try`
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
    def strategy(name: String, scheme: typingsSlinky.bell.bellStrings.bell, mode: `try`, options: BellOptions): Unit = js.native
    def strategy(name: String, scheme: typingsSlinky.bell.bellStrings.bell, mode: optional, options: BellOptions): Unit = js.native
    def strategy(name: String, scheme: typingsSlinky.bell.bellStrings.bell, mode: required, options: BellOptions): Unit = js.native
    @JSName("strategy")
    def strategy_bell(name: String, scheme: typingsSlinky.bell.bellStrings.bell, mode: Boolean, options: BellOptions): Unit = js.native
    @JSName("strategy")
    def strategy_bell(name: String, scheme: typingsSlinky.bell.bellStrings.bell, options: BellOptions): Unit = js.native
  }
  
}

