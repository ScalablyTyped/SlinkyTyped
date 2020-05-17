package typingsSlinky.pkijs.anon

import typingsSlinky.pkijs.certificateMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TrustedCerts extends js.Object {
  var trustedCerts: js.UndefOr[js.Array[default]] = js.native
}

object TrustedCerts {
  @scala.inline
  def apply(): TrustedCerts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TrustedCerts]
  }
  @scala.inline
  implicit class TrustedCertsOps[Self <: TrustedCerts] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTrustedCerts(value: js.Array[default]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trustedCerts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrustedCerts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trustedCerts")(js.undefined)
        ret
    }
  }
  
}

