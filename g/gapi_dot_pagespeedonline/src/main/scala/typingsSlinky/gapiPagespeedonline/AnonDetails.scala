package typingsSlinky.gapiPagespeedonline

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDetails extends js.Object {
  /**
    * List of entries that provide additional details about a single URL. Optional.
    */
  var details: js.Array[AnonArgs] = js.native
  /**
    * A format string that gives information about the URL, and a list of arguments for that format string.
    */
  var result: AnonArgs = js.native
}

object AnonDetails {
  @scala.inline
  def apply(details: js.Array[AnonArgs], result: AnonArgs): AnonDetails = {
    val __obj = js.Dynamic.literal(details = details.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDetails]
  }
  @scala.inline
  implicit class AnonDetailsOps[Self <: AnonDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDetails(value: js.Array[AnonArgs]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("details")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResult(value: AnonArgs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("result")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

