package typingsSlinky.kdbxweb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonFileMagic extends js.Object {
  var FileMagic: Double = js.native
  var Sig2Kdb: Double = js.native
  var Sig2Kdbx: Double = js.native
}

object AnonFileMagic {
  @scala.inline
  def apply(FileMagic: Double, Sig2Kdb: Double, Sig2Kdbx: Double): AnonFileMagic = {
    val __obj = js.Dynamic.literal(FileMagic = FileMagic.asInstanceOf[js.Any], Sig2Kdb = Sig2Kdb.asInstanceOf[js.Any], Sig2Kdbx = Sig2Kdbx.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFileMagic]
  }
  @scala.inline
  implicit class AnonFileMagicOps[Self <: AnonFileMagic] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFileMagic(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FileMagic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSig2Kdb(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Sig2Kdb")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSig2Kdbx(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Sig2Kdbx")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

