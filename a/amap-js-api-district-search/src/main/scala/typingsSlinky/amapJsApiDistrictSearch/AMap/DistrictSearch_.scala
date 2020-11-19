package typingsSlinky.amapJsApiDistrictSearch.AMap

import typingsSlinky.amapJsApi.AMap.EventEmitter
import typingsSlinky.amapJsApiDistrictSearch.AMap.DistrictSearch.Level
import typingsSlinky.amapJsApiDistrictSearch.AMap.DistrictSearch.SearchResult
import typingsSlinky.amapJsApiDistrictSearch.AMap.DistrictSearch.SearchStatus
import typingsSlinky.amapJsApiDistrictSearch.amapJsApiDistrictSearchNumbers.`0`
import typingsSlinky.amapJsApiDistrictSearch.amapJsApiDistrictSearchNumbers.`1`
import typingsSlinky.amapJsApiDistrictSearch.amapJsApiDistrictSearchNumbers.`2`
import typingsSlinky.amapJsApiDistrictSearch.amapJsApiDistrictSearchNumbers.`3`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DistrictSearch_ extends EventEmitter {
  
  /**
    * 根据关键字查询行政区或商圈信息
    * @param keyword 关键词
    * @param callback 回调
    */
  def search(
    keyword: String,
    callback: js.Function2[/* status */ SearchStatus, /* result */ SearchResult | String, Unit]
  ): Unit = js.native
  
  // internal
  def setExtensions(): Unit = js.native
  def setExtensions(extensions: Boolean): Unit = js.native
  
  /**
    * 设置关键字对应的行政区级别或商圈
    * @param level 级别
    */
  def setLevel(): Unit = js.native
  def setLevel(level: Level): Unit = js.native
  
  /**
    * 设置下级行政区级数
    * @param district 级数
    */
  def setSubdistrict(): Unit = js.native
  @JSName("setSubdistrict")
  def setSubdistrict_0(district: `0`): Unit = js.native
  @JSName("setSubdistrict")
  def setSubdistrict_1(district: `1`): Unit = js.native
  @JSName("setSubdistrict")
  def setSubdistrict_2(district: `2`): Unit = js.native
  @JSName("setSubdistrict")
  def setSubdistrict_3(district: `3`): Unit = js.native
}
