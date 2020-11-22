package typingsSlinky.antvAttr

import typingsSlinky.antvAttr.baseMod.AttributeConstructor
import typingsSlinky.antvAttr.baseMod.default
import typingsSlinky.antvAttr.interfaceMod.AttributeCfg
import typingsSlinky.antvScale.typesMod.ScaleConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@antv/attr", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  /**
    * 通过类型获得 Attribute 类
    * @param type
    */
  def getAttribute(`type`: String): js.Any = js.native
  
  def registerAttribute(`type`: String, ctor: AttributeConstructor): Unit = js.native
  
  @js.native
  class Attribute protected () extends default {
    def this(cfg: AttributeCfg) = this()
  }
  
  @js.native
  class Color protected ()
    extends typingsSlinky.antvAttr.colorMod.default {
    def this(cfg: AttributeCfg) = this()
  }
  
  @js.native
  class Opacity protected ()
    extends typingsSlinky.antvAttr.opacityMod.default {
    def this(cfg: AttributeCfg) = this()
  }
  
  @js.native
  class Position protected ()
    extends typingsSlinky.antvAttr.positionMod.default {
    def this(cfg: AttributeCfg) = this()
  }
  
  @js.native
  abstract class Scale protected ()
    extends typingsSlinky.antvAttr.interfaceMod.Scale {
    def this(cfg: ScaleConfig) = this()
  }
  
  @js.native
  class Shape protected ()
    extends typingsSlinky.antvAttr.shapeMod.default {
    def this(cfg: AttributeCfg) = this()
  }
  
  @js.native
  class Size protected ()
    extends typingsSlinky.antvAttr.sizeMod.default {
    def this(cfg: AttributeCfg) = this()
  }
}
