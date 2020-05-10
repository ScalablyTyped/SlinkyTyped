package typingsSlinky.googleAppsScript.GoogleAppsScript.CardService

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A builder for the UniversalActionResponse objects.
  */
@js.native
trait UniversalActionResponseBuilder extends js.Object {
  def build(): UniversalActionResponse = js.native
  def displayAddOnCards(cardObjects: js.Array[Card]): UniversalActionResponseBuilder = js.native
  def setOpenLink(openLink: OpenLink): UniversalActionResponseBuilder = js.native
}

object UniversalActionResponseBuilder {
  @scala.inline
  def apply(
    build: () => UniversalActionResponse,
    displayAddOnCards: js.Array[Card] => UniversalActionResponseBuilder,
    setOpenLink: OpenLink => UniversalActionResponseBuilder
  ): UniversalActionResponseBuilder = {
    val __obj = js.Dynamic.literal(build = js.Any.fromFunction0(build), displayAddOnCards = js.Any.fromFunction1(displayAddOnCards), setOpenLink = js.Any.fromFunction1(setOpenLink))
    __obj.asInstanceOf[UniversalActionResponseBuilder]
  }
  @scala.inline
  implicit class UniversalActionResponseBuilderOps[Self <: UniversalActionResponseBuilder] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBuild(value: () => UniversalActionResponse): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("build")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDisplayAddOnCards(value: js.Array[Card] => UniversalActionResponseBuilder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayAddOnCards")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetOpenLink(value: OpenLink => UniversalActionResponseBuilder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setOpenLink")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

