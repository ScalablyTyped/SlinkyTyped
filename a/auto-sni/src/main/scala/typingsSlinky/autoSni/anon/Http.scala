package typingsSlinky.autoSni.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Http extends js.Object {
  var http: js.UndefOr[Double] = js.native
  var https: js.UndefOr[Double] = js.native
}

object Http {
  @scala.inline
  def apply(): Http = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Http]
  }
  @scala.inline
  implicit class HttpOps[Self <: Http] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHttp(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("http")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHttp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("http")(js.undefined)
        ret
    }
    @scala.inline
    def withHttps(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("https")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHttps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("https")(js.undefined)
        ret
    }
  }
  
}

