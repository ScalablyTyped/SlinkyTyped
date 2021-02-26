package typingsSlinky.antvCoord

import typingsSlinky.antvCoord.interfaceMod.PolarCfg
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object helixMod {
  
  @JSImport("@antv/coord/lib/coord/helix", JSImport.Default)
  @js.native
  class default protected () extends Helix {
    def this(cfg: PolarCfg) = this()
  }
  
  @js.native
  trait Helix
    extends typingsSlinky.antvCoord.baseMod.default {
    
    var a: js.Any = js.native
    
    var d: js.Any = js.native
  }
}
