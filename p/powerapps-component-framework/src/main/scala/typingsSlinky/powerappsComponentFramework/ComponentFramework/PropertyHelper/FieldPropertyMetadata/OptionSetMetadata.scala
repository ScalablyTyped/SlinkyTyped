package typingsSlinky.powerappsComponentFramework.ComponentFramework.PropertyHelper.FieldPropertyMetadata

import typingsSlinky.powerappsComponentFramework.ComponentFramework.PropertyHelper.OptionMetadata
import typingsSlinky.powerappsComponentFramework.ComponentFramework.PropertyHelper.Types.RequiredLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OptionSetMetadata extends Metadata {
  var DefaultValue: Double = js.native
  var Options: js.Array[OptionMetadata] = js.native
}

object OptionSetMetadata {
  @scala.inline
  def apply(
    DefaultValue: Double,
    Description: String,
    DisplayName: String,
    IsSecured: Boolean,
    LogicalName: String,
    Options: js.Array[OptionMetadata],
    RequiredLevel: RequiredLevel,
    SourceType: Double
  ): OptionSetMetadata = {
    val __obj = js.Dynamic.literal(DefaultValue = DefaultValue.asInstanceOf[js.Any], Description = Description.asInstanceOf[js.Any], DisplayName = DisplayName.asInstanceOf[js.Any], IsSecured = IsSecured.asInstanceOf[js.Any], LogicalName = LogicalName.asInstanceOf[js.Any], Options = Options.asInstanceOf[js.Any], RequiredLevel = RequiredLevel.asInstanceOf[js.Any], SourceType = SourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionSetMetadata]
  }
  @scala.inline
  implicit class OptionSetMetadataOps[Self <: OptionSetMetadata] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefaultValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DefaultValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOptions(value: js.Array[OptionMetadata]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Options")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

