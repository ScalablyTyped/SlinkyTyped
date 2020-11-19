package typingsSlinky.openfin.wireMod

import typingsSlinky.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Wire extends EventEmitter {
  
  def connect(address: String): js.Promise[_] = js.native
  
  def connectSync(): js.Any = js.native
  
  def send(data: js.Any): js.Promise[_] = js.native
  
  def shutdown(): js.Promise[Unit] = js.native
}
