package typingsSlinky.googleapis.spannerV1Mod.spannerV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Message type to initiate a read-only transaction.
  */
@js.native
trait SchemaReadOnly extends js.Object {
  /**
    * Executes all reads at a timestamp that is `exact_staleness` old. The
    * timestamp is chosen soon after the read is started.  Guarantees that all
    * writes that have committed more than the specified number of seconds ago
    * are visible. Because Cloud Spanner chooses the exact timestamp, this mode
    * works even if the client&#39;s local clock is substantially skewed from
    * Cloud Spanner commit timestamps.  Useful for reading at nearby replicas
    * without the distributed timestamp negotiation overhead of
    * `max_staleness`.
    */
  var exactStaleness: js.UndefOr[String] = js.native
  /**
    * Read data at a timestamp &gt;= `NOW - max_staleness` seconds. Guarantees
    * that all writes that have committed more than the specified number of
    * seconds ago are visible. Because Cloud Spanner chooses the exact
    * timestamp, this mode works even if the client&#39;s local clock is
    * substantially skewed from Cloud Spanner commit timestamps.  Useful for
    * reading the freshest data available at a nearby replica, while bounding
    * the possible staleness if the local replica has fallen behind.  Note that
    * this option can only be used in single-use transactions.
    */
  var maxStaleness: js.UndefOr[String] = js.native
  /**
    * Executes all reads at a timestamp &gt;= `min_read_timestamp`.  This is
    * useful for requesting fresher data than some previous read, or data that
    * is fresh enough to observe the effects of some previously committed
    * transaction whose timestamp is known.  Note that this option can only be
    * used in single-use transactions.  A timestamp in RFC3339 UTC
    * \&quot;Zulu\&quot; format, accurate to nanoseconds. Example:
    * `&quot;2014-10-02T15:01:23.045123456Z&quot;`.
    */
  var minReadTimestamp: js.UndefOr[String] = js.native
  /**
    * Executes all reads at the given timestamp. Unlike other modes, reads at a
    * specific timestamp are repeatable; the same read at the same timestamp
    * always returns the same data. If the timestamp is in the future, the read
    * will block until the specified timestamp, modulo the read&#39;s deadline.
    * Useful for large scale consistent reads such as mapreduces, or for
    * coordinating many reads against a consistent snapshot of the data.  A
    * timestamp in RFC3339 UTC \&quot;Zulu\&quot; format, accurate to
    * nanoseconds. Example: `&quot;2014-10-02T15:01:23.045123456Z&quot;`.
    */
  var readTimestamp: js.UndefOr[String] = js.native
  /**
    * If true, the Cloud Spanner-selected read timestamp is included in the
    * Transaction message that describes the transaction.
    */
  var returnReadTimestamp: js.UndefOr[Boolean] = js.native
  /**
    * Read at a timestamp where all previously committed transactions are
    * visible.
    */
  var strong: js.UndefOr[Boolean] = js.native
}

object SchemaReadOnly {
  @scala.inline
  def apply(): SchemaReadOnly = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaReadOnly]
  }
  @scala.inline
  implicit class SchemaReadOnlyOps[Self <: SchemaReadOnly] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExactStaleness(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exactStaleness")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExactStaleness: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exactStaleness")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxStaleness(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxStaleness")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxStaleness: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxStaleness")(js.undefined)
        ret
    }
    @scala.inline
    def withMinReadTimestamp(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minReadTimestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinReadTimestamp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minReadTimestamp")(js.undefined)
        ret
    }
    @scala.inline
    def withReadTimestamp(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readTimestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReadTimestamp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readTimestamp")(js.undefined)
        ret
    }
    @scala.inline
    def withReturnReadTimestamp(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("returnReadTimestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReturnReadTimestamp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("returnReadTimestamp")(js.undefined)
        ret
    }
    @scala.inline
    def withStrong(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strong")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrong: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strong")(js.undefined)
        ret
    }
  }
  
}

