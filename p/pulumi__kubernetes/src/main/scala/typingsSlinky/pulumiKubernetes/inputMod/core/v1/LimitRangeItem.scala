package typingsSlinky.pulumiKubernetes.inputMod.core.v1

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * LimitRangeItem defines a min/max usage limit for any resource that matches on kind.
  */
@js.native
trait LimitRangeItem extends js.Object {
  /**
    * Default resource requirement limit value by resource name if resource limit is omitted.
    */
  var default: js.UndefOr[Input[js.Object]] = js.native
  /**
    * DefaultRequest is the default resource requirement request value by resource name if
    * resource request is omitted.
    */
  var defaultRequest: js.UndefOr[Input[js.Object]] = js.native
  /**
    * Max usage constraints on this kind by resource name.
    */
  var max: js.UndefOr[Input[js.Object]] = js.native
  /**
    * MaxLimitRequestRatio if specified, the named resource must have a request and limit that
    * are both non-zero where limit divided by request is less than or equal to the enumerated
    * value; this represents the max burst for the named resource.
    */
  var maxLimitRequestRatio: js.UndefOr[Input[js.Object]] = js.native
  /**
    * Min usage constraints on this kind by resource name.
    */
  var min: js.UndefOr[Input[js.Object]] = js.native
  /**
    * Type of resource that this limit applies to.
    */
  var `type`: js.UndefOr[Input[String]] = js.native
}

object LimitRangeItem {
  @scala.inline
  def apply(): LimitRangeItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LimitRangeItem]
  }
  @scala.inline
  implicit class LimitRangeItemOps[Self <: LimitRangeItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefault(value: Input[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefault: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultRequest(value: Input[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultRequest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultRequest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultRequest")(js.undefined)
        ret
    }
    @scala.inline
    def withMax(value: Input[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMax: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxLimitRequestRatio(value: Input[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxLimitRequestRatio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxLimitRequestRatio: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxLimitRequestRatio")(js.undefined)
        ret
    }
    @scala.inline
    def withMin(value: Input[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

