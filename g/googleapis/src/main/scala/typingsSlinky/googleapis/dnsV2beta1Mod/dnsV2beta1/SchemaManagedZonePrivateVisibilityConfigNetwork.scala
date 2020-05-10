package typingsSlinky.googleapis.dnsV2beta1Mod.dnsV2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaManagedZonePrivateVisibilityConfigNetwork extends js.Object {
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dns#managedZonePrivateVisibilityConfigNetwork&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  var networkUrl: js.UndefOr[String] = js.native
}

object SchemaManagedZonePrivateVisibilityConfigNetwork {
  @scala.inline
  def apply(): SchemaManagedZonePrivateVisibilityConfigNetwork = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaManagedZonePrivateVisibilityConfigNetwork]
  }
  @scala.inline
  implicit class SchemaManagedZonePrivateVisibilityConfigNetworkOps[Self <: SchemaManagedZonePrivateVisibilityConfigNetwork] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withNetworkUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("networkUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNetworkUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("networkUrl")(js.undefined)
        ret
    }
  }
  
}

