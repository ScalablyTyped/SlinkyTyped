package typingsSlinky.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IBatch extends StObject {
  
  /** Batch header */
  var header: js.UndefOr[js.typedarray.Uint8Array | Null] = js.native
  
  /** Batch headerSignature */
  var headerSignature: js.UndefOr[String | Null] = js.native
  
  /** Batch trace */
  var trace: js.UndefOr[Boolean | Null] = js.native
  
  /** Batch transactions */
  var transactions: js.UndefOr[js.Array[ITransaction] | Null] = js.native
}
object IBatch {
  
  @scala.inline
  def apply(): IBatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IBatch]
  }
  
  @scala.inline
  implicit class IBatchMutableBuilder[Self <: IBatch] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeader(value: js.typedarray.Uint8Array): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderNull: Self = StObject.set(x, "header", null)
    
    @scala.inline
    def setHeaderSignature(value: String): Self = StObject.set(x, "headerSignature", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderSignatureNull: Self = StObject.set(x, "headerSignature", null)
    
    @scala.inline
    def setHeaderSignatureUndefined: Self = StObject.set(x, "headerSignature", js.undefined)
    
    @scala.inline
    def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
    
    @scala.inline
    def setTrace(value: Boolean): Self = StObject.set(x, "trace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTraceNull: Self = StObject.set(x, "trace", null)
    
    @scala.inline
    def setTraceUndefined: Self = StObject.set(x, "trace", js.undefined)
    
    @scala.inline
    def setTransactions(value: js.Array[ITransaction]): Self = StObject.set(x, "transactions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransactionsNull: Self = StObject.set(x, "transactions", null)
    
    @scala.inline
    def setTransactionsUndefined: Self = StObject.set(x, "transactions", js.undefined)
    
    @scala.inline
    def setTransactionsVarargs(value: ITransaction*): Self = StObject.set(x, "transactions", js.Array(value :_*))
  }
}
