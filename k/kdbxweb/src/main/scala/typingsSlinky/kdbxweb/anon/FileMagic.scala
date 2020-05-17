package typingsSlinky.kdbxweb.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FileMagic extends js.Object {
  var FileMagic: Double = js.native
  var Sig2Kdb: Double = js.native
  var Sig2Kdbx: Double = js.native
}

object FileMagic {
  @scala.inline
  def apply(FileMagic: Double, Sig2Kdb: Double, Sig2Kdbx: Double): FileMagic = {
    val __obj = js.Dynamic.literal(FileMagic = FileMagic.asInstanceOf[js.Any], Sig2Kdb = Sig2Kdb.asInstanceOf[js.Any], Sig2Kdbx = Sig2Kdbx.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileMagic]
  }
  @scala.inline
  implicit class FileMagicOps[Self <: FileMagic] (val x: Self) extends AnyVal {
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

