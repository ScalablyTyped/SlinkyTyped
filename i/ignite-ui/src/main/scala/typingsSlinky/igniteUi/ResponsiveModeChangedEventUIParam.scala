package typingsSlinky.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResponsiveModeChangedEventUIParam extends js.Object {
  /**
  	 * Gets the newly assumed mode.
  	 */
  var mode: js.UndefOr[String] = js.native
  /**
  	 * Gets the reference to the igGridResponsive widget.
  	 */
  var owner: js.UndefOr[js.Any] = js.native
  /**
  	 * Gets the previously assumed mode.
  	 */
  var previousMode: js.UndefOr[String] = js.native
}

object ResponsiveModeChangedEventUIParam {
  @scala.inline
  def apply(): ResponsiveModeChangedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResponsiveModeChangedEventUIParam]
  }
  @scala.inline
  implicit class ResponsiveModeChangedEventUIParamOps[Self <: ResponsiveModeChangedEventUIParam] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(js.undefined)
        ret
    }
    @scala.inline
    def withOwner(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("owner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOwner: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("owner")(js.undefined)
        ret
    }
    @scala.inline
    def withPreviousMode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previousMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreviousMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previousMode")(js.undefined)
        ret
    }
  }
  
}

