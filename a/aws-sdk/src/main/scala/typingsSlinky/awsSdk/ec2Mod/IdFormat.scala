package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IdFormat extends js.Object {
  /**
    * The date in UTC at which you are permanently switched over to using longer IDs. If a deadline is not yet available for this resource type, this field is not returned.
    */
  var Deadline: js.UndefOr[js.Date] = js.native
  /**
    * The type of resource.
    */
  var Resource: js.UndefOr[String] = js.native
  /**
    * Indicates whether longer IDs (17-character IDs) are enabled for the resource.
    */
  var UseLongIds: js.UndefOr[Boolean] = js.native
}

object IdFormat {
  @scala.inline
  def apply(): IdFormat = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IdFormat]
  }
  @scala.inline
  implicit class IdFormatOps[Self <: IdFormat] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeadline(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Deadline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeadline: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Deadline")(js.undefined)
        ret
    }
    @scala.inline
    def withResource(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Resource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Resource")(js.undefined)
        ret
    }
    @scala.inline
    def withUseLongIds(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UseLongIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseLongIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UseLongIds")(js.undefined)
        ret
    }
  }
  
}

