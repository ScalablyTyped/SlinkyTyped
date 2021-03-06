package typingsSlinky.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IConsensusStateEntry extends StObject {
  
  /** ConsensusStateEntry address */
  var address: js.UndefOr[String | Null] = js.native
  
  /** ConsensusStateEntry data */
  var data: js.UndefOr[js.typedarray.Uint8Array | Null] = js.native
}
object IConsensusStateEntry {
  
  @scala.inline
  def apply(): IConsensusStateEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IConsensusStateEntry]
  }
  
  @scala.inline
  implicit class IConsensusStateEntryMutableBuilder[Self <: IConsensusStateEntry] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddressNull: Self = StObject.set(x, "address", null)
    
    @scala.inline
    def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
    
    @scala.inline
    def setData(value: js.typedarray.Uint8Array): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataNull: Self = StObject.set(x, "data", null)
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
  }
}
