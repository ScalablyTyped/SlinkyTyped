package typingsSlinky.jui.anon

import typingsSlinky.jui.juiStrings.`bottom-left`
import typingsSlinky.jui.juiStrings.`bottom-right`
import typingsSlinky.jui.juiStrings.`top-lefet`
import typingsSlinky.jui.juiStrings.`top-right`
import typingsSlinky.jui.juiStrings.bottom
import typingsSlinky.jui.juiStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Distance extends js.Object {
  /**
    * @cfg {Integer} [distance=5]
    * Determines each margin value when there are multiple notice messages
    */
  var distance: js.UndefOr[Double] = js.native
  var event: js.UndefOr[js.Any] = js.native
  /**
    * @cfg {Integer} [hideDuration=500]
    * Determines the duration of an effect when a notice message disappears
    */
  var hideDuration: js.UndefOr[Double] = js.native
  /**
    * @cfg {String} [hideEasing="linear"]
    * Determines an effect when a notice message disappears (see CSS3 specifications)
    */
  var hideEasing: js.UndefOr[String] = js.native
  /**
    * @cfg {Integer} [padding=12]
    * Determines the margin value of a notice message (the margin value may be in object form rather than a numeric value)
    */
  var padding: js.UndefOr[Double] = js.native
  /**
    * @cfg {"top"/"top-lefet"/"top-right"/"bottom"/"bottom-left"/"bottom-right"} [position="top-right"]
    * Designates the location where a notice message is added
    */
  var position: js.UndefOr[top | `top-lefet` | `top-right` | bottom | `bottom-left` | `bottom-right`] = js.native
  /**
    * @cfg {Integer} [showDuration=500]
    * Determines the duration of an effect when a notice message is shown
    */
  var showDuration: js.UndefOr[Double] = js.native
  /**
    * @cfg {String} [showEasing="swing"]
    * Determines an effect when a notice message is shown (see CSS3 specifications)
    */
  var showEasing: js.UndefOr[String] = js.native
  /**
    * @cfg {Integer} [timeout=3000]
    * Determines the duration for which a notice message is displayed (the message does not disappear when the value is 0)
    */
  var timeout: js.UndefOr[Double] = js.native
  var tpl: js.UndefOr[js.Any] = js.native
}

object Distance {
  @scala.inline
  def apply(): Distance = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Distance]
  }
  @scala.inline
  implicit class DistanceOps[Self <: Distance] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDistance(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("distance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDistance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("distance")(js.undefined)
        ret
    }
    @scala.inline
    def withEvent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("event")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEvent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("event")(js.undefined)
        ret
    }
    @scala.inline
    def withHideDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHideDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideDuration")(js.undefined)
        ret
    }
    @scala.inline
    def withHideEasing(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideEasing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHideEasing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideEasing")(js.undefined)
        ret
    }
    @scala.inline
    def withPadding(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPadding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padding")(js.undefined)
        ret
    }
    @scala.inline
    def withPosition(value: top | `top-lefet` | `top-right` | bottom | `bottom-left` | `bottom-right`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(js.undefined)
        ret
    }
    @scala.inline
    def withShowDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showDuration")(js.undefined)
        ret
    }
    @scala.inline
    def withShowEasing(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showEasing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowEasing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showEasing")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(js.undefined)
        ret
    }
    @scala.inline
    def withTpl(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tpl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTpl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tpl")(js.undefined)
        ret
    }
  }
  
}

