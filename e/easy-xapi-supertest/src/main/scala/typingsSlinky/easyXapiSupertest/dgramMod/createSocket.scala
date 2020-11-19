package typingsSlinky.easyXapiSupertest.dgramMod

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("dgram", "createSocket")
@js.native
object createSocket extends js.Object {
  
  def apply(`type`: String): Socket = js.native
  def apply(`type`: String, callback: js.Function2[/* msg */ Buffer, /* rinfo */ RemoteInfo, Unit]): Socket = js.native
}
