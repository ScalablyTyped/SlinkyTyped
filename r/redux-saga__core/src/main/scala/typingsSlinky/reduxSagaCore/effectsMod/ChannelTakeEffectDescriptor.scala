package typingsSlinky.reduxSagaCore.effectsMod

import typingsSlinky.reduxSagaCore.typesMod.TakeableChannel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChannelTakeEffectDescriptor[T] extends js.Object {
  var channel: TakeableChannel[T] = js.native
  var maybe: js.UndefOr[Boolean] = js.native
  var pattern: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Pattern<T> */ js.Any
  ] = js.native
}

object ChannelTakeEffectDescriptor {
  @scala.inline
  def apply[T](channel: TakeableChannel[T]): ChannelTakeEffectDescriptor[T] = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelTakeEffectDescriptor[T]]
  }
  @scala.inline
  implicit class ChannelTakeEffectDescriptorOps[Self[t] <: ChannelTakeEffectDescriptor[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withChannel(value: TakeableChannel[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaybe(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maybe")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaybe: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maybe")(js.undefined)
        ret
    }
    @scala.inline
    def withPattern(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Pattern<T> */ js.Any
    ): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pattern")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPattern: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pattern")(js.undefined)
        ret
    }
  }
  
}

