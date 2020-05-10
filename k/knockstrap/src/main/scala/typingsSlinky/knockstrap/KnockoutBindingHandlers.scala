package typingsSlinky.knockstrap

import typingsSlinky.knockout.KnockoutBindingHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KnockoutBindingHandlers extends js.Object {
  var alert: AlertKnockoutBindingHandler = js.native
  var carousel: CarouselKnockoutBindingHandler = js.native
  var checkbox: KnockoutBindingHandler[_, _, _] = js.native
  var modal: ModalKnockoutBindingHandler = js.native
  var popover: PopoverKnockoutBindingHandler = js.native
  var progress: ProgressKnockoutBindingHandler = js.native
  var radio: KnockoutBindingHandler[_, _, _] = js.native
  var toggle: KnockoutBindingHandler[_, _, _] = js.native
  var tooltip: KnockoutBindingHandler[_, _, _] = js.native
}

object KnockoutBindingHandlers {
  @scala.inline
  def apply(
    alert: AlertKnockoutBindingHandler,
    carousel: CarouselKnockoutBindingHandler,
    checkbox: KnockoutBindingHandler[_, _, _],
    modal: ModalKnockoutBindingHandler,
    popover: PopoverKnockoutBindingHandler,
    progress: ProgressKnockoutBindingHandler,
    radio: KnockoutBindingHandler[_, _, _],
    toggle: KnockoutBindingHandler[_, _, _],
    tooltip: KnockoutBindingHandler[_, _, _]
  ): KnockoutBindingHandlers = {
    val __obj = js.Dynamic.literal(alert = alert.asInstanceOf[js.Any], carousel = carousel.asInstanceOf[js.Any], checkbox = checkbox.asInstanceOf[js.Any], modal = modal.asInstanceOf[js.Any], popover = popover.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], radio = radio.asInstanceOf[js.Any], toggle = toggle.asInstanceOf[js.Any], tooltip = tooltip.asInstanceOf[js.Any])
    __obj.asInstanceOf[KnockoutBindingHandlers]
  }
  @scala.inline
  implicit class KnockoutBindingHandlersOps[Self <: KnockoutBindingHandlers] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlert(value: AlertKnockoutBindingHandler): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alert")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCarousel(value: CarouselKnockoutBindingHandler): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("carousel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCheckbox(value: KnockoutBindingHandler[_, _, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkbox")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withModal(value: ModalKnockoutBindingHandler): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPopover(value: PopoverKnockoutBindingHandler): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popover")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProgress(value: ProgressKnockoutBindingHandler): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRadio(value: KnockoutBindingHandler[_, _, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("radio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToggle(value: KnockoutBindingHandler[_, _, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTooltip(value: KnockoutBindingHandler[_, _, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltip")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

