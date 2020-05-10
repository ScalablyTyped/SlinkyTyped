package typingsSlinky.pulumiKubernetes.inputMod.core.v1

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The pod this Toleration is attached to tolerates any taint that matches the triple
  * <key,value,effect> using the matching operator <operator>.
  */
@js.native
trait Toleration extends js.Object {
  /**
    * Effect indicates the taint effect to match. Empty means match all taint effects. When
    * specified, allowed values are NoSchedule, PreferNoSchedule and NoExecute.
    */
  var effect: js.UndefOr[Input[String]] = js.native
  /**
    * Key is the taint key that the toleration applies to. Empty means match all taint keys. If
    * the key is empty, operator must be Exists; this combination means to match all values and
    * all keys.
    */
  var key: js.UndefOr[Input[String]] = js.native
  /**
    * Operator represents a key's relationship to the value. Valid operators are Exists and
    * Equal. Defaults to Equal. Exists is equivalent to wildcard for value, so that a pod can
    * tolerate all taints of a particular category.
    */
  var operator: js.UndefOr[Input[String]] = js.native
  /**
    * TolerationSeconds represents the period of time the toleration (which must be of effect
    * NoExecute, otherwise this field is ignored) tolerates the taint. By default, it is not set,
    * which means tolerate the taint forever (do not evict). Zero and negative values will be
    * treated as 0 (evict immediately) by the system.
    */
  var tolerationSeconds: js.UndefOr[Input[Double]] = js.native
  /**
    * Value is the taint value the toleration matches to. If the operator is Exists, the value
    * should be empty, otherwise just a regular string.
    */
  var value: js.UndefOr[Input[String]] = js.native
}

object Toleration {
  @scala.inline
  def apply(): Toleration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Toleration]
  }
  @scala.inline
  implicit class TolerationOps[Self <: Toleration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEffect(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("effect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEffect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("effect")(js.undefined)
        ret
    }
    @scala.inline
    def withKey(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(js.undefined)
        ret
    }
    @scala.inline
    def withOperator(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOperator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operator")(js.undefined)
        ret
    }
    @scala.inline
    def withTolerationSeconds(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tolerationSeconds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTolerationSeconds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tolerationSeconds")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
        ret
    }
  }
  
}

