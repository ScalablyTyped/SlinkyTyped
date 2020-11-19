package typingsSlinky.framebus

import org.scalajs.dom.raw.MessageEvent
import typingsSlinky.framebus.framebusBooleans.`false`
import typingsSlinky.framebus.typesMod.FramebusPayload
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("framebus/dist/lib/unpack-payload", JSImport.Namespace)
@js.native
object unpackPayloadMod extends js.Object {
  
  def unpackPayload(e: MessageEvent): FramebusPayload | `false` = js.native
}
