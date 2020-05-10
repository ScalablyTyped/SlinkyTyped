package typingsSlinky.instagramPrivateApi.directThreadRepositoryUpdateTitleResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DirectThreadRepositoryUpdateTitleResponseTextAttributesItem extends js.Object {
  var bold: Double = js.native
  var color: String = js.native
  var end: Double = js.native
  var intent: String = js.native
  var start: Double = js.native
}

object DirectThreadRepositoryUpdateTitleResponseTextAttributesItem {
  @scala.inline
  def apply(bold: Double, color: String, end: Double, intent: String, start: Double): DirectThreadRepositoryUpdateTitleResponseTextAttributesItem = {
    val __obj = js.Dynamic.literal(bold = bold.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], intent = intent.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectThreadRepositoryUpdateTitleResponseTextAttributesItem]
  }
  @scala.inline
  implicit class DirectThreadRepositoryUpdateTitleResponseTextAttributesItemOps[Self <: DirectThreadRepositoryUpdateTitleResponseTextAttributesItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBold(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnd(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIntent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("intent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStart(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

