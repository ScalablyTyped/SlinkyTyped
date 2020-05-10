package typingsSlinky.dojo.dojox.widget.rotator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/widget/rotator/Slide.html
  *
  *
  */
@js.native
trait Slide extends js.Object {
  /**
    * Returns a dojo.Animation that slides in the next rotator pane from the top.
    *
    * @param args
    */
  def slideDown(args: js.Object): js.Any = js.native
  /**
    * Returns a dojo.Animation that slides in the next rotator pane from the left.
    *
    * @param args
    */
  def slideLeft(args: js.Object): js.Any = js.native
  /**
    * Returns a dojo.Animation that slides in the next rotator pane from the right.
    *
    * @param args
    */
  def slideRight(args: js.Object): js.Any = js.native
  /**
    * Returns a dojo.Animation that slides in the next rotator pane from the bottom.
    *
    * @param args
    */
  def slideUp(args: js.Object): js.Any = js.native
}

object Slide {
  @scala.inline
  def apply(
    slideDown: js.Object => js.Any,
    slideLeft: js.Object => js.Any,
    slideRight: js.Object => js.Any,
    slideUp: js.Object => js.Any
  ): Slide = {
    val __obj = js.Dynamic.literal(slideDown = js.Any.fromFunction1(slideDown), slideLeft = js.Any.fromFunction1(slideLeft), slideRight = js.Any.fromFunction1(slideRight), slideUp = js.Any.fromFunction1(slideUp))
    __obj.asInstanceOf[Slide]
  }
  @scala.inline
  implicit class SlideOps[Self <: Slide] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSlideDown(value: js.Object => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slideDown")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSlideLeft(value: js.Object => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slideLeft")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSlideRight(value: js.Object => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slideRight")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSlideUp(value: js.Object => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slideUp")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

