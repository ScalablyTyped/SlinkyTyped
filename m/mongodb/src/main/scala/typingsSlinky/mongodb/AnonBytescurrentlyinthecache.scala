package typingsSlinky.mongodb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonBytescurrentlyinthecache extends js.Object {
  var `bytes currently in the cache`: Double = js.native
  var `bytes read into cache`: Double = js.native
  var `bytes written from cache`: Double = js.native
  var `checkpoint blocked page eviction`: Double = js.native
  var `data source pages selected for eviction unable to be evicted`: Double = js.native
  var `hazard pointer blocked page eviction`: Double = js.native
  var `in-memory page passed criteria to be split`: Double = js.native
  var `in-memory page splits`: Double = js.native
  var `internal pages evicted`: Double = js.native
  var `internal pages split during eviction`: Double = js.native
  var `leaf pages split during eviction`: Double = js.native
  var `modified pages evicted`: Double = js.native
  var `overflow pages read into cache`: Double = js.native
  var `overflow values cached in memory`: Double = js.native
  var `page split during eviction deepened the tree`: Double = js.native
  var `page written requiring lookaside records`: Double = js.native
  var `pages read into cache`: Double = js.native
  var `pages read into cache requiring lookaside entries`: Double = js.native
  var `pages requested from the cache`: Double = js.native
  var `pages written from cache`: Double = js.native
  var `pages written requiring in-memory restoration`: Double = js.native
  var `tracked dirty bytes in the cache`: Double = js.native
  var `unmodified pages evicted`: Double = js.native
}

object AnonBytescurrentlyinthecache {
  @scala.inline
  def apply(
    `bytes currently in the cache`: Double,
    `bytes read into cache`: Double,
    `bytes written from cache`: Double,
    `checkpoint blocked page eviction`: Double,
    `data source pages selected for eviction unable to be evicted`: Double,
    `hazard pointer blocked page eviction`: Double,
    `in-memory page passed criteria to be split`: Double,
    `in-memory page splits`: Double,
    `internal pages evicted`: Double,
    `internal pages split during eviction`: Double,
    `leaf pages split during eviction`: Double,
    `modified pages evicted`: Double,
    `overflow pages read into cache`: Double,
    `overflow values cached in memory`: Double,
    `page split during eviction deepened the tree`: Double,
    `page written requiring lookaside records`: Double,
    `pages read into cache`: Double,
    `pages read into cache requiring lookaside entries`: Double,
    `pages requested from the cache`: Double,
    `pages written from cache`: Double,
    `pages written requiring in-memory restoration`: Double,
    `tracked dirty bytes in the cache`: Double,
    `unmodified pages evicted`: Double
  ): AnonBytescurrentlyinthecache = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("bytes currently in the cache")((`bytes currently in the cache`).asInstanceOf[js.Any])
    __obj.updateDynamic("bytes read into cache")((`bytes read into cache`).asInstanceOf[js.Any])
    __obj.updateDynamic("bytes written from cache")((`bytes written from cache`).asInstanceOf[js.Any])
    __obj.updateDynamic("checkpoint blocked page eviction")((`checkpoint blocked page eviction`).asInstanceOf[js.Any])
    __obj.updateDynamic("data source pages selected for eviction unable to be evicted")((`data source pages selected for eviction unable to be evicted`).asInstanceOf[js.Any])
    __obj.updateDynamic("hazard pointer blocked page eviction")((`hazard pointer blocked page eviction`).asInstanceOf[js.Any])
    __obj.updateDynamic("in-memory page passed criteria to be split")((`in-memory page passed criteria to be split`).asInstanceOf[js.Any])
    __obj.updateDynamic("in-memory page splits")((`in-memory page splits`).asInstanceOf[js.Any])
    __obj.updateDynamic("internal pages evicted")((`internal pages evicted`).asInstanceOf[js.Any])
    __obj.updateDynamic("internal pages split during eviction")((`internal pages split during eviction`).asInstanceOf[js.Any])
    __obj.updateDynamic("leaf pages split during eviction")((`leaf pages split during eviction`).asInstanceOf[js.Any])
    __obj.updateDynamic("modified pages evicted")((`modified pages evicted`).asInstanceOf[js.Any])
    __obj.updateDynamic("overflow pages read into cache")((`overflow pages read into cache`).asInstanceOf[js.Any])
    __obj.updateDynamic("overflow values cached in memory")((`overflow values cached in memory`).asInstanceOf[js.Any])
    __obj.updateDynamic("page split during eviction deepened the tree")((`page split during eviction deepened the tree`).asInstanceOf[js.Any])
    __obj.updateDynamic("page written requiring lookaside records")((`page written requiring lookaside records`).asInstanceOf[js.Any])
    __obj.updateDynamic("pages read into cache")((`pages read into cache`).asInstanceOf[js.Any])
    __obj.updateDynamic("pages read into cache requiring lookaside entries")((`pages read into cache requiring lookaside entries`).asInstanceOf[js.Any])
    __obj.updateDynamic("pages requested from the cache")((`pages requested from the cache`).asInstanceOf[js.Any])
    __obj.updateDynamic("pages written from cache")((`pages written from cache`).asInstanceOf[js.Any])
    __obj.updateDynamic("pages written requiring in-memory restoration")((`pages written requiring in-memory restoration`).asInstanceOf[js.Any])
    __obj.updateDynamic("tracked dirty bytes in the cache")((`tracked dirty bytes in the cache`).asInstanceOf[js.Any])
    __obj.updateDynamic("unmodified pages evicted")((`unmodified pages evicted`).asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBytescurrentlyinthecache]
  }
  @scala.inline
  implicit class AnonBytescurrentlyinthecacheOps[Self <: AnonBytescurrentlyinthecache] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def `withBytes currently in the cache`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bytes currently in the cache")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withBytes read into cache`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bytes read into cache")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withBytes written from cache`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bytes written from cache")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withCheckpoint blocked page eviction`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkpoint blocked page eviction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withData source pages selected for eviction unable to be evicted`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data source pages selected for eviction unable to be evicted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withHazard pointer blocked page eviction`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hazard pointer blocked page eviction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withIn-memory page passed criteria to be split`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("in-memory page passed criteria to be split")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withIn-memory page splits`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("in-memory page splits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withInternal pages evicted`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("internal pages evicted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withInternal pages split during eviction`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("internal pages split during eviction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withLeaf pages split during eviction`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leaf pages split during eviction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withModified pages evicted`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modified pages evicted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withOverflow pages read into cache`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overflow pages read into cache")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withOverflow values cached in memory`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overflow values cached in memory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withPage split during eviction deepened the tree`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("page split during eviction deepened the tree")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withPage written requiring lookaside records`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("page written requiring lookaside records")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withPages read into cache`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pages read into cache")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withPages read into cache requiring lookaside entries`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pages read into cache requiring lookaside entries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withPages requested from the cache`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pages requested from the cache")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withPages written from cache`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pages written from cache")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withPages written requiring in-memory restoration`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pages written requiring in-memory restoration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withTracked dirty bytes in the cache`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tracked dirty bytes in the cache")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withUnmodified pages evicted`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unmodified pages evicted")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

