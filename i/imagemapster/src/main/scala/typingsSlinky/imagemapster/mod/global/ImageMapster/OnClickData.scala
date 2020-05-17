package typingsSlinky.imagemapster.mod.global.ImageMapster

import typingsSlinky.imagemapster.mod.global.JQuery
import typingsSlinky.jquery.JQueryEventObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnClickData extends js.Object {
  var e: JQueryEventObject = js.native
  /**
    * mapKey for this area
    */
  var key: String = js.native
  /**
    * $(item) from boundList
    */
  var listTarget: js.UndefOr[JQuery] = js.native
  var selected: Boolean = js.native
}

object OnClickData {
  @scala.inline
  def apply(e: JQueryEventObject, key: String, selected: Boolean): OnClickData = {
    val __obj = js.Dynamic.literal(e = e.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnClickData]
  }
  @scala.inline
  implicit class OnClickDataOps[Self <: OnClickData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withE(value: JQueryEventObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("e")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelected(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListTarget(value: JQuery): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listTarget")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutListTarget: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listTarget")(js.undefined)
        ret
    }
  }
  
}

