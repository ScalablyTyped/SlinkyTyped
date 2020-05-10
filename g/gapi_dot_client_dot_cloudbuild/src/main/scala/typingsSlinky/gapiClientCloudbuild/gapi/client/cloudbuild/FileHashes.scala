package typingsSlinky.gapiClientCloudbuild.gapi.client.cloudbuild

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FileHashes extends js.Object {
  /** Collection of file hashes. */
  var fileHash: js.UndefOr[js.Array[Hash]] = js.native
}

object FileHashes {
  @scala.inline
  def apply(): FileHashes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FileHashes]
  }
  @scala.inline
  implicit class FileHashesOps[Self <: FileHashes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFileHash(value: js.Array[Hash]): Self = {
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
  }
  
}

