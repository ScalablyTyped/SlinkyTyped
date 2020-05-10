package typingsSlinky.gapiClientVision.gapi.client.vision

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SafeSearchAnnotation extends js.Object {
  /**
    * Represents the adult content likelihood for the image. Adult content may
    * contain elements such as nudity, pornographic images or cartoons, or
    * sexual activities.
    */
  var adult: js.UndefOr[String] = js.native
  /** Likelihood that this is a medical image. */
  var medical: js.UndefOr[String] = js.native
  /**
    * Spoof likelihood. The likelihood that an modification
    * was made to the image's canonical version to make it appear
    * funny or offensive.
    */
  var spoof: js.UndefOr[String] = js.native
  /** Likelihood that this image contains violent content. */
  var violence: js.UndefOr[String] = js.native
}

object SafeSearchAnnotation {
  @scala.inline
  def apply(): SafeSearchAnnotation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SafeSearchAnnotation]
  }
  @scala.inline
  implicit class SafeSearchAnnotationOps[Self <: SafeSearchAnnotation] (val x: Self) extends AnyVal {
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
    def withViolence(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("violence")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutViolence: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("violence")(js.undefined)
        ret
    }
  }
  
}

