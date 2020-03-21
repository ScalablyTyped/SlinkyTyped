package typingsSlinky.amapJsApi.AMap.convertFrom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.amapJsApi.amapJsApiStrings.gps
  - typingsSlinky.amapJsApi.amapJsApiStrings.baidu
  - typingsSlinky.amapJsApi.amapJsApiStrings.mapbar
*/
trait Type extends js.Object

object Type {
  @scala.inline
  def baidu: typingsSlinky.amapJsApi.amapJsApiStrings.baidu = this.cast("baidu")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def gps: typingsSlinky.amapJsApi.amapJsApiStrings.gps = this.cast("gps")
  @scala.inline
  def mapbar: typingsSlinky.amapJsApi.amapJsApiStrings.mapbar = this.cast("mapbar")
}

