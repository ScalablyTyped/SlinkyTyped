package typingsSlinky.amapJsApiCitySearch.AMap

import typingsSlinky.amapJsApi.AMap.EventEmitter
import typingsSlinky.amapJsApiCitySearch.AMap.CitySearch.SearchResult
import typingsSlinky.amapJsApiCitySearch.AMap.CitySearch.SearchStatus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * 根据IP返回对应城市信息
  */
@js.native
trait CitySearch_ extends EventEmitter {
  
  /**
    * 根据输入IP地址返回对应城市信息
    * @param ip IP
    * @param callback 查询回调
    */
  def getCityByIp(
    ip: String,
    callback: js.Function2[/* status */ SearchStatus, /* result */ SearchResult | String, Unit]
  ): Unit = js.native
  
  /**
    * 自动获取用户IP，回调返回当前用户所在城市
    * @param callback 查询回调
    */
  def getLocalCity(callback: js.Function2[/* status */ SearchStatus, /* result */ SearchResult | String, Unit]): Unit = js.native
}
