package typingsSlinky.opentracing.apiCompatibilityMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApiCompatibilityChecksOptions extends js.Object {
  /** a boolean that controls whether or not to verify certain API functionality */
  var skipBaggageChecks: js.UndefOr[Boolean] = js.native
  var skipInjectExtractChecks: js.UndefOr[Boolean] = js.native
}

object ApiCompatibilityChecksOptions {
  @scala.inline
  def apply(): ApiCompatibilityChecksOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApiCompatibilityChecksOptions]
  }
  @scala.inline
  implicit class ApiCompatibilityChecksOptionsOps[Self <: ApiCompatibilityChecksOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSkipBaggageChecks(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipBaggageChecks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSkipBaggageChecks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipBaggageChecks")(js.undefined)
        ret
    }
    @scala.inline
    def withSkipInjectExtractChecks(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipInjectExtractChecks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSkipInjectExtractChecks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipInjectExtractChecks")(js.undefined)
        ret
    }
  }
  
}

