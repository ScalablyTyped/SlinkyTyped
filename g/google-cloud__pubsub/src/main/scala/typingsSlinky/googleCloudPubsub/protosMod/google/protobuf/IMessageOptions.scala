package typingsSlinky.googleCloudPubsub.protosMod.google.protobuf

import typingsSlinky.googleCloudPubsub.protosMod.google.api.IResourceDescriptor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a MessageOptions. */
@js.native
trait IMessageOptions extends js.Object {
  /** MessageOptions .google.api.resource */
  @JSName(".google.api.resource")
  var DotgoogleDotapiDotresource: js.UndefOr[IResourceDescriptor | Null] = js.native
  /** MessageOptions deprecated */
  var deprecated: js.UndefOr[Boolean | Null] = js.native
  /** MessageOptions mapEntry */
  var mapEntry: js.UndefOr[Boolean | Null] = js.native
  /** MessageOptions messageSetWireFormat */
  var messageSetWireFormat: js.UndefOr[Boolean | Null] = js.native
  /** MessageOptions noStandardDescriptorAccessor */
  var noStandardDescriptorAccessor: js.UndefOr[Boolean | Null] = js.native
  /** MessageOptions uninterpretedOption */
  var uninterpretedOption: js.UndefOr[js.Array[IUninterpretedOption] | Null] = js.native
}

object IMessageOptions {
  @scala.inline
  def apply(): IMessageOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IMessageOptions]
  }
  @scala.inline
  implicit class IMessageOptionsOps[Self <: IMessageOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDotgoogleDotapiDotresource(value: IResourceDescriptor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic(".google.api.resource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDotgoogleDotapiDotresource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic(".google.api.resource")(js.undefined)
        ret
    }
    @scala.inline
    def withDotgoogleDotapiDotresourceNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic(".google.api.resource")(null)
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
    def withDeprecatedNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deprecated")(null)
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
    def withMapEntryNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mapEntry")(null)
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
    def withMessageSetWireFormatNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageSetWireFormat")(null)
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
    @scala.inline
    def withNoStandardDescriptorAccessorNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noStandardDescriptorAccessor")(null)
        ret
    }
    @scala.inline
    def withUninterpretedOption(value: js.Array[IUninterpretedOption]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uninterpretedOption")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUninterpretedOption: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uninterpretedOption")(js.undefined)
        ret
    }
    @scala.inline
    def withUninterpretedOptionNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uninterpretedOption")(null)
        ret
    }
  }
  
}

