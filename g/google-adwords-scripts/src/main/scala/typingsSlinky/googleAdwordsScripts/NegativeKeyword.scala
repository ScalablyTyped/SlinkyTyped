package typingsSlinky.googleAdwordsScripts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Negative Keywords
@js.native
trait NegativeKeyword
  extends isAdGroupChild
     with AdWordsEntity {
  
  def getMatchType(): MatchType = js.native
  
  def getText(): String = js.native
  
  def remove(): Unit = js.native
}
object NegativeKeyword {
  
  @scala.inline
  def apply(
    getAdGroup: () => AdGroup,
    getCampaign: () => Campaign,
    getMatchType: () => MatchType,
    getText: () => String,
    remove: () => Unit
  ): NegativeKeyword = {
    val __obj = js.Dynamic.literal(getAdGroup = js.Any.fromFunction0(getAdGroup), getCampaign = js.Any.fromFunction0(getCampaign), getMatchType = js.Any.fromFunction0(getMatchType), getText = js.Any.fromFunction0(getText), remove = js.Any.fromFunction0(remove))
    __obj.asInstanceOf[NegativeKeyword]
  }
  
  @scala.inline
  implicit class NegativeKeywordMutableBuilder[Self <: NegativeKeyword] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetMatchType(value: () => MatchType): Self = StObject.set(x, "getMatchType", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetText(value: () => String): Self = StObject.set(x, "getText", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRemove(value: () => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction0(value))
  }
}
