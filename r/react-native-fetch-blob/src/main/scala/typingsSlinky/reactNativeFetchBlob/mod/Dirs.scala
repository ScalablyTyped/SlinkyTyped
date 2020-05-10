package typingsSlinky.reactNativeFetchBlob.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Dirs extends js.Object {
  var CacheDir: String = js.native
  var DCIMDir: String = js.native
  var DocumentDir: String = js.native
  var DownloadDir: String = js.native
  var MainBundleDir: String = js.native
  var MovieDir: String = js.native
  var MusicDir: String = js.native
  var PictureDir: String = js.native
  var SDCardDir: String = js.native
}

object Dirs {
  @scala.inline
  def apply(
    CacheDir: String,
    DCIMDir: String,
    DocumentDir: String,
    DownloadDir: String,
    MainBundleDir: String,
    MovieDir: String,
    MusicDir: String,
    PictureDir: String,
    SDCardDir: String
  ): Dirs = {
    val __obj = js.Dynamic.literal(CacheDir = CacheDir.asInstanceOf[js.Any], DCIMDir = DCIMDir.asInstanceOf[js.Any], DocumentDir = DocumentDir.asInstanceOf[js.Any], DownloadDir = DownloadDir.asInstanceOf[js.Any], MainBundleDir = MainBundleDir.asInstanceOf[js.Any], MovieDir = MovieDir.asInstanceOf[js.Any], MusicDir = MusicDir.asInstanceOf[js.Any], PictureDir = PictureDir.asInstanceOf[js.Any], SDCardDir = SDCardDir.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dirs]
  }
  @scala.inline
  implicit class DirsOps[Self <: Dirs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCacheDir(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CacheDir")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDCIMDir(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DCIMDir")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDocumentDir(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DocumentDir")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDownloadDir(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DownloadDir")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMainBundleDir(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MainBundleDir")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMovieDir(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MovieDir")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMusicDir(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MusicDir")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPictureDir(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PictureDir")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSDCardDir(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SDCardDir")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

