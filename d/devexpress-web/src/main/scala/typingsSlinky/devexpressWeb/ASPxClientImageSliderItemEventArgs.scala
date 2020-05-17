package typingsSlinky.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientImageSlider.ActiveItemChanged and ASPxClientImageSlider.ItemClick events.
  */
@js.native
trait ASPxClientImageSliderItemEventArgs extends ASPxClientEventArgs {
  /**
    * Gets an item object related to the event.
    */
  var item: ASPxClientImageSliderItem = js.native
}

object ASPxClientImageSliderItemEventArgs {
  @scala.inline
  def apply(item: ASPxClientImageSliderItem): ASPxClientImageSliderItemEventArgs = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientImageSliderItemEventArgs]
  }
  @scala.inline
  implicit class ASPxClientImageSliderItemEventArgsOps[Self <: ASPxClientImageSliderItemEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withItem(value: ASPxClientImageSliderItem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("item")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

