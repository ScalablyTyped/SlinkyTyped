package typingsSlinky.rusha.mod

import org.scalajs.dom.raw.MessageEvent
import typingsSlinky.std.Worker
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RushaWorker extends Worker {
  
  @JSName("onmessage")
  var onmessage_RushaWorker: (js.ThisFunction1[/* this */ this.type, /* res */ MessageEvent, Unit]) | Null = js.native
  
  def postMessage(req: RushaWorkerRequest): Unit = js.native
}
