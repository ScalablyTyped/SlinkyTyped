package typingsSlinky.ipSubnetCalculator.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SubnetResult extends js.Object {
  var invertedMask: Double = js.native
  var invertedMaskStr: String = js.native
  var invertedSize: Double = js.native
  var ipHigh: Double = js.native
  var ipHighStr: String = js.native
  var ipLow: Double = js.native
  var ipLowStr: String = js.native
  var prefixMask: Double = js.native
  var prefixMaskStr: String = js.native
  var prefixSize: Double = js.native
}

object SubnetResult {
  @scala.inline
  def apply(
    invertedMask: Double,
    invertedMaskStr: String,
    invertedSize: Double,
    ipHigh: Double,
    ipHighStr: String,
    ipLow: Double,
    ipLowStr: String,
    prefixMask: Double,
    prefixMaskStr: String,
    prefixSize: Double
  ): SubnetResult = {
    val __obj = js.Dynamic.literal(invertedMask = invertedMask.asInstanceOf[js.Any], invertedMaskStr = invertedMaskStr.asInstanceOf[js.Any], invertedSize = invertedSize.asInstanceOf[js.Any], ipHigh = ipHigh.asInstanceOf[js.Any], ipHighStr = ipHighStr.asInstanceOf[js.Any], ipLow = ipLow.asInstanceOf[js.Any], ipLowStr = ipLowStr.asInstanceOf[js.Any], prefixMask = prefixMask.asInstanceOf[js.Any], prefixMaskStr = prefixMaskStr.asInstanceOf[js.Any], prefixSize = prefixSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubnetResult]
  }
  @scala.inline
  implicit class SubnetResultOps[Self <: SubnetResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInvertedMask(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invertedMask")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInvertedMaskStr(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invertedMaskStr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInvertedSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invertedSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIpHigh(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ipHigh")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIpHighStr(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ipHighStr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIpLow(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ipLow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIpLowStr(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ipLowStr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrefixMask(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefixMask")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrefixMaskStr(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefixMaskStr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrefixSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefixSize")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

