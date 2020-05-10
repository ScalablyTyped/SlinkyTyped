package typingsSlinky.powerappsComponentFramework.ComponentFramework.PropertyHelper.DataSetApi

import typingsSlinky.powerappsComponentFramework.ComponentFramework.PropertyHelper.DataSetApi.Types.ConditionOperator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
			 * An expression used to represent a filter condition.
			 */
@js.native
trait ConditionExpression extends js.Object {
  /**
  				 * The name of the data-set column to apply the filter on.
  				 */
  var attributeName: String = js.native
  /**
  				 * The value evaluated by the condition
  				 */
  var conditionOperator: ConditionOperator = js.native
  /**
  				 * Entity alias name so filtering can be used on linked entities.
  				 */
  var entityAliasName: js.UndefOr[String] = js.native
  /**
  				 * The value evaluated by the condition.
  				 */
  var value: String | js.Array[String] = js.native
}

object ConditionExpression {
  @scala.inline
  def apply(attributeName: String, conditionOperator: ConditionOperator, value: String | js.Array[String]): ConditionExpression = {
    val __obj = js.Dynamic.literal(attributeName = attributeName.asInstanceOf[js.Any], conditionOperator = conditionOperator.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConditionExpression]
  }
  @scala.inline
  implicit class ConditionExpressionOps[Self <: ConditionExpression] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttributeName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributeName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConditionOperator(value: ConditionOperator): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conditionOperator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEntityAliasName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entityAliasName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEntityAliasName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entityAliasName")(js.undefined)
        ret
    }
  }
  
}

