package typingsSlinky.oracledb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonIndex extends js.Object {
  /**
    * Name of the index on the last-modified column.
    *
    * The value of this component is the name of a nonunique index on the last-modified time-stamp column.
    * The index is created if a name is specified. This index can improve the performance of read and write
    * operations that are driven by last-modified time stamps.
    *
    * Only SODA for REST provides such an operation (operation GET collection with time-stamp parameters since
    * and until). Other implementations do not use this component, since they do not provide any read or write
    * operations that are driven by last-modified time stamps. Even for SODA for REST, it is typically better
    * not to set this component if you are sure that your application does not use any read or write operations
    * that are driven by time stamps, because creating and maintaining an index carries a cost.
    */
  var index: js.UndefOr[String] = js.native
  /**
    * Name of the column that stores the last-modified time stamp of the document.
    *
    * @default LAST_MODIFIED
    */
  var name: js.UndefOr[String] = js.native
}

object AnonIndex {
  @scala.inline
  def apply(): AnonIndex = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonIndex]
  }
  @scala.inline
  implicit class AnonIndexOps[Self <: AnonIndex] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIndex(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
  }
  
}

