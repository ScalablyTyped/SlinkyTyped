package typingsSlinky.actionsOnGoogle.v1Mod

import typingsSlinky.actionsOnGoogle.actionsOnGoogleStrings.carousel_card
import typingsSlinky.actionsOnGoogle.actionsOnGoogleStrings.google
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DialogflowV1MessageCarousel
  extends DialogflowV1BaseGoogleMessage[carousel_card]
     with DialogflowV1Message {
  var items: js.UndefOr[js.Array[DialogflowV1MessageOptionItem]] = js.native
}

object DialogflowV1MessageCarousel {
  @scala.inline
  def apply(platform: google): DialogflowV1MessageCarousel = {
    val __obj = js.Dynamic.literal(platform = platform.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialogflowV1MessageCarousel]
  }
  @scala.inline
  implicit class DialogflowV1MessageCarouselOps[Self <: DialogflowV1MessageCarousel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withItems(value: js.Array[DialogflowV1MessageOptionItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(js.undefined)
        ret
    }
  }
  
}

