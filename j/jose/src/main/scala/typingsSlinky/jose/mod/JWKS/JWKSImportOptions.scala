package typingsSlinky.jose.mod.JWKS

import typingsSlinky.jose.mod.ImportOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JWKSImportOptions extends ImportOptions {
  var ignoreErrors: js.UndefOr[Boolean] = js.native
}

object JWKSImportOptions {
  @scala.inline
  def apply(): JWKSImportOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JWKSImportOptions]
  }
  @scala.inline
  implicit class JWKSImportOptionsOps[Self <: JWKSImportOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIgnoreErrors(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreErrors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreErrors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreErrors")(js.undefined)
        ret
    }
  }
  
}

