package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FileSecurityState extends js.Object {
  // Complex type containing file hashes (cryptographic and location-sensitive).
  var fileHash: js.UndefOr[FileHash] = js.native
  // File name (without path).
  var name: js.UndefOr[String] = js.native
  // Full file path of the file/imageFile.
  var path: js.UndefOr[String] = js.native
  /**
    * Provider generated/calculated risk score of the alert file. Recommended value range of 0-1, which equates to a
    * percentage.
    */
  var riskScore: js.UndefOr[String] = js.native
}

object FileSecurityState {
  @scala.inline
  def apply(): FileSecurityState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FileSecurityState]
  }
  @scala.inline
  implicit class FileSecurityStateOps[Self <: FileSecurityState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFileHash(value: FileHash): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileHash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFileHash: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileHash")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(js.undefined)
        ret
    }
    @scala.inline
    def withRiskScore(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("riskScore")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRiskScore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("riskScore")(js.undefined)
        ret
    }
  }
  
}

