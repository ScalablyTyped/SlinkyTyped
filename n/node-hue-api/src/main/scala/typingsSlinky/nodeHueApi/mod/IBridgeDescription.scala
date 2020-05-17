package typingsSlinky.nodeHueApi.mod

import typingsSlinky.nodeHueApi.anon.Description
import typingsSlinky.nodeHueApi.anon.Major
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IBridgeDescription extends js.Object {
  var icons: js.UndefOr[js.Array[IBridgeIcon]] = js.native
  var manufacturer: String = js.native
  var model: Description = js.native
  var name: String = js.native
  var url: String = js.native
  var version: Major = js.native
}

object IBridgeDescription {
  @scala.inline
  def apply(manufacturer: String, model: Description, name: String, url: String, version: Major): IBridgeDescription = {
    val __obj = js.Dynamic.literal(manufacturer = manufacturer.asInstanceOf[js.Any], model = model.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBridgeDescription]
  }
  @scala.inline
  implicit class IBridgeDescriptionOps[Self <: IBridgeDescription] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withManufacturer(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("manufacturer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withModel(value: Description): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("model")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVersion(value: Major): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIcons(value: js.Array[IBridgeIcon]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icons")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIcons: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icons")(js.undefined)
        ret
    }
  }
  
}

