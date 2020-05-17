package typingsSlinky.keystonejsAppNext.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Dev extends js.Object {
  var dev: js.UndefOr[Boolean] = js.native
  var distDir: js.UndefOr[js.Any] = js.native
}

object Dev {
  @scala.inline
  def apply(): Dev = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Dev]
  }
  @scala.inline
  implicit class DevOps[Self <: Dev] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDev(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dev")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDev: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dev")(js.undefined)
        ret
    }
    @scala.inline
    def withDistDir(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("distDir")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDistDir: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("distDir")(js.undefined)
        ret
    }
  }
  
}

