package typingsSlinky.azureSb.mpnserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TileTemplate extends Template {
  var backBackgroundImage: String = js.native
  var backContent: String = js.native
  var backTitle: String = js.native
  var backgroundImage: String = js.native
  var count: String = js.native
  var id: String = js.native
  var title: String = js.native
}

object TileTemplate {
  @scala.inline
  def apply(
    backBackgroundImage: String,
    backContent: String,
    backTitle: String,
    backgroundImage: String,
    count: String,
    id: String,
    title: String
  ): TileTemplate = {
    val __obj = js.Dynamic.literal(backBackgroundImage = backBackgroundImage.asInstanceOf[js.Any], backContent = backContent.asInstanceOf[js.Any], backTitle = backTitle.asInstanceOf[js.Any], backgroundImage = backgroundImage.asInstanceOf[js.Any], count = count.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[TileTemplate]
  }
  @scala.inline
  implicit class TileTemplateOps[Self <: TileTemplate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBackBackgroundImage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backBackgroundImage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBackContent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backContent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBackTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBackgroundImage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundImage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCount(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

