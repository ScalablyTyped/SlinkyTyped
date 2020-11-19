package typingsSlinky.pulsarClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("pulsar-client", "Client")
@js.native
class Client protected () extends js.Object {
  def this(opts: ClientOpts) = this()
  
  def close(): js.Promise[Null] = js.native
  
  def createProducer(data: ProducerOpts): js.Promise[Producer] = js.native
  
  def createReader(data: ReaderOpts): js.Promise[Reader] = js.native
  
  def subscribe(data: SubscribeOpts): js.Promise[Consumer] = js.native
}
