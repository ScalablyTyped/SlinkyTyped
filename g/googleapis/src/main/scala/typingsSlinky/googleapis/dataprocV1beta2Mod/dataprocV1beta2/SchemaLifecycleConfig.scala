package typingsSlinky.googleapis.dataprocV1beta2Mod.dataprocV1beta2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Specifies the cluster auto-delete schedule configuration.
  */
@js.native
trait SchemaLifecycleConfig extends js.Object {
  /**
    * Optional. The time when cluster will be auto-deleted.
    */
  var autoDeleteTime: js.UndefOr[String] = js.native
  /**
    * Optional. The lifetime duration of cluster. The cluster will be
    * auto-deleted at the end of this period. Valid range: 10m, 14d.Example:
    * &quot;1d&quot;, to delete the cluster 1 day after its creation..
    */
  var autoDeleteTtl: js.UndefOr[String] = js.native
  /**
    * Optional. The duration to keep the cluster alive while idling. Passing
    * this threshold will cause the cluster to be deleted. Valid range: 10m,
    * 14d.Example: &quot;10m&quot;, the minimum value, to delete the cluster
    * when it has had no jobs running for 10 minutes.
    */
  var idleDeleteTtl: js.UndefOr[String] = js.native
}

object SchemaLifecycleConfig {
  @scala.inline
  def apply(): SchemaLifecycleConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLifecycleConfig]
  }
  @scala.inline
  implicit class SchemaLifecycleConfigOps[Self <: SchemaLifecycleConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoDeleteTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoDeleteTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoDeleteTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoDeleteTime")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoDeleteTtl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoDeleteTtl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoDeleteTtl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoDeleteTtl")(js.undefined)
        ret
    }
    @scala.inline
    def withIdleDeleteTtl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("idleDeleteTtl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIdleDeleteTtl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("idleDeleteTtl")(js.undefined)
        ret
    }
  }
  
}

