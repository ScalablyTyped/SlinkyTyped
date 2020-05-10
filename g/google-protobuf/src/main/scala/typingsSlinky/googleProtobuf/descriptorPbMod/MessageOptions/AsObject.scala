package typingsSlinky.googleProtobuf.descriptorPbMod.MessageOptions

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AsObject extends js.Object {
  var deprecated: js.UndefOr[Boolean] = js.native
  var mapEntry: js.UndefOr[Boolean] = js.native
  var messageSetWireFormat: js.UndefOr[Boolean] = js.native
  var noStandardDescriptorAccessor: js.UndefOr[Boolean] = js.native
  var uninterpretedOptionList: js.Array[typingsSlinky.googleProtobuf.descriptorPbMod.UninterpretedOption.AsObject] = js.native
}

object AsObject {
  @scala.inline
  def apply(
    uninterpretedOptionList: js.Array[typingsSlinky.googleProtobuf.descriptorPbMod.UninterpretedOption.AsObject]
  ): AsObject = {
    val __obj = js.Dynamic.literal(uninterpretedOptionList = uninterpretedOptionList.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsObject]
  }
  @scala.inline
  implicit class AsObjectOps[Self <: AsObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUninterpretedOptionList(value: js.Array[typingsSlinky.googleProtobuf.descriptorPbMod.UninterpretedOption.AsObject]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uninterpretedOptionList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeprecated(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deprecated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeprecated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deprecated")(js.undefined)
        ret
    }
    @scala.inline
    def withMapEntry(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mapEntry")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMapEntry: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mapEntry")(js.undefined)
        ret
    }
    @scala.inline
    def withMessageSetWireFormat(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageSetWireFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessageSetWireFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageSetWireFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withNoStandardDescriptorAccessor(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noStandardDescriptorAccessor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoStandardDescriptorAccessor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noStandardDescriptorAccessor")(js.undefined)
        ret
    }
  }
  
}

