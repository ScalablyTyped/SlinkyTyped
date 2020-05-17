package typingsSlinky.instagramPrivateApi.anon

import typingsSlinky.instagramPrivateApi.instagramPrivateApiStrings.mention_reshare
import typingsSlinky.instagramPrivateApi.instagramPrivateApiStrings.mention_username
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<instagram-private-api.instagram-private-api/dist/sticker-builder/stickers.MentionSticker> */
@js.native
trait PartialMentionSticker extends js.Object {
  var additionalConfigureProperties: js.UndefOr[js.Function0[_]] = js.native
  var bottom: js.UndefOr[js.Function0[this.type]] = js.native
  var center: js.UndefOr[js.Function0[this.type]] = js.native
  var displayType: js.UndefOr[mention_username | mention_reshare] = js.native
  var height: js.UndefOr[Double] = js.native
  var id: js.UndefOr[js.Function0[String]] = js.native
  var isSticker: js.UndefOr[Boolean] = js.native
  var key: js.UndefOr[js.Function0[String]] = js.native
  var left: js.UndefOr[js.Function0[this.type]] = js.native
  var mediaId: js.UndefOr[String] = js.native
  var moveBackwards: js.UndefOr[js.Function1[/* layers */ js.UndefOr[Double], this.type]] = js.native
  var moveForward: js.UndefOr[js.Function1[/* layers */ js.UndefOr[Double], this.type]] = js.native
  var right: js.UndefOr[js.Function0[this.type]] = js.native
  var rotateDeg: js.UndefOr[js.Function1[/* deg */ Double, this.type]] = js.native
  var rotation: js.UndefOr[Double] = js.native
  var scale: js.UndefOr[js.Function1[/* factor */ Double, this.type]] = js.native
  var toJSON: js.UndefOr[js.Function0[_]] = js.native
  var top: js.UndefOr[js.Function0[this.type]] = js.native
  var userId: js.UndefOr[String] = js.native
  var width: js.UndefOr[Double] = js.native
  var x: js.UndefOr[Double] = js.native
  var y: js.UndefOr[Double] = js.native
  var z: js.UndefOr[Double] = js.native
}

object PartialMentionSticker {
  @scala.inline
  def apply(): PartialMentionSticker = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialMentionSticker]
  }
  @scala.inline
  implicit class PartialMentionStickerOps[Self <: PartialMentionSticker] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdditionalConfigureProperties(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("additionalConfigureProperties")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutAdditionalConfigureProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("additionalConfigureProperties")(js.undefined)
        ret
    }
    @scala.inline
    def withBottom(value: () => PartialMentionSticker): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bottom")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutBottom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bottom")(js.undefined)
        ret
    }
    @scala.inline
    def withCenter(value: () => PartialMentionSticker): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("center")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutCenter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("center")(js.undefined)
        ret
    }
    @scala.inline
    def withDisplayType(value: mention_username | mention_reshare): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayType")(js.undefined)
        ret
    }
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withIsSticker(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSticker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsSticker: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSticker")(js.undefined)
        ret
    }
    @scala.inline
    def withKey(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(js.undefined)
        ret
    }
    @scala.inline
    def withLeft(value: () => PartialMentionSticker): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("left")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutLeft: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("left")(js.undefined)
        ret
    }
    @scala.inline
    def withMediaId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mediaId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMediaId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mediaId")(js.undefined)
        ret
    }
    @scala.inline
    def withMoveBackwards(value: /* layers */ js.UndefOr[Double] => PartialMentionSticker): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moveBackwards")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutMoveBackwards: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moveBackwards")(js.undefined)
        ret
    }
    @scala.inline
    def withMoveForward(value: /* layers */ js.UndefOr[Double] => PartialMentionSticker): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moveForward")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutMoveForward: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moveForward")(js.undefined)
        ret
    }
    @scala.inline
    def withRight(value: () => PartialMentionSticker): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("right")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutRight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("right")(js.undefined)
        ret
    }
    @scala.inline
    def withRotateDeg(value: /* deg */ Double => PartialMentionSticker): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotateDeg")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRotateDeg: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotateDeg")(js.undefined)
        ret
    }
    @scala.inline
    def withRotation(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRotation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotation")(js.undefined)
        ret
    }
    @scala.inline
    def withScale(value: /* factor */ Double => PartialMentionSticker): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scale")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutScale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scale")(js.undefined)
        ret
    }
    @scala.inline
    def withToJSON(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toJSON")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutToJSON: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toJSON")(js.undefined)
        ret
    }
    @scala.inline
    def withTop(value: () => PartialMentionSticker): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("top")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutTop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("top")(js.undefined)
        ret
    }
    @scala.inline
    def withUserId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userId")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
    @scala.inline
    def withX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x")(js.undefined)
        ret
    }
    @scala.inline
    def withY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y")(js.undefined)
        ret
    }
    @scala.inline
    def withZ(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("z")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZ: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("z")(js.undefined)
        ret
    }
  }
  
}

