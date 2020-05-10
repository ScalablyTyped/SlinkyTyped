package typingsSlinky.gapiClientSafebrowsing.gapi.client.safebrowsing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ThreatEntrySet extends js.Object {
  /** The compression type for the entries in this set. */
  var compressionType: js.UndefOr[String] = js.native
  /** The raw SHA256-formatted entries. */
  var rawHashes: js.UndefOr[RawHashes] = js.native
  /** The raw removal indices for a local list. */
  var rawIndices: js.UndefOr[RawIndices] = js.native
  /**
    * The encoded 4-byte prefixes of SHA256-formatted entries, using a
    * Golomb-Rice encoding. The hashes are converted to uint32, sorted in
    * ascending order, then delta encoded and stored as encoded_data.
    */
  var riceHashes: js.UndefOr[RiceDeltaEncoding] = js.native
  /**
    * The encoded local, lexicographically-sorted list indices, using a
    * Golomb-Rice encoding. Used for sending compressed removal indices. The
    * removal indices (uint32) are sorted in ascending order, then delta encoded
    * and stored as encoded_data.
    */
  var riceIndices: js.UndefOr[RiceDeltaEncoding] = js.native
}

object ThreatEntrySet {
  @scala.inline
  def apply(): ThreatEntrySet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ThreatEntrySet]
  }
  @scala.inline
  implicit class ThreatEntrySetOps[Self <: ThreatEntrySet] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCompressionType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compressionType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompressionType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compressionType")(js.undefined)
        ret
    }
    @scala.inline
    def withRawHashes(value: RawHashes): Self = {
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
    @scala.inline
    def withRawIndices(value: RawIndices): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rawIndices")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRawIndices: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rawIndices")(js.undefined)
        ret
    }
    @scala.inline
    def withRiceHashes(value: RiceDeltaEncoding): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("riceHashes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRiceHashes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("riceHashes")(js.undefined)
        ret
    }
    @scala.inline
    def withRiceIndices(value: RiceDeltaEncoding): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("riceIndices")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRiceIndices: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("riceIndices")(js.undefined)
        ret
    }
  }
  
}

