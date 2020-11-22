package typingsSlinky.ipfsCore.anon

import typingsSlinky.ipfsCore.dnsMod.DNSSettings
import typingsSlinky.ipfsCore.ipnsMod.^
import typingsSlinky.ipfsCore.srcUtilsMod.AbortOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Dns extends js.Object {
  
  def dns(domain: String): js.Promise[String] = js.native
  def dns(domain: String, options: DNSSettings with AbortOptions): js.Promise[String] = js.native
  
  var ipns: ^ = js.native
  
  def isOnline(): Boolean = js.native
  
  var options: Offline = js.native
  
  var peerId: typingsSlinky.peerId.mod.^ = js.native
}
