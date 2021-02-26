package typingsSlinky.moviedb

import typingsSlinky.moviedb.mod.MovieDB.IMovieDB
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("moviedb", JSImport.Namespace)
  @js.native
  def apply(key: String): IMovieDB = js.native
  
  object MovieDB {
    
    @js.native
    trait Genre extends StObject {
      
      var id: Double = js.native
      
      var name: String = js.native
    }
    object Genre {
      
      @scala.inline
      def apply(id: Double, name: String): Genre = {
        val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
        __obj.asInstanceOf[Genre]
      }
      
      @scala.inline
      implicit class GenreMutableBuilder[Self <: Genre] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      }
    }
    
    @js.native
    trait IMovieDB extends StObject {
      
      def movieImages(options: InfoOptions, callback: js.Function2[/* err */ js.Any, /* images */ MovieImages, Unit]): Unit = js.native
      
      def movieInfo(options: InfoOptions, callback: js.Function2[/* err */ js.Any, /* curMovie */ Movie, Unit]): Unit = js.native
      
      def searchMovie(params: SearchOptions, callback: js.Function2[/* err */ js.Any, /* movies */ SearchResults, Unit]): Unit = js.native
    }
    object IMovieDB {
      
      @scala.inline
      def apply(
        movieImages: (InfoOptions, js.Function2[/* err */ js.Any, /* images */ MovieImages, Unit]) => Unit,
        movieInfo: (InfoOptions, js.Function2[/* err */ js.Any, /* curMovie */ Movie, Unit]) => Unit,
        searchMovie: (SearchOptions, js.Function2[/* err */ js.Any, /* movies */ SearchResults, Unit]) => Unit
      ): IMovieDB = {
        val __obj = js.Dynamic.literal(movieImages = js.Any.fromFunction2(movieImages), movieInfo = js.Any.fromFunction2(movieInfo), searchMovie = js.Any.fromFunction2(searchMovie))
        __obj.asInstanceOf[IMovieDB]
      }
      
      @scala.inline
      implicit class IMovieDBMutableBuilder[Self <: IMovieDB] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setMovieImages(value: (InfoOptions, js.Function2[/* err */ js.Any, /* images */ MovieImages, Unit]) => Unit): Self = StObject.set(x, "movieImages", js.Any.fromFunction2(value))
        
        @scala.inline
        def setMovieInfo(value: (InfoOptions, js.Function2[/* err */ js.Any, /* curMovie */ Movie, Unit]) => Unit): Self = StObject.set(x, "movieInfo", js.Any.fromFunction2(value))
        
        @scala.inline
        def setSearchMovie(value: (SearchOptions, js.Function2[/* err */ js.Any, /* movies */ SearchResults, Unit]) => Unit): Self = StObject.set(x, "searchMovie", js.Any.fromFunction2(value))
      }
    }
    
    @js.native
    trait InfoOptions extends StObject {
      
      var id: Double = js.native
      
      var language: js.UndefOr[String] = js.native
    }
    object InfoOptions {
      
      @scala.inline
      def apply(id: Double): InfoOptions = {
        val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
        __obj.asInstanceOf[InfoOptions]
      }
      
      @scala.inline
      implicit class InfoOptionsMutableBuilder[Self <: InfoOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
      }
    }
    
    @js.native
    trait Movie extends StObject {
      
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
      implicit class MovieMutableBuilder[Self <: Movie] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAdult(value: Boolean): Self = StObject.set(x, "adult", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBackdrop_path(value: String): Self = StObject.set(x, "backdrop_path", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBelongs_to_collection(value: js.Any): Self = StObject.set(x, "belongs_to_collection", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBudget(value: Double): Self = StObject.set(x, "budget", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setGenres(value: js.Array[Genre]): Self = StObject.set(x, "genres", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setGenresVarargs(value: Genre*): Self = StObject.set(x, "genres", js.Array(value :_*))
        
        @scala.inline
        def setHomepage(value: String): Self = StObject.set(x, "homepage", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setImdb_id(value: Double): Self = StObject.set(x, "imdb_id", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOriginal_title(value: String): Self = StObject.set(x, "original_title", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOverview(value: String): Self = StObject.set(x, "overview", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPopularity(value: Double): Self = StObject.set(x, "popularity", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPoster_path(value: String): Self = StObject.set(x, "poster_path", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setProduction_companies(value: js.Array[ProductionCompany]): Self = StObject.set(x, "production_companies", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setProduction_companiesVarargs(value: ProductionCompany*): Self = StObject.set(x, "production_companies", js.Array(value :_*))
        
        @scala.inline
        def setProduction_countries(value: js.Array[ProductionCountry]): Self = StObject.set(x, "production_countries", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setProduction_countriesVarargs(value: ProductionCountry*): Self = StObject.set(x, "production_countries", js.Array(value :_*))
        
        @scala.inline
        def setRelease_date(value: js.Date): Self = StObject.set(x, "release_date", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRevenue(value: Double): Self = StObject.set(x, "revenue", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRuntime(value: Double): Self = StObject.set(x, "runtime", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSpoken_languages(value: js.Array[SpokenLanguage]): Self = StObject.set(x, "spoken_languages", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSpoken_languagesVarargs(value: SpokenLanguage*): Self = StObject.set(x, "spoken_languages", js.Array(value :_*))
        
        @scala.inline
        def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTagline(value: String): Self = StObject.set(x, "tagline", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setVote_average(value: Double): Self = StObject.set(x, "vote_average", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setVote_count(value: Double): Self = StObject.set(x, "vote_count", value.asInstanceOf[js.Any])
      }
    }
    
    @js.native
    trait MovieImage extends StObject {
      
      var aspect_ratio: Double = js.native
      
      var file_path: String = js.native
      
      var height: Double = js.native
      
      var iso_639_1: String = js.native
      
      var vote_average: Double = js.native
      
      var vote_count: Double = js.native
      
      var width: Double = js.native
    }
    object MovieImage {
      
      @scala.inline
      def apply(
        aspect_ratio: Double,
        file_path: String,
        height: Double,
        iso_639_1: String,
        vote_average: Double,
        vote_count: Double,
        width: Double
      ): MovieImage = {
        val __obj = js.Dynamic.literal(aspect_ratio = aspect_ratio.asInstanceOf[js.Any], file_path = file_path.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], iso_639_1 = iso_639_1.asInstanceOf[js.Any], vote_average = vote_average.asInstanceOf[js.Any], vote_count = vote_count.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
        __obj.asInstanceOf[MovieImage]
      }
      
      @scala.inline
      implicit class MovieImageMutableBuilder[Self <: MovieImage] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAspect_ratio(value: Double): Self = StObject.set(x, "aspect_ratio", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFile_path(value: String): Self = StObject.set(x, "file_path", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIso_639_1(value: String): Self = StObject.set(x, "iso_639_1", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setVote_average(value: Double): Self = StObject.set(x, "vote_average", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setVote_count(value: Double): Self = StObject.set(x, "vote_count", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      }
    }
    
    @js.native
    trait MovieImages extends StObject {
      
      var backdrops: js.Array[MovieImage] = js.native
      
      var id: Double = js.native
      
      var posters: js.Array[MovieImage] = js.native
    }
    object MovieImages {
      
      @scala.inline
      def apply(backdrops: js.Array[MovieImage], id: Double, posters: js.Array[MovieImage]): MovieImages = {
        val __obj = js.Dynamic.literal(backdrops = backdrops.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], posters = posters.asInstanceOf[js.Any])
        __obj.asInstanceOf[MovieImages]
      }
      
      @scala.inline
      implicit class MovieImagesMutableBuilder[Self <: MovieImages] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setBackdrops(value: js.Array[MovieImage]): Self = StObject.set(x, "backdrops", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBackdropsVarargs(value: MovieImage*): Self = StObject.set(x, "backdrops", js.Array(value :_*))
        
        @scala.inline
        def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPosters(value: js.Array[MovieImage]): Self = StObject.set(x, "posters", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPostersVarargs(value: MovieImage*): Self = StObject.set(x, "posters", js.Array(value :_*))
      }
    }
    
    @js.native
    trait ProductionCompany extends StObject {
      
      var id: Double = js.native
      
      var name: String = js.native
    }
    object ProductionCompany {
      
      @scala.inline
      def apply(id: Double, name: String): ProductionCompany = {
        val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
        __obj.asInstanceOf[ProductionCompany]
      }
      
      @scala.inline
      implicit class ProductionCompanyMutableBuilder[Self <: ProductionCompany] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      }
    }
    
    @js.native
    trait ProductionCountry extends StObject {
      
      var iso_3166_1: Double = js.native
      
      var name: String = js.native
    }
    object ProductionCountry {
      
      @scala.inline
      def apply(iso_3166_1: Double, name: String): ProductionCountry = {
        val __obj = js.Dynamic.literal(iso_3166_1 = iso_3166_1.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
        __obj.asInstanceOf[ProductionCountry]
      }
      
      @scala.inline
      implicit class ProductionCountryMutableBuilder[Self <: ProductionCountry] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setIso_3166_1(value: Double): Self = StObject.set(x, "iso_3166_1", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      }
    }
    
    @js.native
    trait SearchOptions extends StObject {
      
      var language: js.UndefOr[String] = js.native
      
      var query: String = js.native
    }
    object SearchOptions {
      
      @scala.inline
      def apply(query: String): SearchOptions = {
        val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any])
        __obj.asInstanceOf[SearchOptions]
      }
      
      @scala.inline
      implicit class SearchOptionsMutableBuilder[Self <: SearchOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
        
        @scala.inline
        def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      }
    }
    
    @js.native
    trait SearchResult extends StObject {
      
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
      implicit class SearchResultMutableBuilder[Self <: SearchResult] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAdult(value: Boolean): Self = StObject.set(x, "adult", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBackdrop_path(value: String): Self = StObject.set(x, "backdrop_path", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOriginal_title(value: String): Self = StObject.set(x, "original_title", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPopularity(value: Double): Self = StObject.set(x, "popularity", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPoster_path(value: String): Self = StObject.set(x, "poster_path", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRelease_date(value: js.Date): Self = StObject.set(x, "release_date", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setVote_average(value: Double): Self = StObject.set(x, "vote_average", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setVote_count(value: Double): Self = StObject.set(x, "vote_count", value.asInstanceOf[js.Any])
      }
    }
    
    @js.native
    trait SearchResults extends StObject {
      
      var page: Double = js.native
      
      var results: js.Array[SearchResult] = js.native
      
      var total_Pages: Double = js.native
      
      var total_results: Double = js.native
    }
    object SearchResults {
      
      @scala.inline
      def apply(page: Double, results: js.Array[SearchResult], total_Pages: Double, total_results: Double): SearchResults = {
        val __obj = js.Dynamic.literal(page = page.asInstanceOf[js.Any], results = results.asInstanceOf[js.Any], total_Pages = total_Pages.asInstanceOf[js.Any], total_results = total_results.asInstanceOf[js.Any])
        __obj.asInstanceOf[SearchResults]
      }
      
      @scala.inline
      implicit class SearchResultsMutableBuilder[Self <: SearchResults] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setResults(value: js.Array[SearchResult]): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setResultsVarargs(value: SearchResult*): Self = StObject.set(x, "results", js.Array(value :_*))
        
        @scala.inline
        def setTotal_Pages(value: Double): Self = StObject.set(x, "total_Pages", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTotal_results(value: Double): Self = StObject.set(x, "total_results", value.asInstanceOf[js.Any])
      }
    }
    
    @js.native
    trait SpokenLanguage extends StObject {
      
      var iso_639_1: Double = js.native
      
      var name: String = js.native
    }
    object SpokenLanguage {
      
      @scala.inline
      def apply(iso_639_1: Double, name: String): SpokenLanguage = {
        val __obj = js.Dynamic.literal(iso_639_1 = iso_639_1.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
        __obj.asInstanceOf[SpokenLanguage]
      }
      
      @scala.inline
      implicit class SpokenLanguageMutableBuilder[Self <: SpokenLanguage] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setIso_639_1(value: Double): Self = StObject.set(x, "iso_639_1", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      }
    }
  }
}
