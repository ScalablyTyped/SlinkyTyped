package typingsSlinky.html5plus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * 保存位置检索、周边检索和范围检索返回的结果
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
  */
@js.native
trait PlusMapsSearchPoiResult extends js.Object {
  /**
    * 当前页的POI检索结果数
    * 当前页POI检索结果数，若没有检索到则返回0。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
    */
  var currentNumber: js.UndefOr[Double] = js.native
  /**
    * 获取当前页的索引
    * 当前页的索引值，从0开始，即0表示第一页。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
    */
  var pageIndex: js.UndefOr[Double] = js.native
  /**
    * 本次POI检索的总页数
    * 本次POI检索的总页数，若没有检索到则返回0。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
    */
  var pageNumber: js.UndefOr[Double] = js.native
  /**
    * 本次POI检索结果数组
    * POI检索结果数组，Array数组对象，数组内容为Position对象。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
    */
  var poiList: js.UndefOr[js.Array[_]] = js.native
  /**
    * POI检索总结果数
    * POI检索总结果数，若没有检索到则返回0。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
    */
  var totalNumber: js.UndefOr[Double] = js.native
  /**
    * 获取指定索引的检索结果
    * 如果index值超出范围则返回null对象。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
    */
  def getPosition(): PlusMapsPosition = js.native
}

object PlusMapsSearchPoiResult {
  @scala.inline
  def apply(getPosition: () => PlusMapsPosition): PlusMapsSearchPoiResult = {
    val __obj = js.Dynamic.literal(getPosition = js.Any.fromFunction0(getPosition))
    __obj.asInstanceOf[PlusMapsSearchPoiResult]
  }
  @scala.inline
  implicit class PlusMapsSearchPoiResultOps[Self <: PlusMapsSearchPoiResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetPosition(value: () => PlusMapsPosition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPosition")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCurrentNumber(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrentNumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentNumber")(js.undefined)
        ret
    }
    @scala.inline
    def withPageIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPageIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withPageNumber(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPageNumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageNumber")(js.undefined)
        ret
    }
    @scala.inline
    def withPoiList(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("poiList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPoiList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("poiList")(js.undefined)
        ret
    }
    @scala.inline
    def withTotalNumber(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTotalNumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalNumber")(js.undefined)
        ret
    }
  }
  
}

