package typingsSlinky.oracledb.mod

import typingsSlinky.oracledb.anon.Operation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An object specifying which tables were affected by a subscription's notification.
  */
@js.native
trait SubscriptionTables extends js.Object {
  /** Name of the table which was modified in some way. */
  var name: String = js.native
  /**
    * One of the CQN_OPCODE_* constants.
    */
  var operation: Double = js.native
  /**
    * array of objects specifying the rows which were changed. This will only be defined if the qos
    * quality of service used when creating the subscription indicated the desire for ROWIDs and no
    * summary grouping took place.
    */
  var rows: js.UndefOr[js.Array[Operation]] = js.native
}

object SubscriptionTables {
  @scala.inline
  def apply(name: String, operation: Double): SubscriptionTables = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], operation = operation.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubscriptionTables]
  }
  @scala.inline
  implicit class SubscriptionTablesOps[Self <: SubscriptionTables] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOperation(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRows(value: js.Array[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRows: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rows")(js.undefined)
        ret
    }
  }
  
}

