package typingsSlinky.archiver.mod

import typingsSlinky.node.zlibMod.ZlibOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TarOptions extends js.Object {
  var gzip: js.UndefOr[Boolean] = js.native
  var gzipOptions: js.UndefOr[ZlibOptions] = js.native
}

object TarOptions {
  @scala.inline
  def apply(): TarOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TarOptions]
  }
  @scala.inline
  implicit class TarOptionsOps[Self <: TarOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGzip(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gzip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGzip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gzip")(js.undefined)
        ret
    }
    @scala.inline
    def withGzipOptions(value: ZlibOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gzipOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGzipOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gzipOptions")(js.undefined)
        ret
    }
  }
  
}

