package typingsSlinky.famous.physicsMod

import typingsSlinky.famous.mathMod.Vec3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("famous/physics", "Wall")
@js.native
class Wall protected () extends Particle {
  def this(options: IWallOptions) = this()
  
  var invNormal: Vec3 = js.native
  
  var normal: Vec3 = js.native
}
