package typingsSlinky.parseTorrentFile.mod

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Torrent extends js.Object {
  var announce: js.UndefOr[String] = js.native
  var `announce-list`: js.UndefOr[js.Array[js.Array[String]]] = js.native
  var comment: js.UndefOr[Buffer] = js.native
  var `created by`: js.UndefOr[String] = js.native
  var `creation date`: js.UndefOr[Double] = js.native
  var info: js.UndefOr[TorrentInfo] = js.native
  var `url-list`: js.UndefOr[Buffer] = js.native
}

object Torrent {
  @scala.inline
  def apply(): Torrent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Torrent]
  }
  @scala.inline
  implicit class TorrentOps[Self <: Torrent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnnounce(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("announce")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnnounce: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("announce")(js.undefined)
        ret
    }
    @scala.inline
    def `withAnnounce-list`(value: js.Array[js.Array[String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("announce-list")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutAnnounce-list`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("announce-list")(js.undefined)
        ret
    }
    @scala.inline
    def withComment(value: Buffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comment")(js.undefined)
        ret
    }
    @scala.inline
    def `withCreated by`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("created by")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutCreated by`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("created by")(js.undefined)
        ret
    }
    @scala.inline
    def `withCreation date`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creation date")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutCreation date`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creation date")(js.undefined)
        ret
    }
    @scala.inline
    def withInfo(value: TorrentInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("info")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("info")(js.undefined)
        ret
    }
    @scala.inline
    def `withUrl-list`(value: Buffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url-list")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutUrl-list`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url-list")(js.undefined)
        ret
    }
  }
  
}

