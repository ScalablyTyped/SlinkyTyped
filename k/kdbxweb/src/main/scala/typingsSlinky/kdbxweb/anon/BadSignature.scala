package typingsSlinky.kdbxweb.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BadSignature extends js.Object {
  var BadSignature: String = js.native
  var FileCorrupt: String = js.native
  var InvalidArg: String = js.native
  var InvalidKey: String = js.native
  var InvalidVersion: String = js.native
  var MergeError: String = js.native
  var NotImplemented: String = js.native
  var Unsupported: String = js.native
}

object BadSignature {
  @scala.inline
  def apply(
    BadSignature: String,
    FileCorrupt: String,
    InvalidArg: String,
    InvalidKey: String,
    InvalidVersion: String,
    MergeError: String,
    NotImplemented: String,
    Unsupported: String
  ): BadSignature = {
    val __obj = js.Dynamic.literal(BadSignature = BadSignature.asInstanceOf[js.Any], FileCorrupt = FileCorrupt.asInstanceOf[js.Any], InvalidArg = InvalidArg.asInstanceOf[js.Any], InvalidKey = InvalidKey.asInstanceOf[js.Any], InvalidVersion = InvalidVersion.asInstanceOf[js.Any], MergeError = MergeError.asInstanceOf[js.Any], NotImplemented = NotImplemented.asInstanceOf[js.Any], Unsupported = Unsupported.asInstanceOf[js.Any])
    __obj.asInstanceOf[BadSignature]
  }
  @scala.inline
  implicit class BadSignatureOps[Self <: BadSignature] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBadSignature(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BadSignature")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFileCorrupt(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FileCorrupt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInvalidArg(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InvalidArg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInvalidKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InvalidKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInvalidVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InvalidVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMergeError(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MergeError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNotImplemented(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NotImplemented")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnsupported(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Unsupported")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

