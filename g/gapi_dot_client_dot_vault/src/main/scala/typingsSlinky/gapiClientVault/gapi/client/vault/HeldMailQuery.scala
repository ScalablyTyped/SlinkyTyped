package typingsSlinky.gapiClientVault.gapi.client.vault

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HeldMailQuery extends js.Object {
  /**
    * The end date range for the search query. These timestamps are in GMT and
    * rounded down to the start of the given date.
    */
  var endTime: js.UndefOr[String] = js.native
  /**
    * The start date range for the search query. These timestamps are in GMT and
    * rounded down to the start of the given date.
    */
  var startTime: js.UndefOr[String] = js.native
  /** The search terms for the hold. */
  var terms: js.UndefOr[String] = js.native
}

object HeldMailQuery {
  @scala.inline
  def apply(): HeldMailQuery = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HeldMailQuery]
  }
  @scala.inline
  implicit class HeldMailQueryOps[Self <: HeldMailQuery] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEndTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endTime")(js.undefined)
        ret
    }
    @scala.inline
    def withStartTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startTime")(js.undefined)
        ret
    }
    @scala.inline
    def withTerms(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("terms")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTerms: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("terms")(js.undefined)
        ret
    }
  }
  
}

