package typingsSlinky.electron.Electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SourcesOptions extends js.Object {
  /**
    * Set to true to enable fetching window icons. The default value is false. When
    * false the appIcon property of the sources return null. Same if a source has the
    * type screen.
    */
  var fetchWindowIcons: js.UndefOr[Boolean] = js.native
  /**
    * The size that the media source thumbnail should be scaled to. Default is 150 x
    * 150. Set width or height to 0 when you do not need the thumbnails. This will
    * save the processing time required for capturing the content of each window and
    * screen.
    */
  var thumbnailSize: js.UndefOr[Size] = js.native
  /**
    * An array of Strings that lists the types of desktop sources to be captured,
    * available types are screen and window.
    */
  var types: js.Array[String] = js.native
}

object SourcesOptions {
  @scala.inline
  def apply(types: js.Array[String]): SourcesOptions = {
    val __obj = js.Dynamic.literal(types = types.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourcesOptions]
  }
  @scala.inline
  implicit class SourcesOptionsOps[Self <: SourcesOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTypes(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("types")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFetchWindowIcons(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fetchWindowIcons")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFetchWindowIcons: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fetchWindowIcons")(js.undefined)
        ret
    }
    @scala.inline
    def withThumbnailSize(value: Size): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumbnailSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThumbnailSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumbnailSize")(js.undefined)
        ret
    }
  }
  
}

