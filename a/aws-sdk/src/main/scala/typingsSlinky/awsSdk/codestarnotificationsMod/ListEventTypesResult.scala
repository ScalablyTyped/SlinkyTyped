package typingsSlinky.awsSdk.codestarnotificationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListEventTypesResult extends js.Object {
  /**
    * Information about each event, including service name, resource type, event ID, and event name.
    */
  var EventTypes: js.UndefOr[EventTypeBatch] = js.native
  /**
    * An enumeration token that can be used in a request to return the next batch of the results.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.codestarnotificationsMod.NextToken] = js.native
}

object ListEventTypesResult {
  @scala.inline
  def apply(): ListEventTypesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListEventTypesResult]
  }
  @scala.inline
  implicit class ListEventTypesResultOps[Self <: ListEventTypesResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEventTypes(value: EventTypeBatch): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EventTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEventTypes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EventTypes")(js.undefined)
        ret
    }
    @scala.inline
    def withNextToken(value: NextToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextToken")(js.undefined)
        ret
    }
  }
  
}

