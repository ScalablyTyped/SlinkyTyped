package typingsSlinky.ipfsHttpServer.resourcesMod

import typingsSlinky.ipfsHttpServer.anon.Typeofaddrs
import typingsSlinky.ipfsHttpServer.anon.Typeofconnect
import typingsSlinky.ipfsHttpServer.anon.Typeofdisconnect
import typingsSlinky.ipfsHttpServer.anon.TypeoflocalAddrs
import typingsSlinky.ipfsHttpServer.anon.Typeofpeers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ipfs-http-server/dist/src/api/resources", "swarm")
@js.native
object swarm extends js.Object {
  
  val addrs: Typeofaddrs = js.native
  
  val connect: Typeofconnect = js.native
  
  val disconnect: Typeofdisconnect = js.native
  
  val localAddrs: TypeoflocalAddrs = js.native
  
  val peers: Typeofpeers = js.native
}
