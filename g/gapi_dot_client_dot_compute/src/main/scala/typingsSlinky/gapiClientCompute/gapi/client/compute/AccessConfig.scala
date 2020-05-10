package typingsSlinky.gapiClientCompute.gapi.client.compute

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccessConfig extends js.Object {
  /** [Output Only] Type of the resource. Always compute#accessConfig for access configs. */
  var kind: js.UndefOr[String] = js.native
  /**
    * The name of this access configuration. The default and recommended name is External NAT but you can use any arbitrary string you would like. For
    * example, My external IP or Network Access.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * An external IP address associated with this instance. Specify an unused static external IP address available to the project or leave this field
    * undefined to use an IP from a shared ephemeral IP address pool. If you specify a static external IP address, it must live in the same region as the
    * zone of the instance.
    */
  var natIP: js.UndefOr[String] = js.native
  /** The type of configuration. The default and only option is ONE_TO_ONE_NAT. */
  var `type`: js.UndefOr[String] = js.native
}

object AccessConfig {
  @scala.inline
  def apply(): AccessConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccessConfig]
  }
  @scala.inline
  implicit class AccessConfigOps[Self <: AccessConfig] (val x: Self) extends AnyVal {
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
    def withNatIP(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("natIP")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNatIP: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("natIP")(js.undefined)
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

