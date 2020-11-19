package typingsSlinky.hubspotPace.HubSpotPaceInterfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Pace extends js.Object {
  
  def ignore(fn: js.Function0[Unit], args: js.Any*): Unit = js.native
  
  def off(event: String): Unit = js.native
  def off(event: String, handler: js.Function1[/* repeated */ js.Any, Unit]): Unit = js.native
  
  def on(event: String, handler: js.Function1[/* repeated */ js.Any, Unit]): Unit = js.native
  def on(event: String, handler: js.Function1[/* repeated */ js.Any, Unit], context: js.Any): Unit = js.native
  
  def once(event: String, handler: js.Function1[/* repeated */ js.Any, Unit]): Unit = js.native
  def once(event: String, handler: js.Function1[/* repeated */ js.Any, Unit], context: js.Any): Unit = js.native
  
  var options: PaceOptions = js.native
  
  def restart(): Unit = js.native
  
  def start(): Unit = js.native
  def start(options: PaceOptions): Unit = js.native
  
  def stop(): Unit = js.native
  
  def track(fn: js.Function0[Unit], args: js.Any*): Unit = js.native
}
