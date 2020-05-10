package typingsSlinky.gapiClientSafebrowsing.gapi.client.safebrowsing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Checksum extends js.Object {
  /**
    * The SHA256 hash of the client state; that is, of the sorted list of all
    * hashes present in the database.
    */
  var sha256: js.UndefOr[String] = js.native
}

object Checksum {
  @scala.inline
  def apply(): Checksum = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Checksum]
  }
  @scala.inline
  implicit class ChecksumOps[Self <: Checksum] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSha256(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sha256")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSha256: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sha256")(js.undefined)
        ret
    }
  }
  
}

