package typingsSlinky.fridaGum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MemoryAccessDetails extends js.Object {
  /**
    * Address being accessed.
    */
  var address: NativePointer = js.native
  /**
    * Address of instruction performing the access.
    */
  var from: NativePointer = js.native
  /**
    * The kind of operation that triggered the access.
    */
  var operation: MemoryOperation = js.native
  /**
    * Index of the accessed memory page inside the specified range.
    */
  var pageIndex: Double = js.native
  /**
    * Overall number of pages which have been accessed so far, and are thus
    * no longer being monitored.
    */
  var pagesCompleted: Double = js.native
  /**
    * Overall number of pages that were initially monitored.
    */
  var pagesTotal: Double = js.native
  /**
    * Index of the accessed range in the ranges provided to
    * `MemoryAccessMonitor.enable()`.
    */
  var rangeIndex: Double = js.native
}

object MemoryAccessDetails {
  @scala.inline
  def apply(
    address: NativePointer,
    from: NativePointer,
    operation: MemoryOperation,
    pageIndex: Double,
    pagesCompleted: Double,
    pagesTotal: Double,
    rangeIndex: Double
  ): MemoryAccessDetails = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], operation = operation.asInstanceOf[js.Any], pageIndex = pageIndex.asInstanceOf[js.Any], pagesCompleted = pagesCompleted.asInstanceOf[js.Any], pagesTotal = pagesTotal.asInstanceOf[js.Any], rangeIndex = rangeIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[MemoryAccessDetails]
  }
  @scala.inline
  implicit class MemoryAccessDetailsOps[Self <: MemoryAccessDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddress(value: NativePointer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("address")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFrom(value: NativePointer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("from")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOperation(value: MemoryOperation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPageIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPagesCompleted(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pagesCompleted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPagesTotal(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pagesTotal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRangeIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rangeIndex")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

