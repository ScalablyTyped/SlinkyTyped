package typingsSlinky.googleapis.healthcareV1alphaMod.healthcareV1alpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains multiple sensitive information findings for each resource slice.
  */
@js.native
trait SchemaDetail extends js.Object {
  var findings: js.UndefOr[js.Array[SchemaFinding]] = js.native
}

object SchemaDetail {
  @scala.inline
  def apply(): SchemaDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDetail]
  }
  @scala.inline
  implicit class SchemaDetailOps[Self <: SchemaDetail] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFindings(value: js.Array[SchemaFinding]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("findings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFindings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("findings")(js.undefined)
        ret
    }
  }
  
}

