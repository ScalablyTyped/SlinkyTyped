package typingsSlinky.pulumiKubernetes.outputMod.core.v1

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
  val default: js.Object = js.native
  /**
    * DefaultRequest is the default resource requirement request value by resource name if
    * resource request is omitted.
    */
  val defaultRequest: js.Object = js.native
  /**
    * Max usage constraints on this kind by resource name.
    */
  val max: js.Object = js.native
  /**
    * MaxLimitRequestRatio if specified, the named resource must have a request and limit that
    * are both non-zero where limit divided by request is less than or equal to the enumerated
    * value; this represents the max burst for the named resource.
    */
  val maxLimitRequestRatio: js.Object = js.native
  /**
    * Min usage constraints on this kind by resource name.
    */
  val min: js.Object = js.native
  /**
    * Type of resource that this limit applies to.
    */
  val `type`: String = js.native
}

object LimitRangeItem {
  @scala.inline
  def apply(
    default: js.Object,
    defaultRequest: js.Object,
    max: js.Object,
    maxLimitRequestRatio: js.Object,
    min: js.Object,
    `type`: String
  ): LimitRangeItem = {
    val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any], defaultRequest = defaultRequest.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], maxLimitRequestRatio = maxLimitRequestRatio.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LimitRangeItem]
  }
  @scala.inline
  implicit class LimitRangeItemOps[Self <: LimitRangeItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefault(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefaultRequest(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultRequest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMax(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxLimitRequestRatio(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxLimitRequestRatio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMin(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

