package typingsSlinky.gapiClientVideointelligence.gapi.client.videointelligence

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoogleCloudVideointelligenceV1beta1SafeSearchAnnotation extends js.Object {
  /** Likelihood of adult content. */
  var adult: js.UndefOr[String] = js.native
  /** Likelihood of medical content. */
  var medical: js.UndefOr[String] = js.native
  /** Likelihood of racy content. */
  var racy: js.UndefOr[String] = js.native
  /**
    * Likelihood that an obvious modification was made to the original
    * version to make it appear funny or offensive.
    */
  var spoof: js.UndefOr[String] = js.native
  /** Video time offset in microseconds. */
  var timeOffset: js.UndefOr[String] = js.native
  /** Likelihood of violent content. */
  var violent: js.UndefOr[String] = js.native
}

object GoogleCloudVideointelligenceV1beta1SafeSearchAnnotation {
  @scala.inline
  def apply(): GoogleCloudVideointelligenceV1beta1SafeSearchAnnotation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudVideointelligenceV1beta1SafeSearchAnnotation]
  }
  @scala.inline
  implicit class GoogleCloudVideointelligenceV1beta1SafeSearchAnnotationOps[Self <: GoogleCloudVideointelligenceV1beta1SafeSearchAnnotation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdult(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adult")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdult: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adult")(js.undefined)
        ret
    }
    @scala.inline
    def withMedical(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("medical")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMedical: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("medical")(js.undefined)
        ret
    }
    @scala.inline
    def withRacy(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("racy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRacy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("racy")(js.undefined)
        ret
    }
    @scala.inline
    def withSpoof(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spoof")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpoof: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spoof")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeOffset(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeOffset")(js.undefined)
        ret
    }
    @scala.inline
    def withViolent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("violent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutViolent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("violent")(js.undefined)
        ret
    }
  }
  
}

