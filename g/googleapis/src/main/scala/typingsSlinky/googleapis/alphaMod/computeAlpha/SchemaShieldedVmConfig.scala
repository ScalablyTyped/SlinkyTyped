package typingsSlinky.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A set of Shielded VM options.
  */
@js.native
trait SchemaShieldedVmConfig extends js.Object {
  /**
    * Defines whether the instance has integrity monitoring enabled.
    */
  var enableIntegrityMonitoring: js.UndefOr[Boolean] = js.native
  /**
    * Defines whether the instance has Secure Boot enabled.
    */
  var enableSecureBoot: js.UndefOr[Boolean] = js.native
  /**
    * Defines whether the instance has the vTPM enabled.
    */
  var enableVtpm: js.UndefOr[Boolean] = js.native
}

object SchemaShieldedVmConfig {
  @scala.inline
  def apply(): SchemaShieldedVmConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaShieldedVmConfig]
  }
  @scala.inline
  implicit class SchemaShieldedVmConfigOps[Self <: SchemaShieldedVmConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnableIntegrityMonitoring(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableIntegrityMonitoring")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableIntegrityMonitoring: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableIntegrityMonitoring")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableSecureBoot(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableSecureBoot")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableSecureBoot: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableSecureBoot")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableVtpm(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableVtpm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableVtpm: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableVtpm")(js.undefined)
        ret
    }
  }
  
}

