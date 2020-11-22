package typingsSlinky.ipfsCore.anon

import typingsSlinky.ipfsCore.startMod.APIManager
import typingsSlinky.ipfsCore.startMod.GCLock
import typingsSlinky.ipfsCore.startMod.IPFSBlockService
import typingsSlinky.ipfsCore.startMod.IPFSRepo
import typingsSlinky.ipfsCore.startMod.IPLD
import typingsSlinky.ipfsCore.startMod.StartOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApiManagerBlockService extends js.Object {
  
  var apiManager: APIManager = js.native
  
  var blockService: IPFSBlockService = js.native
  
  var gcLock: GCLock = js.native
  
  var initOptions: typingsSlinky.ipfsCore.startMod.InitOptions = js.native
  
  var ipld: IPLD = js.native
  
  var keychain: typingsSlinky.ipfsCore.startMod.Keychain = js.native
  
  var options: StartOptions = js.native
  
  var peerId: typingsSlinky.ipfsCore.startMod.PeerId = js.native
  
  var pinManager: typingsSlinky.ipfsCore.startMod.PinManager = js.native
  
  var preload: typingsSlinky.ipfsCore.startMod.Preload = js.native
  
  def print(args: js.Any*): Unit = js.native
  @JSName("print")
  var print_Original: typingsSlinky.ipfsCore.startMod.Print = js.native
  
  var repo: IPFSRepo = js.native
}
