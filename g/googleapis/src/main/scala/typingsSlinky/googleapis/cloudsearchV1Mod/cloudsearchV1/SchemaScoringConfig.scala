package typingsSlinky.googleapis.cloudsearchV1Mod.cloudsearchV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Scoring configurations for a source while processing a Search or Suggest
  * request.
  */
@js.native
trait SchemaScoringConfig extends js.Object {
  /**
    * Whether to use freshness as a ranking signal. By default, freshness is
    * used as a ranking signal. Note that this setting is not available in the
    * Admin UI.
    */
  var disableFreshness: js.UndefOr[Boolean] = js.native
  /**
    * Whether to personalize the results. By default, personal signals will be
    * used to boost results.
    */
  var disablePersonalization: js.UndefOr[Boolean] = js.native
}

object SchemaScoringConfig {
  @scala.inline
  def apply(): SchemaScoringConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaScoringConfig]
  }
  @scala.inline
  implicit class SchemaScoringConfigOps[Self <: SchemaScoringConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisableFreshness(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableFreshness")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableFreshness: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableFreshness")(js.undefined)
        ret
    }
    @scala.inline
    def withDisablePersonalization(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disablePersonalization")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisablePersonalization: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disablePersonalization")(js.undefined)
        ret
    }
  }
  
}

