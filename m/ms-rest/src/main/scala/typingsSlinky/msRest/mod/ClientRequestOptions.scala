package typingsSlinky.msRest.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClientRequestOptions extends RequestOptions {
  var jar: js.UndefOr[Boolean] = js.native
}

object ClientRequestOptions {
  @scala.inline
  def apply(): ClientRequestOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClientRequestOptions]
  }
  @scala.inline
  implicit class ClientRequestOptionsOps[Self <: ClientRequestOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withJar(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jar")(js.undefined)
        ret
    }
  }
  
}

