package typingsSlinky.moviedb.mod.MovieDB

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Movie extends js.Object {
  var adult: Boolean = js.native
  var backdrop_path: String = js.native
  var belongs_to_collection: js.Any = js.native
  var budget: Double = js.native
  var genres: js.Array[Genre] = js.native
  var homepage: String = js.native
  var id: Double = js.native
  var imdb_id: Double = js.native
  var original_title: String = js.native
  var overview: String = js.native
  var popularity: Double = js.native
  var poster_path: String = js.native
  var production_companies: js.Array[ProductionCompany] = js.native
  var production_countries: js.Array[ProductionCountry] = js.native
  var release_date: js.Date = js.native
  var revenue: Double = js.native
  var runtime: Double = js.native
  var spoken_languages: js.Array[SpokenLanguage] = js.native
  var status: String = js.native
  var tagline: String = js.native
  var title: String = js.native
  var vote_average: Double = js.native
  var vote_count: Double = js.native
}

object Movie {
  @scala.inline
  def apply(
    adult: Boolean,
    backdrop_path: String,
    belongs_to_collection: js.Any,
    budget: Double,
    genres: js.Array[Genre],
    homepage: String,
    id: Double,
    imdb_id: Double,
    original_title: String,
    overview: String,
    popularity: Double,
    poster_path: String,
    production_companies: js.Array[ProductionCompany],
    production_countries: js.Array[ProductionCountry],
    release_date: js.Date,
    revenue: Double,
    runtime: Double,
    spoken_languages: js.Array[SpokenLanguage],
    status: String,
    tagline: String,
    title: String,
    vote_average: Double,
    vote_count: Double
  ): Movie = {
    val __obj = js.Dynamic.literal(adult = adult.asInstanceOf[js.Any], backdrop_path = backdrop_path.asInstanceOf[js.Any], belongs_to_collection = belongs_to_collection.asInstanceOf[js.Any], budget = budget.asInstanceOf[js.Any], genres = genres.asInstanceOf[js.Any], homepage = homepage.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], imdb_id = imdb_id.asInstanceOf[js.Any], original_title = original_title.asInstanceOf[js.Any], overview = overview.asInstanceOf[js.Any], popularity = popularity.asInstanceOf[js.Any], poster_path = poster_path.asInstanceOf[js.Any], production_companies = production_companies.asInstanceOf[js.Any], production_countries = production_countries.asInstanceOf[js.Any], release_date = release_date.asInstanceOf[js.Any], revenue = revenue.asInstanceOf[js.Any], runtime = runtime.asInstanceOf[js.Any], spoken_languages = spoken_languages.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], tagline = tagline.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], vote_average = vote_average.asInstanceOf[js.Any], vote_count = vote_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[Movie]
  }
  @scala.inline
  implicit class MovieOps[Self <: Movie] (val x: Self) extends AnyVal {
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
    def withBelongs_to_collection(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("belongs_to_collection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBudget(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("budget")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGenres(value: js.Array[Genre]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("genres")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHomepage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("homepage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withImdb_id(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imdb_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOriginal_title(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("original_title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOverview(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overview")(value.asInstanceOf[js.Any])
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
    def withProduction_companies(value: js.Array[ProductionCompany]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("production_companies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProduction_countries(value: js.Array[ProductionCountry]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("production_countries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRelease_date(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("release_date")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRevenue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("revenue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRuntime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("runtime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSpoken_languages(value: js.Array[SpokenLanguage]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spoken_languages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTagline(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tagline")(value.asInstanceOf[js.Any])
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

