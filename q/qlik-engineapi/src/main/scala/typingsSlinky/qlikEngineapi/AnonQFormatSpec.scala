package typingsSlinky.qlikEngineapi

import typingsSlinky.qlikEngineapi.EngineAPI.IDataRecord
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonQFormatSpec extends js.Object {
  var qFormatSpec: String = js.native
  var qPreview: js.Array[IDataRecord] = js.native
}

object AnonQFormatSpec {
  @scala.inline
  def apply(qFormatSpec: String, qPreview: js.Array[IDataRecord]): AnonQFormatSpec = {
    val __obj = js.Dynamic.literal(qFormatSpec = qFormatSpec.asInstanceOf[js.Any], qPreview = qPreview.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonQFormatSpec]
  }
  @scala.inline
  implicit class AnonQFormatSpecOps[Self <: AnonQFormatSpec] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withQFormatSpec(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qFormatSpec")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQPreview(value: js.Array[IDataRecord]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qPreview")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

