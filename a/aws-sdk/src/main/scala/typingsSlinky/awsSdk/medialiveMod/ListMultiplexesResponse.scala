package typingsSlinky.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListMultiplexesResponse extends js.Object {
  /**
    * List of multiplexes.
    */
  var Multiplexes: js.UndefOr[listOfMultiplexSummary] = js.native
  /**
    * Token for the next ListMultiplexes request.
    */
  var NextToken: js.UndefOr[string] = js.native
}

object ListMultiplexesResponse {
  @scala.inline
  def apply(): ListMultiplexesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListMultiplexesResponse]
  }
  @scala.inline
  implicit class ListMultiplexesResponseOps[Self <: ListMultiplexesResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMultiplexes(value: listOfMultiplexSummary): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Multiplexes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMultiplexes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Multiplexes")(js.undefined)
        ret
    }
    @scala.inline
    def withNextToken(value: string): Self = {
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

