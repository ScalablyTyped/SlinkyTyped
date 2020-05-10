package typingsSlinky.awsSdk.sesv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BlacklistEntry extends js.Object {
  /**
    * Additional information about the blacklisting event, as provided by the blacklist maintainer.
    */
  var Description: js.UndefOr[BlacklistingDescription] = js.native
  /**
    * The time when the blacklisting event occurred, shown in Unix time format.
    */
  var ListingTime: js.UndefOr[js.Date] = js.native
  /**
    * The name of the blacklist that the IP address appears on.
    */
  var RblName: js.UndefOr[typingsSlinky.awsSdk.sesv2Mod.RblName] = js.native
}

object BlacklistEntry {
  @scala.inline
  def apply(): BlacklistEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BlacklistEntry]
  }
  @scala.inline
  implicit class BlacklistEntryOps[Self <: BlacklistEntry] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDescription(value: BlacklistingDescription): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(js.undefined)
        ret
    }
    @scala.inline
    def withListingTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ListingTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutListingTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ListingTime")(js.undefined)
        ret
    }
    @scala.inline
    def withRblName(value: RblName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RblName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRblName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RblName")(js.undefined)
        ret
    }
  }
  
}

