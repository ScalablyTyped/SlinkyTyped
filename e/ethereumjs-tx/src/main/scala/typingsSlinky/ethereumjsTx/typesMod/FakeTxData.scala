package typingsSlinky.ethereumjsTx.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FakeTxData extends TxData {
  
  /**
    * The sender of the Tx.
    */
  var from: js.UndefOr[BufferLike] = js.native
}
object FakeTxData {
  
  @scala.inline
  def apply(): FakeTxData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FakeTxData]
  }
  
  @scala.inline
  implicit class FakeTxDataOps[Self <: FakeTxData] (val x: Self) extends AnyVal {
    
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
    def setFrom(value: BufferLike): Self = this.set("from", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFrom: Self = this.set("from", js.undefined)
  }
}
