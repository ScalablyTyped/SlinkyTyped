package typingsSlinky.antvCoord

import typingsSlinky.antvCoord.baseMod.CoordinateCtor
import typingsSlinky.antvCoord.baseMod.default
import typingsSlinky.antvCoord.interfaceMod.CoordinateCfg
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@antv/coord", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def getCoordinate(`type`: String): CoordinateCtor = js.native
  
  def registerCoordinate(`type`: String, ctor: CoordinateCtor): Unit = js.native
  
  @js.native
  abstract class Coordinate protected () extends default {
    def this(cfg: CoordinateCfg) = this()
  }
}
