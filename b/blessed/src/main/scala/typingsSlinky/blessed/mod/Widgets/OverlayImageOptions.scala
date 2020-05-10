package typingsSlinky.blessed.mod.Widgets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OverlayImageOptions extends BoxOptions {
  /**
    * Render the file as ANSI art instead of using w3m to overlay Internally uses the
    * ANSIImage element. See the ANSIImage element for more information/options. (Default: true).
    */
  var ansi: Boolean = js.native
  /**
    * Path to image.
    */
  var file: String = js.native
  /**
    * Whether to search /usr, /bin, and /lib for w3mimgdisplay (Default: true).
    */
  var search: String = js.native
  /**
    * Path to w3mimgdisplay. If a proper w3mimgdisplay path is not given, blessed will
    * search the entire disk for the binary.
    */
  var w3m: String = js.native
}

object OverlayImageOptions {
  @scala.inline
  def apply(ansi: Boolean, file: String, search: String, w3m: String): OverlayImageOptions = {
    val __obj = js.Dynamic.literal(ansi = ansi.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any], search = search.asInstanceOf[js.Any], w3m = w3m.asInstanceOf[js.Any])
    __obj.asInstanceOf[OverlayImageOptions]
  }
  @scala.inline
  implicit class OverlayImageOptionsOps[Self <: OverlayImageOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnsi(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ansi")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFile(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("file")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSearch(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("search")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withW3m(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("w3m")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

