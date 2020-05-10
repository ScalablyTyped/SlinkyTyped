package typingsSlinky.libnpmsearch.mod

import typingsSlinky.libnpmsearch.libnpmsearchStrings.maintenance
import typingsSlinky.libnpmsearch.libnpmsearchStrings.optimal
import typingsSlinky.libnpmsearch.libnpmsearchStrings.popularity
import typingsSlinky.libnpmsearch.libnpmsearchStrings.quality
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SearchOptions extends js.Object {
  /**
    * If true, returns an object with `package`, `score`, and `searchScore`
    * fields, with `package` being what would usually be returned, and the
    * other two containing details about how that package scored. Useful
    * for UIs. Default: `false`
    */
  var detailed: js.UndefOr[Boolean] = js.native
  /**
    * Offset number for results. Used with `opts.limit` for pagination.
    * Default: `0`
    */
  var from: js.UndefOr[Double] = js.native
  /**
    * Number of results to limit the query to. Default: `20`
    */
  var limit: js.UndefOr[Double] = js.native
  /**
    * Decimal number between `0` and `1` that defines the weight of
    * `maintenance` metrics when scoring and sorting packages.
    * Default: `0.65` (same as `opts.sortBy: 'optimal'`)
    */
  var maintenance: js.UndefOr[Double] = js.native
  /**
    * Decimal number between `0` and `1` that defines the weight of
    * `popularity` metrics when scoring and sorting packages.
    * Default: `0.98` (same as `opts.sortBy: 'optimal'`)
    */
  var popularity: js.UndefOr[Double] = js.native
  /**
    * Decimal number between `0` and `1` that defines the weight of
    * `quality` metrics when scoring and sorting packages.
    * Default: `0.5` (same as `opts.sortBy: 'optimal'`)
    */
  var quality: js.UndefOr[Double] = js.native
  /**
    * Used as a shorthand to set `opts.quality`, `opts.maintenance`, and
    * `opts.popularity` with values that prioritize each one.
    */
  var sortBy: js.UndefOr[optimal | quality | maintenance | popularity] = js.native
}

object SearchOptions {
  @scala.inline
  def apply(): SearchOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchOptions]
  }
  @scala.inline
  implicit class SearchOptionsOps[Self <: SearchOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDetailed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detailed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDetailed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detailed")(js.undefined)
        ret
    }
    @scala.inline
    def withFrom(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("from")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFrom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("from")(js.undefined)
        ret
    }
    @scala.inline
    def withLimit(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLimit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limit")(js.undefined)
        ret
    }
    @scala.inline
    def withMaintenance(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maintenance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaintenance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maintenance")(js.undefined)
        ret
    }
    @scala.inline
    def withPopularity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popularity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPopularity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popularity")(js.undefined)
        ret
    }
    @scala.inline
    def withQuality(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quality")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuality: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quality")(js.undefined)
        ret
    }
    @scala.inline
    def withSortBy(value: optimal | quality | maintenance | popularity): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortBy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSortBy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortBy")(js.undefined)
        ret
    }
  }
  
}

