package typingsSlinky.j5IoTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPWMModule extends js.Object {
  
  def createPWM(config: String): IPWM = js.native
  def createPWM(config: Double): IPWM = js.native
  def createPWM(config: IPWMConfig): IPWM = js.native
}
