package typingsSlinky.maximMazurokGapiClientAdexchangebuyer.gapi.client.adexchangebuyer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MarketplaceLabel extends js.Object {
  
  /** The accountId of the party that created the label. */
  var accountId: js.UndefOr[String] = js.native
  
  /** The creation time (in ms since epoch) for the label. */
  var createTimeMs: js.UndefOr[String] = js.native
  
  /** Information about the party that created the label. */
  var deprecatedMarketplaceDealParty: js.UndefOr[MarketplaceDealParty] = js.native
  
  /** The label to use. */
  var label: js.UndefOr[String] = js.native
}
object MarketplaceLabel {
  
  @scala.inline
  def apply(): MarketplaceLabel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MarketplaceLabel]
  }
  
  @scala.inline
  implicit class MarketplaceLabelOps[Self <: MarketplaceLabel] (val x: Self) extends AnyVal {
    
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
    def setAccountId(value: String): Self = this.set("accountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccountId: Self = this.set("accountId", js.undefined)
    
    @scala.inline
    def setCreateTimeMs(value: String): Self = this.set("createTimeMs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreateTimeMs: Self = this.set("createTimeMs", js.undefined)
    
    @scala.inline
    def setDeprecatedMarketplaceDealParty(value: MarketplaceDealParty): Self = this.set("deprecatedMarketplaceDealParty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeprecatedMarketplaceDealParty: Self = this.set("deprecatedMarketplaceDealParty", js.undefined)
    
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
  }
}
