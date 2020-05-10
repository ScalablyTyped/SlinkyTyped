package typingsSlinky.googleapis.civicinfoV2Mod.civicinfoV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaPointProto extends js.Object {
  var latE7: js.UndefOr[Double] = js.native
  var lngE7: js.UndefOr[Double] = js.native
  var metadata: js.UndefOr[SchemaFieldMetadataProto] = js.native
  var temporaryData: js.UndefOr[SchemaMessageSet] = js.native
}

object SchemaPointProto {
  @scala.inline
  def apply(): SchemaPointProto = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPointProto]
  }
  @scala.inline
  implicit class SchemaPointProtoOps[Self <: SchemaPointProto] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLatE7(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("latE7")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLatE7: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("latE7")(js.undefined)
        ret
    }
    @scala.inline
    def withLngE7(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lngE7")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLngE7: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lngE7")(js.undefined)
        ret
    }
    @scala.inline
    def withMetadata(value: SchemaFieldMetadataProto): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMetadata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(js.undefined)
        ret
    }
    @scala.inline
    def withTemporaryData(value: SchemaMessageSet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("temporaryData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTemporaryData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("temporaryData")(js.undefined)
        ret
    }
  }
  
}

