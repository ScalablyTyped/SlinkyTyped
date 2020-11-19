package typingsSlinky.awsSdk.devicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListOfferingTransactionsResult extends js.Object {
  
  /**
    * An identifier that was returned from the previous call to this operation, which can be used to return the next set of items in the list.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.native
  
  /**
    * The audit log of subscriptions you have purchased and modified through AWS Device Farm.
    */
  var offeringTransactions: js.UndefOr[OfferingTransactions] = js.native
}
object ListOfferingTransactionsResult {
  
  @scala.inline
  def apply(): ListOfferingTransactionsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListOfferingTransactionsResult]
  }
  
  @scala.inline
  implicit class ListOfferingTransactionsResultOps[Self <: ListOfferingTransactionsResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setNextToken(value: PaginationToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
    
    @scala.inline
    def setOfferingTransactionsVarargs(value: OfferingTransaction*): Self = this.set("offeringTransactions", js.Array(value :_*))
    
    @scala.inline
    def setOfferingTransactions(value: OfferingTransactions): Self = this.set("offeringTransactions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOfferingTransactions: Self = this.set("offeringTransactions", js.undefined)
  }
}
