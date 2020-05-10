package typingsSlinky.reactBeautifulDnd.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DroppableDimension extends js.Object {
  var axis: Axis = js.native
  // relative to the current viewport
  var client: BoxModel = js.native
  var descriptor: DroppableDescriptor = js.native
  // The container of the droppable
  var frame: js.UndefOr[Scrollable] = js.native
  var isCombineEnabled: Boolean = js.native
  var isEnabled: Boolean = js.native
  // relative to the whole page
  var isFixedOnPage: Boolean = js.native
  // relative to the page
  var page: BoxModel = js.native
  // what is visible through the frame
  var subject: DroppableSubject = js.native
}

object DroppableDimension {
  @scala.inline
  def apply(
    axis: Axis,
    client: BoxModel,
    descriptor: DroppableDescriptor,
    isCombineEnabled: Boolean,
    isEnabled: Boolean,
    isFixedOnPage: Boolean,
    page: BoxModel,
    subject: DroppableSubject
  ): DroppableDimension = {
    val __obj = js.Dynamic.literal(axis = axis.asInstanceOf[js.Any], client = client.asInstanceOf[js.Any], descriptor = descriptor.asInstanceOf[js.Any], isCombineEnabled = isCombineEnabled.asInstanceOf[js.Any], isEnabled = isEnabled.asInstanceOf[js.Any], isFixedOnPage = isFixedOnPage.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any])
    __obj.asInstanceOf[DroppableDimension]
  }
  @scala.inline
  implicit class DroppableDimensionOps[Self <: DroppableDimension] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAxis(value: Axis): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClient(value: BoxModel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescriptor(value: DroppableDescriptor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("descriptor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsCombineEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isCombineEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsFixedOnPage(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFixedOnPage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPage(value: BoxModel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("page")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubject(value: DroppableSubject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subject")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFrame(value: Scrollable): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frame")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFrame: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frame")(js.undefined)
        ret
    }
  }
  
}

