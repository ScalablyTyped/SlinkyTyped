package typingsSlinky.reReselect.mod

import typingsSlinky.reReselect.anon.InputSelectors
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options[S, C, D] extends js.Object {
  var cacheObject: js.UndefOr[ICacheObject] = js.native
  var keySelector: js.UndefOr[KeySelector[S]] = js.native
  var keySelectorCreator: js.UndefOr[KeySelectorCreator[S, C, D]] = js.native
  var selectorCreator: js.UndefOr[CreateSelectorInstance] = js.native
}

object Options {
  @scala.inline
  def apply[S, C, D](): Options[S, C, D] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options[S, C, D]]
  }
  @scala.inline
  implicit class OptionsOps[Self[s, c, d] <: Options[s, c, d], S, C, D] (val x: Self[S, C, D]) extends AnyVal {
    @scala.inline
    def duplicate: Self[S, C, D] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[S, C, D]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[S, C, D]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[S, C, D]) with Other]
    @scala.inline
    def withCacheObject(value: ICacheObject): Self[S, C, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cacheObject")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCacheObject: Self[S, C, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cacheObject")(js.undefined)
        ret
    }
    @scala.inline
    def withKeySelector(value: (S, /* repeated */ js.Any) => js.Any): Self[S, C, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keySelector")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutKeySelector: Self[S, C, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keySelector")(js.undefined)
        ret
    }
    @scala.inline
    def withKeySelectorCreator(value: /* selectorInputs */ InputSelectors[D, C, S] => KeySelector[S]): Self[S, C, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keySelectorCreator")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutKeySelectorCreator: Self[S, C, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keySelectorCreator")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectorCreator(value: CreateSelectorInstance): Self[S, C, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectorCreator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectorCreator: Self[S, C, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectorCreator")(js.undefined)
        ret
    }
  }
  
}

