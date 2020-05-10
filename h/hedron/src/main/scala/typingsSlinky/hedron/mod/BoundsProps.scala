package typingsSlinky.hedron.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.hedron.hedronStrings.bottom
import typingsSlinky.hedron.hedronStrings.center
import typingsSlinky.hedron.hedronStrings.horizontal
import typingsSlinky.hedron.hedronStrings.left
import typingsSlinky.hedron.hedronStrings.right
import typingsSlinky.hedron.hedronStrings.top
import typingsSlinky.hedron.hedronStrings.vertical
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BoundsProps
  extends Styleable
     with /**
  *  Allow for customer props due to ability to add
  * custom breakpoints
  */
/* x */ StringDictionary[js.Any] {
  /**
    * Draws all child columns with 'bounding boxes' for easy
    * visualization of the grid. This enables debug mode for all the
    * children of this component
    * @default false
    */
  var debug: js.UndefOr[Boolean] = js.native
  /**
    * Direction of content
    */
  var direction: js.UndefOr[horizontal | vertical] = js.native
  /**
    * Controls the CSS flex property
    */
  var flex: js.UndefOr[String] = js.native
  /**
    * Alignment of children along the horizontal axis
    */
  var halign: js.UndefOr[left | center | right] = js.native
  /**
    * Alignment of children along the vertical axis
    */
  var valign: js.UndefOr[top | center | bottom] = js.native
  /**
    * Sets whether the children should wrap when there's no more room on the primary axis
    */
  var wrap: js.UndefOr[Boolean] = js.native
}

object BoundsProps {
  @scala.inline
  def apply(): BoundsProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BoundsProps]
  }
  @scala.inline
  implicit class BoundsPropsOps[Self <: BoundsProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDebug(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debug")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDebug: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debug")(js.undefined)
        ret
    }
    @scala.inline
    def withDirection(value: horizontal | vertical): Self = {
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
    def withFlex(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flex")(js.undefined)
        ret
    }
    @scala.inline
    def withHalign(value: left | center | right): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("halign")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHalign: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("halign")(js.undefined)
        ret
    }
    @scala.inline
    def withValign(value: top | center | bottom): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valign")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValign: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valign")(js.undefined)
        ret
    }
    @scala.inline
    def withWrap(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWrap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrap")(js.undefined)
        ret
    }
  }
  
}

