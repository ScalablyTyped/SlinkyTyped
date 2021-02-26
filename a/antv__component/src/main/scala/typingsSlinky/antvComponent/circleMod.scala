package typingsSlinky.antvComponent

import typingsSlinky.antvComponent.typesMod.CircleAxisCfg
import typingsSlinky.antvGBase.typesMod.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object circleMod {
  
  @JSImport("@antv/component/lib/axis/circle", JSImport.Default)
  @js.native
  class default () extends Circle
  
  @js.native
  trait Circle
    extends typingsSlinky.antvComponent.baseMod.default[CircleAxisCfg] {
    
    var getCirclePoint: js.Any = js.native
    
    /* protected */ def getTickPoint(tickValue: js.Any): Point = js.native
  }
}
