package typingsSlinky.chrome.chrome.input.ime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CandidateWindowParameterProperties extends js.Object {
  /**
    * Optional.
    * Text that is shown at the bottom of the candidate window.
    */
  var auxiliaryText: js.UndefOr[String] = js.native
  /**
    * Optional.
    * True to display the auxiliary text, false to hide it.
    */
  var auxiliaryTextVisible: js.UndefOr[Boolean] = js.native
  /**
    * Optional.
    * True to show the cursor, false to hide it.
    */
  var cursorVisible: js.UndefOr[Boolean] = js.native
  /**
    * Optional.
    * The number of candidates to display per page.
    */
  var pageSize: js.UndefOr[Double] = js.native
  /**
    * Optional.
    * True if the candidate window should be rendered vertical, false to make it horizontal.
    */
  var vertical: js.UndefOr[Boolean] = js.native
  /**
    * Optional.
    * True to show the Candidate window, false to hide it.
    */
  var visible: js.UndefOr[Boolean] = js.native
  /**
    * Optional.
    * Where to display the candidate window.
    * @since Chrome 28.
    */
  var windowPosition: js.UndefOr[String] = js.native
}

object CandidateWindowParameterProperties {
  @scala.inline
  def apply(): CandidateWindowParameterProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CandidateWindowParameterProperties]
  }
  @scala.inline
  implicit class CandidateWindowParameterPropertiesOps[Self <: CandidateWindowParameterProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuxiliaryText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auxiliaryText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuxiliaryText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auxiliaryText")(js.undefined)
        ret
    }
    @scala.inline
    def withAuxiliaryTextVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auxiliaryTextVisible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuxiliaryTextVisible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auxiliaryTextVisible")(js.undefined)
        ret
    }
    @scala.inline
    def withCursorVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cursorVisible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCursorVisible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cursorVisible")(js.undefined)
        ret
    }
    @scala.inline
    def withPageSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPageSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageSize")(js.undefined)
        ret
    }
    @scala.inline
    def withVertical(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vertical")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVertical: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vertical")(js.undefined)
        ret
    }
    @scala.inline
    def withVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(js.undefined)
        ret
    }
    @scala.inline
    def withWindowPosition(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("windowPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWindowPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("windowPosition")(js.undefined)
        ret
    }
  }
  
}

