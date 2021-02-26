package typingsSlinky.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IConsensusPeerInfo extends StObject {
  
  /** ConsensusPeerInfo peerId */
  var peerId: js.UndefOr[js.typedarray.Uint8Array | Null] = js.native
}
object IConsensusPeerInfo {
  
  @scala.inline
  def apply(): IConsensusPeerInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IConsensusPeerInfo]
  }
  
  @scala.inline
  implicit class IConsensusPeerInfoMutableBuilder[Self <: IConsensusPeerInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPeerId(value: js.typedarray.Uint8Array): Self = StObject.set(x, "peerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPeerIdNull: Self = StObject.set(x, "peerId", null)
    
    @scala.inline
    def setPeerIdUndefined: Self = StObject.set(x, "peerId", js.undefined)
  }
}
