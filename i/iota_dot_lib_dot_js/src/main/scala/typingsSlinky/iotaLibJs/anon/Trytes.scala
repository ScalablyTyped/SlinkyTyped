package typingsSlinky.iotaLibJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Trytes extends js.Object {
  var trytes: js.Array[String] = js.native
}

object Trytes {
  @scala.inline
  def apply(trytes: js.Array[String]): Trytes = {
    val __obj = js.Dynamic.literal(trytes = trytes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Trytes]
  }
  @scala.inline
  implicit class TrytesOps[Self <: Trytes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTrytes(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trytes")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

