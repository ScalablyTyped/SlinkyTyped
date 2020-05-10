package typingsSlinky.ledgerhqHwTransport.mod

import typingsSlinky.ledgerhqHwTransport.ledgerhqHwTransportStrings.add
import typingsSlinky.ledgerhqHwTransport.ledgerhqHwTransportStrings.remove
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescriptorEvent[Descriptor] extends js.Object {
  var descriptor: Descriptor = js.native
  var device: js.UndefOr[Device] = js.native
  var `type`: add | remove = js.native
}

object DescriptorEvent {
  @scala.inline
  def apply[Descriptor](descriptor: Descriptor, `type`: add | remove): DescriptorEvent[Descriptor] = {
    val __obj = js.Dynamic.literal(descriptor = descriptor.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescriptorEvent[Descriptor]]
  }
  @scala.inline
  implicit class DescriptorEventOps[Self[descriptor] <: DescriptorEvent[descriptor], Descriptor] (val x: Self[Descriptor]) extends AnyVal {
    @scala.inline
    def duplicate: Self[Descriptor] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[Descriptor]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[Descriptor] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[Descriptor] with Other]
    @scala.inline
    def withDescriptor(value: Descriptor): Self[Descriptor] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("descriptor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: add | remove): Self[Descriptor] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDevice(value: Device): Self[Descriptor] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("device")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDevice: Self[Descriptor] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("device")(js.undefined)
        ret
    }
  }
  
}

