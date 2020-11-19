package typingsSlinky.meteor.global

import typingsSlinky.meteor.DDP.DDPStatic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("DDP")
@js.native
object DDP extends js.Object {
  
  @JSName("_allSubscriptionsReady")
  def allSubscriptionsReady(): Boolean = js.native
  
  def connect(url: String): DDPStatic = js.native
}
