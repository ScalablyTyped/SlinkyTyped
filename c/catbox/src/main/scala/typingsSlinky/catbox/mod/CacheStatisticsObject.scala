package typingsSlinky.catbox.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CacheStatisticsObject extends js.Object {
  /** errors - cache operations errors. TODO check this */
  var errors: Double = js.native
  /** generates - number of calls to the generate function. */
  var generates: Double = js.native
  /** gets - number of cache get() requests. */
  var gets: Double = js.native
  /** hits - number of cache get() requests in which the requested id was found in the cache (can be stale). */
  var hits: Double = js.native
  /** sets - number of cache writes. */
  var sets: Double = js.native
  /** stales - number of cache reads with stale requests (only counts the first request in a queued get() operation). */
  var stales: Double = js.native
}

object CacheStatisticsObject {
  @scala.inline
  def apply(errors: Double, generates: Double, gets: Double, hits: Double, sets: Double, stales: Double): CacheStatisticsObject = {
    val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], generates = generates.asInstanceOf[js.Any], gets = gets.asInstanceOf[js.Any], hits = hits.asInstanceOf[js.Any], sets = sets.asInstanceOf[js.Any], stales = stales.asInstanceOf[js.Any])
    __obj.asInstanceOf[CacheStatisticsObject]
  }
  @scala.inline
  implicit class CacheStatisticsObjectOps[Self <: CacheStatisticsObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withErrors(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGenerates(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("generates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGets(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHits(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSets(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStales(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stales")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

