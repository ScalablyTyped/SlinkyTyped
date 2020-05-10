package typingsSlinky.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Specifies what kind of log the caller must write
  */
@js.native
trait SchemaLogConfig extends js.Object {
  /**
    * Cloud audit options.
    */
  var cloudAudit: js.UndefOr[SchemaLogConfigCloudAuditOptions] = js.native
  /**
    * Counter options.
    */
  var counter: js.UndefOr[SchemaLogConfigCounterOptions] = js.native
  /**
    * Data access options.
    */
  var dataAccess: js.UndefOr[SchemaLogConfigDataAccessOptions] = js.native
}

object SchemaLogConfig {
  @scala.inline
  def apply(): SchemaLogConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLogConfig]
  }
  @scala.inline
  implicit class SchemaLogConfigOps[Self <: SchemaLogConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCloudAudit(value: SchemaLogConfigCloudAuditOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cloudAudit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloudAudit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cloudAudit")(js.undefined)
        ret
    }
    @scala.inline
    def withCounter(value: SchemaLogConfigCounterOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("counter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCounter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("counter")(js.undefined)
        ret
    }
    @scala.inline
    def withDataAccess(value: SchemaLogConfigDataAccessOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataAccess")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataAccess: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataAccess")(js.undefined)
        ret
    }
  }
  
}

