package typingsSlinky.googleapis.spannerV1Mod.spannerV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Information returned for each partition returned in a PartitionResponse.
  */
@js.native
trait SchemaPartition extends js.Object {
  /**
    * This token can be passed to Read, StreamingRead, ExecuteSql, or
    * ExecuteStreamingSql requests to restrict the results to those identified
    * by this partition token.
    */
  var partitionToken: js.UndefOr[String] = js.native
}

object SchemaPartition {
  @scala.inline
  def apply(): SchemaPartition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPartition]
  }
  @scala.inline
  implicit class SchemaPartitionOps[Self <: SchemaPartition] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPartitionToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("partitionToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPartitionToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("partitionToken")(js.undefined)
        ret
    }
  }
  
}

