package typingsSlinky.electron.Electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IOCounters extends js.Object {
  // Docs: http://electronjs.org/docs/api/structures/io-counters
  /**
    * Then number of I/O other operations.
    */
  var otherOperationCount: Double = js.native
  /**
    * Then number of I/O other transfers.
    */
  var otherTransferCount: Double = js.native
  /**
    * The number of I/O read operations.
    */
  var readOperationCount: Double = js.native
  /**
    * The number of I/O read transfers.
    */
  var readTransferCount: Double = js.native
  /**
    * The number of I/O write operations.
    */
  var writeOperationCount: Double = js.native
  /**
    * The number of I/O write transfers.
    */
  var writeTransferCount: Double = js.native
}

object IOCounters {
  @scala.inline
  def apply(
    otherOperationCount: Double,
    otherTransferCount: Double,
    readOperationCount: Double,
    readTransferCount: Double,
    writeOperationCount: Double,
    writeTransferCount: Double
  ): IOCounters = {
    val __obj = js.Dynamic.literal(otherOperationCount = otherOperationCount.asInstanceOf[js.Any], otherTransferCount = otherTransferCount.asInstanceOf[js.Any], readOperationCount = readOperationCount.asInstanceOf[js.Any], readTransferCount = readTransferCount.asInstanceOf[js.Any], writeOperationCount = writeOperationCount.asInstanceOf[js.Any], writeTransferCount = writeTransferCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOCounters]
  }
  @scala.inline
  implicit class IOCountersOps[Self <: IOCounters] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOtherOperationCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("otherOperationCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOtherTransferCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("otherTransferCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReadOperationCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readOperationCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReadTransferCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readTransferCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWriteOperationCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("writeOperationCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWriteTransferCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("writeTransferCount")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

