package typingsSlinky.reactRouterNavigationCore

import typingsSlinky.reactRouterNavigationCore.mod.Card
import typingsSlinky.reactRouterNavigationCore.mod.NavigationState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCards extends js.Object {
  var cards: js.Array[Card] = js.native
  var key: Double = js.native
  var navigationState: NavigationState[AnonParams] = js.native
}

object AnonCards {
  @scala.inline
  def apply(cards: js.Array[Card], key: Double, navigationState: NavigationState[AnonParams]): AnonCards = {
    val __obj = js.Dynamic.literal(cards = cards.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], navigationState = navigationState.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCards]
  }
  @scala.inline
  implicit class AnonCardsOps[Self <: AnonCards] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCards(value: js.Array[Card]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cards")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKey(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNavigationState(value: NavigationState[AnonParams]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navigationState")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

