package typingsSlinky.nano.mod

import typingsSlinky.nano.anon.External
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://docs.couchdb.org/en/latest/partitioned-dbs/index.html
@js.native
trait PartitionInfoResponse extends js.Object {
  // Database name
  var db_name: String = js.native
  // Document count
  var doc_count: Double = js.native
  // Deleted document count
  var doc_del_count: Double = js.native
  // Partition name
  var partition: String = js.native
  // Partition sizes
  var sizes: External = js.native
}

object PartitionInfoResponse {
  @scala.inline
  def apply(db_name: String, doc_count: Double, doc_del_count: Double, partition: String, sizes: External): PartitionInfoResponse = {
    val __obj = js.Dynamic.literal(db_name = db_name.asInstanceOf[js.Any], doc_count = doc_count.asInstanceOf[js.Any], doc_del_count = doc_del_count.asInstanceOf[js.Any], partition = partition.asInstanceOf[js.Any], sizes = sizes.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartitionInfoResponse]
  }
  @scala.inline
  implicit class PartitionInfoResponseOps[Self <: PartitionInfoResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDb_name(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("db_name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDoc_count(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doc_count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDoc_del_count(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doc_del_count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPartition(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("partition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSizes(value: External): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sizes")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

