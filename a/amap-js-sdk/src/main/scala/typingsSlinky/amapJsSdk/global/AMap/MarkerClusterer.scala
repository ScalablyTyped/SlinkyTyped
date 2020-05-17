package typingsSlinky.amapJsSdk.global.AMap

import typingsSlinky.amapJsSdk.AMap.MarkerClustererOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * 用于地图上加载大量点标记，提高地图的绘制和显示性能。
  */
@JSGlobal("AMap.MarkerClusterer")
@js.native
class MarkerClusterer protected ()
  extends typingsSlinky.amapJsSdk.AMap.MarkerClusterer {
  def this(map: typingsSlinky.amapJsSdk.AMap.Map, markers: js.Array[typingsSlinky.amapJsSdk.AMap.Marker]) = this()
  def this(
    map: typingsSlinky.amapJsSdk.AMap.Map,
    markers: js.Array[typingsSlinky.amapJsSdk.AMap.Marker],
    opt: MarkerClustererOptions
  ) = this()
}

