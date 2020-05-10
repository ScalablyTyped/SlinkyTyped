package typingsSlinky.officeUiFabricReact.suggestionsStoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SuggestionsStoreOptions[T] extends js.Object {
  var getAriaLabel: js.UndefOr[js.Function1[/* item */ T, String]] = js.native
}

object SuggestionsStoreOptions {
  @scala.inline
  def apply[T](): SuggestionsStoreOptions[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SuggestionsStoreOptions[T]]
  }
  @scala.inline
  implicit class SuggestionsStoreOptionsOps[Self[t] <: SuggestionsStoreOptions[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withGetAriaLabel(value: /* item */ T => String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAriaLabel")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetAriaLabel: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAriaLabel")(js.undefined)
        ret
    }
  }
  
}

