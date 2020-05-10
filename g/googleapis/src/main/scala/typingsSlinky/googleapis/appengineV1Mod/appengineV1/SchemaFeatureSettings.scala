package typingsSlinky.googleapis.appengineV1Mod.appengineV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The feature specific settings to be used in the application. These define
  * behaviors that are user configurable.
  */
@js.native
trait SchemaFeatureSettings extends js.Object {
  /**
    * Boolean value indicating if split health checks should be used instead of
    * the legacy health checks. At an app.yaml level, this means defaulting to
    * &#39;readiness_check&#39; and &#39;liveness_check&#39; values instead of
    * &#39;health_check&#39; ones. Once the legacy &#39;health_check&#39;
    * behavior is deprecated, and this value is always true, this setting can
    * be removed.
    */
  var splitHealthChecks: js.UndefOr[Boolean] = js.native
  /**
    * If true, use Container-Optimized OS
    * (https://cloud.google.com/container-optimized-os/) base image for VMs,
    * rather than a base Debian image.
    */
  var useContainerOptimizedOs: js.UndefOr[Boolean] = js.native
}

object SchemaFeatureSettings {
  @scala.inline
  def apply(): SchemaFeatureSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFeatureSettings]
  }
  @scala.inline
  implicit class SchemaFeatureSettingsOps[Self <: SchemaFeatureSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSplitHealthChecks(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("splitHealthChecks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSplitHealthChecks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("splitHealthChecks")(js.undefined)
        ret
    }
    @scala.inline
    def withUseContainerOptimizedOs(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useContainerOptimizedOs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseContainerOptimizedOs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useContainerOptimizedOs")(js.undefined)
        ret
    }
  }
  
}

