package typingsSlinky.antdMobileRn.cardStyleIndexNativeMod

import typingsSlinky.reactNative.mod.ImageStyle
import typingsSlinky.reactNative.mod.TextStyle
import typingsSlinky.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICardStyle extends js.Object {
  var body: ViewStyle = js.native
  var card: ViewStyle = js.native
  var footerContent: TextStyle = js.native
  var footerExtra: TextStyle = js.native
  var footerWrap: ViewStyle = js.native
  var full: ViewStyle = js.native
  var headerContent: TextStyle = js.native
  var headerExtra: TextStyle = js.native
  var headerImage: ImageStyle = js.native
  var headerTitle: ViewStyle = js.native
  var headerWrap: ViewStyle = js.native
}

object ICardStyle {
  @scala.inline
  def apply(
    body: ViewStyle,
    card: ViewStyle,
    footerContent: TextStyle,
    footerExtra: TextStyle,
    footerWrap: ViewStyle,
    full: ViewStyle,
    headerContent: TextStyle,
    headerExtra: TextStyle,
    headerImage: ImageStyle,
    headerTitle: ViewStyle,
    headerWrap: ViewStyle
  ): ICardStyle = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], card = card.asInstanceOf[js.Any], footerContent = footerContent.asInstanceOf[js.Any], footerExtra = footerExtra.asInstanceOf[js.Any], footerWrap = footerWrap.asInstanceOf[js.Any], full = full.asInstanceOf[js.Any], headerContent = headerContent.asInstanceOf[js.Any], headerExtra = headerExtra.asInstanceOf[js.Any], headerImage = headerImage.asInstanceOf[js.Any], headerTitle = headerTitle.asInstanceOf[js.Any], headerWrap = headerWrap.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICardStyle]
  }
  @scala.inline
  implicit class ICardStyleOps[Self <: ICardStyle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBody(value: ViewStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCard(value: ViewStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("card")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFooterContent(value: TextStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footerContent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFooterExtra(value: TextStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footerExtra")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFooterWrap(value: ViewStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footerWrap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFull(value: ViewStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("full")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeaderContent(value: TextStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerContent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeaderExtra(value: TextStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerExtra")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeaderImage(value: ImageStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerImage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeaderTitle(value: ViewStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeaderWrap(value: ViewStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerWrap")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

