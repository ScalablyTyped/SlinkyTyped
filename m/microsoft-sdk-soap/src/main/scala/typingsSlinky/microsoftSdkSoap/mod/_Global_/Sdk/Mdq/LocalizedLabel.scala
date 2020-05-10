package typingsSlinky.microsoftSdkSoap.mod._Global_.Sdk.Mdq

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LocalizedLabel extends js.Object {
  var HasChanged: Boolean = js.native
  var IsManaged: Boolean = js.native
  var Label: String = js.native
  var LangaugeCode: Double = js.native
  var MetadataId: String = js.native
}

object LocalizedLabel {
  @scala.inline
  def apply(HasChanged: Boolean, IsManaged: Boolean, Label: String, LangaugeCode: Double, MetadataId: String): LocalizedLabel = {
    val __obj = js.Dynamic.literal(HasChanged = HasChanged.asInstanceOf[js.Any], IsManaged = IsManaged.asInstanceOf[js.Any], Label = Label.asInstanceOf[js.Any], LangaugeCode = LangaugeCode.asInstanceOf[js.Any], MetadataId = MetadataId.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocalizedLabel]
  }
  @scala.inline
  implicit class LocalizedLabelOps[Self <: LocalizedLabel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHasChanged(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HasChanged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsManaged(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsManaged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLangaugeCode(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LangaugeCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMetadataId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MetadataId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

