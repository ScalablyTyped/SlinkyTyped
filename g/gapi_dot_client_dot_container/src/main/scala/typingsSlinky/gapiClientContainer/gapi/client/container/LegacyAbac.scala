package typingsSlinky.gapiClientContainer.gapi.client.container

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LegacyAbac extends js.Object {
  /**
    * Whether the ABAC authorizer is enabled for this cluster. When enabled,
    * identities in the system, including service accounts, nodes, and
    * controllers, will have statically granted permissions beyond those
    * provided by the RBAC configuration or IAM.
    */
  var enabled: js.UndefOr[Boolean] = js.native
}

object LegacyAbac {
  @scala.inline
  def apply(): LegacyAbac = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LegacyAbac]
  }
  @scala.inline
  implicit class LegacyAbacOps[Self <: LegacyAbac] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(js.undefined)
        ret
    }
  }
  
}

