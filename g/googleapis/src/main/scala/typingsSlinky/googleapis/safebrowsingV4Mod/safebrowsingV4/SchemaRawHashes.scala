package typingsSlinky.googleapis.safebrowsingV4Mod.safebrowsingV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The uncompressed threat entries in hash format of a particular prefix
  * length. Hashes can be anywhere from 4 to 32 bytes in size. A large majority
  * are 4 bytes, but some hashes are lengthened if they collide with the hash
  * of a popular URL.  Used for sending ThreatEntrySet to clients that do not
  * support compression, or when sending non-4-byte hashes to clients that do
  * support compression.
  */
@js.native
trait SchemaRawHashes extends js.Object {
  /**
    * The number of bytes for each prefix encoded below.  This field can be
    * anywhere from 4 (shortest prefix) to 32 (full SHA256 hash).
    */
  var prefixSize: js.UndefOr[Double] = js.native
  /**
    * The hashes, in binary format, concatenated into one long string. Hashes
    * are sorted in lexicographic order. For JSON API users, hashes are
    * base64-encoded.
    */
  var rawHashes: js.UndefOr[String] = js.native
}

object SchemaRawHashes {
  @scala.inline
  def apply(): SchemaRawHashes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRawHashes]
  }
  @scala.inline
  implicit class SchemaRawHashesOps[Self <: SchemaRawHashes] (val x: Self) extends AnyVal {
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

