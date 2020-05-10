package typingsSlinky.nyaapi.mod.pantsu

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Torrent extends js.Object {
  var anidbid: Double = js.native
  var category: String = js.native
  var comments: js.Array[Comment] = js.native
  var completed: Double = js.native
  var date: String = js.native
  var description: String = js.native
  var dlsite: String = js.native
  var file_list: js.Array[String] = js.native
  var filesize: Double = js.native
  var hash: String = js.native
  var id: Double = js.native
  var languages: js.Array[String] = js.native
  var last_scrape: String = js.native
  var leechers: Double = js.native
  var magnet: String = js.native
  var name: String = js.native
  var seeders: Double = js.native
  var status: Double = js.native
  var sub_category: String = js.native
  var tags: Null = js.native
  var torrent: String = js.native
  var uploader_id: Double = js.native
  var uploader_name: String = js.native
  var uploader_old: String = js.native
  var vgmdbid: Double = js.native
  var videoquality: String = js.native
  var vndbid: Double = js.native
  var website_link: String = js.native
}

object Torrent {
  @scala.inline
  def apply(
    anidbid: Double,
    category: String,
    comments: js.Array[Comment],
    completed: Double,
    date: String,
    description: String,
    dlsite: String,
    file_list: js.Array[String],
    filesize: Double,
    hash: String,
    id: Double,
    languages: js.Array[String],
    last_scrape: String,
    leechers: Double,
    magnet: String,
    name: String,
    seeders: Double,
    status: Double,
    sub_category: String,
    tags: Null,
    torrent: String,
    uploader_id: Double,
    uploader_name: String,
    uploader_old: String,
    vgmdbid: Double,
    videoquality: String,
    vndbid: Double,
    website_link: String
  ): Torrent = {
    val __obj = js.Dynamic.literal(anidbid = anidbid.asInstanceOf[js.Any], category = category.asInstanceOf[js.Any], comments = comments.asInstanceOf[js.Any], completed = completed.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], dlsite = dlsite.asInstanceOf[js.Any], file_list = file_list.asInstanceOf[js.Any], filesize = filesize.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], languages = languages.asInstanceOf[js.Any], last_scrape = last_scrape.asInstanceOf[js.Any], leechers = leechers.asInstanceOf[js.Any], magnet = magnet.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], seeders = seeders.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], sub_category = sub_category.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], torrent = torrent.asInstanceOf[js.Any], uploader_id = uploader_id.asInstanceOf[js.Any], uploader_name = uploader_name.asInstanceOf[js.Any], uploader_old = uploader_old.asInstanceOf[js.Any], vgmdbid = vgmdbid.asInstanceOf[js.Any], videoquality = videoquality.asInstanceOf[js.Any], vndbid = vndbid.asInstanceOf[js.Any], website_link = website_link.asInstanceOf[js.Any])
    __obj.asInstanceOf[Torrent]
  }
  @scala.inline
  implicit class TorrentOps[Self <: Torrent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnidbid(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anidbid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCategory(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("category")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComments(value: js.Array[Comment]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCompleted(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("completed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("date")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDlsite(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dlsite")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFile_list(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("file_list")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFilesize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filesize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHash(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLanguages(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("languages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLast_scrape(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("last_scrape")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLeechers(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leechers")(value.asInstanceOf[js.Any])
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
    def withSeeders(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seeders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSub_category(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sub_category")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTags(value: Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTorrent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("torrent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUploader_id(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uploader_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUploader_name(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uploader_name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUploader_old(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uploader_old")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVgmdbid(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vgmdbid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVideoquality(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("videoquality")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVndbid(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vndbid")(value.asInstanceOf[js.Any])
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

