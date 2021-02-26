package typingsSlinky.googleAdwordsScripts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SearchAdGroupExcludedAudience extends isAdGroupChild {
  
  def getAudienceId(): Double = js.native
  
  def getId(): Double = js.native
  
  def getName(): String = js.native
  
  def remove(): Unit = js.native
}
object SearchAdGroupExcludedAudience {
  
  @scala.inline
  def apply(
    getAdGroup: () => AdGroup,
    getAudienceId: () => Double,
    getCampaign: () => Campaign,
    getId: () => Double,
    getName: () => String,
    remove: () => Unit
  ): SearchAdGroupExcludedAudience = {
    val __obj = js.Dynamic.literal(getAdGroup = js.Any.fromFunction0(getAdGroup), getAudienceId = js.Any.fromFunction0(getAudienceId), getCampaign = js.Any.fromFunction0(getCampaign), getId = js.Any.fromFunction0(getId), getName = js.Any.fromFunction0(getName), remove = js.Any.fromFunction0(remove))
    __obj.asInstanceOf[SearchAdGroupExcludedAudience]
  }
  
  @scala.inline
  implicit class SearchAdGroupExcludedAudienceMutableBuilder[Self <: SearchAdGroupExcludedAudience] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetAudienceId(value: () => Double): Self = StObject.set(x, "getAudienceId", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetId(value: () => Double): Self = StObject.set(x, "getId", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetName(value: () => String): Self = StObject.set(x, "getName", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRemove(value: () => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction0(value))
  }
}
