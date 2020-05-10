package typingsSlinky.materialUiLab.useAutocompleteUseAutocompleteMod

import typingsSlinky.materialUiLab.materialUiLabStrings.any
import typingsSlinky.materialUiLab.materialUiLabStrings.start
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateFilterOptionsConfig[T] extends js.Object {
  var ignoreAccents: js.UndefOr[Boolean] = js.native
  var ignoreCase: js.UndefOr[Boolean] = js.native
  var limit: js.UndefOr[Double] = js.native
  var matchFrom: js.UndefOr[any | start] = js.native
  var stringify: js.UndefOr[js.Function1[/* option */ T, String]] = js.native
  var trim: js.UndefOr[Boolean] = js.native
}

object CreateFilterOptionsConfig {
  @scala.inline
  def apply[T](): CreateFilterOptionsConfig[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateFilterOptionsConfig[T]]
  }
  @scala.inline
  implicit class CreateFilterOptionsConfigOps[Self[t] <: CreateFilterOptionsConfig[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withIgnoreAccents(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreAccents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreAccents: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreAccents")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnoreCase(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreCase")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreCase: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreCase")(js.undefined)
        ret
    }
    @scala.inline
    def withLimit(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLimit: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limit")(js.undefined)
        ret
    }
    @scala.inline
    def withMatchFrom(value: any | start): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matchFrom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMatchFrom: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matchFrom")(js.undefined)
        ret
    }
    @scala.inline
    def withStringify(value: /* option */ T => String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stringify")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutStringify: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stringify")(js.undefined)
        ret
    }
    @scala.inline
    def withTrim(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trim")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrim: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trim")(js.undefined)
        ret
    }
  }
  
}

