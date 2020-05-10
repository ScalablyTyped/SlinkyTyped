package typingsSlinky.html5plus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * 地图中的路线对象
  * 从Overlay对象继承而来，可通过Map对象的addOverlay()方法将对象添加地图中。
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
  */
@js.native
trait PlusMapsRoute extends js.Object {
  /**
    * 路线总距离
    * 路线从起始点到终点的距离，单位为米。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
    */
  var distance: js.UndefOr[Double] = js.native
  /**
    * 路线终点地理坐标点
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
    */
  var endPoint: js.UndefOr[PlusMapsPoint] = js.native
  /**
    * 路线坐标点段数
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
    */
  var pointCount: js.UndefOr[PlusMapsPoint] = js.native
  /**
    * 路线的地理坐标点数组
    * 路线的地理坐标点数组，数组中保存Point对象。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
    */
  var pointList: js.UndefOr[js.Array[_]] = js.native
  /**
    * 线路的提示信息
    * 线路提示信息，没有提示信息则返回空字符串。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
    */
  var routeTip: js.UndefOr[String] = js.native
  /**
    * 路线起点地理坐标点
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/maps.html](http://www.html5plus.org/doc/zh_cn/maps.html)
    */
  var startPoint: js.UndefOr[PlusMapsPoint] = js.native
}

object PlusMapsRoute {
  @scala.inline
  def apply(): PlusMapsRoute = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlusMapsRoute]
  }
  @scala.inline
  implicit class PlusMapsRouteOps[Self <: PlusMapsRoute] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDistance(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("distance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDistance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("distance")(js.undefined)
        ret
    }
    @scala.inline
    def withEndPoint(value: PlusMapsPoint): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endPoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndPoint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endPoint")(js.undefined)
        ret
    }
    @scala.inline
    def withPointCount(value: PlusMapsPoint): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPointCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointCount")(js.undefined)
        ret
    }
    @scala.inline
    def withPointList(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPointList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointList")(js.undefined)
        ret
    }
    @scala.inline
    def withRouteTip(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("routeTip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRouteTip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("routeTip")(js.undefined)
        ret
    }
    @scala.inline
    def withStartPoint(value: PlusMapsPoint): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startPoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartPoint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startPoint")(js.undefined)
        ret
    }
  }
  
}

