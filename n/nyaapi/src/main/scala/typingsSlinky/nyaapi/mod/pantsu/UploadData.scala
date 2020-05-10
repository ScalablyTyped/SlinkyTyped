package typingsSlinky.nyaapi.mod.pantsu

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UploadData extends js.Object {
  var c: Category = js.native
  var description: String = js.native
  var hidden: Boolean = js.native
  var languages: js.Array[String] = js.native
  var magnet: String = js.native
  var name: String = js.native
  var remake: Boolean = js.native
  var status: Double = js.native
  var torrent: String = js.native
  var username: String = js.native
  var website_link: String = js.native
}

object UploadData {
  @scala.inline
  def apply(
    c: Category,
    description: String,
    hidden: Boolean,
    languages: js.Array[String],
    magnet: String,
    name: String,
    remake: Boolean,
    status: Double,
    torrent: String,
    username: String,
    website_link: String
  ): UploadData = {
    val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], hidden = hidden.asInstanceOf[js.Any], languages = languages.asInstanceOf[js.Any], magnet = magnet.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], remake = remake.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], torrent = torrent.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any], website_link = website_link.asInstanceOf[js.Any])
    __obj.asInstanceOf[UploadData]
  }
  @scala.inline
  implicit class UploadDataOps[Self <: UploadData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withC(value: Category): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("c")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHidden(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hidden")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLanguages(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("languages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMagnet(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("magnet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemake(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remake")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTorrent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("torrent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUsername(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("username")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWebsite_link(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("website_link")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

