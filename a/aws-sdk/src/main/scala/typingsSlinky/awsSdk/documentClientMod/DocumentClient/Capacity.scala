package typingsSlinky.awsSdk.documentClientMod.DocumentClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Capacity extends js.Object {
  /**
    * The total number of capacity units consumed on a table or an index.
    */
  var CapacityUnits: js.UndefOr[ConsumedCapacityUnits] = js.native
  /**
    * The total number of read capacity units consumed on a table or an index.
    */
  var ReadCapacityUnits: js.UndefOr[ConsumedCapacityUnits] = js.native
  /**
    * The total number of write capacity units consumed on a table or an index.
    */
  var WriteCapacityUnits: js.UndefOr[ConsumedCapacityUnits] = js.native
}

object Capacity {
  @scala.inline
  def apply(): Capacity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Capacity]
  }
  @scala.inline
  implicit class CapacityOps[Self <: Capacity] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCapacityUnits(value: ConsumedCapacityUnits): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CapacityUnits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCapacityUnits: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CapacityUnits")(js.undefined)
        ret
    }
    @scala.inline
    def withReadCapacityUnits(value: ConsumedCapacityUnits): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReadCapacityUnits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReadCapacityUnits: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReadCapacityUnits")(js.undefined)
        ret
    }
    @scala.inline
    def withWriteCapacityUnits(value: ConsumedCapacityUnits): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WriteCapacityUnits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWriteCapacityUnits: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WriteCapacityUnits")(js.undefined)
        ret
    }
  }
  
}

