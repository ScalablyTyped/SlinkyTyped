package typingsSlinky.googleapis.safebrowsingV4Mod.safebrowsingV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A single list update request.
  */
@js.native
trait SchemaListUpdateRequest extends js.Object {
  /**
    * The constraints associated with this request.
    */
  var constraints: js.UndefOr[SchemaConstraints] = js.native
  /**
    * The type of platform at risk by entries present in the list.
    */
  var platformType: js.UndefOr[String] = js.native
  /**
    * The current state of the client for the requested list (the encrypted
    * client state that was received from the last successful list update).
    */
  var state: js.UndefOr[String] = js.native
  /**
    * The types of entries present in the list.
    */
  var threatEntryType: js.UndefOr[String] = js.native
  /**
    * The type of threat posed by entries present in the list.
    */
  var threatType: js.UndefOr[String] = js.native
}

object SchemaListUpdateRequest {
  @scala.inline
  def apply(): SchemaListUpdateRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListUpdateRequest]
  }
  @scala.inline
  implicit class SchemaListUpdateRequestOps[Self <: SchemaListUpdateRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConstraints(value: SchemaConstraints): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("constraints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConstraints: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("constraints")(js.undefined)
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
    def withState(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(js.undefined)
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

