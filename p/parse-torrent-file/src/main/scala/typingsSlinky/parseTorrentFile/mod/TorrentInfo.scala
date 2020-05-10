package typingsSlinky.parseTorrentFile.mod

import org.scalajs.dom.raw.File
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TorrentInfo extends js.Object {
  var files: js.UndefOr[js.Array[File]] = js.native
  var name: js.UndefOr[String] = js.native
  @JSName("name.utf-8")
  var `nameDotutf-8`: js.UndefOr[String] = js.native
  var `piece length`: js.UndefOr[Double] = js.native
  var pieces: js.UndefOr[Double] = js.native
  var `private`: js.UndefOr[Boolean] = js.native
}

object TorrentInfo {
  @scala.inline
  def apply(): TorrentInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TorrentInfo]
  }
  @scala.inline
  implicit class TorrentInfoOps[Self <: TorrentInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFiles(value: js.Array[File]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("files")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFiles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("files")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def `withNameDotutf-8`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name.utf-8")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutNameDotutf-8`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name.utf-8")(js.undefined)
        ret
    }
    @scala.inline
    def `withPiece length`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("piece length")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutPiece length`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("piece length")(js.undefined)
        ret
    }
    @scala.inline
    def withPieces(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pieces")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPieces: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pieces")(js.undefined)
        ret
    }
    @scala.inline
    def withPrivate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("private")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrivate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("private")(js.undefined)
        ret
    }
  }
  
}

