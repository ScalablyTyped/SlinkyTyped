package typingsSlinky.moviedb.mod.MovieDB

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SearchResult extends js.Object {
  var adult: Boolean = js.native
  var backdrop_path: String = js.native
  var id: Double = js.native
  var original_title: String = js.native
  var popularity: Double = js.native
  var poster_path: String = js.native
  var release_date: js.Date = js.native
  var title: String = js.native
  var vote_average: Double = js.native
  var vote_count: Double = js.native
}

object SearchResult {
  @scala.inline
  def apply(
    adult: Boolean,
    backdrop_path: String,
    id: Double,
    original_title: String,
    popularity: Double,
    poster_path: String,
    release_date: js.Date,
    title: String,
    vote_average: Double,
    vote_count: Double
  ): SearchResult = {
    val __obj = js.Dynamic.literal(adult = adult.asInstanceOf[js.Any], backdrop_path = backdrop_path.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], original_title = original_title.asInstanceOf[js.Any], popularity = popularity.asInstanceOf[js.Any], poster_path = poster_path.asInstanceOf[js.Any], release_date = release_date.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], vote_average = vote_average.asInstanceOf[js.Any], vote_count = vote_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchResult]
  }
  @scala.inline
  implicit class SearchResultOps[Self <: SearchResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdult(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adult")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBackdrop_path(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backdrop_path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOriginal_title(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("original_title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPopularity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popularity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPoster_path(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("poster_path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRelease_date(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("release_date")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVote_average(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vote_average")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVote_count(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vote_count")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

