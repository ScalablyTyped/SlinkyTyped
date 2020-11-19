package typingsSlinky.amapJsApi.AMap

import org.scalajs.dom.raw.HTMLImageElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * 图片图层
  */
@js.native
trait ImageLayer extends MediaLayer[HTMLImageElement] {
  
  /**
    * 返回Image的Url
    */
  def getImageUrl(): js.UndefOr[String] = js.native
  
  /**
    * 修改Image的Url
    * @param url url
    */
  def setImageUrl(url: String): Unit = js.native
}
