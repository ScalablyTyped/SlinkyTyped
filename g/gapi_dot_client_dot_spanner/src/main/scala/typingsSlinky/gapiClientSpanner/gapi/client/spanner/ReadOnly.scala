package typingsSlinky.gapiClientSpanner.gapi.client.spanner

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReadOnly extends js.Object {
  
  /**
    * Executes all reads at a timestamp that is `exact_staleness`
    * old. The timestamp is chosen soon after the read is started.
    *
    * Guarantees that all writes that have committed more than the
    * specified number of seconds ago are visible. Because Cloud Spanner
    * chooses the exact timestamp, this mode works even if the client's
    * local clock is substantially skewed from Cloud Spanner commit
    * timestamps.
    *
    * Useful for reading at nearby replicas without the distributed
    * timestamp negotiation overhead of `max_staleness`.
    */
  var exactStaleness: js.UndefOr[String] = js.native
  
  /**
    * Read data at a timestamp >= `NOW - max_staleness`
    * seconds. Guarantees that all writes that have committed more
    * than the specified number of seconds ago are visible. Because
    * Cloud Spanner chooses the exact timestamp, this mode works even if
    * the client's local clock is substantially skewed from Cloud Spanner
    * commit timestamps.
    *
    * Useful for reading the freshest data available at a nearby
    * replica, while bounding the possible staleness if the local
    * replica has fallen behind.
    *
    * Note that this option can only be used in single-use
    * transactions.
    */
  var maxStaleness: js.UndefOr[String] = js.native
  
  /**
    * Executes all reads at a timestamp >= `min_read_timestamp`.
    *
    * This is useful for requesting fresher data than some previous
    * read, or data that is fresh enough to observe the effects of some
    * previously committed transaction whose timestamp is known.
    *
    * Note that this option can only be used in single-use transactions.
    */
  var minReadTimestamp: js.UndefOr[String] = js.native
  
  /**
    * Executes all reads at the given timestamp. Unlike other modes,
    * reads at a specific timestamp are repeatable; the same read at
    * the same timestamp always returns the same data. If the
    * timestamp is in the future, the read will block until the
    * specified timestamp, modulo the read's deadline.
    *
    * Useful for large scale consistent reads such as mapreduces, or
    * for coordinating many reads against a consistent snapshot of the
    * data.
    */
  var readTimestamp: js.UndefOr[String] = js.native
  
  /**
    * If true, the Cloud Spanner-selected read timestamp is included in
    * the Transaction message that describes the transaction.
    */
  var returnReadTimestamp: js.UndefOr[Boolean] = js.native
  
  /**
    * Read at a timestamp where all previously committed transactions
    * are visible.
    */
  var strong: js.UndefOr[Boolean] = js.native
}
object ReadOnly {
  
  @scala.inline
  def apply(): ReadOnly = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReadOnly]
  }
  
  @scala.inline
  implicit class ReadOnlyOps[Self <: ReadOnly] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setExactStaleness(value: String): Self = this.set("exactStaleness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExactStaleness: Self = this.set("exactStaleness", js.undefined)
    
    @scala.inline
    def setMaxStaleness(value: String): Self = this.set("maxStaleness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxStaleness: Self = this.set("maxStaleness", js.undefined)
    
    @scala.inline
    def setMinReadTimestamp(value: String): Self = this.set("minReadTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinReadTimestamp: Self = this.set("minReadTimestamp", js.undefined)
    
    @scala.inline
    def setReadTimestamp(value: String): Self = this.set("readTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReadTimestamp: Self = this.set("readTimestamp", js.undefined)
    
    @scala.inline
    def setReturnReadTimestamp(value: Boolean): Self = this.set("returnReadTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReturnReadTimestamp: Self = this.set("returnReadTimestamp", js.undefined)
    
    @scala.inline
    def setStrong(value: Boolean): Self = this.set("strong", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStrong: Self = this.set("strong", js.undefined)
  }
}
