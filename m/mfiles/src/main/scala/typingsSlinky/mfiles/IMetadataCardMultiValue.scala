package typingsSlinky.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IMetadataCardMultiValue extends js.Object {
  val ID: String = js.native
  val IsMultiValue: Boolean = js.native
  val State: js.Any = js.native
  val ValueParts: js.Any = js.native
}

object IMetadataCardMultiValue {
  @scala.inline
  def apply(ID: String, IsMultiValue: Boolean, State: js.Any, ValueParts: js.Any): IMetadataCardMultiValue = {
    val __obj = js.Dynamic.literal(ID = ID.asInstanceOf[js.Any], IsMultiValue = IsMultiValue.asInstanceOf[js.Any], State = State.asInstanceOf[js.Any], ValueParts = ValueParts.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMetadataCardMultiValue]
  }
  @scala.inline
  implicit class IMetadataCardMultiValueOps[Self <: IMetadataCardMultiValue] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withID(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsMultiValue(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsMultiValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withState(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("State")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValueParts(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ValueParts")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

