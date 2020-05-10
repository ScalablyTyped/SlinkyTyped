package typingsSlinky.moviedb.mod.MovieDB

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IMovieDB extends js.Object {
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
  implicit class IMovieDBOps[Self <: IMovieDB] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMovieImages(value: (InfoOptions, js.Function2[/* err */ js.Any, /* images */ MovieImages, Unit]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("movieImages")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withMovieInfo(value: (InfoOptions, js.Function2[/* err */ js.Any, /* curMovie */ Movie, Unit]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("movieInfo")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSearchMovie(value: (SearchOptions, js.Function2[/* err */ js.Any, /* movies */ SearchResults, Unit]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchMovie")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

