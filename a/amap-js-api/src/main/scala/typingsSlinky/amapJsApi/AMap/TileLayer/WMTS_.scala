package typingsSlinky.amapJsApi.AMap.TileLayer

import typingsSlinky.amapJsApi.AMap.TileLayer.WMTS.Params
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WMTS_
  extends typingsSlinky.amapJsApi.AMap.TileLayer {
  
  /**
    * 返回OGC标准的WMTS getTile接口的参数
    */
  def getParams(): Params = js.native
  
  /**
    * 返回wmts服务地址
    */
  def getUrl(): String = js.native
  
  /**
    * 设置OGC标准的WMTS getTile接口的参数
    * @param params 接口参数
    */
  def setParams(params: Params): Unit = js.native
  
  /**
    * 设置wmts服务地址
    * @param url 服务地址
    */
  def setUrl(url: String): Unit = js.native
}
