package typingsSlinky.lyricist

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAcceptedannotations extends js.Object {
  var accepted_annotations: Double = js.native
  var contributors: Double = js.native
  var hot: Boolean = js.native
  var iq_earners: Double = js.native
  var pageviews: Double = js.native
  var transcribers: Double = js.native
  var unreviewed_annotations: Double = js.native
  var verified_annotations: Double = js.native
}

object AnonAcceptedannotations {
  @scala.inline
  def apply(
    accepted_annotations: Double,
    contributors: Double,
    hot: Boolean,
    iq_earners: Double,
    pageviews: Double,
    transcribers: Double,
    unreviewed_annotations: Double,
    verified_annotations: Double
  ): AnonAcceptedannotations = {
    val __obj = js.Dynamic.literal(accepted_annotations = accepted_annotations.asInstanceOf[js.Any], contributors = contributors.asInstanceOf[js.Any], hot = hot.asInstanceOf[js.Any], iq_earners = iq_earners.asInstanceOf[js.Any], pageviews = pageviews.asInstanceOf[js.Any], transcribers = transcribers.asInstanceOf[js.Any], unreviewed_annotations = unreviewed_annotations.asInstanceOf[js.Any], verified_annotations = verified_annotations.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAcceptedannotations]
  }
  @scala.inline
  implicit class AnonAcceptedannotationsOps[Self <: AnonAcceptedannotations] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccepted_annotations(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accepted_annotations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContributors(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contributors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHot(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hot")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIq_earners(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iq_earners")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPageviews(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageviews")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTranscribers(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transcribers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnreviewed_annotations(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unreviewed_annotations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVerified_annotations(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verified_annotations")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

