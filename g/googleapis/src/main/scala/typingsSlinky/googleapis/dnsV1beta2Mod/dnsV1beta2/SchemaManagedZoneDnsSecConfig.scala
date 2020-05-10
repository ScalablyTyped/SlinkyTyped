package typingsSlinky.googleapis.dnsV1beta2Mod.dnsV1beta2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaManagedZoneDnsSecConfig extends js.Object {
  var defaultKeySpecs: js.UndefOr[js.Array[SchemaDnsKeySpec]] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dns#managedZoneDnsSecConfig&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  var nonExistence: js.UndefOr[String] = js.native
  var state: js.UndefOr[String] = js.native
}

object SchemaManagedZoneDnsSecConfig {
  @scala.inline
  def apply(): SchemaManagedZoneDnsSecConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaManagedZoneDnsSecConfig]
  }
  @scala.inline
  implicit class SchemaManagedZoneDnsSecConfigOps[Self <: SchemaManagedZoneDnsSecConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefaultKeySpecs(value: js.Array[SchemaDnsKeySpec]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultKeySpecs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultKeySpecs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultKeySpecs")(js.undefined)
        ret
    }
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
    @scala.inline
    def withNonExistence(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nonExistence")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNonExistence: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nonExistence")(js.undefined)
        ret
    }
    @scala.inline
    def withState(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(js.undefined)
        ret
    }
  }
  
}

