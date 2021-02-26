package typingsSlinky.antvAttr

import typingsSlinky.antvAttr.baseMod.AttributeConstructor
import typingsSlinky.antvAttr.baseMod.default
import typingsSlinky.antvAttr.interfaceMod.AttributeCfg
import typingsSlinky.antvScale.typesMod.ScaleConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@antv/attr", "Attribute")
  @js.native
  class Attribute protected () extends default {
    def this(cfg: AttributeCfg) = this()
  }
  
  @JSImport("@antv/attr", "Color")
  @js.native
  class Color protected ()
    extends typingsSlinky.antvAttr.colorMod.default {
    def this(cfg: AttributeCfg) = this()
  }
  
  @JSImport("@antv/attr", "Opacity")
  @js.native
  class Opacity protected ()
    extends typingsSlinky.antvAttr.opacityMod.default {
    def this(cfg: AttributeCfg) = this()
  }
  
  @JSImport("@antv/attr", "Position")
  @js.native
  class Position protected ()
    extends typingsSlinky.antvAttr.positionMod.default {
    def this(cfg: AttributeCfg) = this()
  }
  
  @JSImport("@antv/attr", "Scale")
  @js.native
  abstract class Scale protected ()
    extends typingsSlinky.antvAttr.interfaceMod.Scale {
    def this(cfg: ScaleConfig) = this()
  }
  
  @JSImport("@antv/attr", "Shape")
  @js.native
  class Shape protected ()
    extends typingsSlinky.antvAttr.shapeMod.default {
    def this(cfg: AttributeCfg) = this()
  }
  
  @JSImport("@antv/attr", "Size")
  @js.native
  class Size protected ()
    extends typingsSlinky.antvAttr.sizeMod.default {
    def this(cfg: AttributeCfg) = this()
  }
  
  /**
    * 通过类型获得 Attribute 类
    * @param type
    */
  @JSImport("@antv/attr", "getAttribute")
  @js.native
  def getAttribute(`type`: String): js.Any = js.native
  
  @JSImport("@antv/attr", "registerAttribute")
  @js.native
  def registerAttribute(`type`: String, ctor: AttributeConstructor): Unit = js.native
}
