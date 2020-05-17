package typingsSlinky.autoprefixer.mod

import typingsSlinky.autoprefixer.anon.Browsers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExportedAPI extends js.Object {
  /** Autoprefixer data */
  var data: Browsers = js.native
  /** Autoprefixer default browsers */
  var defaults: js.Any = js.native
  /** Inspect with default Autoprefixer */
  def info(): Unit = js.native
}

object ExportedAPI {
  @scala.inline
  def apply(data: Browsers, defaults: js.Any, info: () => Unit): ExportedAPI = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], defaults = defaults.asInstanceOf[js.Any], info = js.Any.fromFunction0(info))
    __obj.asInstanceOf[ExportedAPI]
  }
  @scala.inline
  implicit class ExportedAPIOps[Self <: ExportedAPI] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withData(value: Browsers): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefaults(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInfo(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("info")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

