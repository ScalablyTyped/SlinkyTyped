package typingsSlinky.googleapis.healthcareV1alpha2Mod.healthcareV1alpha2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The content of a HL7v2 message in a structured format.
  */
@js.native
trait SchemaParsedData extends js.Object {
  var segments: js.UndefOr[js.Array[SchemaSegment]] = js.native
}

object SchemaParsedData {
  @scala.inline
  def apply(): SchemaParsedData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaParsedData]
  }
  @scala.inline
  implicit class SchemaParsedDataOps[Self <: SchemaParsedData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSegments(value: js.Array[SchemaSegment]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("segments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSegments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("segments")(js.undefined)
        ret
    }
  }
  
}

