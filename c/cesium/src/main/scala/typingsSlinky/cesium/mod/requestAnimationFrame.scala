package typingsSlinky.cesium.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "requestAnimationFrame")
@js.native
object requestAnimationFrame extends js.Object {
  
  def apply(callback: Callback): Double = js.native
  
  type Callback = js.Function1[/* timestamp */ Double, Unit]
}
