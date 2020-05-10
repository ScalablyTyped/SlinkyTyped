package typingsSlinky.rasha.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImportOptions extends js.Object {
  var pem: String = js.native
  var public: Boolean = js.native
}

object ImportOptions {
  @scala.inline
  def apply(pem: String, public: Boolean): ImportOptions = {
    val __obj = js.Dynamic.literal(pem = pem.asInstanceOf[js.Any], public = public.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImportOptions]
  }
  @scala.inline
  implicit class ImportOptionsOps[Self <: ImportOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPem(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPublic(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("public")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

