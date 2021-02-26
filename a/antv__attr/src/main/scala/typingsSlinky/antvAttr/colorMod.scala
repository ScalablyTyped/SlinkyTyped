package typingsSlinky.antvAttr

import typingsSlinky.antvAttr.interfaceMod.AttributeCfg
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object colorMod {
  
  @JSImport("@antv/attr/lib/attributes/color", JSImport.Default)
  @js.native
  class default protected () extends Color {
    def this(cfg: AttributeCfg) = this()
  }
  
  @js.native
  trait Color
    extends typingsSlinky.antvAttr.baseMod.default {
    
    def gradient(percent: Double): String = js.native
  }
}
