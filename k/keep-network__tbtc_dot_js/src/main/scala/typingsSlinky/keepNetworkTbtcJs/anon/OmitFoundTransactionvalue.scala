package typingsSlinky.keepNetworkTbtcJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<@keep-network/tbtc.js.@keep-network/tbtc.js/src/BitcoinHelpers.FoundTransaction, 'value'> */
@js.native
trait OmitFoundTransactionvalue extends js.Object {
  
  var outputPosition: Double = js.native
  
  var transactionID: String = js.native
}
object OmitFoundTransactionvalue {
  
  @scala.inline
  def apply(outputPosition: Double, transactionID: String): OmitFoundTransactionvalue = {
    val __obj = js.Dynamic.literal(outputPosition = outputPosition.asInstanceOf[js.Any], transactionID = transactionID.asInstanceOf[js.Any])
    __obj.asInstanceOf[OmitFoundTransactionvalue]
  }
  
  @scala.inline
  implicit class OmitFoundTransactionvalueOps[Self <: OmitFoundTransactionvalue] (val x: Self) extends AnyVal {
    
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
    def setOutputPosition(value: Double): Self = this.set("outputPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransactionID(value: String): Self = this.set("transactionID", value.asInstanceOf[js.Any])
  }
}
