package typingsSlinky.ejWebAll.ej.Tab

import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AjaxLoadEventArgs extends js.Object {
  /** returns the URL of AJAX request
    */
  var URL: js.UndefOr[String] = js.native
  /** returns current active tab header .
    */
  var activeHeader: js.UndefOr[HTMLElement] = js.native
  /** returns current active index.
    */
  var activeIndex: js.UndefOr[Double] = js.native
  /** if the event should be canceled; otherwise, false.
    */
  var cancel: js.UndefOr[Boolean] = js.native
  /** returns, is it triggered by interaction or not.
    */
  var isInteraction: js.UndefOr[Boolean] = js.native
  /** returns the tab model.
    */
  var model: js.UndefOr[Model] = js.native
  /** returns previous active tab header.
    */
  var prevActiveHeader: js.UndefOr[HTMLElement] = js.native
  /** returns previous active index.
    */
  var prevActiveIndex: js.UndefOr[Double] = js.native
  /** returns the name of the event.
    */
  var `type`: js.UndefOr[String] = js.native
}

object AjaxLoadEventArgs {
  @scala.inline
  def apply(): AjaxLoadEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AjaxLoadEventArgs]
  }
  @scala.inline
  implicit class AjaxLoadEventArgsOps[Self <: AjaxLoadEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withURL(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("URL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutURL: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("URL")(js.undefined)
        ret
    }
    @scala.inline
    def withActiveHeader(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeHeader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActiveHeader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeHeader")(js.undefined)
        ret
    }
    @scala.inline
    def withActiveIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActiveIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withCancel(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCancel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancel")(js.undefined)
        ret
    }
    @scala.inline
    def withIsInteraction(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isInteraction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsInteraction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isInteraction")(js.undefined)
        ret
    }
    @scala.inline
    def withModel(value: Model): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("model")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("model")(js.undefined)
        ret
    }
    @scala.inline
    def withPrevActiveHeader(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prevActiveHeader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrevActiveHeader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prevActiveHeader")(js.undefined)
        ret
    }
    @scala.inline
    def withPrevActiveIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prevActiveIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrevActiveIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prevActiveIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

