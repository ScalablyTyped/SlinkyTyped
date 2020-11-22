package typingsSlinky.antvGBase

import typingsSlinky.antvGBase.interfacesMod.IShape
import typingsSlinky.antvGBase.typesMod.SimpleBBox
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@antv/g-base/lib/bbox/register", JSImport.Namespace)
@js.native
object registerMod extends js.Object {
  
  def getMethod(`type`: String): BoxMethod = js.native
  
  def register(`type`: String, method: BoxMethod): Unit = js.native
  
  type BoxMethod = js.Function1[/* shape */ IShape, SimpleBBox]
}
