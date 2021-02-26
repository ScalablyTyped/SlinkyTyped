package typingsSlinky.jweixin.mod

import typingsSlinky.jweixin.anon.CardId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IopenCard extends BaseParams {
  
  var cardList: js.Array[CardId] = js.native
}
object IopenCard {
  
  @scala.inline
  def apply(cardList: js.Array[CardId]): IopenCard = {
    val __obj = js.Dynamic.literal(cardList = cardList.asInstanceOf[js.Any])
    __obj.asInstanceOf[IopenCard]
  }
  
  @scala.inline
  implicit class IopenCardMutableBuilder[Self <: IopenCard] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCardList(value: js.Array[CardId]): Self = StObject.set(x, "cardList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCardListVarargs(value: CardId*): Self = StObject.set(x, "cardList", js.Array(value :_*))
  }
}
