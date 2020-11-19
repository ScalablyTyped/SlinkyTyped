package typingsSlinky.rethinkdb.mod

import typingsSlinky.rethinkdb.rethinkdbStrings.hard
import typingsSlinky.rethinkdb.rethinkdbStrings.majority
import typingsSlinky.rethinkdb.rethinkdbStrings.native
import typingsSlinky.rethinkdb.rethinkdbStrings.outdated
import typingsSlinky.rethinkdb.rethinkdbStrings.raw
import typingsSlinky.rethinkdb.rethinkdbStrings.single
import typingsSlinky.rethinkdb.rethinkdbStrings.soft
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OperationOptions extends js.Object {
  
  /**
    * The maximum numbers of array elements that can be returned by a query (default: 100,000). This affects all ReQL commands that return arrays. Note that it has no effect on the size of arrays being written to the database; those always have an upper limit of 100,000 elements.
    */
  var arrayLimit: Double = js.native
  
  /**
    * What format to return binary data in (default: 'native'). Set this to 'raw' if you want the raw pseudotype.
    */
  var binaryFormat: native | raw = js.native
  
  /**
    * The database to run this query against as a string. The default is the database specified in the db parameter to connect (which defaults to test). The database may also be specified with the db command.
    */
  var db: String = js.native
  
  /**
    * Possible values are 'hard' and 'soft'. In soft durability mode RethinkDB will acknowledge the write immediately after receiving it, but before the write has been committed to disk.
    */
  var durability: hard | soft = js.native
  
  /**
    * Factor to scale the other parameters down by on the first batch (default: 4). For example, with this set to 8 and maxBatchRows set to 80, on the first batch maxBatchRows will be adjusted to 10 (80 / 8). This allows the first batch to return faster.
    */
  var firstBatchScaledownFactor: Double = js.native
  
  /**
    * What format to return `grouped_data` and `grouped_streams` in (default: 'native'). Set this to 'raw' if you want the raw pseudotype.
    */
  var groupFormat: native | raw = js.native
  
  /**
    * Maximum number of bytes to wait for before batching a result set (default: 1MB). This is an integer.
    */
  var maxBatchBytes: Double = js.native
  
  /**
    * Maximum number of rows to wait for before batching a result set (default: unlimited). This is an integer.
    */
  var maxBatchRows: Double = js.native
  
  /**
    * Maximum number of seconds to wait before batching a result set (default: 0.5). This is a float (not an integer) and may be specified to the microsecond.
    */
  var maxBatchSeconds: Double = js.native
  
  /**
    * Minimum number of rows to wait for before batching a result set (default: 8). This is an integer.
    */
  var minBatchRows: Double = js.native
  
  /**
    * Set to `true` to not receive the result object or cursor and return immediately.
    */
  var noreply: Boolean = js.native
  
  /**
    * Whether or not to return a profile of the query’s execution (default: false).
    */
  var profile: Boolean = js.native
  
  /**
    * One of three possible values affecting the consistency guarantee for the query (default: 'single').
    *
    *   * 'single' (the default) returns values that are in memory (but not necessarily written to disk) on the primary replica.
    *   * 'majority' will only return values that are safely committed on disk on a majority of replicas. This requires sending a message to every replica on each read, so it is the slowest but most consistent.
    *   * 'outdated' will return values that are in memory on an arbitrarily-selected replica. This is the fastest but least consistent.
    */
  var readMode: single | majority | outdated = js.native
  
  /**
    * What format to return times in (default: 'native'). Set this to 'raw' if you want times returned as JSON objects for exporting.
    */
  var timeFormat: native | raw = js.native
}
object OperationOptions {
  
  @scala.inline
  def apply(
    arrayLimit: Double,
    binaryFormat: native | raw,
    db: String,
    durability: hard | soft,
    firstBatchScaledownFactor: Double,
    groupFormat: native | raw,
    maxBatchBytes: Double,
    maxBatchRows: Double,
    maxBatchSeconds: Double,
    minBatchRows: Double,
    noreply: Boolean,
    profile: Boolean,
    readMode: single | majority | outdated,
    timeFormat: native | raw
  ): OperationOptions = {
    val __obj = js.Dynamic.literal(arrayLimit = arrayLimit.asInstanceOf[js.Any], binaryFormat = binaryFormat.asInstanceOf[js.Any], db = db.asInstanceOf[js.Any], durability = durability.asInstanceOf[js.Any], firstBatchScaledownFactor = firstBatchScaledownFactor.asInstanceOf[js.Any], groupFormat = groupFormat.asInstanceOf[js.Any], maxBatchBytes = maxBatchBytes.asInstanceOf[js.Any], maxBatchRows = maxBatchRows.asInstanceOf[js.Any], maxBatchSeconds = maxBatchSeconds.asInstanceOf[js.Any], minBatchRows = minBatchRows.asInstanceOf[js.Any], noreply = noreply.asInstanceOf[js.Any], profile = profile.asInstanceOf[js.Any], readMode = readMode.asInstanceOf[js.Any], timeFormat = timeFormat.asInstanceOf[js.Any])
    __obj.asInstanceOf[OperationOptions]
  }
  
  @scala.inline
  implicit class OperationOptionsOps[Self <: OperationOptions] (val x: Self) extends AnyVal {
    
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
    def setArrayLimit(value: Double): Self = this.set("arrayLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBinaryFormat(value: native | raw): Self = this.set("binaryFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDb(value: String): Self = this.set("db", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDurability(value: hard | soft): Self = this.set("durability", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstBatchScaledownFactor(value: Double): Self = this.set("firstBatchScaledownFactor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupFormat(value: native | raw): Self = this.set("groupFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxBatchBytes(value: Double): Self = this.set("maxBatchBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxBatchRows(value: Double): Self = this.set("maxBatchRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxBatchSeconds(value: Double): Self = this.set("maxBatchSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinBatchRows(value: Double): Self = this.set("minBatchRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoreply(value: Boolean): Self = this.set("noreply", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProfile(value: Boolean): Self = this.set("profile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadMode(value: single | majority | outdated): Self = this.set("readMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeFormat(value: native | raw): Self = this.set("timeFormat", value.asInstanceOf[js.Any])
  }
}
