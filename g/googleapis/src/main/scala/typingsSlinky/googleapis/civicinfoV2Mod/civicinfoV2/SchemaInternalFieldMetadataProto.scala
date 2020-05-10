package typingsSlinky.googleapis.civicinfoV2Mod.civicinfoV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaInternalFieldMetadataProto extends js.Object {
  var isAuto: js.UndefOr[Boolean] = js.native
  var sourceSummary: js.UndefOr[SchemaInternalSourceSummaryProto] = js.native
}

object SchemaInternalFieldMetadataProto {
  @scala.inline
  def apply(): SchemaInternalFieldMetadataProto = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInternalFieldMetadataProto]
  }
  @scala.inline
  implicit class SchemaInternalFieldMetadataProtoOps[Self <: SchemaInternalFieldMetadataProto] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsAuto(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isAuto")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsAuto: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isAuto")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceSummary(value: SchemaInternalSourceSummaryProto): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceSummary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceSummary: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceSummary")(js.undefined)
        ret
    }
  }
  
}

