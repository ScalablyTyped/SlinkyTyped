package typingsSlinky.progressjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProgressJsOptions extends js.Object {
  /**
    * to consider CSS3 transitions in events
    */
  var considerTransition: js.UndefOr[Boolean] = js.native
  /**
    * overlay mode makes an overlay layer in the target element
    */
  var overlayMode: js.UndefOr[Boolean] = js.native
  /**
    * progress bar theme
    */
  var theme: js.UndefOr[String] = js.native
}

object ProgressJsOptions {
  @scala.inline
  def apply(): ProgressJsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProgressJsOptions]
  }
  @scala.inline
  implicit class ProgressJsOptionsOps[Self <: ProgressJsOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConsiderTransition(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("considerTransition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConsiderTransition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("considerTransition")(js.undefined)
        ret
    }
    @scala.inline
    def withOverlayMode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overlayMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverlayMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overlayMode")(js.undefined)
        ret
    }
    @scala.inline
    def withTheme(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTheme: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(js.undefined)
        ret
    }
  }
  
}

