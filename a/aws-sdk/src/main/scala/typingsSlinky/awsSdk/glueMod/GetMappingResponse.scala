package typingsSlinky.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetMappingResponse extends js.Object {
  /**
    * A list of mappings to the specified targets.
    */
  var Mapping: MappingList = js.native
}

object GetMappingResponse {
  @scala.inline
  def apply(Mapping: MappingList): GetMappingResponse = {
    val __obj = js.Dynamic.literal(Mapping = Mapping.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetMappingResponse]
  }
  @scala.inline
  implicit class GetMappingResponseOps[Self <: GetMappingResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMapping(value: MappingList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Mapping")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

