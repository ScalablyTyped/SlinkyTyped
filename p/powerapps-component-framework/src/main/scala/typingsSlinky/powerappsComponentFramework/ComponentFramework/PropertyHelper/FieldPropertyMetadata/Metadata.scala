package typingsSlinky.powerappsComponentFramework.ComponentFramework.PropertyHelper.FieldPropertyMetadata

import typingsSlinky.powerappsComponentFramework.ComponentFramework.PropertyHelper.Types.RequiredLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Metadata extends js.Object {
  var Description: String = js.native
  var DisplayName: String = js.native
  var IsSecured: Boolean = js.native
  var LogicalName: String = js.native
  var RequiredLevel: typingsSlinky.powerappsComponentFramework.ComponentFramework.PropertyHelper.Types.RequiredLevel = js.native
  var SourceType: Double = js.native
}

object Metadata {
  @scala.inline
  def apply(
    Description: String,
    DisplayName: String,
    IsSecured: Boolean,
    LogicalName: String,
    RequiredLevel: RequiredLevel,
    SourceType: Double
  ): Metadata = {
    val __obj = js.Dynamic.literal(Description = Description.asInstanceOf[js.Any], DisplayName = DisplayName.asInstanceOf[js.Any], IsSecured = IsSecured.asInstanceOf[js.Any], LogicalName = LogicalName.asInstanceOf[js.Any], RequiredLevel = RequiredLevel.asInstanceOf[js.Any], SourceType = SourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Metadata]
  }
  @scala.inline
  implicit class MetadataOps[Self <: Metadata] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisplayName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DisplayName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsSecured(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsSecured")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLogicalName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LogicalName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequiredLevel(value: RequiredLevel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RequiredLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSourceType(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SourceType")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

