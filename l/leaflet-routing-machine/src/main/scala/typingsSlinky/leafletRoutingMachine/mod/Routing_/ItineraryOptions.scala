package typingsSlinky.leafletRoutingMachine.mod.Routing_

import typingsSlinky.leaflet.mod.PathOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ItineraryOptions extends js.Object {
  var alternativeClassName: js.UndefOr[String] = js.native
  var collapseBtn: js.UndefOr[js.Function1[/* itinerary */ Itinerary_, Unit]] = js.native
  var collapseBtnClass: js.UndefOr[String] = js.native
  var collapsible: js.UndefOr[Boolean] = js.native
  var containerClassName: js.UndefOr[String] = js.native
  var distanceTemplate: js.UndefOr[String] = js.native
  var formatter: js.UndefOr[Formatter_] = js.native
  var itineraryClassName: js.UndefOr[String] = js.native
  var itineraryFormatter: js.UndefOr[ItineraryBuilder] = js.native
  var minimizedClassName: js.UndefOr[String] = js.native
  var pointMarkerStyle: js.UndefOr[PathOptions] = js.native
  var show: js.UndefOr[Boolean] = js.native
  var summaryTemplate: js.UndefOr[String] = js.native
  var timeTemplate: js.UndefOr[String] = js.native
  var totalDistanceRoundingSensitivity: js.UndefOr[Double] = js.native
}

object ItineraryOptions {
  @scala.inline
  def apply(): ItineraryOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ItineraryOptions]
  }
  @scala.inline
  implicit class ItineraryOptionsOps[Self <: ItineraryOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlternativeClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alternativeClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlternativeClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alternativeClassName")(js.undefined)
        ret
    }
    @scala.inline
    def withCollapseBtn(value: /* itinerary */ Itinerary_ => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapseBtn")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCollapseBtn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapseBtn")(js.undefined)
        ret
    }
    @scala.inline
    def withCollapseBtnClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapseBtnClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCollapseBtnClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapseBtnClass")(js.undefined)
        ret
    }
    @scala.inline
    def withCollapsible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapsible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCollapsible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapsible")(js.undefined)
        ret
    }
    @scala.inline
    def withContainerClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContainerClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerClassName")(js.undefined)
        ret
    }
    @scala.inline
    def withDistanceTemplate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("distanceTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDistanceTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("distanceTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withFormatter(value: Formatter_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormatter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatter")(js.undefined)
        ret
    }
    @scala.inline
    def withItineraryClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itineraryClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItineraryClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itineraryClassName")(js.undefined)
        ret
    }
    @scala.inline
    def withItineraryFormatter(value: ItineraryBuilder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itineraryFormatter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItineraryFormatter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itineraryFormatter")(js.undefined)
        ret
    }
    @scala.inline
    def withMinimizedClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimizedClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinimizedClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimizedClassName")(js.undefined)
        ret
    }
    @scala.inline
    def withPointMarkerStyle(value: PathOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointMarkerStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPointMarkerStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointMarkerStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withShow(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("show")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("show")(js.undefined)
        ret
    }
    @scala.inline
    def withSummaryTemplate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("summaryTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSummaryTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("summaryTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeTemplate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withTotalDistanceRoundingSensitivity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalDistanceRoundingSensitivity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTotalDistanceRoundingSensitivity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalDistanceRoundingSensitivity")(js.undefined)
        ret
    }
  }
  
}

