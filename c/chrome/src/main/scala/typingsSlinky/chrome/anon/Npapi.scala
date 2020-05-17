package typingsSlinky.chrome.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Npapi extends js.Object {
  var npapi: js.UndefOr[Boolean] = js.native
}

object Npapi {
  @scala.inline
  def apply(): Npapi = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Npapi]
  }
  @scala.inline
  implicit class NpapiOps[Self <: Npapi] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNpapi(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("npapi")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNpapi: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("npapi")(js.undefined)
        ret
    }
  }
  
}

