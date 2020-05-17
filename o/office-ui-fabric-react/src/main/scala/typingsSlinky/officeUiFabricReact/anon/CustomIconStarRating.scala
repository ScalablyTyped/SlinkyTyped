package typingsSlinky.officeUiFabricReact.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomIconStarRating extends js.Object {
  var customIconStarRating: js.UndefOr[Double] = js.native
  var largeStarRating: js.UndefOr[Double] = js.native
  var rating: js.UndefOr[Double] = js.native
  var smallStarRating: js.UndefOr[Double] = js.native
  var tenStarRating: js.UndefOr[Double] = js.native
  var themedStarRating: js.UndefOr[Double] = js.native
}

object CustomIconStarRating {
  @scala.inline
  def apply(): CustomIconStarRating = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomIconStarRating]
  }
  @scala.inline
  implicit class CustomIconStarRatingOps[Self <: CustomIconStarRating] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCustomIconStarRating(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customIconStarRating")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomIconStarRating: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customIconStarRating")(js.undefined)
        ret
    }
    @scala.inline
    def withLargeStarRating(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("largeStarRating")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLargeStarRating: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("largeStarRating")(js.undefined)
        ret
    }
    @scala.inline
    def withRating(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rating")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRating: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rating")(js.undefined)
        ret
    }
    @scala.inline
    def withSmallStarRating(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smallStarRating")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSmallStarRating: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smallStarRating")(js.undefined)
        ret
    }
    @scala.inline
    def withTenStarRating(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tenStarRating")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTenStarRating: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tenStarRating")(js.undefined)
        ret
    }
    @scala.inline
    def withThemedStarRating(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("themedStarRating")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThemedStarRating: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("themedStarRating")(js.undefined)
        ret
    }
  }
  
}

