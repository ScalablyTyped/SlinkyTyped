package typingsSlinky.dockerode.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Activeanon extends js.Object {
  var active_anon: Double = js.native
  var active_file: Double = js.native
  var cache: Double = js.native
  var hierarchical_memory_limit: Double = js.native
  var inactive_anon: Double = js.native
  var inactive_file: Double = js.native
  var mapped_file: Double = js.native
  var pgfault: Double = js.native
  var pgmajfault: Double = js.native
  var pgpgin: Double = js.native
  var pgpgout: Double = js.native
  var rss: Double = js.native
  var rss_huge: Double = js.native
  var total_active_anon: Double = js.native
  var total_active_file: Double = js.native
  var total_cache: Double = js.native
  var total_inactive_anon: Double = js.native
  var total_inactive_file: Double = js.native
  var total_mapped_file: Double = js.native
  var total_pgfault: Double = js.native
  var total_pgmajfault: Double = js.native
  var total_pgpgin: Double = js.native
  var total_pgpgout: Double = js.native
  var total_rss: Double = js.native
  var total_rss_huge: Double = js.native
  var total_unevictable: Double = js.native
  var total_writeback: Double = js.native
  var unevictable: Double = js.native
  var writeback: Double = js.native
}

object Activeanon {
  @scala.inline
  def apply(
    active_anon: Double,
    active_file: Double,
    cache: Double,
    hierarchical_memory_limit: Double,
    inactive_anon: Double,
    inactive_file: Double,
    mapped_file: Double,
    pgfault: Double,
    pgmajfault: Double,
    pgpgin: Double,
    pgpgout: Double,
    rss: Double,
    rss_huge: Double,
    total_active_anon: Double,
    total_active_file: Double,
    total_cache: Double,
    total_inactive_anon: Double,
    total_inactive_file: Double,
    total_mapped_file: Double,
    total_pgfault: Double,
    total_pgmajfault: Double,
    total_pgpgin: Double,
    total_pgpgout: Double,
    total_rss: Double,
    total_rss_huge: Double,
    total_unevictable: Double,
    total_writeback: Double,
    unevictable: Double,
    writeback: Double
  ): Activeanon = {
    val __obj = js.Dynamic.literal(active_anon = active_anon.asInstanceOf[js.Any], active_file = active_file.asInstanceOf[js.Any], cache = cache.asInstanceOf[js.Any], hierarchical_memory_limit = hierarchical_memory_limit.asInstanceOf[js.Any], inactive_anon = inactive_anon.asInstanceOf[js.Any], inactive_file = inactive_file.asInstanceOf[js.Any], mapped_file = mapped_file.asInstanceOf[js.Any], pgfault = pgfault.asInstanceOf[js.Any], pgmajfault = pgmajfault.asInstanceOf[js.Any], pgpgin = pgpgin.asInstanceOf[js.Any], pgpgout = pgpgout.asInstanceOf[js.Any], rss = rss.asInstanceOf[js.Any], rss_huge = rss_huge.asInstanceOf[js.Any], total_active_anon = total_active_anon.asInstanceOf[js.Any], total_active_file = total_active_file.asInstanceOf[js.Any], total_cache = total_cache.asInstanceOf[js.Any], total_inactive_anon = total_inactive_anon.asInstanceOf[js.Any], total_inactive_file = total_inactive_file.asInstanceOf[js.Any], total_mapped_file = total_mapped_file.asInstanceOf[js.Any], total_pgfault = total_pgfault.asInstanceOf[js.Any], total_pgmajfault = total_pgmajfault.asInstanceOf[js.Any], total_pgpgin = total_pgpgin.asInstanceOf[js.Any], total_pgpgout = total_pgpgout.asInstanceOf[js.Any], total_rss = total_rss.asInstanceOf[js.Any], total_rss_huge = total_rss_huge.asInstanceOf[js.Any], total_unevictable = total_unevictable.asInstanceOf[js.Any], total_writeback = total_writeback.asInstanceOf[js.Any], unevictable = unevictable.asInstanceOf[js.Any], writeback = writeback.asInstanceOf[js.Any])
    __obj.asInstanceOf[Activeanon]
  }
  @scala.inline
  implicit class ActiveanonOps[Self <: Activeanon] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActive_anon(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("active_anon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withActive_file(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("active_file")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCache(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cache")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHierarchical_memory_limit(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hierarchical_memory_limit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInactive_anon(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inactive_anon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInactive_file(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inactive_file")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMapped_file(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mapped_file")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPgfault(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pgfault")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPgmajfault(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pgmajfault")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPgpgin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pgpgin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPgpgout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pgpgout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRss(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rss")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRss_huge(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rss_huge")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTotal_active_anon(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("total_active_anon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTotal_active_file(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("total_active_file")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTotal_cache(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("total_cache")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTotal_inactive_anon(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("total_inactive_anon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTotal_inactive_file(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("total_inactive_file")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTotal_mapped_file(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("total_mapped_file")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTotal_pgfault(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("total_pgfault")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTotal_pgmajfault(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("total_pgmajfault")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTotal_pgpgin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("total_pgpgin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTotal_pgpgout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("total_pgpgout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTotal_rss(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("total_rss")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTotal_rss_huge(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("total_rss_huge")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTotal_unevictable(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("total_unevictable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTotal_writeback(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("total_writeback")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnevictable(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unevictable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWriteback(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("writeback")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

