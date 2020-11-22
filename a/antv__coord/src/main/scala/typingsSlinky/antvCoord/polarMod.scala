package typingsSlinky.antvCoord

import typingsSlinky.antvCoord.interfaceMod.Point
import typingsSlinky.antvCoord.interfaceMod.PolarCfg
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@antv/coord/lib/coord/polar", JSImport.Namespace)
@js.native
object polarMod extends js.Object {
  
  @js.native
  trait Polar
    extends typingsSlinky.antvCoord.baseMod.default {
    
    var circleCenter: Point = js.native
    
    var getOneBox: js.Any = js.native
    
    var polarRadius: js.Any = js.native
  }
  
  @js.native
  class default protected () extends Polar {
    def this(cfg: PolarCfg) = this()
  }
}
