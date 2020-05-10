package typingsSlinky.html5plus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * 检索策略类型
  * 在线路检索时设置检索策略时使用。
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
  */
@js.native
trait PlusMapsSearchPolicy extends js.Object {
  /**
    * 最短距离优先
    * 检索策略类型常量，用于驾车检索策略
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
    */
  var DRIVING_DIS_FIRST: js.UndefOr[Double] = js.native
  /**
    * 最少费用优先
    * 检索策略类型常量，用于驾车检索策略
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
    */
  var DRIVING_FEE_FIRST: js.UndefOr[Double] = js.native
  /**
    * 无高速公路线路
    * 检索策略类型常量，用于驾车检索策略
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
    */
  var DRIVING_NO_EXPRESSWAY: js.UndefOr[Double] = js.native
  /**
    * 选择车票花销最少优先
    * 检索策略类型常量，用于公交检索策略
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
    */
  var TRANSIT_FEE_FIRST: js.UndefOr[Double] = js.native
  /**
    * 时间优先
    * 检索策略类型常量，用于公交检索策略
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
    */
  var TRANSIT_TIME_FIRST: js.UndefOr[Double] = js.native
  /**
    * 最少换乘优先
    * 检索策略类型常量，用于公交检索策略
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
    */
  var TRANSIT_TRANSFER_FIRST: js.UndefOr[Double] = js.native
  /**
    * 最少步行距离优先
    * 检索策略类型常量，用于公交检索策略
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
    */
  var TRANSIT_WALK_FIRST: js.UndefOr[Double] = js.native
}

object PlusMapsSearchPolicy {
  @scala.inline
  def apply(): PlusMapsSearchPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlusMapsSearchPolicy]
  }
  @scala.inline
  implicit class PlusMapsSearchPolicyOps[Self <: PlusMapsSearchPolicy] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDRIVING_DIS_FIRST(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DRIVING_DIS_FIRST")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDRIVING_DIS_FIRST: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DRIVING_DIS_FIRST")(js.undefined)
        ret
    }
    @scala.inline
    def withDRIVING_FEE_FIRST(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DRIVING_FEE_FIRST")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDRIVING_FEE_FIRST: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DRIVING_FEE_FIRST")(js.undefined)
        ret
    }
    @scala.inline
    def withDRIVING_NO_EXPRESSWAY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DRIVING_NO_EXPRESSWAY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDRIVING_NO_EXPRESSWAY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DRIVING_NO_EXPRESSWAY")(js.undefined)
        ret
    }
    @scala.inline
    def withTRANSIT_FEE_FIRST(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TRANSIT_FEE_FIRST")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTRANSIT_FEE_FIRST: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TRANSIT_FEE_FIRST")(js.undefined)
        ret
    }
    @scala.inline
    def withTRANSIT_TIME_FIRST(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TRANSIT_TIME_FIRST")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTRANSIT_TIME_FIRST: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TRANSIT_TIME_FIRST")(js.undefined)
        ret
    }
    @scala.inline
    def withTRANSIT_TRANSFER_FIRST(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TRANSIT_TRANSFER_FIRST")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTRANSIT_TRANSFER_FIRST: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TRANSIT_TRANSFER_FIRST")(js.undefined)
        ret
    }
    @scala.inline
    def withTRANSIT_WALK_FIRST(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TRANSIT_WALK_FIRST")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTRANSIT_WALK_FIRST: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TRANSIT_WALK_FIRST")(js.undefined)
        ret
    }
  }
  
}

