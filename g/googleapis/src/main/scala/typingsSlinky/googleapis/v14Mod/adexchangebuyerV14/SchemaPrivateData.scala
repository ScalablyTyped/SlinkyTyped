package typingsSlinky.googleapis.v14Mod.adexchangebuyerV14

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaPrivateData extends js.Object {
  var referenceId: js.UndefOr[String] = js.native
  var referencePayload: js.UndefOr[String] = js.native
}

object SchemaPrivateData {
  @scala.inline
  def apply(): SchemaPrivateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPrivateData]
  }
  @scala.inline
  implicit class SchemaPrivateDataOps[Self <: SchemaPrivateData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withReferenceId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("referenceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReferenceId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("referenceId")(js.undefined)
        ret
    }
    @scala.inline
    def withReferencePayload(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("referencePayload")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReferencePayload: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("referencePayload")(js.undefined)
        ret
    }
  }
  
}

