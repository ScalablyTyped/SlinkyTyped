package typingsSlinky.rrule.cacheMod

import typingsSlinky.rrule.anon.PartialIterArgs
import typingsSlinky.rrule.iterresultMod.IterArgs
import typingsSlinky.rrule.rruleBooleans.`false`
import typingsSlinky.rrule.rruleStrings.all
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rrule/dist/esm/src/cache", "Cache")
@js.native
class Cache () extends js.Object {
  var after: js.Array[IterArgs] = js.native
  var all: js.Array[js.Date] | PartialIterArgs | `false` = js.native
  var before: js.Array[IterArgs] = js.native
  var between: js.Array[IterArgs] = js.native
  /**
    * @param {String} what - all/before/after/between
    * @param {Array,Date} value - an array of dates, one date, or null
    * @param {Object?} args - _iter arguments
    */
  def _cacheAdd(what: CacheKeys): Unit = js.native
  def _cacheAdd(what: CacheKeys, value: js.Array[js.Date]): Unit = js.native
  def _cacheAdd(what: CacheKeys, value: js.Array[js.Date], args: PartialIterArgs): Unit = js.native
  def _cacheAdd(what: CacheKeys, value: Null, args: PartialIterArgs): Unit = js.native
  def _cacheAdd(what: CacheKeys, value: js.Date): Unit = js.native
  def _cacheAdd(what: CacheKeys, value: js.Date, args: PartialIterArgs): Unit = js.native
  @JSName("_cacheAdd")
  def _cacheAdd_all(what: all): Unit = js.native
  @JSName("_cacheAdd")
  def _cacheAdd_all(what: all, value: js.Array[js.Date]): Unit = js.native
  @JSName("_cacheAdd")
  def _cacheAdd_all(what: all, value: js.Array[js.Date], args: PartialIterArgs): Unit = js.native
  @JSName("_cacheAdd")
  def _cacheAdd_all(what: all, value: Null, args: PartialIterArgs): Unit = js.native
  @JSName("_cacheAdd")
  def _cacheAdd_all(what: all, value: js.Date): Unit = js.native
  @JSName("_cacheAdd")
  def _cacheAdd_all(what: all, value: js.Date, args: PartialIterArgs): Unit = js.native
  /**
    * @return false - not in the cache
    *         null  - cached, but zero occurrences (before/after)
    *         Date  - cached (before/after)
    *         []    - cached, but zero occurrences (all/between)
    *         [Date1, DateN] - cached (all/between)
    */
  def _cacheGet(what: CacheKeys): js.Date | js.Array[js.Date] | `false` | Null = js.native
  def _cacheGet(what: CacheKeys, args: PartialIterArgs): js.Date | js.Array[js.Date] | `false` | Null = js.native
  @JSName("_cacheGet")
  def _cacheGet_all(what: all): js.Date | js.Array[js.Date] | `false` | Null = js.native
  @JSName("_cacheGet")
  def _cacheGet_all(what: all, args: PartialIterArgs): js.Date | js.Array[js.Date] | `false` | Null = js.native
}

