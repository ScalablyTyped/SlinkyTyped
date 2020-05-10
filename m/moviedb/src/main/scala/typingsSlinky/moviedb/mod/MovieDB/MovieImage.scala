package typingsSlinky.moviedb.mod.MovieDB

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MovieImage extends js.Object {
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
  implicit class MovieImageOps[Self <: MovieImage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAspect_ratio(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aspect_ratio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFile_path(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("file_path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIso_639_1(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iso_639_1")(value.asInstanceOf[js.Any])
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
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

