package typingsSlinky.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeDBLogFilesResponse extends js.Object {
  /**
    * The DB log files returned.
    */
  var DescribeDBLogFiles: js.UndefOr[DescribeDBLogFilesList] = js.native
  /**
    * A pagination token that can be used in a later DescribeDBLogFiles request.
    */
  var Marker: js.UndefOr[String] = js.native
}

object DescribeDBLogFilesResponse {
  @scala.inline
  def apply(): DescribeDBLogFilesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeDBLogFilesResponse]
  }
  @scala.inline
  implicit class DescribeDBLogFilesResponseOps[Self <: DescribeDBLogFilesResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDescribeDBLogFiles(value: DescribeDBLogFilesList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DescribeDBLogFiles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescribeDBLogFiles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DescribeDBLogFiles")(js.undefined)
        ret
    }
    @scala.inline
    def withMarker(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Marker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarker: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Marker")(js.undefined)
        ret
    }
  }
  
}

