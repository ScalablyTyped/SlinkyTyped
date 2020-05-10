package typingsSlinky.nyaapi.mod.si

import typingsSlinky.nyaapi.AnonCode
import typingsSlinky.nyaapi.AnonFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Torrent extends js.Object {
  var category: AnonCode = js.native
  var fileSize: String = js.native
  var leechers: String = js.native
  var links: AnonFile = js.native
  var name: String = js.native
  var nbDownload: String = js.native
  var seeders: String = js.native
  var timestamp: String = js.native
}

object Torrent {
  @scala.inline
  def apply(
    category: AnonCode,
    fileSize: String,
    leechers: String,
    links: AnonFile,
    name: String,
    nbDownload: String,
    seeders: String,
    timestamp: String
  ): Torrent = {
    val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any], fileSize = fileSize.asInstanceOf[js.Any], leechers = leechers.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nbDownload = nbDownload.asInstanceOf[js.Any], seeders = seeders.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[Torrent]
  }
  @scala.inline
  implicit class TorrentOps[Self <: Torrent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCategory(value: AnonCode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("category")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFileSize(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLeechers(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leechers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLinks(value: AnonFile): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("links")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNbDownload(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nbDownload")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSeeders(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seeders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimestamp(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timestamp")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

