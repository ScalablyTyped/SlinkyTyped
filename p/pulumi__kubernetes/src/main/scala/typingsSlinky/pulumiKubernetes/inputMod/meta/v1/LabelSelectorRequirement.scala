package typingsSlinky.pulumiKubernetes.inputMod.meta.v1

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A label selector requirement is a selector that contains values, a key, and an operator that
  * relates the key and values.
  */
@js.native
trait LabelSelectorRequirement extends js.Object {
  /**
    * key is the label key that the selector applies to.
    */
  var key: Input[String] = js.native
  /**
    * operator represents a key's relationship to a set of values. Valid operators are In, NotIn,
    * Exists and DoesNotExist.
    */
  var operator: Input[String] = js.native
  /**
    * values is an array of string values. If the operator is In or NotIn, the values array must
    * be non-empty. If the operator is Exists or DoesNotExist, the values array must be empty.
    * This array is replaced during a strategic merge patch.
    */
  var values: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
}

object LabelSelectorRequirement {
  @scala.inline
  def apply(key: Input[String], operator: Input[String]): LabelSelectorRequirement = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any])
    __obj.asInstanceOf[LabelSelectorRequirement]
  }
  @scala.inline
  implicit class LabelSelectorRequirementOps[Self <: LabelSelectorRequirement] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKey(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOperator(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValues(value: Input[js.Array[Input[String]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("values")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValues: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("values")(js.undefined)
        ret
    }
  }
  
}

