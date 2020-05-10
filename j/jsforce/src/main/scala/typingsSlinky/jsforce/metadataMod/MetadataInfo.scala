package typingsSlinky.jsforce.metadataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MetadataInfo extends js.Object {
  var fullName: String = js.native
}

object MetadataInfo {
  @scala.inline
  def apply(fullName: String): MetadataInfo = {
    val __obj = js.Dynamic.literal(fullName = fullName.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetadataInfo]
  }
  @scala.inline
  implicit class MetadataInfoOps[Self <: MetadataInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFullName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

