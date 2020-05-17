package typingsSlinky.gapiClientCompute.gapi.client.compute

import typingsSlinky.gapiClientCompute.anon.Code
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DiskTypesScopedList extends js.Object {
  /** [Output Only] List of disk types contained in this scope. */
  var diskTypes: js.UndefOr[js.Array[DiskType]] = js.native
  /** [Output Only] Informational warning which replaces the list of disk types when the list is empty. */
  var warning: js.UndefOr[Code] = js.native
}

object DiskTypesScopedList {
  @scala.inline
  def apply(): DiskTypesScopedList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DiskTypesScopedList]
  }
  @scala.inline
  implicit class DiskTypesScopedListOps[Self <: DiskTypesScopedList] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDiskTypes(value: js.Array[DiskType]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("diskTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDiskTypes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("diskTypes")(js.undefined)
        ret
    }
    @scala.inline
    def withWarning(value: Code): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("warning")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWarning: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("warning")(js.undefined)
        ret
    }
  }
  
}

