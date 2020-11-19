package typingsSlinky.mdns.mod

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.mdns.mdnsStrings.serviceDown
import typingsSlinky.mdns.mdnsStrings.serviceUp
import typingsSlinky.node.eventsMod.global.NodeJS.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Browser extends EventEmitter {
  
  def on(event: String, listener: js.Function): this.type = js.native
  @JSName("on")
  def on_serviceDown(event: serviceDown, listener: js.Function1[/* info */ Service, Unit]): this.type = js.native
  @JSName("on")
  def on_serviceUp(event: serviceUp, listener: js.Function1[/* info */ Service, Unit]): this.type = js.native
  
  def start(): js.Any = js.native
  
  def stop(): js.Any = js.native
}
@JSImport("mdns", "Browser")
@js.native
object Browser extends TopLevel[BrowserStatic]
