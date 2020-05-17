package typingsSlinky.amapJsApi.global.AMap

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.amapJsApi.AMap.Map.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("AMap.Map")
@js.native
class Map protected ()
  extends typingsSlinky.amapJsApi.AMap.Map {
  /**
    * 构造一个地图对象
    * @param container 地图容器的id或者是DOM元素
    * @param opts 选项
    */
  def this(container: String) = this()
  def this(container: HTMLElement) = this()
  def this(container: String, opts: Options) = this()
  def this(container: HTMLElement, opts: Options) = this()
}

