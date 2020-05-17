package typingsSlinky.reReselect.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParametricOptions[S, P, C, D] extends js.Object {
  var cacheObject: js.UndefOr[ICacheObject] = js.native
  var keySelector: js.UndefOr[ParametricKeySelector[S, P]] = js.native
  var keySelectorCreator: js.UndefOr[ParametricKeySelectorCreator[S, P, C, D]] = js.native
  var selectorCreator: js.UndefOr[CreateSelectorInstance] = js.native
}

object ParametricOptions {
  @scala.inline
  def apply[S, P, C, D](): ParametricOptions[S, P, C, D] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParametricOptions[S, P, C, D]]
  }
  @scala.inline
  implicit class ParametricOptionsOps[Self[s, p, c, d] <: ParametricOptions[s, p, c, d], S, P, C, D] (val x: Self[S, P, C, D]) extends AnyVal {
    @scala.inline
    def duplicate: Self[S, P, C, D] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[S, P, C, D]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[S, P, C, D]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[S, P, C, D]) with Other]
    @scala.inline
    def withCacheObject(value: ICacheObject): Self[S, P, C, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cacheObject")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCacheObject: Self[S, P, C, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cacheObject")(js.undefined)
        ret
    }
    @scala.inline
    def withKeySelector(value: (S, P, /* repeated */ js.Any) => js.Any): Self[S, P, C, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keySelector")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutKeySelector: Self[S, P, C, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keySelector")(js.undefined)
        ret
    }
    @scala.inline
    def withKeySelectorCreator(
      value: /* selectorInputs */ typingsSlinky.reReselect.anon.KeySelector[D, C, S, P] => ParametricKeySelector[S, P]
    ): Self[S, P, C, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keySelectorCreator")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutKeySelectorCreator: Self[S, P, C, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keySelectorCreator")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectorCreator(value: CreateSelectorInstance): Self[S, P, C, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectorCreator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectorCreator: Self[S, P, C, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectorCreator")(js.undefined)
        ret
    }
  }
  
}

