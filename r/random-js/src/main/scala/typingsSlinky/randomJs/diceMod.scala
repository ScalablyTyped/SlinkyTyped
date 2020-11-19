package typingsSlinky.randomJs

import typingsSlinky.randomJs.typesMod.Distribution
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("random-js/dist/distribution/dice", JSImport.Namespace)
@js.native
object diceMod extends js.Object {
  
  def dice(sideCount: Double, dieCount: Double): Distribution[js.Array[Double]] = js.native
}
