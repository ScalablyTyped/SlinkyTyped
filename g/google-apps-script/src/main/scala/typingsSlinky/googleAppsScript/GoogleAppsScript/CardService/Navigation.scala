package typingsSlinky.googleAppsScript.GoogleAppsScript.CardService

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A helper object that controls card navigation. See the card navigation guide for more details.
  */
@js.native
trait Navigation extends js.Object {
  def popCard(): Navigation = js.native
  def popToNamedCard(cardName: String): Navigation = js.native
  def popToRoot(): Navigation = js.native
  def printJson(): String = js.native
  def pushCard(card: Card): Navigation = js.native
  def updateCard(card: Card): Navigation = js.native
}

object Navigation {
  @scala.inline
  def apply(
    popCard: () => Navigation,
    popToNamedCard: String => Navigation,
    popToRoot: () => Navigation,
    printJson: () => String,
    pushCard: Card => Navigation,
    updateCard: Card => Navigation
  ): Navigation = {
    val __obj = js.Dynamic.literal(popCard = js.Any.fromFunction0(popCard), popToNamedCard = js.Any.fromFunction1(popToNamedCard), popToRoot = js.Any.fromFunction0(popToRoot), printJson = js.Any.fromFunction0(printJson), pushCard = js.Any.fromFunction1(pushCard), updateCard = js.Any.fromFunction1(updateCard))
    __obj.asInstanceOf[Navigation]
  }
  @scala.inline
  implicit class NavigationOps[Self <: Navigation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPopCard(value: () => Navigation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popCard")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPopToNamedCard(value: String => Navigation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popToNamedCard")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPopToRoot(value: () => Navigation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popToRoot")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPrintJson(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("printJson")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPushCard(value: Card => Navigation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pushCard")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdateCard(value: Card => Navigation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateCard")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

