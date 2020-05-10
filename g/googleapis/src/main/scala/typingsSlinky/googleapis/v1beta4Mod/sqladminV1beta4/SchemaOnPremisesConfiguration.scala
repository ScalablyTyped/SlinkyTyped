package typingsSlinky.googleapis.v1beta4Mod.sqladminV1beta4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * On-premises instance configuration.
  */
@js.native
trait SchemaOnPremisesConfiguration extends js.Object {
  /**
    * The host and port of the on-premises instance in host:port format
    */
  var hostPort: js.UndefOr[String] = js.native
  /**
    * This is always sql#onPremisesConfiguration.
    */
  var kind: js.UndefOr[String] = js.native
}

object SchemaOnPremisesConfiguration {
  @scala.inline
  def apply(): SchemaOnPremisesConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOnPremisesConfiguration]
  }
  @scala.inline
  implicit class SchemaOnPremisesConfigurationOps[Self <: SchemaOnPremisesConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHostPort(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hostPort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHostPort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hostPort")(js.undefined)
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
  }
  
}

