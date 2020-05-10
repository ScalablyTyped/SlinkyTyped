package typingsSlinky.googleapis.v31Mod.dfareportingV31

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Lookback configuration settings.
  */
@js.native
trait SchemaLookbackConfiguration extends js.Object {
  /**
    * Lookback window, in days, from the last time a given user clicked on one
    * of your ads. If you enter 0, clicks will not be considered as triggering
    * events for floodlight tracking. If you leave this field blank, the
    * default value for your account will be used. Acceptable values are 0 to
    * 90, inclusive.
    */
  var clickDuration: js.UndefOr[Double] = js.native
  /**
    * Lookback window, in days, from the last time a given user viewed one of
    * your ads. If you enter 0, impressions will not be considered as
    * triggering events for floodlight tracking. If you leave this field blank,
    * the default value for your account will be used. Acceptable values are 0
    * to 90, inclusive.
    */
  var postImpressionActivitiesDuration: js.UndefOr[Double] = js.native
}

object SchemaLookbackConfiguration {
  @scala.inline
  def apply(): SchemaLookbackConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLookbackConfiguration]
  }
  @scala.inline
  implicit class SchemaLookbackConfigurationOps[Self <: SchemaLookbackConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClickDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clickDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClickDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clickDuration")(js.undefined)
        ret
    }
    @scala.inline
    def withPostImpressionActivitiesDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postImpressionActivitiesDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPostImpressionActivitiesDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postImpressionActivitiesDuration")(js.undefined)
        ret
    }
  }
  
}

