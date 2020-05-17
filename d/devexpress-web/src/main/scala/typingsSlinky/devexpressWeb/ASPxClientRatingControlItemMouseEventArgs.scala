package typingsSlinky.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the rating control's ItemMouseOver and ItemMouseOut client events (such as ASPxClientRatingControl.ItemMouseOver and ASPxClientRatingControl.ItemMouseOut).
  */
@js.native
trait ASPxClientRatingControlItemMouseEventArgs extends ASPxClientEventArgs {
  /**
    * Gets the index of the item related to the event.
    */
  var index: Double = js.native
}

object ASPxClientRatingControlItemMouseEventArgs {
  @scala.inline
  def apply(index: Double): ASPxClientRatingControlItemMouseEventArgs = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientRatingControlItemMouseEventArgs]
  }
  @scala.inline
  implicit class ASPxClientRatingControlItemMouseEventArgsOps[Self <: ASPxClientRatingControlItemMouseEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

