package typingsSlinky.reduxSagaCore.effectsMod

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActionChannelEffectDescriptor extends js.Object {
  var buffer: js.UndefOr[Buffer] = js.native
  var pattern: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ActionPattern */ js.Any = js.native
}

object ActionChannelEffectDescriptor {
  @scala.inline
  def apply(
    pattern: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ActionPattern */ js.Any
  ): ActionChannelEffectDescriptor = {
    val __obj = js.Dynamic.literal(pattern = pattern.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionChannelEffectDescriptor]
  }
  @scala.inline
  implicit class ActionChannelEffectDescriptorOps[Self <: ActionChannelEffectDescriptor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPattern(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ActionPattern */ js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pattern")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBuffer(value: Buffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buffer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBuffer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buffer")(js.undefined)
        ret
    }
  }
  
}

