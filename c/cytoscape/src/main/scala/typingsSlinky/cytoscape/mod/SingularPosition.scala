package typingsSlinky.cytoscape.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * http://js.cytoscape.org/#collection/position--dimensions
  */
@js.native
trait SingularPosition extends js.Object {
  /**
    * Gets whether the element is active (e.g. on user tap, grab, etc).
    * http://js.cytoscape.org/#ele.active
    */
  def active(): Boolean = js.native
  /**
    * Get the height of the element.
    */
  def height(): Double = js.native
  /**
    * Get the outer height of the element (includes height, padding, & border).
    */
  def outerHeight(): Double = js.native
  /**
    * Get the outer width of the element (includes width, padding, & border).
    */
  def outerWidth(): Double = js.native
  /**
    * Get the height of the element in rendered dimensions.
    */
  def renderedHeight(): Double = js.native
  /**
    * Get the outer height of the element (includes height, padding, & border) in rendered dimensions.
    */
  def renderedOuterHeight(): Double = js.native
  /**
    * Get the outer width of the element (includes width, padding, & border) in rendered dimensions.
    */
  def renderedOuterWidth(): Double = js.native
  /**
    * Get the width of the element in rendered dimensions.
    */
  def renderedWidth(): Double = js.native
  /**
    * Get the width of the element.
    */
  def width(): Double = js.native
}

object SingularPosition {
  @scala.inline
  def apply(
    active: () => Boolean,
    height: () => Double,
    outerHeight: () => Double,
    outerWidth: () => Double,
    renderedHeight: () => Double,
    renderedOuterHeight: () => Double,
    renderedOuterWidth: () => Double,
    renderedWidth: () => Double,
    width: () => Double
  ): SingularPosition = {
    val __obj = js.Dynamic.literal(active = js.Any.fromFunction0(active), height = js.Any.fromFunction0(height), outerHeight = js.Any.fromFunction0(outerHeight), outerWidth = js.Any.fromFunction0(outerWidth), renderedHeight = js.Any.fromFunction0(renderedHeight), renderedOuterHeight = js.Any.fromFunction0(renderedOuterHeight), renderedOuterWidth = js.Any.fromFunction0(renderedOuterWidth), renderedWidth = js.Any.fromFunction0(renderedWidth), width = js.Any.fromFunction0(width))
    __obj.asInstanceOf[SingularPosition]
  }
  @scala.inline
  implicit class SingularPositionOps[Self <: SingularPosition] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActive(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("active")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withHeight(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOuterHeight(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outerHeight")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOuterWidth(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outerWidth")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRenderedHeight(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderedHeight")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRenderedOuterHeight(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderedOuterHeight")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRenderedOuterWidth(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderedOuterWidth")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRenderedWidth(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderedWidth")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withWidth(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

