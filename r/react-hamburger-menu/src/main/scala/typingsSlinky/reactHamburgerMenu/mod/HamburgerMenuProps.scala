package typingsSlinky.reactHamburgerMenu.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HamburgerMenuProps extends js.Object {
  /**
    * The length of time it takes for the icon transitions to complete.
    * @default 0.4
    */
  var animationDuration: js.UndefOr[Double] = js.native
  /**
    * The border radius of the lines
    * @default 0
    */
  var borderRadius: js.UndefOr[Double] = js.native
  /**
    * The color of both icons
    * @default #000
    */
  var color: String = js.native
  /**
    * The height of the icon
    * @default 30
    */
  var height: js.UndefOr[Double] = js.native
  /**
    * Determines whether the menu is a hamburger or cross icon
    */
  var isOpen: Boolean = js.native
  /**
    * The rotation of the icon, eg {45} would be 45deg
    * @default 0
    */
  var rotate: js.UndefOr[Double] = js.native
  /**
    * The stroke width of the lines
    * @default 2
    */
  var strokeWidth: js.UndefOr[Double] = js.native
  /**
    * The width of the icon
    * @default 36
    */
  var width: js.UndefOr[Double] = js.native
  /**
    * Will be invoked when the component is clicked
    */
  def menuClicked(): Unit = js.native
}

object HamburgerMenuProps {
  @scala.inline
  def apply(color: String, isOpen: Boolean, menuClicked: () => Unit): HamburgerMenuProps = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], isOpen = isOpen.asInstanceOf[js.Any], menuClicked = js.Any.fromFunction0(menuClicked))
    __obj.asInstanceOf[HamburgerMenuProps]
  }
  @scala.inline
  implicit class HamburgerMenuPropsOps[Self <: HamburgerMenuProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsOpen(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isOpen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMenuClicked(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menuClicked")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withAnimationDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimationDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationDuration")(js.undefined)
        ret
    }
    @scala.inline
    def withBorderRadius(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderRadius")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorderRadius: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderRadius")(js.undefined)
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
    def withRotate(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRotate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotate")(js.undefined)
        ret
    }
    @scala.inline
    def withStrokeWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrokeWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeWidth")(js.undefined)
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
  }
  
}

