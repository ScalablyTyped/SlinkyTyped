package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Hashes extends js.Object {
  // The CRC32 value of the file in little endian (if available). Read-only.
  var crc32Hash: js.UndefOr[String] = js.native
  /**
    * A proprietary hash of the file that can be used to determine if the contents of the file have changed (if available).
    * Read-only.
    */
  var quickXorHash: js.UndefOr[String] = js.native
  // SHA1 hash for the contents of the file (if available). Read-only.
  var sha1Hash: js.UndefOr[String] = js.native
}

object Hashes {
  @scala.inline
  def apply(): Hashes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Hashes]
  }
  @scala.inline
  implicit class HashesOps[Self <: Hashes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCrc32Hash(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crc32Hash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCrc32Hash: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crc32Hash")(js.undefined)
        ret
    }
    @scala.inline
    def withQuickXorHash(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quickXorHash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuickXorHash: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quickXorHash")(js.undefined)
        ret
    }
    @scala.inline
    def withSha1Hash(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sha1Hash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSha1Hash: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sha1Hash")(js.undefined)
        ret
    }
  }
  
}

