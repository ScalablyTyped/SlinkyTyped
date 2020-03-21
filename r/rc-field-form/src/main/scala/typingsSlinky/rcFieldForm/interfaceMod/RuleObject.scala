package typingsSlinky.rcFieldForm.interfaceMod

import slinky.core.facade.ReactElement
import typingsSlinky.rcFieldForm.rcFieldFormStrings.array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.rcFieldForm.interfaceMod.BaseRule
  - typingsSlinky.rcFieldForm.interfaceMod.ArrayRule
*/
trait RuleObject extends js.Object

object RuleObject {
  @scala.inline
  def BaseRule(
    enum: js.Array[StoreValue] = null,
    len: Int | Double = null,
    max: Int | Double = null,
    message: String | ReactElement = null,
    min: Int | Double = null,
    pattern: js.RegExp = null,
    required: js.UndefOr[Boolean] = js.undefined,
    transform: /* value */ StoreValue => StoreValue = null,
    `type`: RuleType = null,
    validateTrigger: String | js.Array[String] = null,
    validator: (/* rule */ RuleObject, /* value */ StoreValue, /* callback */ js.Function1[/* error */ js.UndefOr[String], Unit]) => js.Promise[Unit] | Unit = null,
    whitespace: js.UndefOr[Boolean] = js.undefined
  ): RuleObject = {
    val __obj = js.Dynamic.literal()
    if (enum != null) __obj.updateDynamic("enum")(enum.asInstanceOf[js.Any])
    if (len != null) __obj.updateDynamic("len")(len.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (pattern != null) __obj.updateDynamic("pattern")(pattern.asInstanceOf[js.Any])
    if (!js.isUndefined(required)) __obj.updateDynamic("required")(required.asInstanceOf[js.Any])
    if (transform != null) __obj.updateDynamic("transform")(js.Any.fromFunction1(transform))
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (validateTrigger != null) __obj.updateDynamic("validateTrigger")(validateTrigger.asInstanceOf[js.Any])
    if (validator != null) __obj.updateDynamic("validator")(js.Any.fromFunction3(validator))
    if (!js.isUndefined(whitespace)) __obj.updateDynamic("whitespace")(whitespace.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuleObject]
  }
  @scala.inline
  def ArrayRule(
    `type`: array,
    defaultField: RuleObject = null,
    enum: js.Array[StoreValue] = null,
    len: Int | Double = null,
    max: Int | Double = null,
    message: String | ReactElement = null,
    min: Int | Double = null,
    pattern: js.RegExp = null,
    required: js.UndefOr[Boolean] = js.undefined,
    transform: /* value */ StoreValue => StoreValue = null,
    validateTrigger: String | js.Array[String] = null,
    validator: (/* rule */ RuleObject, /* value */ StoreValue, /* callback */ js.Function1[/* error */ js.UndefOr[String], Unit]) => js.Promise[Unit] | Unit = null,
    whitespace: js.UndefOr[Boolean] = js.undefined
  ): RuleObject = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (defaultField != null) __obj.updateDynamic("defaultField")(defaultField.asInstanceOf[js.Any])
    if (enum != null) __obj.updateDynamic("enum")(enum.asInstanceOf[js.Any])
    if (len != null) __obj.updateDynamic("len")(len.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (pattern != null) __obj.updateDynamic("pattern")(pattern.asInstanceOf[js.Any])
    if (!js.isUndefined(required)) __obj.updateDynamic("required")(required.asInstanceOf[js.Any])
    if (transform != null) __obj.updateDynamic("transform")(js.Any.fromFunction1(transform))
    if (validateTrigger != null) __obj.updateDynamic("validateTrigger")(validateTrigger.asInstanceOf[js.Any])
    if (validator != null) __obj.updateDynamic("validator")(js.Any.fromFunction3(validator))
    if (!js.isUndefined(whitespace)) __obj.updateDynamic("whitespace")(whitespace.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuleObject]
  }
}

