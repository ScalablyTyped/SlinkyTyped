package typingsSlinky.rcFieldForm

import typingsSlinky.rcFieldForm.interfaceMod.InternalNamePath
import typingsSlinky.rcFieldForm.interfaceMod.RuleObject
import typingsSlinky.rcFieldForm.interfaceMod.StoreValue
import typingsSlinky.rcFieldForm.interfaceMod.ValidateOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rc-field-form/lib/utils/validateUtil", JSImport.Namespace)
@js.native
object validateUtilMod extends js.Object {
  def validateRules(
    namePath: InternalNamePath,
    value: StoreValue,
    rules: js.Array[RuleObject],
    options: ValidateOptions
  ): js.Promise[js.Array[String]] = js.native
  def validateRules(
    namePath: InternalNamePath,
    value: StoreValue,
    rules: js.Array[RuleObject],
    options: ValidateOptions,
    validateFirst: Boolean
  ): js.Promise[js.Array[String]] = js.native
}

