package typingsSlinky.nodeOpenload

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAdded extends js.Object {
  var added: String = js.native
  var bytes_loaded: String = js.native
  var bytes_total: String = js.native
  var extid: String | Boolean = js.native
  var folderid: String = js.native
  var id: Double = js.native
  var last_update: String = js.native
  var remoteurl: String = js.native
  var status: String = js.native
  var url: String | Boolean = js.native
}

object AnonAdded {
  @scala.inline
  def apply(
    added: String,
    bytes_loaded: String,
    bytes_total: String,
    extid: String | Boolean,
    folderid: String,
    id: Double,
    last_update: String,
    remoteurl: String,
    status: String,
    url: String | Boolean
  ): AnonAdded = {
    val __obj = js.Dynamic.literal(added = added.asInstanceOf[js.Any], bytes_loaded = bytes_loaded.asInstanceOf[js.Any], bytes_total = bytes_total.asInstanceOf[js.Any], extid = extid.asInstanceOf[js.Any], folderid = folderid.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], last_update = last_update.asInstanceOf[js.Any], remoteurl = remoteurl.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAdded]
  }
  @scala.inline
  implicit class AnonAddedOps[Self <: AnonAdded] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdded(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("added")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBytes_loaded(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bytes_loaded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBytes_total(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bytes_total")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExtid(value: String | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFolderid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("folderid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLast_update(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("last_update")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemoteurl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remoteurl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrl(value: String | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

