package typingsSlinky.gapiClientSafebrowsing.gapi.client.safebrowsing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RawHashes extends js.Object {
  /**
    * The number of bytes for each prefix encoded below.  This field can be
    * anywhere from 4 (shortest prefix) to 32 (full SHA256 hash).
    */
  var prefixSize: js.UndefOr[Double] = js.native
  /**
    * The hashes, in binary format, concatenated into one long string. Hashes are
    * sorted in lexicographic order. For JSON API users, hashes are
    * base64-encoded.
    */
  var rawHashes: js.UndefOr[String] = js.native
}

object RawHashes {
  @scala.inline
  def apply(): RawHashes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RawHashes]
  }
  @scala.inline
  implicit class RawHashesOps[Self <: RawHashes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPrefixSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefixSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrefixSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefixSize")(js.undefined)
        ret
    }
    @scala.inline
    def withRawHashes(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rawHashes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRawHashes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rawHashes")(js.undefined)
        ret
    }
  }
  
}

