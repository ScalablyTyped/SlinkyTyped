package typingsSlinky.awsSdk.servicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListPortfoliosForProductOutput extends js.Object {
  
  /**
    * The page token to use to retrieve the next set of results. If there are no additional results, this value is null.
    */
  var NextPageToken: js.UndefOr[PageToken] = js.native
  
  /**
    * Information about the portfolios.
    */
  var PortfolioDetails: js.UndefOr[typingsSlinky.awsSdk.servicecatalogMod.PortfolioDetails] = js.native
}
object ListPortfoliosForProductOutput {
  
  @scala.inline
  def apply(): ListPortfoliosForProductOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListPortfoliosForProductOutput]
  }
  
  @scala.inline
  implicit class ListPortfoliosForProductOutputOps[Self <: ListPortfoliosForProductOutput] (val x: Self) extends AnyVal {
    
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
    def setNextPageToken(value: PageToken): Self = this.set("NextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextPageToken: Self = this.set("NextPageToken", js.undefined)
    
    @scala.inline
    def setPortfolioDetailsVarargs(value: PortfolioDetail*): Self = this.set("PortfolioDetails", js.Array(value :_*))
    
    @scala.inline
    def setPortfolioDetails(value: PortfolioDetails): Self = this.set("PortfolioDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePortfolioDetails: Self = this.set("PortfolioDetails", js.undefined)
  }
}
