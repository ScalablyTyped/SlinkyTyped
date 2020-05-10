package typingsSlinky.googleAppsScript.GoogleAppsScript.CardService

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The header of a Card.
  *
  *     var cardHeader = CardService.newCardHeader()
  *         .setTitle("Card header title")
  *         .setSubtitle("Card header subtitle")
  *         .setImageStyle(CardService.ImageStyle.CIRCLE)
  *         .setImageUrl("https://image.png");
  */
@js.native
trait CardHeader extends js.Object {
  def setImageAltText(imageAltText: String): CardHeader = js.native
  def setImageStyle(imageStyle: ImageStyle): CardHeader = js.native
  def setImageUrl(imageUrl: String): CardHeader = js.native
  def setSubtitle(subtitle: String): CardHeader = js.native
  def setTitle(title: String): CardHeader = js.native
}

object CardHeader {
  @scala.inline
  def apply(
    setImageAltText: String => CardHeader,
    setImageStyle: ImageStyle => CardHeader,
    setImageUrl: String => CardHeader,
    setSubtitle: String => CardHeader,
    setTitle: String => CardHeader
  ): CardHeader = {
    val __obj = js.Dynamic.literal(setImageAltText = js.Any.fromFunction1(setImageAltText), setImageStyle = js.Any.fromFunction1(setImageStyle), setImageUrl = js.Any.fromFunction1(setImageUrl), setSubtitle = js.Any.fromFunction1(setSubtitle), setTitle = js.Any.fromFunction1(setTitle))
    __obj.asInstanceOf[CardHeader]
  }
  @scala.inline
  implicit class CardHeaderOps[Self <: CardHeader] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSetImageAltText(value: String => CardHeader): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setImageAltText")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetImageStyle(value: ImageStyle => CardHeader): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setImageStyle")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetImageUrl(value: String => CardHeader): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setImageUrl")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetSubtitle(value: String => CardHeader): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setSubtitle")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetTitle(value: String => CardHeader): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setTitle")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

