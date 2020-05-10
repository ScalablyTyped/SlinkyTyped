package typingsSlinky.jsrsasign

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCaissuer extends js.Object {
  var caissuer: js.Array[String] = js.native
  var ocsp: js.Array[String] = js.native
}

object AnonCaissuer {
  @scala.inline
  def apply(caissuer: js.Array[String], ocsp: js.Array[String]): AnonCaissuer = {
    val __obj = js.Dynamic.literal(caissuer = caissuer.asInstanceOf[js.Any], ocsp = ocsp.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCaissuer]
  }
  @scala.inline
  implicit class AnonCaissuerOps[Self <: AnonCaissuer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCaissuer(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("caissuer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOcsp(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ocsp")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

