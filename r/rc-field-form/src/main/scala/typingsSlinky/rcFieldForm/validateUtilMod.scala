package typingsSlinky.rcFieldForm

import typingsSlinky.rcFieldForm.interfaceMod.InternalNamePath
import typingsSlinky.rcFieldForm.interfaceMod.RuleObject
import typingsSlinky.rcFieldForm.interfaceMod.StoreValue
import typingsSlinky.rcFieldForm.interfaceMod.ValidateOptions
import typingsSlinky.rcFieldForm.rcFieldFormStrings.parallel
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rc-field-form/es/utils/validateUtil", JSImport.Namespace)
@js.native
object validateUtilMod extends js.Object {
  
  def validateRules(
    namePath: InternalNamePath,
    value: StoreValue,
    rules: js.Array[RuleObject],
    options: ValidateOptions,
    validateFirst: Boolean
  ): js.Promise[js.Array[String]] = js.native
  def validateRules(
    namePath: InternalNamePath,
    value: StoreValue,
    rules: js.Array[RuleObject],
    options: ValidateOptions,
    validateFirst: Boolean,
    messageVariables: Record[String, String]
  ): js.Promise[js.Array[String]] = js.native
  @JSName("validateRules")
  def validateRules_parallel(
    namePath: InternalNamePath,
    value: StoreValue,
    rules: js.Array[RuleObject],
    options: ValidateOptions,
    validateFirst: parallel
  ): js.Promise[js.Array[String]] = js.native
  @JSName("validateRules")
  def validateRules_parallel(
    namePath: InternalNamePath,
    value: StoreValue,
    rules: js.Array[RuleObject],
    options: ValidateOptions,
    validateFirst: parallel,
    messageVariables: Record[String, String]
  ): js.Promise[js.Array[String]] = js.native
}
