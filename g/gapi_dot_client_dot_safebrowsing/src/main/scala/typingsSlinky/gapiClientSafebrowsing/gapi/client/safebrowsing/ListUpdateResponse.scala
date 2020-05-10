package typingsSlinky.gapiClientSafebrowsing.gapi.client.safebrowsing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListUpdateResponse extends js.Object {
  /**
    * A set of entries to add to a local threat type's list. Repeated to allow
    * for a combination of compressed and raw data to be sent in a single
    * response.
    */
  var additions: js.UndefOr[js.Array[ThreatEntrySet]] = js.native
  /**
    * The expected SHA256 hash of the client state; that is, of the sorted list
    * of all hashes present in the database after applying the provided update.
    * If the client state doesn't match the expected state, the client must
    * disregard this update and retry later.
    */
  var checksum: js.UndefOr[Checksum] = js.native
  /** The new client state, in encrypted format. Opaque to clients. */
  var newClientState: js.UndefOr[String] = js.native
  /** The platform type for which data is returned. */
  var platformType: js.UndefOr[String] = js.native
  /**
    * A set of entries to remove from a local threat type's list. In practice,
    * this field is empty or contains exactly one ThreatEntrySet.
    */
  var removals: js.UndefOr[js.Array[ThreatEntrySet]] = js.native
  /**
    * The type of response. This may indicate that an action is required by the
    * client when the response is received.
    */
  var responseType: js.UndefOr[String] = js.native
  /** The format of the threats. */
  var threatEntryType: js.UndefOr[String] = js.native
  /** The threat type for which data is returned. */
  var threatType: js.UndefOr[String] = js.native
}

object ListUpdateResponse {
  @scala.inline
  def apply(): ListUpdateResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListUpdateResponse]
  }
  @scala.inline
  implicit class ListUpdateResponseOps[Self <: ListUpdateResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdditions(value: js.Array[ThreatEntrySet]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("additions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdditions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("additions")(js.undefined)
        ret
    }
    @scala.inline
    def withChecksum(value: Checksum): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checksum")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChecksum: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checksum")(js.undefined)
        ret
    }
    @scala.inline
    def withNewClientState(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newClientState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNewClientState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newClientState")(js.undefined)
        ret
    }
    @scala.inline
    def withPlatformType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("platformType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlatformType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("platformType")(js.undefined)
        ret
    }
    @scala.inline
    def withRemovals(value: js.Array[ThreatEntrySet]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removals")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemovals: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removals")(js.undefined)
        ret
    }
    @scala.inline
    def withResponseType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResponseType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseType")(js.undefined)
        ret
    }
    @scala.inline
    def withThreatEntryType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("threatEntryType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThreatEntryType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("threatEntryType")(js.undefined)
        ret
    }
    @scala.inline
    def withThreatType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("threatType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThreatType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("threatType")(js.undefined)
        ret
    }
  }
  
}

