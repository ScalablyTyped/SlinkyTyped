package typingsSlinky.acmeClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CsrDomains extends js.Object {
  var altNames: js.Array[String] = js.native
  var commonName: String = js.native
}

object CsrDomains {
  @scala.inline
  def apply(altNames: js.Array[String], commonName: String): CsrDomains = {
    val __obj = js.Dynamic.literal(altNames = altNames.asInstanceOf[js.Any], commonName = commonName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CsrDomains]
  }
  @scala.inline
  implicit class CsrDomainsOps[Self <: CsrDomains] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAltNames(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("altNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCommonName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commonName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

