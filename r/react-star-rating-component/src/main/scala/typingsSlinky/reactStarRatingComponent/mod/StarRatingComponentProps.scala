package typingsSlinky.reactStarRatingComponent.mod

import slinky.core.TagMod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StarRatingComponentProps extends js.Object {
  /** is component available for editing, default `true` */
  var editing: js.UndefOr[Boolean] = js.native
  /** color of non-selected icons */
  var emptyStarColor: js.UndefOr[String] = js.native
  /** name of the radio input */
  var name: String = js.native
  var onStarClick: js.UndefOr[
    js.Function3[/* nextValue */ Double, /* prevValue */ Double, /* name */ String, Unit]
  ] = js.native
  var onStarHover: js.UndefOr[
    js.Function3[/* nextValue */ Double, /* prevValue */ Double, /* name */ String, Unit]
  ] = js.native
  var onStarHoverOut: js.UndefOr[
    js.Function3[/* nextValue */ Double, /* prevValue */ Double, /* name */ String, Unit]
  ] = js.native
  /** render method for the full-star icon */
  var renderStarIcon: js.UndefOr[
    js.Function3[
      /* nextValue */ Double, 
      /* prevValue */ Double, 
      /* name */ String, 
      TagMod[Any] | String
    ]
  ] = js.native
  /** render method for the half-star icon */
  var renderStarIconHalf: js.UndefOr[
    js.Function3[
      /* nextValue */ Double, 
      /* prevValue */ Double, 
      /* name */ String, 
      TagMod[Any] | String
    ]
  ] = js.native
  /** color of selected icons */
  var starColor: js.UndefOr[String] = js.native
  /** number of icons in rating, default `5` */
  var starCount: js.UndefOr[Double] = js.native
  /** the value of the star rating to display. i.e. the number of filled stars */
  var value: Double = js.native
}

object StarRatingComponentProps {
  @scala.inline
  def apply(name: String, value: Double): StarRatingComponentProps = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[StarRatingComponentProps]
  }
  @scala.inline
  implicit class StarRatingComponentPropsOps[Self <: StarRatingComponentProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEditing(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEditing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editing")(js.undefined)
        ret
    }
    @scala.inline
    def withEmptyStarColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emptyStarColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmptyStarColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emptyStarColor")(js.undefined)
        ret
    }
    @scala.inline
    def withOnStarClick(value: (/* nextValue */ Double, /* prevValue */ Double, /* name */ String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onStarClick")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutOnStarClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onStarClick")(js.undefined)
        ret
    }
    @scala.inline
    def withOnStarHover(value: (/* nextValue */ Double, /* prevValue */ Double, /* name */ String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onStarHover")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutOnStarHover: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onStarHover")(js.undefined)
        ret
    }
    @scala.inline
    def withOnStarHoverOut(value: (/* nextValue */ Double, /* prevValue */ Double, /* name */ String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onStarHoverOut")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutOnStarHoverOut: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onStarHoverOut")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderStarIcon(value: (/* nextValue */ Double, /* prevValue */ Double, /* name */ String) => TagMod[Any] | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderStarIcon")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutRenderStarIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderStarIcon")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderStarIconHalf(value: (/* nextValue */ Double, /* prevValue */ Double, /* name */ String) => TagMod[Any] | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderStarIconHalf")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutRenderStarIconHalf: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderStarIconHalf")(js.undefined)
        ret
    }
    @scala.inline
    def withStarColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("starColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStarColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("starColor")(js.undefined)
        ret
    }
    @scala.inline
    def withStarCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("starCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStarCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("starCount")(js.undefined)
        ret
    }
  }
  
}

