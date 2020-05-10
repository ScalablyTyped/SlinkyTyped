package typingsSlinky.awsSdk.applicationinsightsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeApplicationResponse extends js.Object {
  /**
    * Information about the application.
    */
  var ApplicationInfo: js.UndefOr[typingsSlinky.awsSdk.applicationinsightsMod.ApplicationInfo] = js.native
}

object DescribeApplicationResponse {
  @scala.inline
  def apply(): DescribeApplicationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeApplicationResponse]
  }
  @scala.inline
  implicit class DescribeApplicationResponseOps[Self <: DescribeApplicationResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApplicationInfo(value: ApplicationInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ApplicationInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApplicationInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ApplicationInfo")(js.undefined)
        ret
    }
  }
  
}

