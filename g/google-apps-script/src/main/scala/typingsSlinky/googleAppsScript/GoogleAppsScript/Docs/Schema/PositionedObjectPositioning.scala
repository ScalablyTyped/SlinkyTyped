package typingsSlinky.googleAppsScript.GoogleAppsScript.Docs.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PositionedObjectPositioning extends js.Object {
  var layout: js.UndefOr[String] = js.native
  var leftOffset: js.UndefOr[Dimension] = js.native
  var topOffset: js.UndefOr[Dimension] = js.native
}

object PositionedObjectPositioning {
  @scala.inline
  def apply(): PositionedObjectPositioning = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PositionedObjectPositioning]
  }
  @scala.inline
  implicit class PositionedObjectPositioningOps[Self <: PositionedObjectPositioning] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLayout(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLayout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layout")(js.undefined)
        ret
    }
    @scala.inline
    def withLeftOffset(value: Dimension): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leftOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLeftOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leftOffset")(js.undefined)
        ret
    }
    @scala.inline
    def withTopOffset(value: Dimension): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTopOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topOffset")(js.undefined)
        ret
    }
  }
  
}

