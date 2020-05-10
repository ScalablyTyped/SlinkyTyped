package typingsSlinky.nyaapi.mod.si

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UploadData extends js.Object {
  var anonymous: Boolean = js.native
  var category: String = js.native
  var complete: Boolean = js.native
  var credentials: String = js.native
  var description: String = js.native
  var hidden: Boolean = js.native
  var information: String = js.native
  var name: String = js.native
  var remake: Boolean = js.native
  var torrent: String = js.native
  var trusted: Boolean = js.native
}

object UploadData {
  @scala.inline
  def apply(
    anonymous: Boolean,
    category: String,
    complete: Boolean,
    credentials: String,
    description: String,
    hidden: Boolean,
    information: String,
    name: String,
    remake: Boolean,
    torrent: String,
    trusted: Boolean
  ): UploadData = {
    val __obj = js.Dynamic.literal(anonymous = anonymous.asInstanceOf[js.Any], category = category.asInstanceOf[js.Any], complete = complete.asInstanceOf[js.Any], credentials = credentials.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], hidden = hidden.asInstanceOf[js.Any], information = information.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], remake = remake.asInstanceOf[js.Any], torrent = torrent.asInstanceOf[js.Any], trusted = trusted.asInstanceOf[js.Any])
    __obj.asInstanceOf[UploadData]
  }
  @scala.inline
  implicit class UploadDataOps[Self <: UploadData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnonymous(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anonymous")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCategory(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("category")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComplete(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("complete")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCredentials(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("credentials")(value.asInstanceOf[js.Any])
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
    def withInformation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("information")(value.asInstanceOf[js.Any])
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
    def withTorrent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("torrent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTrusted(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trusted")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

