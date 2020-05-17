package typingsSlinky.reduxSagaCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Args extends js.Object {
  var args: js.Array[_] = js.native
  var effectId: Double = js.native
  var saga: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Saga */ js.Any = js.native
}

object Args {
  @scala.inline
  def apply(
    args: js.Array[_],
    effectId: Double,
    saga: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Saga */ js.Any
  ): Args = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], effectId = effectId.asInstanceOf[js.Any], saga = saga.asInstanceOf[js.Any])
    __obj.asInstanceOf[Args]
  }
  @scala.inline
  implicit class ArgsOps[Self <: Args] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArgs(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("args")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEffectId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("effectId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSaga(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Saga */ js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("saga")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

