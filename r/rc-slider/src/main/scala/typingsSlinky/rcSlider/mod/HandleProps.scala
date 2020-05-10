package typingsSlinky.rcSlider.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HandleProps extends CommonApiProps {
  /**
    * Class name
    */
  @JSName("className")
  var className_HandleProps: String = js.native
  /**
    * Styling option offset
    */
  var offset: Double = js.native
  /**
    * Set the tabIndex of the slider handle.
    * @default 0
    */
  var tabIndex: js.UndefOr[Double] = js.native
  /**
    * Styling if true, then bottom: {offset} else left: {offset}
    * @default False
    */
  @JSName("vertical")
  var vertical_HandleProps: Boolean = js.native
}

object HandleProps {
  @scala.inline
  def apply(className: String, offset: Double, vertical: Boolean): HandleProps = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], vertical = vertical.asInstanceOf[js.Any])
    __obj.asInstanceOf[HandleProps]
  }
  @scala.inline
  implicit class HandlePropsOps[Self <: HandleProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVertical(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vertical")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTabIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTabIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabIndex")(js.undefined)
        ret
    }
  }
  
}

