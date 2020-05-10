package typingsSlinky.googleapis.civicinfoV2Mod.civicinfoV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaFieldMetadataProto extends js.Object {
  var internal: js.UndefOr[SchemaInternalFieldMetadataProto] = js.native
}

object SchemaFieldMetadataProto {
  @scala.inline
  def apply(): SchemaFieldMetadataProto = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFieldMetadataProto]
  }
  @scala.inline
  implicit class SchemaFieldMetadataProtoOps[Self <: SchemaFieldMetadataProto] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInternal(value: SchemaInternalFieldMetadataProto): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("internal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInternal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("internal")(js.undefined)
        ret
    }
  }
  
}

