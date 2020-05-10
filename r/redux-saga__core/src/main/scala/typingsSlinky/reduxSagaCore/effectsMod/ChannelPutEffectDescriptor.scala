package typingsSlinky.reduxSagaCore.effectsMod

import typingsSlinky.reduxSagaCore.typesMod.PuttableChannel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChannelPutEffectDescriptor[T] extends js.Object {
  var action: T = js.native
  var channel: PuttableChannel[T] = js.native
}

object ChannelPutEffectDescriptor {
  @scala.inline
  def apply[T](action: T, channel: PuttableChannel[T]): ChannelPutEffectDescriptor[T] = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], channel = channel.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelPutEffectDescriptor[T]]
  }
  @scala.inline
  implicit class ChannelPutEffectDescriptorOps[Self[t] <: ChannelPutEffectDescriptor[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withAction(value: T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("action")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChannel(value: PuttableChannel[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channel")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

