package typingsSlinky.expressValidator

import typingsSlinky.expressValidator.contextItemMod.ContextItem
import typingsSlinky.expressValidator.contextMod.Context
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("express-validator/src/context-items/bail", JSImport.Namespace)
@js.native
object bailMod extends js.Object {
  @js.native
  class Bail () extends ContextItem {
    def run(context: Context): js.Promise[Unit] = js.native
  }
  
}

