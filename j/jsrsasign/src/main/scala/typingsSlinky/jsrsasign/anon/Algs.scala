package typingsSlinky.jsrsasign.anon

import typingsSlinky.jsrsasign.jsrsasign.KJUR.asn1.cms.SignedData
import typingsSlinky.jsrsasign.jsrsasign.KJUR.asn1.cms.SignerInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Algs extends js.Object {
  var algs: String = js.native
  var certs: String = js.native
  var obj: SignedData = js.native
  var revs: String = js.native
  var si: js.Array[SignerInfo] = js.native
  var version: String = js.native
}

object Algs {
  @scala.inline
  def apply(
    algs: String,
    certs: String,
    obj: SignedData,
    revs: String,
    si: js.Array[SignerInfo],
    version: String
  ): Algs = {
    val __obj = js.Dynamic.literal(algs = algs.asInstanceOf[js.Any], certs = certs.asInstanceOf[js.Any], obj = obj.asInstanceOf[js.Any], revs = revs.asInstanceOf[js.Any], si = si.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Algs]
  }
  @scala.inline
  implicit class AlgsOps[Self <: Algs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlgs(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("algs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCerts(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("certs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withObj(value: SignedData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("obj")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRevs(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("revs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSi(value: js.Array[SignerInfo]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("si")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

