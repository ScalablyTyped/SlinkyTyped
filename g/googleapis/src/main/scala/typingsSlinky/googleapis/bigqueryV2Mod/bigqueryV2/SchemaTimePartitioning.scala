package typingsSlinky.googleapis.bigqueryV2Mod.bigqueryV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaTimePartitioning extends js.Object {
  /**
    * [Optional] Number of milliseconds for which to keep the storage for
    * partitions in the table. The storage in a partition will have an
    * expiration time of its partition time plus this value.
    */
  var expirationMs: js.UndefOr[String] = js.native
  /**
    * [Beta] [Optional] If not set, the table is partitioned by pseudo column,
    * referenced via either &#39;_PARTITIONTIME&#39; as TIMESTAMP type, or
    * &#39;_PARTITIONDATE&#39; as DATE type. If field is specified, the table
    * is instead partitioned by this field. The field must be a top-level
    * TIMESTAMP or DATE field. Its mode must be NULLABLE or REQUIRED.
    */
  var field: js.UndefOr[String] = js.native
  var requirePartitionFilter: js.UndefOr[Boolean] = js.native
  /**
    * [Required] The only type supported is DAY, which will generate one
    * partition per day.
    */
  var `type`: js.UndefOr[String] = js.native
}

object SchemaTimePartitioning {
  @scala.inline
  def apply(): SchemaTimePartitioning = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTimePartitioning]
  }
  @scala.inline
  implicit class SchemaTimePartitioningOps[Self <: SchemaTimePartitioning] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExpirationMs(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expirationMs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpirationMs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expirationMs")(js.undefined)
        ret
    }
    @scala.inline
    def withField(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("field")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("field")(js.undefined)
        ret
    }
    @scala.inline
    def withRequirePartitionFilter(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requirePartitionFilter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequirePartitionFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requirePartitionFilter")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

