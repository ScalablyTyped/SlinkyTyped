package typingsSlinky.antvComponent

import typingsSlinky.antvComponent.gridBaseMod.default
import typingsSlinky.antvComponent.typesMod.GroupComponentCfg
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gridMod {
  
  @JSImport("@antv/component/lib/grid", "Base")
  @js.native
  abstract class Base[T /* <: GroupComponentCfg */] () extends default[T]
  
  @JSImport("@antv/component/lib/grid", "Circle")
  @js.native
  class Circle ()
    extends typingsSlinky.antvComponent.gridCircleMod.default
  
  @JSImport("@antv/component/lib/grid", "Line")
  @js.native
  class Line ()
    extends typingsSlinky.antvComponent.gridLineMod.default
}
