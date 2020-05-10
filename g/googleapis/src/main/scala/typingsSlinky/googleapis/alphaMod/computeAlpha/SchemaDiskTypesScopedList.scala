package typingsSlinky.googleapis.alphaMod.computeAlpha

import typingsSlinky.googleapis.AnonCode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaDiskTypesScopedList extends js.Object {
  /**
    * [Output Only] A list of disk types contained in this scope.
    */
  var diskTypes: js.UndefOr[js.Array[SchemaDiskType]] = js.native
  /**
    * [Output Only] Informational warning which replaces the list of disk types
    * when the list is empty.
    */
  var warning: js.UndefOr[AnonCode] = js.native
}

object SchemaDiskTypesScopedList {
  @scala.inline
  def apply(): SchemaDiskTypesScopedList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDiskTypesScopedList]
  }
  @scala.inline
  implicit class SchemaDiskTypesScopedListOps[Self <: SchemaDiskTypesScopedList] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDiskTypes(value: js.Array[SchemaDiskType]): Self = {
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
    def withWarning(value: AnonCode): Self = {
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

