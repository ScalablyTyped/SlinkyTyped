package typingsSlinky.instagramPrivateApi.savedFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SavedFeedResponseVariantValuesItem extends js.Object {
  var id: String = js.native
  var is_preselected: Boolean = js.native
  var name: String = js.native
  var value: String = js.native
  var visual_style: String = js.native
}

object SavedFeedResponseVariantValuesItem {
  @scala.inline
  def apply(id: String, is_preselected: Boolean, name: String, value: String, visual_style: String): SavedFeedResponseVariantValuesItem = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], is_preselected = is_preselected.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], visual_style = visual_style.asInstanceOf[js.Any])
    __obj.asInstanceOf[SavedFeedResponseVariantValuesItem]
  }
  @scala.inline
  implicit class SavedFeedResponseVariantValuesItemOps[Self <: SavedFeedResponseVariantValuesItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIs_preselected(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("is_preselected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVisual_style(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visual_style")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

