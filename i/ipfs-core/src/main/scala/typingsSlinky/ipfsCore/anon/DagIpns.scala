package typingsSlinky.ipfsCore.anon

import typingsSlinky.ipfsCore.componentsMod.DAG_
import typingsSlinky.ipfsCore.componentsMod.IsOnline_
import typingsSlinky.ipfsCore.ipnsMod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DagIpns extends js.Object {
  
  var dag: DAG_ = js.native
  
  var ipns: ^ = js.native
  
  def isOnline(): Boolean = js.native
  @JSName("isOnline")
  var isOnline_Original: IsOnline_ = js.native
  
  var keychain: typingsSlinky.ipfsCore.initMod.Keychain = js.native
  
  var peerId: typingsSlinky.peerId.mod.^ = js.native
}
