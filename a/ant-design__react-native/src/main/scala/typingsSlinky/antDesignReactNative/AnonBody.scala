package typingsSlinky.antDesignReactNative

import typingsSlinky.reactNative.mod.ImageStyle
import typingsSlinky.reactNative.mod.RegisteredStyle
import typingsSlinky.reactNative.mod.TextStyle
import typingsSlinky.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonBody extends js.Object {
  var body: RegisteredStyle[ViewStyle] = js.native
  var card: RegisteredStyle[ViewStyle] = js.native
  var footerContent: RegisteredStyle[TextStyle] = js.native
  var footerExtra: RegisteredStyle[TextStyle] = js.native
  var footerWrap: RegisteredStyle[ViewStyle] = js.native
  var full: RegisteredStyle[ViewStyle] = js.native
  var headerContent: RegisteredStyle[TextStyle] = js.native
  var headerContentWrap: RegisteredStyle[ViewStyle] = js.native
  var headerExtra: RegisteredStyle[TextStyle] = js.native
  var headerExtraWrap: RegisteredStyle[ViewStyle] = js.native
  var headerImage: RegisteredStyle[ImageStyle] = js.native
  var headerTitle: RegisteredStyle[ViewStyle] = js.native
  var headerWrap: RegisteredStyle[ViewStyle] = js.native
}

object AnonBody {
  @scala.inline
  def apply(
    body: RegisteredStyle[ViewStyle],
    card: RegisteredStyle[ViewStyle],
    footerContent: RegisteredStyle[TextStyle],
    footerExtra: RegisteredStyle[TextStyle],
    footerWrap: RegisteredStyle[ViewStyle],
    full: RegisteredStyle[ViewStyle],
    headerContent: RegisteredStyle[TextStyle],
    headerContentWrap: RegisteredStyle[ViewStyle],
    headerExtra: RegisteredStyle[TextStyle],
    headerExtraWrap: RegisteredStyle[ViewStyle],
    headerImage: RegisteredStyle[ImageStyle],
    headerTitle: RegisteredStyle[ViewStyle],
    headerWrap: RegisteredStyle[ViewStyle]
  ): AnonBody = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], card = card.asInstanceOf[js.Any], footerContent = footerContent.asInstanceOf[js.Any], footerExtra = footerExtra.asInstanceOf[js.Any], footerWrap = footerWrap.asInstanceOf[js.Any], full = full.asInstanceOf[js.Any], headerContent = headerContent.asInstanceOf[js.Any], headerContentWrap = headerContentWrap.asInstanceOf[js.Any], headerExtra = headerExtra.asInstanceOf[js.Any], headerExtraWrap = headerExtraWrap.asInstanceOf[js.Any], headerImage = headerImage.asInstanceOf[js.Any], headerTitle = headerTitle.asInstanceOf[js.Any], headerWrap = headerWrap.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBody]
  }
  @scala.inline
  implicit class AnonBodyOps[Self <: AnonBody] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBody(value: RegisteredStyle[ViewStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCard(value: RegisteredStyle[ViewStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("card")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFooterContent(value: RegisteredStyle[TextStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footerContent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFooterExtra(value: RegisteredStyle[TextStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footerExtra")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFooterWrap(value: RegisteredStyle[ViewStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footerWrap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFull(value: RegisteredStyle[ViewStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("full")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeaderContent(value: RegisteredStyle[TextStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerContent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeaderContentWrap(value: RegisteredStyle[ViewStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerContentWrap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeaderExtra(value: RegisteredStyle[TextStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerExtra")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeaderExtraWrap(value: RegisteredStyle[ViewStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerExtraWrap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeaderImage(value: RegisteredStyle[ImageStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerImage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeaderTitle(value: RegisteredStyle[ViewStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeaderWrap(value: RegisteredStyle[ViewStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerWrap")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

