package typingsSlinky.awsSdk.snowballMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetSnowballUsageResult extends js.Object {
  /**
    * The service limit for number of Snowballs this account can have at once. The default service limit is 1 (one).
    */
  var SnowballLimit: js.UndefOr[Integer] = js.native
  /**
    * The number of Snowballs that this account is currently using.
    */
  var SnowballsInUse: js.UndefOr[Integer] = js.native
}

object GetSnowballUsageResult {
  @scala.inline
  def apply(): GetSnowballUsageResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetSnowballUsageResult]
  }
  @scala.inline
  implicit class GetSnowballUsageResultOps[Self <: GetSnowballUsageResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSnowballLimit(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SnowballLimit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSnowballLimit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SnowballLimit")(js.undefined)
        ret
    }
    @scala.inline
    def withSnowballsInUse(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SnowballsInUse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSnowballsInUse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SnowballsInUse")(js.undefined)
        ret
    }
  }
  
}

