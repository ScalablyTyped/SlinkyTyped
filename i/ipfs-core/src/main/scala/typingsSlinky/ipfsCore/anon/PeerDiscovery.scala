package typingsSlinky.ipfsCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PeerDiscovery extends js.Object {
  
  var dht: ClientMode = js.native
  
  var peerDiscovery: AutoDial = js.native
  
  var pubsub: EmitSelf = js.native
}
object PeerDiscovery {
  
  @scala.inline
  def apply(dht: ClientMode, peerDiscovery: AutoDial, pubsub: EmitSelf): PeerDiscovery = {
    val __obj = js.Dynamic.literal(dht = dht.asInstanceOf[js.Any], peerDiscovery = peerDiscovery.asInstanceOf[js.Any], pubsub = pubsub.asInstanceOf[js.Any])
    __obj.asInstanceOf[PeerDiscovery]
  }
  
  @scala.inline
  implicit class PeerDiscoveryOps[Self <: PeerDiscovery] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDht(value: ClientMode): Self = this.set("dht", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPeerDiscovery(value: AutoDial): Self = this.set("peerDiscovery", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPubsub(value: EmitSelf): Self = this.set("pubsub", value.asInstanceOf[js.Any])
  }
}
