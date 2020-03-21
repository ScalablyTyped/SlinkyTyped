package typingsSlinky.devextreme.mod.DevExpress.ui

import typingsSlinky.devextreme.devextremeStrings.EqualssignEqualssign
import typingsSlinky.devextreme.devextremeStrings.EqualssignEqualssignEqualssign
import typingsSlinky.devextreme.devextremeStrings.ExclamationmarkEqualssign
import typingsSlinky.devextreme.devextremeStrings.ExclamationmarkEqualssignEqualssign
import typingsSlinky.devextreme.devextremeStrings.Greaterthansign
import typingsSlinky.devextreme.devextremeStrings.GreaterthansignEqualssign
import typingsSlinky.devextreme.devextremeStrings.Lessthansign
import typingsSlinky.devextreme.devextremeStrings.LessthansignEqualssign
import typingsSlinky.devextreme.devextremeStrings.async
import typingsSlinky.devextreme.devextremeStrings.compare
import typingsSlinky.devextreme.devextremeStrings.custom
import typingsSlinky.devextreme.devextremeStrings.email
import typingsSlinky.devextreme.devextremeStrings.numeric
import typingsSlinky.devextreme.devextremeStrings.pattern
import typingsSlinky.devextreme.devextremeStrings.range
import typingsSlinky.devextreme.devextremeStrings.required
import typingsSlinky.devextreme.devextremeStrings.stringLength
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompareRule extends js.Object {
  /** Specifies the function whose return value is used for comparison with the validated value. */
  var comparisonTarget: js.UndefOr[js.Function0[_]] = js.undefined
  /** Specifies the operator to be used for comparing the validated value with the target. */
  var comparisonType: js.UndefOr[
    ExclamationmarkEqualssign | ExclamationmarkEqualssignEqualssign | Lessthansign | LessthansignEqualssign | EqualssignEqualssign | EqualssignEqualssignEqualssign | Greaterthansign | GreaterthansignEqualssign
  ] = js.undefined
  /** If set to true, empty values are valid. */
  var ignoreEmptyValue: js.UndefOr[Boolean] = js.undefined
  /** Specifies the message that is shown if the rule is broken. */
  var message: js.UndefOr[String] = js.undefined
  /** Indicates whether or not the rule should be always checked for the target value or only when the target value changes. */
  var reevaluate: js.UndefOr[Boolean] = js.undefined
  /** Specifies the rule type. Set it to "compare" to use the CompareRule. */
  var `type`: js.UndefOr[
    required | numeric | range | stringLength | custom | compare | pattern | email | async
  ] = js.undefined
}

object CompareRule {
  @scala.inline
  def apply(
    comparisonTarget: () => _ = null,
    comparisonType: ExclamationmarkEqualssign | ExclamationmarkEqualssignEqualssign | Lessthansign | LessthansignEqualssign | EqualssignEqualssign | EqualssignEqualssignEqualssign | Greaterthansign | GreaterthansignEqualssign = null,
    ignoreEmptyValue: js.UndefOr[Boolean] = js.undefined,
    message: String = null,
    reevaluate: js.UndefOr[Boolean] = js.undefined,
    `type`: required | numeric | range | stringLength | custom | compare | pattern | email | async = null
  ): CompareRule = {
    val __obj = js.Dynamic.literal()
    if (comparisonTarget != null) __obj.updateDynamic("comparisonTarget")(js.Any.fromFunction0(comparisonTarget))
    if (comparisonType != null) __obj.updateDynamic("comparisonType")(comparisonType.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreEmptyValue)) __obj.updateDynamic("ignoreEmptyValue")(ignoreEmptyValue.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (!js.isUndefined(reevaluate)) __obj.updateDynamic("reevaluate")(reevaluate.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompareRule]
  }
}

