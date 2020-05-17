package typingsSlinky.angularThrottle

import typingsSlinky.angular.mod.global.Function
import typingsSlinky.angularThrottle.anon.Leading
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* augmented module */
@JSImport("angular", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  trait IAngularStatic extends js.Object {
    def throttle(fn: Function, throttle: Double): Function = js.native
    def throttle(fn: Function, throttle: Double, options: Leading): Function = js.native
  }
  
}

