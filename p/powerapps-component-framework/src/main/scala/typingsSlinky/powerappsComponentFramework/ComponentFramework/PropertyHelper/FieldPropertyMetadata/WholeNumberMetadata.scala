package typingsSlinky.powerappsComponentFramework.ComponentFramework.PropertyHelper.FieldPropertyMetadata

import typingsSlinky.powerappsComponentFramework.ComponentFramework.Dictionary
import typingsSlinky.powerappsComponentFramework.ComponentFramework.PropertyHelper.Types.ImeMode
import typingsSlinky.powerappsComponentFramework.ComponentFramework.PropertyHelper.Types.RequiredLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WholeNumberMetadata extends NumberMetadata {
  var Format: String = js.native
  var LanguageByCode: js.UndefOr[Dictionary] = js.native
  var TimeZoneByCode: js.UndefOr[Dictionary] = js.native
}

object WholeNumberMetadata {
  @scala.inline
  def apply(
    Description: String,
    DisplayName: String,
    Format: String,
    ImeMode: ImeMode,
    IsSecured: Boolean,
    LogicalName: String,
    MaxValue: Double,
    MinValue: Double,
    RequiredLevel: RequiredLevel,
    SourceType: Double
  ): WholeNumberMetadata = {
    val __obj = js.Dynamic.literal(Description = Description.asInstanceOf[js.Any], DisplayName = DisplayName.asInstanceOf[js.Any], Format = Format.asInstanceOf[js.Any], ImeMode = ImeMode.asInstanceOf[js.Any], IsSecured = IsSecured.asInstanceOf[js.Any], LogicalName = LogicalName.asInstanceOf[js.Any], MaxValue = MaxValue.asInstanceOf[js.Any], MinValue = MinValue.asInstanceOf[js.Any], RequiredLevel = RequiredLevel.asInstanceOf[js.Any], SourceType = SourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[WholeNumberMetadata]
  }
  @scala.inline
  implicit class WholeNumberMetadataOps[Self <: WholeNumberMetadata] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLanguageByCode(value: Dictionary): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LanguageByCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLanguageByCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LanguageByCode")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeZoneByCode(value: Dictionary): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TimeZoneByCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeZoneByCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TimeZoneByCode")(js.undefined)
        ret
    }
  }
  
}

