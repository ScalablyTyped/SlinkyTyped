package typingsSlinky.antvAttr

import typingsSlinky.antvAttr.interfaceMod.AttributeCfg
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object positionMod {
  
  @JSImport("@antv/attr/lib/attributes/position", JSImport.Default)
  @js.native
  class default protected () extends Position {
    def this(cfg: AttributeCfg) = this()
  }
  
  type MappingValue = js.Array[Value] | Value
  
  @js.native
  trait Position
    extends typingsSlinky.antvAttr.baseMod.default {
    
    def mapping(x: MappingValue, y: MappingValue): js.Array[Double | js.Array[Double]] = js.native
  }
  
  type Value = Double | String
}
