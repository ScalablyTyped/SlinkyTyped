package typingsSlinky.reduxSagaCore.effectsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TakeEffectDescriptor extends js.Object {
  var maybe: js.UndefOr[Boolean] = js.native
  var pattern: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ActionPattern */ js.Any = js.native
}

object TakeEffectDescriptor {
  @scala.inline
  def apply(
    pattern: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ActionPattern */ js.Any
  ): TakeEffectDescriptor = {
    val __obj = js.Dynamic.literal(pattern = pattern.asInstanceOf[js.Any])
    __obj.asInstanceOf[TakeEffectDescriptor]
  }
  @scala.inline
  implicit class TakeEffectDescriptorOps[Self <: TakeEffectDescriptor] (val x: Self) extends AnyVal {
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
    def withMaybe(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maybe")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaybe: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maybe")(js.undefined)
        ret
    }
  }
  
}

