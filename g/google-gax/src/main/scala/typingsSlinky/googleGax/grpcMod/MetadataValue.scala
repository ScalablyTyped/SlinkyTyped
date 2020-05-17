package typingsSlinky.googleGax.grpcMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MetadataValue extends js.Object {
  @JSName("equals")
  var equals_FMetadataValue: js.Function = js.native
}

object MetadataValue {
  @scala.inline
  def apply(equals: js.Function): MetadataValue = {
    val __obj = js.Dynamic.literal(equals = equals.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetadataValue]
  }
  @scala.inline
  implicit class MetadataValueOps[Self <: MetadataValue] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEquals(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("equals")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

