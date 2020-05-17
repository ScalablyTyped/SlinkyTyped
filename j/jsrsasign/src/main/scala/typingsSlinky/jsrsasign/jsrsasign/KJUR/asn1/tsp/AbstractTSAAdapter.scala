package typingsSlinky.jsrsasign.jsrsasign.KJUR.asn1.tsp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * abstract class for TimeStampToken generator
  * @param params associative array of parameters
  * @description
  */
@js.native
trait AbstractTSAAdapter extends js.Object {
  def getTSTHex(msgHex: String, hashAlg: String): Unit = js.native
}

object AbstractTSAAdapter {
  @scala.inline
  def apply(getTSTHex: (String, String) => Unit): AbstractTSAAdapter = {
    val __obj = js.Dynamic.literal(getTSTHex = js.Any.fromFunction2(getTSTHex))
    __obj.asInstanceOf[AbstractTSAAdapter]
  }
  @scala.inline
  implicit class AbstractTSAAdapterOps[Self <: AbstractTSAAdapter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetTSTHex(value: (String, String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTSTHex")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

