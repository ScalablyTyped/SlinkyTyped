package typingsSlinky.googleapis.runV1alpha1Mod.runV1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ServiceSpecPinnedType Pins this service to a specific revision name. The
  * revision must be owned by the configuration provided.  Deprecated and not
  * supported by Cloud Run.
  */
@js.native
trait SchemaServiceSpecPinnedType extends js.Object {
  /**
    * The configuration for this service.
    */
  var configuration: js.UndefOr[SchemaConfigurationSpec] = js.native
  /**
    * The revision name to pin this service to until changed to a different
    * service type.
    */
  var revisionName: js.UndefOr[String] = js.native
}

object SchemaServiceSpecPinnedType {
  @scala.inline
  def apply(): SchemaServiceSpecPinnedType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaServiceSpecPinnedType]
  }
  @scala.inline
  implicit class SchemaServiceSpecPinnedTypeOps[Self <: SchemaServiceSpecPinnedType] (val x: Self) extends AnyVal {
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
    @scala.inline
    def withRevisionName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("revisionName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRevisionName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("revisionName")(js.undefined)
        ret
    }
  }
  
}

