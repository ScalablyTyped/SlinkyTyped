package typingsSlinky.jweixin.mod

import typingsSlinky.jweixin.anon.CardExt
import typingsSlinky.jweixin.anon.CardList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IaddCard extends BaseParams {
  
  var cardList: js.Array[CardExt] = js.native
  
  // 需要添加的卡券列表
  @JSName("success")
  def success_MIaddCard(res: CardList): Unit = js.native
}
object IaddCard {
  
  @scala.inline
  def apply(cardList: js.Array[CardExt], success: CardList => Unit): IaddCard = {
    val __obj = js.Dynamic.literal(cardList = cardList.asInstanceOf[js.Any], success = js.Any.fromFunction1(success))
    __obj.asInstanceOf[IaddCard]
  }
  
  @scala.inline
  implicit class IaddCardMutableBuilder[Self <: IaddCard] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCardList(value: js.Array[CardExt]): Self = StObject.set(x, "cardList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCardListVarargs(value: CardExt*): Self = StObject.set(x, "cardList", js.Array(value :_*))
    
    @scala.inline
    def setSuccess(value: CardList => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
  }
}
