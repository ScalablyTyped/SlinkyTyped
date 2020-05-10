package typingsSlinky.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DivContainerProperties extends ComponentProperties {
  /**
  		 * Indicates whether the element is clickable
  		 */
  var clickable: js.UndefOr[Boolean] = js.native
  /**
  		 * Matches the overflow-y CSS property and its available values.
  		 */
  var overflowY: js.UndefOr[String] = js.native
  /**
  		 * Setting the scroll based on the y offset
  		 * This is used when its child component is webview
  		 */
  var yOffsetChange: js.UndefOr[Double] = js.native
}

object DivContainerProperties {
  @scala.inline
  def apply(): DivContainerProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DivContainerProperties]
  }
  @scala.inline
  implicit class DivContainerPropertiesOps[Self <: DivContainerProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClickable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clickable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClickable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clickable")(js.undefined)
        ret
    }
    @scala.inline
    def withOverflowY(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overflowY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverflowY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overflowY")(js.undefined)
        ret
    }
    @scala.inline
    def withYOffsetChange(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yOffsetChange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutYOffsetChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yOffsetChange")(js.undefined)
        ret
    }
  }
  
}

