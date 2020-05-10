package typingsSlinky.googleapis.runV1alpha1Mod.runV1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ServiceSpecRunLatest contains the options for always having a route to the
  * latest configuration. See ServiceSpec for more details.
  */
@js.native
trait SchemaServiceSpecRunLatest extends js.Object {
  /**
    * The configuration for this service.
    */
  var configuration: js.UndefOr[SchemaConfigurationSpec] = js.native
}

object SchemaServiceSpecRunLatest {
  @scala.inline
  def apply(): SchemaServiceSpecRunLatest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaServiceSpecRunLatest]
  }
  @scala.inline
  implicit class SchemaServiceSpecRunLatestOps[Self <: SchemaServiceSpecRunLatest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConfiguration(value: SchemaConfigurationSpec): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configuration")(js.undefined)
        ret
    }
  }
  
}

