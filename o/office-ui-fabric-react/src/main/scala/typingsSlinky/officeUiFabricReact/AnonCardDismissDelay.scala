package typingsSlinky.officeUiFabricReact

import typingsSlinky.officeUiFabricReact.hoverCardTypesMod.HoverCardType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCardDismissDelay extends js.Object {
  var cardDismissDelay: Double = js.native
  var cardOpenDelay: Double = js.native
  var expandedCardOpenDelay: Double = js.native
  var instantOpenOnClick: Boolean = js.native
  var openHotKey: Double = js.native
  var setInitialFocus: Boolean = js.native
  var `type`: HoverCardType = js.native
}

object AnonCardDismissDelay {
  @scala.inline
  def apply(
    cardDismissDelay: Double,
    cardOpenDelay: Double,
    expandedCardOpenDelay: Double,
    instantOpenOnClick: Boolean,
    openHotKey: Double,
    setInitialFocus: Boolean,
    `type`: HoverCardType
  ): AnonCardDismissDelay = {
    val __obj = js.Dynamic.literal(cardDismissDelay = cardDismissDelay.asInstanceOf[js.Any], cardOpenDelay = cardOpenDelay.asInstanceOf[js.Any], expandedCardOpenDelay = expandedCardOpenDelay.asInstanceOf[js.Any], instantOpenOnClick = instantOpenOnClick.asInstanceOf[js.Any], openHotKey = openHotKey.asInstanceOf[js.Any], setInitialFocus = setInitialFocus.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCardDismissDelay]
  }
  @scala.inline
  implicit class AnonCardDismissDelayOps[Self <: AnonCardDismissDelay] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCardDismissDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cardDismissDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCardOpenDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cardOpenDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExpandedCardOpenDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandedCardOpenDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInstantOpenOnClick(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instantOpenOnClick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOpenHotKey(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openHotKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSetInitialFocus(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setInitialFocus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: HoverCardType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

