package typingsSlinky.coreObject.utilsMod

import typingsSlinky.std.IArguments
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CallOrApply[This, Args, Return] extends js.Object {
  // TODO support this properly with `...args: Args` once we can restrict to 3.0+ on DT
  var call: (js.Function2[/* thisArg */ This, /* repeated */ js.Any, Return]) | (js.Function5[/* thisArg */ This, /* a */ js.Any, /* b */ js.Any, /* c */ js.Any, /* d */ js.Any, Return]) | (js.Function4[/* thisArg */ This, /* a */ js.Any, /* b */ js.Any, /* c */ js.Any, Return]) | (js.Function3[/* thisArg */ This, /* a */ js.Any, /* b */ js.Any, Return]) | (js.Function1[/* thisArg */ This, Return]) = js.native
  @JSName("apply")
  def apply(thisArg: This, args: Args | IArguments | js.Array[_]): Return = js.native
}

object CallOrApply {
  @scala.inline
  def apply[This, Args, Return](
    apply: (This, Args | IArguments | js.Array[_]) => Return,
    call: (js.Function2[/* thisArg */ This, /* repeated */ js.Any, Return]) | (js.Function5[/* thisArg */ This, /* a */ js.Any, /* b */ js.Any, /* c */ js.Any, /* d */ js.Any, Return]) | (js.Function4[/* thisArg */ This, /* a */ js.Any, /* b */ js.Any, /* c */ js.Any, Return]) | (js.Function3[/* thisArg */ This, /* a */ js.Any, /* b */ js.Any, Return]) | (js.Function1[/* thisArg */ This, Return])
  ): CallOrApply[This, Args, Return] = {
    val __obj = js.Dynamic.literal(apply = js.Any.fromFunction2(apply), call = call.asInstanceOf[js.Any])
    __obj.asInstanceOf[CallOrApply[This, Args, Return]]
  }
  @scala.inline
  implicit class CallOrApplyOps[Self[`this`, args, `return`] <: CallOrApply[`this`, args, `return`], This, Args, Return] (val x: Self[This, Args, Return]) extends AnyVal {
    @scala.inline
    def duplicate: Self[This, Args, Return] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[This, Args, Return]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[This, Args, Return]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[This, Args, Return]) with Other]
    @scala.inline
    def withApply(value: (This, Args | IArguments | js.Array[_]) => Return): Self[This, Args, Return] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apply")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withCallFunction4(value: (/* thisArg */ This, /* a */ js.Any, /* b */ js.Any, /* c */ js.Any) => Return): Self[This, Args, Return] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("call")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withCall(
      value: (js.Function2[/* thisArg */ This, /* repeated */ js.Any, Return]) | (js.Function5[/* thisArg */ This, /* a */ js.Any, /* b */ js.Any, /* c */ js.Any, /* d */ js.Any, Return]) | (js.Function4[/* thisArg */ This, /* a */ js.Any, /* b */ js.Any, /* c */ js.Any, Return]) | (js.Function3[/* thisArg */ This, /* a */ js.Any, /* b */ js.Any, Return]) | (js.Function1[/* thisArg */ This, Return])
    ): Self[This, Args, Return] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("call")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCallFunction2(value: (/* thisArg */ This, /* repeated */ js.Any) => Return): Self[This, Args, Return] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("call")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withCallFunction1(value: /* thisArg */ This => Return): Self[This, Args, Return] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("call")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCallFunction5(
      value: (/* thisArg */ This, /* a */ js.Any, /* b */ js.Any, /* c */ js.Any, /* d */ js.Any) => Return
    ): Self[This, Args, Return] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("call")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withCallFunction3(value: (/* thisArg */ This, /* a */ js.Any, /* b */ js.Any) => Return): Self[This, Args, Return] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("call")(js.Any.fromFunction3(value))
        ret
    }
  }
  
}

