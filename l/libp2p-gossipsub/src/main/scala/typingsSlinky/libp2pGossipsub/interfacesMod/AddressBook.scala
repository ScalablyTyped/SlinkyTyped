package typingsSlinky.libp2pGossipsub.interfacesMod

import typingsSlinky.peerId.mod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AddressBook
  extends Book[^, js.Array[typingsSlinky.multiaddr.mod.^]] {
  
  def consumePeerRecord(envelope: Envelope): Boolean = js.native
  
  def getRawEnvelope(peerId: ^): js.UndefOr[js.typedarray.Uint8Array] = js.native
}
object AddressBook {
  
  @scala.inline
  def apply(
    add: (^, js.Array[typingsSlinky.multiaddr.mod.^]) => AddressBook,
    consumePeerRecord: Envelope => Boolean,
    get: ^ => js.Array[js.Array[typingsSlinky.multiaddr.mod.^]],
    getRawEnvelope: ^ => js.UndefOr[js.typedarray.Uint8Array],
    set: (^, js.Array[js.Array[typingsSlinky.multiaddr.mod.^]]) => AddressBook
  ): AddressBook = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction2(add), consumePeerRecord = js.Any.fromFunction1(consumePeerRecord), get = js.Any.fromFunction1(get), getRawEnvelope = js.Any.fromFunction1(getRawEnvelope), set = js.Any.fromFunction2(set))
    __obj.asInstanceOf[AddressBook]
  }
  
  @scala.inline
  implicit class AddressBookOps[Self <: AddressBook] (val x: Self) extends AnyVal {
    
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
    def setConsumePeerRecord(value: Envelope => Boolean): Self = this.set("consumePeerRecord", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetRawEnvelope(value: ^ => js.UndefOr[js.typedarray.Uint8Array]): Self = this.set("getRawEnvelope", js.Any.fromFunction1(value))
  }
}
