package typingsSlinky.gapiClientSqladmin.gapi.client.sqladmin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BinLogCoordinates extends js.Object {
  /** Name of the binary log file for a Cloud SQL instance. */
  var binLogFileName: js.UndefOr[String] = js.native
  /** Position (offset) within the binary log file. */
  var binLogPosition: js.UndefOr[String] = js.native
  /** This is always sql#binLogCoordinates. */
  var kind: js.UndefOr[String] = js.native
}

object BinLogCoordinates {
  @scala.inline
  def apply(): BinLogCoordinates = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BinLogCoordinates]
  }
  @scala.inline
  implicit class BinLogCoordinatesOps[Self <: BinLogCoordinates] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBinLogFileName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("binLogFileName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBinLogFileName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("binLogFileName")(js.undefined)
        ret
    }
    @scala.inline
    def withBinLogPosition(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("binLogPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBinLogPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("binLogPosition")(js.undefined)
        ret
    }
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
  }
  
}

