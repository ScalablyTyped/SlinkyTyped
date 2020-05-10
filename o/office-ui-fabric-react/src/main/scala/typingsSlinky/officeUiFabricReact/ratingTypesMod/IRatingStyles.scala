package typingsSlinky.officeUiFabricReact.ratingTypesMod

import typingsSlinky.uifabricMergeStyles.istyleMod.IStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IRatingStyles extends js.Object {
  var labelText: IStyle = js.native
  var ratingButton: IStyle = js.native
  var ratingFocusZone: IStyle = js.native
  var ratingStar: IStyle = js.native
  var ratingStarBack: IStyle = js.native
  var ratingStarFront: IStyle = js.native
  var ratingStarIsLarge: IStyle = js.native
  var ratingStarIsSmall: IStyle = js.native
  var root: IStyle = js.native
  var rootIsLarge: IStyle = js.native
  var rootIsSmall: IStyle = js.native
}

object IRatingStyles {
  @scala.inline
  def apply(): IRatingStyles = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IRatingStyles]
  }
  @scala.inline
  implicit class IRatingStylesOps[Self <: IRatingStyles] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLabelText(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelText")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelTextNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelText")(null)
        ret
    }
    @scala.inline
    def withRatingButton(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ratingButton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRatingButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ratingButton")(js.undefined)
        ret
    }
    @scala.inline
    def withRatingButtonNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ratingButton")(null)
        ret
    }
    @scala.inline
    def withRatingFocusZone(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ratingFocusZone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRatingFocusZone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ratingFocusZone")(js.undefined)
        ret
    }
    @scala.inline
    def withRatingFocusZoneNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ratingFocusZone")(null)
        ret
    }
    @scala.inline
    def withRatingStar(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ratingStar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRatingStar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ratingStar")(js.undefined)
        ret
    }
    @scala.inline
    def withRatingStarNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ratingStar")(null)
        ret
    }
    @scala.inline
    def withRatingStarBack(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ratingStarBack")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRatingStarBack: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ratingStarBack")(js.undefined)
        ret
    }
    @scala.inline
    def withRatingStarBackNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ratingStarBack")(null)
        ret
    }
    @scala.inline
    def withRatingStarFront(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ratingStarFront")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRatingStarFront: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ratingStarFront")(js.undefined)
        ret
    }
    @scala.inline
    def withRatingStarFrontNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ratingStarFront")(null)
        ret
    }
    @scala.inline
    def withRatingStarIsLarge(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ratingStarIsLarge")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRatingStarIsLarge: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ratingStarIsLarge")(js.undefined)
        ret
    }
    @scala.inline
    def withRatingStarIsLargeNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ratingStarIsLarge")(null)
        ret
    }
    @scala.inline
    def withRatingStarIsSmall(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ratingStarIsSmall")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRatingStarIsSmall: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ratingStarIsSmall")(js.undefined)
        ret
    }
    @scala.inline
    def withRatingStarIsSmallNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ratingStarIsSmall")(null)
        ret
    }
    @scala.inline
    def withRoot(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("root")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoot: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("root")(js.undefined)
        ret
    }
    @scala.inline
    def withRootNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("root")(null)
        ret
    }
    @scala.inline
    def withRootIsLarge(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootIsLarge")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRootIsLarge: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootIsLarge")(js.undefined)
        ret
    }
    @scala.inline
    def withRootIsLargeNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootIsLarge")(null)
        ret
    }
    @scala.inline
    def withRootIsSmall(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootIsSmall")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRootIsSmall: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootIsSmall")(js.undefined)
        ret
    }
    @scala.inline
    def withRootIsSmallNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootIsSmall")(null)
        ret
    }
  }
  
}

