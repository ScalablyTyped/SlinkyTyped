package typingsSlinky.googleAdwordsScripts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SearchCampaignAudience extends SearchCampaignExcludedAudience {
  
  def bidding(): SearchAudienceBidding = js.native
  
  def isEnabled(): Boolean = js.native
  
  def isPaused(): Boolean = js.native
}
object SearchCampaignAudience {
  
  @scala.inline
  def apply(
    bidding: () => SearchAudienceBidding,
    getAudienceId: () => Double,
    getCampaign: () => Campaign,
    getId: () => Double,
    getName: () => String,
    isEnabled: () => Boolean,
    isPaused: () => Boolean,
    remove: () => Unit
  ): SearchCampaignAudience = {
    val __obj = js.Dynamic.literal(bidding = js.Any.fromFunction0(bidding), getAudienceId = js.Any.fromFunction0(getAudienceId), getCampaign = js.Any.fromFunction0(getCampaign), getId = js.Any.fromFunction0(getId), getName = js.Any.fromFunction0(getName), isEnabled = js.Any.fromFunction0(isEnabled), isPaused = js.Any.fromFunction0(isPaused), remove = js.Any.fromFunction0(remove))
    __obj.asInstanceOf[SearchCampaignAudience]
  }
  
  @scala.inline
  implicit class SearchCampaignAudienceMutableBuilder[Self <: SearchCampaignAudience] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBidding(value: () => SearchAudienceBidding): Self = StObject.set(x, "bidding", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsEnabled(value: () => Boolean): Self = StObject.set(x, "isEnabled", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsPaused(value: () => Boolean): Self = StObject.set(x, "isPaused", js.Any.fromFunction0(value))
  }
}
