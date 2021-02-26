package typingsSlinky.antvAttr

import typingsSlinky.antvAttr.baseMod.AttributeConstructor
import typingsSlinky.antvAttr.baseMod.default
import typingsSlinky.antvAttr.interfaceMod.AttributeCfg
import typingsSlinky.antvScale.typesMod.ScaleConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object factoryMod {
  
  @JSImport("@antv/attr/lib/factory", "Attribute")
  @js.native
  class Attribute protected () extends default {
    def this(cfg: AttributeCfg) = this()
  }
  
  @JSImport("@antv/attr/lib/factory", "Scale")
  @js.native
  abstract class Scale protected ()
    extends typingsSlinky.antvAttr.interfaceMod.Scale {
    def this(cfg: ScaleConfig) = this()
  }
  
  /**
    * 通过类型获得 Attribute 类
    * @param type
    */
  @JSImport("@antv/attr/lib/factory", "getAttribute")
  @js.native
  def getAttribute(`type`: String): js.Any = js.native
  
  @JSImport("@antv/attr/lib/factory", "registerAttribute")
  @js.native
  def registerAttribute(`type`: String, ctor: AttributeConstructor): Unit = js.native
}
