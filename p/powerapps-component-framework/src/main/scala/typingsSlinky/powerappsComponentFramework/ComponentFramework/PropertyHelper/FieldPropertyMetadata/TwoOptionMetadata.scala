package typingsSlinky.powerappsComponentFramework.ComponentFramework.PropertyHelper.FieldPropertyMetadata

import typingsSlinky.powerappsComponentFramework.ComponentFramework.PropertyHelper.OptionMetadata
import typingsSlinky.powerappsComponentFramework.ComponentFramework.PropertyHelper.Types.RequiredLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TwoOptionMetadata extends Metadata {
  var DefaultValue: Boolean = js.native
  var Options: js.Tuple2[OptionMetadata, OptionMetadata] = js.native
}

object TwoOptionMetadata {
  @scala.inline
  def apply(
    DefaultValue: Boolean,
    Description: String,
    DisplayName: String,
    IsSecured: Boolean,
    LogicalName: String,
    Options: js.Tuple2[OptionMetadata, OptionMetadata],
    RequiredLevel: RequiredLevel,
    SourceType: Double
  ): TwoOptionMetadata = {
    val __obj = js.Dynamic.literal(DefaultValue = DefaultValue.asInstanceOf[js.Any], Description = Description.asInstanceOf[js.Any], DisplayName = DisplayName.asInstanceOf[js.Any], IsSecured = IsSecured.asInstanceOf[js.Any], LogicalName = LogicalName.asInstanceOf[js.Any], Options = Options.asInstanceOf[js.Any], RequiredLevel = RequiredLevel.asInstanceOf[js.Any], SourceType = SourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[TwoOptionMetadata]
  }
  @scala.inline
  implicit class TwoOptionMetadataOps[Self <: TwoOptionMetadata] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefaultValue(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DefaultValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOptions(value: js.Tuple2[OptionMetadata, OptionMetadata]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Options")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

