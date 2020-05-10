package typingsSlinky.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeDBLogFilesDetails extends js.Object {
  /**
    * A POSIX timestamp when the last log entry was written.
    */
  var LastWritten: js.UndefOr[Long] = js.native
  /**
    * The name of the log file for the specified DB instance.
    */
  var LogFileName: js.UndefOr[String] = js.native
  /**
    * The size, in bytes, of the log file for the specified DB instance.
    */
  var Size: js.UndefOr[Long] = js.native
}

object DescribeDBLogFilesDetails {
  @scala.inline
  def apply(): DescribeDBLogFilesDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeDBLogFilesDetails]
  }
  @scala.inline
  implicit class DescribeDBLogFilesDetailsOps[Self <: DescribeDBLogFilesDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLastWritten(value: Long): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastWritten")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastWritten: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastWritten")(js.undefined)
        ret
    }
    @scala.inline
    def withLogFileName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LogFileName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogFileName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LogFileName")(js.undefined)
        ret
    }
    @scala.inline
    def withSize(value: Long): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Size")(js.undefined)
        ret
    }
  }
  
}

