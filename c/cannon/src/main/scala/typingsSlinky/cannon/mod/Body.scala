package typingsSlinky.cannon.mod

import typingsSlinky.cannon.CANNON.IBodyOptions
import typingsSlinky.cannon.CANNON.IEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cannon", "Body")
@js.native
class Body ()
  extends typingsSlinky.cannon.CANNON.Body {
  def this(options: IBodyOptions) = this()
}
/* static members */
@JSImport("cannon", "Body")
@js.native
object Body extends js.Object {
  
  var AWAKE: Double = js.native
  
  var DYNAMIC: Double = js.native
  
  var KINEMATIC: Double = js.native
  
  var SLEEPING: Double = js.native
  
  var SLEEPY: Double = js.native
  
  var STATIC: Double = js.native
  
  var sleepEvent: IEvent = js.native
  
  var sleepyEvent: IEvent = js.native
}
