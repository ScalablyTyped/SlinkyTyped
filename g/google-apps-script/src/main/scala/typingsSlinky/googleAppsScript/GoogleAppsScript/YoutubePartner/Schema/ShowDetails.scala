package typingsSlinky.googleAppsScript.GoogleAppsScript.YoutubePartner.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ShowDetails extends js.Object {
  var episodeNumber: js.UndefOr[String] = js.native
  var episodeTitle: js.UndefOr[String] = js.native
  var seasonNumber: js.UndefOr[String] = js.native
  var title: js.UndefOr[String] = js.native
}

object ShowDetails {
  @scala.inline
  def apply(): ShowDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShowDetails]
  }
  @scala.inline
  implicit class ShowDetailsOps[Self <: ShowDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEpisodeNumber(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("episodeNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEpisodeNumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("episodeNumber")(js.undefined)
        ret
    }
    @scala.inline
    def withEpisodeTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("episodeTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEpisodeTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("episodeTitle")(js.undefined)
        ret
    }
    @scala.inline
    def withSeasonNumber(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seasonNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSeasonNumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seasonNumber")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
  }
  
}

