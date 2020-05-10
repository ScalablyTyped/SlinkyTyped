package typingsSlinky.googleapis.replicapoolV1beta1Mod.replicapoolV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A Compute Engine network accessConfig. Identical to the accessConfig on
  * corresponding Compute Engine resource.
  */
@js.native
trait SchemaAccessConfig extends js.Object {
  /**
    * Name of this access configuration.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * An external IP address associated with this instance.
    */
  var natIp: js.UndefOr[String] = js.native
  /**
    * Type of this access configuration file. Currently only ONE_TO_ONE_NAT is
    * supported.
    */
  var `type`: js.UndefOr[String] = js.native
}

object SchemaAccessConfig {
  @scala.inline
  def apply(): SchemaAccessConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAccessConfig]
  }
  @scala.inline
  implicit class SchemaAccessConfigOps[Self <: SchemaAccessConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withNatIp(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("natIp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNatIp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("natIp")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

