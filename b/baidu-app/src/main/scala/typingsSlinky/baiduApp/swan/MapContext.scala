package typingsSlinky.baiduApp.swan

import typingsSlinky.baiduApp.anon.Padding
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * mapContext 通过 mapId 跟一个 <map/> 组件绑定，通过它可以操作对应的 <map/> 组件。
	 */
@js.native
trait MapContext extends js.Object {
  /**
  		 * 获取当前地图中心的经纬度，返回的是 gcj02 坐标系，可以用于 swan.openLocation
  		 */
  def getCenterLocation(options: GetCenterLocationOptions): OpenLocationOptions = js.native
  def getRegion(options: GetRegionOptions): Unit = js.native
  def includePoints(options: Padding): Unit = js.native
  /**
  		 * 将地图中心移动到当前定位点，需要配合map组件的show-location使用
  		 */
  def moveToLocation(): Unit = js.native
  def translateMarker(options: TranslateMarkerOptions): Unit = js.native
}

object MapContext {
  @scala.inline
  def apply(
    getCenterLocation: GetCenterLocationOptions => OpenLocationOptions,
    getRegion: GetRegionOptions => Unit,
    includePoints: Padding => Unit,
    moveToLocation: () => Unit,
    translateMarker: TranslateMarkerOptions => Unit
  ): MapContext = {
    val __obj = js.Dynamic.literal(getCenterLocation = js.Any.fromFunction1(getCenterLocation), getRegion = js.Any.fromFunction1(getRegion), includePoints = js.Any.fromFunction1(includePoints), moveToLocation = js.Any.fromFunction0(moveToLocation), translateMarker = js.Any.fromFunction1(translateMarker))
    __obj.asInstanceOf[MapContext]
  }
  @scala.inline
  implicit class MapContextOps[Self <: MapContext] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetCenterLocation(value: GetCenterLocationOptions => OpenLocationOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCenterLocation")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetRegion(value: GetRegionOptions => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRegion")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIncludePoints(value: Padding => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includePoints")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withMoveToLocation(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moveToLocation")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withTranslateMarker(value: TranslateMarkerOptions => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("translateMarker")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

