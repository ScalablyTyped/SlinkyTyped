package typingsSlinky.alertify.alertify

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Properties for alertify.set function
  */
@js.native
trait IProperties extends js.Object {
  /** Default button for focus */
  var buttonFocus: js.UndefOr[String] = js.native
  /** Should buttons be displayed in reverse order */
  var buttonReverse: js.UndefOr[Boolean] = js.native
  /** Default value for milliseconds display of log messages */
  var delay: js.UndefOr[Double] = js.native
  /** Default values for display of labels */
  var labels: js.UndefOr[ILabels] = js.native
}

object IProperties {
  @scala.inline
  def apply(): IProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IProperties]
  }
  @scala.inline
  implicit class IPropertiesOps[Self <: IProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withButtonFocus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonFocus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutButtonFocus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonFocus")(js.undefined)
        ret
    }
    @scala.inline
    def withButtonReverse(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonReverse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutButtonReverse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonReverse")(js.undefined)
        ret
    }
    @scala.inline
    def withDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delay")(js.undefined)
        ret
    }
    @scala.inline
    def withLabels(value: ILabels): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labels")(js.undefined)
        ret
    }
  }
  
}

