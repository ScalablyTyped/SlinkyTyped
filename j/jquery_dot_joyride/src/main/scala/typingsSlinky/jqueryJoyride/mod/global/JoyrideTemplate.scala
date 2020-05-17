package typingsSlinky.jqueryJoyride.mod.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * HTML segments for tip layout
	 */
@js.native
trait JoyrideTemplate extends js.Object {
  /**
  		 * Button template
  		 * @member {string}
  		 */
  var button: js.UndefOr[String] = js.native
  /**
  		 * Exposed Cover template
  		 * @member {string}
  		 */
  var exposeCover: js.UndefOr[String] = js.native
  /**
  		 * Link template
  		 * @member {string}
  		 */
  var link: js.UndefOr[String] = js.native
  /**
  		 * Modal template
  		 * @member {string}
  		 */
  var modal: js.UndefOr[String] = js.native
  /**
  		 * Timer template
  		 * @member {string}
  		 */
  var timer: js.UndefOr[String] = js.native
  /**
  		 * Tip template
  		 * @member {string}
  		 */
  var tip: js.UndefOr[String] = js.native
  /**
  		 * Wrapper template
  		 * @member {string}
  		 */
  var wrapper: js.UndefOr[String] = js.native
}

object JoyrideTemplate {
  @scala.inline
  def apply(): JoyrideTemplate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JoyrideTemplate]
  }
  @scala.inline
  implicit class JoyrideTemplateOps[Self <: JoyrideTemplate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withButton(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("button")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("button")(js.undefined)
        ret
    }
    @scala.inline
    def withExposeCover(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exposeCover")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExposeCover: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exposeCover")(js.undefined)
        ret
    }
    @scala.inline
    def withLink(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("link")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLink: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("link")(js.undefined)
        ret
    }
    @scala.inline
    def withModal(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modal")(js.undefined)
        ret
    }
    @scala.inline
    def withTimer(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timer")(js.undefined)
        ret
    }
    @scala.inline
    def withTip(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tip")(js.undefined)
        ret
    }
    @scala.inline
    def withWrapper(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrapper")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWrapper: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrapper")(js.undefined)
        ret
    }
  }
  
}

