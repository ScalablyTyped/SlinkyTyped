package typingsSlinky.devextreme

import typingsSlinky.devextreme.devextremeStrings.auto
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAllowColumnDragging extends js.Object {
  var allowColumnDragging: js.UndefOr[Boolean] = js.native
  var emptyPanelText: js.UndefOr[String] = js.native
  var visible: js.UndefOr[Boolean | auto] = js.native
}

object AnonAllowColumnDragging {
  @scala.inline
  def apply(): AnonAllowColumnDragging = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonAllowColumnDragging]
  }
  @scala.inline
  implicit class AnonAllowColumnDraggingOps[Self <: AnonAllowColumnDragging] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowColumnDragging(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowColumnDragging")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowColumnDragging: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowColumnDragging")(js.undefined)
        ret
    }
    @scala.inline
    def withEmptyPanelText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emptyPanelText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmptyPanelText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emptyPanelText")(js.undefined)
        ret
    }
    @scala.inline
    def withVisible(value: Boolean | auto): Self = {
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
  }
  
}

