package typingsSlinky.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetRelationalDatabaseLogEventsResult extends js.Object {
  /**
    * A token used for advancing to the previous page of results from your get relational database log events request.
    */
  var nextBackwardToken: js.UndefOr[String] = js.native
  /**
    * A token used for advancing to the next page of results from your get relational database log events request.
    */
  var nextForwardToken: js.UndefOr[String] = js.native
  /**
    * An object describing the result of your get relational database log events request.
    */
  var resourceLogEvents: js.UndefOr[LogEventList] = js.native
}

object GetRelationalDatabaseLogEventsResult {
  @scala.inline
  def apply(): GetRelationalDatabaseLogEventsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetRelationalDatabaseLogEventsResult]
  }
  @scala.inline
  implicit class GetRelationalDatabaseLogEventsResultOps[Self <: GetRelationalDatabaseLogEventsResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNextBackwardToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextBackwardToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextBackwardToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextBackwardToken")(js.undefined)
        ret
    }
    @scala.inline
    def withNextForwardToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextForwardToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextForwardToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextForwardToken")(js.undefined)
        ret
    }
    @scala.inline
    def withResourceLogEvents(value: LogEventList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceLogEvents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceLogEvents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceLogEvents")(js.undefined)
        ret
    }
  }
  
}

