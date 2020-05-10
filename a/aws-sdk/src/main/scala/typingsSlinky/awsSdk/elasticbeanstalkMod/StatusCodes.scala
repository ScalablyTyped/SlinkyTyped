package typingsSlinky.awsSdk.elasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StatusCodes extends js.Object {
  /**
    * The percentage of requests over the last 10 seconds that resulted in a 2xx (200, 201, etc.) status code.
    */
  var Status2xx: js.UndefOr[NullableInteger] = js.native
  /**
    * The percentage of requests over the last 10 seconds that resulted in a 3xx (300, 301, etc.) status code.
    */
  var Status3xx: js.UndefOr[NullableInteger] = js.native
  /**
    * The percentage of requests over the last 10 seconds that resulted in a 4xx (400, 401, etc.) status code.
    */
  var Status4xx: js.UndefOr[NullableInteger] = js.native
  /**
    * The percentage of requests over the last 10 seconds that resulted in a 5xx (500, 501, etc.) status code.
    */
  var Status5xx: js.UndefOr[NullableInteger] = js.native
}

object StatusCodes {
  @scala.inline
  def apply(): StatusCodes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StatusCodes]
  }
  @scala.inline
  implicit class StatusCodesOps[Self <: StatusCodes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStatus2xx(value: NullableInteger): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status2xx")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus2xx: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status2xx")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus3xx(value: NullableInteger): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status3xx")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus3xx: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status3xx")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus4xx(value: NullableInteger): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status4xx")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus4xx: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status4xx")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus5xx(value: NullableInteger): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status5xx")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus5xx: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status5xx")(js.undefined)
        ret
    }
  }
  
}

