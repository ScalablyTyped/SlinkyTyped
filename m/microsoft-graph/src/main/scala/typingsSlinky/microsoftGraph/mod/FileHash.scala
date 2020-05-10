package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FileHash extends js.Object {
  // File hash type. Possible values are: unknown, sha1, sha256, md5, authenticodeHash256, lsHash, ctph, peSha1, peSha256.
  var hashType: js.UndefOr[FileHashType] = js.native
  // Value of the file hash.
  var hashValue: js.UndefOr[String] = js.native
}

object FileHash {
  @scala.inline
  def apply(): FileHash = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FileHash]
  }
  @scala.inline
  implicit class FileHashOps[Self <: FileHash] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHashType(value: FileHashType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hashType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHashType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hashType")(js.undefined)
        ret
    }
    @scala.inline
    def withHashValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hashValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHashValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hashValue")(js.undefined)
        ret
    }
  }
  
}

