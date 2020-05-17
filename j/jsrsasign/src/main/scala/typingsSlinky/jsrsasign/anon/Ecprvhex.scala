package typingsSlinky.jsrsasign.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Ecprvhex extends js.Object {
  var ecprvhex: String = js.native
  var ecpubhex: String = js.native
}

object Ecprvhex {
  @scala.inline
  def apply(ecprvhex: String, ecpubhex: String): Ecprvhex = {
    val __obj = js.Dynamic.literal(ecprvhex = ecprvhex.asInstanceOf[js.Any], ecpubhex = ecpubhex.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ecprvhex]
  }
  @scala.inline
  implicit class EcprvhexOps[Self <: Ecprvhex] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEcprvhex(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ecprvhex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEcpubhex(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ecpubhex")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

