package typingsSlinky.playerframework.PlayerFramework.UI

import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Meter extends js.Object {
  var disabled: Boolean = js.native
  var element: HTMLElement = js.native
  var hidden: Boolean = js.native
  var label: String = js.native
  var tooltip: String = js.native
  var value: Double = js.native
}

object Meter {
  @scala.inline
  def apply(
    disabled: Boolean,
    element: HTMLElement,
    hidden: Boolean,
    label: String,
    tooltip: String,
    value: Double
  ): Meter = {
    val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], hidden = hidden.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], tooltip = tooltip.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Meter]
  }
  @scala.inline
  implicit class MeterOps[Self <: Meter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withElement(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("element")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHidden(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hidden")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTooltip(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

