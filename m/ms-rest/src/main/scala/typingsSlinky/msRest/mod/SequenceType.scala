package typingsSlinky.msRest.mod

import typingsSlinky.msRest.anon.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SequenceType extends Mapper {
  @JSName("type")
  var type_SequenceType: Element = js.native
}

object SequenceType {
  @scala.inline
  def apply(name: MapperType, required: Boolean, serializedName: String, `type`: Element): SequenceType = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any], serializedName = serializedName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SequenceType]
  }
  @scala.inline
  implicit class SequenceTypeOps[Self <: SequenceType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withType(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

