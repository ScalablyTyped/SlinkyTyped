package typingsSlinky.antvAdjust

import typingsSlinky.antvAdjust.adjustMod.AdjustConstructor
import typingsSlinky.antvAdjust.adjustMod.default
import typingsSlinky.antvAdjust.interfaceMod.AdjustCfg
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@antv/adjust", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  /**
    * 根据类型获取 Adjust 类
    * @param type
    */
  def getAdjust(`type`: String): AdjustConstructor = js.native
  
  /**
    * 注册自定义 Adjust
    * @param type
    * @param ctor
    */
  def registerAdjust(`type`: String, ctor: AdjustConstructor): Unit = js.native
  
  @js.native
  abstract class Adjust protected () extends default {
    def this(cfg: AdjustCfg) = this()
  }
}
