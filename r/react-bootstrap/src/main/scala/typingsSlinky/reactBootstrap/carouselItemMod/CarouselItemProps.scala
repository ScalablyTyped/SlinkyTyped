package typingsSlinky.reactBootstrap.carouselItemMod

import typingsSlinky.react.mod.AllHTMLAttributes
import typingsSlinky.react.mod.ClassAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CarouselItemProps
  extends AllHTMLAttributes[CarouselItem]
     with ClassAttributes[CarouselItem] {
  var active: js.UndefOr[Boolean] = js.native
  var animateOut: js.UndefOr[Boolean] = js.native
  var animtateIn: js.UndefOr[Boolean] = js.native
  var direction: js.UndefOr[String] = js.native
  var index: js.UndefOr[Double] = js.native
  // TODO: Add more specific type
  var onAnimateOutEnd: js.UndefOr[js.Function] = js.native
}

object CarouselItemProps {
  @scala.inline
  def apply(): CarouselItemProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CarouselItemProps]
  }
  @scala.inline
  implicit class CarouselItemPropsOps[Self <: CarouselItemProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("active")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("active")(js.undefined)
        ret
    }
    @scala.inline
    def withAnimateOut(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animateOut")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimateOut: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animateOut")(js.undefined)
        ret
    }
    @scala.inline
    def withAnimtateIn(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animtateIn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimtateIn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animtateIn")(js.undefined)
        ret
    }
    @scala.inline
    def withDirection(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direction")(js.undefined)
        ret
    }
    @scala.inline
    def withIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(js.undefined)
        ret
    }
    @scala.inline
    def withOnAnimateOutEnd(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAnimateOutEnd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnAnimateOutEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAnimateOutEnd")(js.undefined)
        ret
    }
  }
  
}

