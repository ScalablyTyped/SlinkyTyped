package typingsSlinky.frctlFractal.mod.fractal.web

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebBuilderUrls extends js.Object {
  var ext: js.UndefOr[String] = js.native
}

object WebBuilderUrls {
  @scala.inline
  def apply(): WebBuilderUrls = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WebBuilderUrls]
  }
  @scala.inline
  implicit class WebBuilderUrlsOps[Self <: WebBuilderUrls] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExt(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ext")(js.undefined)
        ret
    }
  }
  
}

