package typingsSlinky.googleapis.v3p1beta1Mod.jobsV3p1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Input only.  Options for job processing.
  */
@js.native
trait SchemaProcessingOptions extends js.Object {
  /**
    * Optional.  If set to `true`, the service does not attempt to resolve a
    * more precise address for the job.
    */
  var disableStreetAddressResolution: js.UndefOr[Boolean] = js.native
  /**
    * Optional.  Option for job HTML content sanitization. Applied fields are:
    * * description * applicationInfo.instruction * incentives * qualifications
    * * responsibilities  HTML tags in these fields may be stripped if
    * sanitiazation is not disabled.  Defaults to
    * HtmlSanitization.SIMPLE_FORMATTING_ONLY.
    */
  var htmlSanitization: js.UndefOr[String] = js.native
}

object SchemaProcessingOptions {
  @scala.inline
  def apply(): SchemaProcessingOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaProcessingOptions]
  }
  @scala.inline
  implicit class SchemaProcessingOptionsOps[Self <: SchemaProcessingOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisableStreetAddressResolution(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableStreetAddressResolution")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableStreetAddressResolution: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableStreetAddressResolution")(js.undefined)
        ret
    }
    @scala.inline
    def withHtmlSanitization(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("htmlSanitization")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHtmlSanitization: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("htmlSanitization")(js.undefined)
        ret
    }
  }
  
}

