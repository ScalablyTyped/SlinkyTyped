package typingsSlinky.googleapis.youtubeV3Mod.youtubeV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaVideoAgeGating extends js.Object {
  /**
    * Indicates whether or not the video has alcoholic beverage content. Only
    * users of legal purchasing age in a particular country, as identified by
    * ICAP, can view the content.
    */
  var alcoholContent: js.UndefOr[Boolean] = js.native
  /**
    * Age-restricted trailers. For redband trailers and adult-rated
    * video-games. Only users aged 18+ can view the content. The the field is
    * true the content is restricted to viewers aged 18+. Otherwise The field
    * won&#39;t be present.
    */
  var restricted: js.UndefOr[Boolean] = js.native
  /**
    * Video game rating, if any.
    */
  var videoGameRating: js.UndefOr[String] = js.native
}

object SchemaVideoAgeGating {
  @scala.inline
  def apply(): SchemaVideoAgeGating = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaVideoAgeGating]
  }
  @scala.inline
  implicit class SchemaVideoAgeGatingOps[Self <: SchemaVideoAgeGating] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlcoholContent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alcoholContent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlcoholContent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alcoholContent")(js.undefined)
        ret
    }
    @scala.inline
    def withRestricted(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restricted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRestricted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restricted")(js.undefined)
        ret
    }
    @scala.inline
    def withVideoGameRating(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("videoGameRating")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVideoGameRating: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("videoGameRating")(js.undefined)
        ret
    }
  }
  
}

