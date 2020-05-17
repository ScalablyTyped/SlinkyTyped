package typingsSlinky.paypalRestSdk.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Cancelurl extends js.Object {
  var cancel_url: js.UndefOr[String] = js.native
  var return_url: js.UndefOr[String] = js.native
}

object Cancelurl {
  @scala.inline
  def apply(): Cancelurl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Cancelurl]
  }
  @scala.inline
  implicit class CancelurlOps[Self <: Cancelurl] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCancel_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancel_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCancel_url: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancel_url")(js.undefined)
        ret
    }
    @scala.inline
    def withReturn_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("return_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReturn_url: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("return_url")(js.undefined)
        ret
    }
  }
  
}

