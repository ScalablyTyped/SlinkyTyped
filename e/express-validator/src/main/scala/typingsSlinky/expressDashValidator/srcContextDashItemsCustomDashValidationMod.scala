package typingsSlinky.expressDashValidator

import typingsSlinky.expressDashValidator.srcBaseMod.CustomValidator
import typingsSlinky.expressDashValidator.srcBaseMod.Meta
import typingsSlinky.expressDashValidator.srcContextDashItemsContextDashItemMod.ContextItem
import typingsSlinky.expressDashValidator.srcContextMod.Context
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("express-validator/src/context-items/custom-validation", JSImport.Namespace)
@js.native
object srcContextDashItemsCustomDashValidationMod extends js.Object {
  @js.native
  class CustomValidation protected () extends ContextItem {
    def this(validator: CustomValidator, negated: Boolean) = this()
    var message: js.Any = js.native
    val negated: js.Any = js.native
    val validator: js.Any = js.native
    /* CompleteClass */
    override def run(context: Context, value: js.Any, meta: Meta): js.Promise[Unit] = js.native
  }
  
}

