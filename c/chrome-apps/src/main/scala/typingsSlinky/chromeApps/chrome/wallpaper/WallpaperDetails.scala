package typingsSlinky.chromeApps.chrome.wallpaper

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WallpaperDetails extends js.Object {
  /** The jpeg or png encoded wallpaper image. */
  var data: js.UndefOr[js.typedarray.ArrayBuffer] = js.native
  /** The file name of the saved wallpaper. */
  var filename: String = js.native
  /**
    * The supported wallpaper layouts.
    * @see WallpaperLayout
    */
  var layout: WallpaperLayout | WallpaperLayoutType = js.native
  /** True if a 128x60 thumbnail should be generated. */
  var thumbnail: js.UndefOr[Boolean] = js.native
  /** The URL of the wallpaper to be set. */
  var url: js.UndefOr[String] = js.native
}

object WallpaperDetails {
  @scala.inline
  def apply(filename: String, layout: WallpaperLayout | WallpaperLayoutType): WallpaperDetails = {
    val __obj = js.Dynamic.literal(filename = filename.asInstanceOf[js.Any], layout = layout.asInstanceOf[js.Any])
    __obj.asInstanceOf[WallpaperDetails]
  }
  @scala.inline
  implicit class WallpaperDetailsOps[Self <: WallpaperDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFilename(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filename")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLayout(value: WallpaperLayout | WallpaperLayoutType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withData(value: js.typedarray.ArrayBuffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(js.undefined)
        ret
    }
    @scala.inline
    def withThumbnail(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumbnail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThumbnail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumbnail")(js.undefined)
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(js.undefined)
        ret
    }
  }
  
}

