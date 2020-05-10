package typingsSlinky.reactNativeSafariView.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SafariViewOptions extends js.Object {
  /**
    * A String containing a hex or rgba color to use for the background of the browser controls (only available on iOS 10 and higher)
    *
    */
  var barTintColor: js.UndefOr[String] = js.native
  /**
    * A Boolean indicating to open the Safari View from the bottom
    *
    */
  var fromBottom: js.UndefOr[Boolean] = js.native
  /**
    * A Boolean indicating to use Safari's Reader Mode if available
    *
    */
  var readerMode: js.UndefOr[Boolean] = js.native
  /**
    * A String containing a hex or rgba color to use for the browser controls
    *
    */
  var tintColor: js.UndefOr[String] = js.native
  /**
    * A String containing the url you want to load in the Safari View
    *
    */
  var url: String = js.native
}

object SafariViewOptions {
  @scala.inline
  def apply(url: String): SafariViewOptions = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[SafariViewOptions]
  }
  @scala.inline
  implicit class SafariViewOptionsOps[Self <: SafariViewOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBarTintColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("barTintColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBarTintColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("barTintColor")(js.undefined)
        ret
    }
    @scala.inline
    def withFromBottom(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromBottom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFromBottom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromBottom")(js.undefined)
        ret
    }
    @scala.inline
    def withReaderMode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readerMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReaderMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readerMode")(js.undefined)
        ret
    }
    @scala.inline
    def withTintColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tintColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTintColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tintColor")(js.undefined)
        ret
    }
  }
  
}

