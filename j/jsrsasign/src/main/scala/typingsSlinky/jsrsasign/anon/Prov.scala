package typingsSlinky.jsrsasign.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Prov extends js.Object {
  var alg: js.UndefOr[String] = js.native
  var prov: js.UndefOr[String] = js.native
}

object Prov {
  @scala.inline
  def apply(): Prov = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Prov]
  }
  @scala.inline
  implicit class ProvOps[Self <: Prov] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlg(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlg: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alg")(js.undefined)
        ret
    }
    @scala.inline
    def withProv(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prov")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProv: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prov")(js.undefined)
        ret
    }
  }
  
}

