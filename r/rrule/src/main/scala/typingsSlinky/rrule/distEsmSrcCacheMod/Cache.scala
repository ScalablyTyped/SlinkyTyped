package typingsSlinky.rrule.distEsmSrcCacheMod

import typingsSlinky.rrule.distEsmSrcIterresultMod.IterArgs
import typingsSlinky.rrule.rruleBooleans.`false`
import typingsSlinky.rrule.rruleStrings.all
import typingsSlinky.std.Date
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rrule/dist/esm/src/cache", "Cache")
@js.native
class Cache () extends js.Object {
  var after: js.Array[IterArgs] = js.native
  var all: js.Array[js.Date] | Partial[IterArgs] | `false` = js.native
  var before: js.Array[IterArgs] = js.native
  var between: js.Array[IterArgs] = js.native
  def _cacheAdd(what: CacheKeys): Unit = js.native
  /**
    * @param {String} what - all/before/after/between
    * @param {Array,Date} value - an array of dates, one date, or null
    * @param {Object?} args - _iter arguments
    */
  def _cacheAdd(what: CacheKeys, value: js.Array[Date]): Unit = js.native
  def _cacheAdd(what: CacheKeys, value: js.Array[Date], args: Partial[IterArgs]): Unit = js.native
  def _cacheAdd(what: CacheKeys, value: Null, args: Partial[IterArgs]): Unit = js.native
  def _cacheAdd(what: CacheKeys, value: Date): Unit = js.native
  def _cacheAdd(what: CacheKeys, value: Date, args: Partial[IterArgs]): Unit = js.native
  @JSName("_cacheAdd")
  def _cacheAdd_all(what: all): Unit = js.native
  @JSName("_cacheAdd")
  def _cacheAdd_all(what: all, value: js.Array[Date]): Unit = js.native
  @JSName("_cacheAdd")
  def _cacheAdd_all(what: all, value: js.Array[Date], args: Partial[IterArgs]): Unit = js.native
  @JSName("_cacheAdd")
  def _cacheAdd_all(what: all, value: Null, args: Partial[IterArgs]): Unit = js.native
  @JSName("_cacheAdd")
  def _cacheAdd_all(what: all, value: Date): Unit = js.native
  @JSName("_cacheAdd")
  def _cacheAdd_all(what: all, value: Date, args: Partial[IterArgs]): Unit = js.native
  /**
    * @return false - not in the cache
    *         null  - cached, but zero occurrences (before/after)
    *         Date  - cached (before/after)
    *         []    - cached, but zero occurrences (all/between)
    *         [Date1, DateN] - cached (all/between)
    */
  def _cacheGet(what: CacheKeys): js.Date | js.Array[js.Date] | `false` | Null = js.native
  def _cacheGet(what: CacheKeys, args: Partial[IterArgs]): js.Date | js.Array[js.Date] | `false` | Null = js.native
  @JSName("_cacheGet")
  def _cacheGet_all(what: all): js.Date | js.Array[js.Date] | `false` | Null = js.native
  @JSName("_cacheGet")
  def _cacheGet_all(what: all, args: Partial[IterArgs]): js.Date | js.Array[js.Date] | `false` | Null = js.native
}

