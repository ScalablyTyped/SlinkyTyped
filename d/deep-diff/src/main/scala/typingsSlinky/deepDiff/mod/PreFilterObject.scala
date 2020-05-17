package typingsSlinky.deepDiff.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PreFilterObject[LHS, RHS] extends PreFilter[LHS, RHS] {
  var normalize: js.UndefOr[
    js.Function4[
      /* currentPath */ js.Any, 
      /* key */ js.Any, 
      /* lhs */ LHS, 
      /* rhs */ RHS, 
      js.UndefOr[js.Tuple2[LHS, RHS]]
    ]
  ] = js.native
  var prefilter: js.UndefOr[js.Function2[/* path */ js.Array[_], /* key */ js.Any, Boolean]] = js.native
}

object PreFilterObject {
  @scala.inline
  def apply[LHS, RHS](): PreFilterObject[LHS, RHS] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PreFilterObject[LHS, RHS]]
  }
  @scala.inline
  implicit class PreFilterObjectOps[Self[lhs, rhs] <: PreFilterObject[lhs, rhs], LHS, RHS] (val x: Self[LHS, RHS]) extends AnyVal {
    @scala.inline
    def duplicate: Self[LHS, RHS] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[LHS, RHS]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[LHS, RHS]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[LHS, RHS]) with Other]
    @scala.inline
    def withNormalize(
      value: (/* currentPath */ js.Any, /* key */ js.Any, /* lhs */ LHS, /* rhs */ RHS) => js.UndefOr[js.Tuple2[LHS, RHS]]
    ): Self[LHS, RHS] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("normalize")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutNormalize: Self[LHS, RHS] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("normalize")(js.undefined)
        ret
    }
    @scala.inline
    def withPrefilter(value: (/* path */ js.Array[_], /* key */ js.Any) => Boolean): Self[LHS, RHS] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefilter")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutPrefilter: Self[LHS, RHS] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefilter")(js.undefined)
        ret
    }
  }
  
}

