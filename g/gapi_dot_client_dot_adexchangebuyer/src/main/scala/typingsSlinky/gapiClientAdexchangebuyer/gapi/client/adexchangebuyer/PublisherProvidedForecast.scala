package typingsSlinky.gapiClientAdexchangebuyer.gapi.client.adexchangebuyer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PublisherProvidedForecast extends js.Object {
  /** Publisher provided dimensions. E.g. geo, sizes etc... */
  var dimensions: js.UndefOr[js.Array[Dimension]] = js.native
  /** Publisher provided weekly impressions. */
  var weeklyImpressions: js.UndefOr[String] = js.native
  /** Publisher provided weekly uniques. */
  var weeklyUniques: js.UndefOr[String] = js.native
}

object PublisherProvidedForecast {
  @scala.inline
  def apply(): PublisherProvidedForecast = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PublisherProvidedForecast]
  }
  @scala.inline
  implicit class PublisherProvidedForecastOps[Self <: PublisherProvidedForecast] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDimensions(value: js.Array[Dimension]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dimensions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDimensions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dimensions")(js.undefined)
        ret
    }
    @scala.inline
    def withWeeklyImpressions(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weeklyImpressions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWeeklyImpressions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weeklyImpressions")(js.undefined)
        ret
    }
    @scala.inline
    def withWeeklyUniques(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weeklyUniques")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWeeklyUniques: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weeklyUniques")(js.undefined)
        ret
    }
  }
  
}

