package typingsSlinky.antvAdjust

import typingsSlinky.antvAdjust.adjustMod.AdjustConstructor
import typingsSlinky.antvAdjust.adjustMod.default
import typingsSlinky.antvAdjust.interfaceMod.AdjustCfg
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@antv/adjust", "Adjust")
  @js.native
  abstract class Adjust protected () extends default {
    def this(cfg: AdjustCfg) = this()
  }
  
  /**
    * 根据类型获取 Adjust 类
    * @param type
    */
  @JSImport("@antv/adjust", "getAdjust")
  @js.native
  def getAdjust(`type`: String): AdjustConstructor = js.native
  
  /**
    * 注册自定义 Adjust
    * @param type
    * @param ctor
    */
  @JSImport("@antv/adjust", "registerAdjust")
  @js.native
  def registerAdjust(`type`: String, ctor: AdjustConstructor): Unit = js.native
}
