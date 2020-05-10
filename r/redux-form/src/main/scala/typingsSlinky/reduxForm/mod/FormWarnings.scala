package typingsSlinky.reduxForm.mod

import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {[ P in keyof FormData ]:? react.react.ReactElement | string | redux-form.redux-form.WarningOther<T>} */
@js.native
trait FormWarnings[FormData, T] extends js.Object {
  var append: js.UndefOr[ReactElement | String | WarningOther[T]] = js.native
  var delete: js.UndefOr[ReactElement | String | WarningOther[T]] = js.native
  var entries: js.UndefOr[ReactElement | String | WarningOther[T]] = js.native
  var forEach: js.UndefOr[ReactElement | String | WarningOther[T]] = js.native
  var get: js.UndefOr[ReactElement | String | WarningOther[T]] = js.native
  var getAll: js.UndefOr[ReactElement | String | WarningOther[T]] = js.native
  var has: js.UndefOr[ReactElement | String | WarningOther[T]] = js.native
  var keys: js.UndefOr[ReactElement | String | WarningOther[T]] = js.native
  var set: js.UndefOr[ReactElement | String | WarningOther[T]] = js.native
  var values: js.UndefOr[ReactElement | String | WarningOther[T]] = js.native
}

object FormWarnings {
  @scala.inline
  def apply[FormData, T](): FormWarnings[FormData, T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FormWarnings[FormData, T]]
  }
  @scala.inline
  implicit class FormWarningsOps[Self[formdata, t] <: FormWarnings[formdata, t], FormData, T] (val x: Self[FormData, T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[FormData, T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[FormData, T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[FormData, T]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[FormData, T]) with Other]
    @scala.inline
    def withAppendReactElement(value: ReactElement): Self[FormData, T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("append")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAppend(value: ReactElement | String | WarningOther[T]): Self[FormData, T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("append")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppend: Self[FormData, T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("append")(js.undefined)
        ret
    }
    @scala.inline
    def withDeleteReactElement(value: ReactElement): Self[FormData, T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDelete(value: ReactElement | String | WarningOther[T]): Self[FormData, T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDelete: Self[FormData, T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.undefined)
        ret
    }
    @scala.inline
    def withEntriesReactElement(value: ReactElement): Self[FormData, T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEntries(value: ReactElement | String | WarningOther[T]): Self[FormData, T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEntries: Self[FormData, T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entries")(js.undefined)
        ret
    }
    @scala.inline
    def withForEachReactElement(value: ReactElement): Self[FormData, T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forEach")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withForEach(value: ReactElement | String | WarningOther[T]): Self[FormData, T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forEach")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForEach: Self[FormData, T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forEach")(js.undefined)
        ret
    }
    @scala.inline
    def withGetReactElement(value: ReactElement): Self[FormData, T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGet(value: ReactElement | String | WarningOther[T]): Self[FormData, T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGet: Self[FormData, T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.undefined)
        ret
    }
    @scala.inline
    def withGetAllReactElement(value: ReactElement): Self[FormData, T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAll")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetAll(value: ReactElement | String | WarningOther[T]): Self[FormData, T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAll")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGetAll: Self[FormData, T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAll")(js.undefined)
        ret
    }
    @scala.inline
    def withHasReactElement(value: ReactElement): Self[FormData, T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("has")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHas(value: ReactElement | String | WarningOther[T]): Self[FormData, T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("has")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHas: Self[FormData, T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("has")(js.undefined)
        ret
    }
    @scala.inline
    def withKeysReactElement(value: ReactElement): Self[FormData, T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKeys(value: ReactElement | String | WarningOther[T]): Self[FormData, T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeys: Self[FormData, T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keys")(js.undefined)
        ret
    }
    @scala.inline
    def withSetReactElement(value: ReactElement): Self[FormData, T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("set")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSet(value: ReactElement | String | WarningOther[T]): Self[FormData, T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("set")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSet: Self[FormData, T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("set")(js.undefined)
        ret
    }
    @scala.inline
    def withValuesReactElement(value: ReactElement): Self[FormData, T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("values")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValues(value: ReactElement | String | WarningOther[T]): Self[FormData, T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("values")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValues: Self[FormData, T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("values")(js.undefined)
        ret
    }
  }
  
}

