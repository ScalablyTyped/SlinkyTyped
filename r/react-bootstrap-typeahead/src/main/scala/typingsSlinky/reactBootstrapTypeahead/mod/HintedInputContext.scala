package typingsSlinky.reactBootstrapTypeahead.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Pick<react-bootstrap-typeahead.react-bootstrap-typeahead.TypeaheadContext<T>, react-bootstrap-typeahead.react-bootstrap-typeahead.HintedInputContextKeys> */
@js.native
trait HintedInputContext[T /* <: TypeaheadModel */] extends js.Object {
  var hintText: js.UndefOr[String] = js.native
  var initialItem: js.UndefOr[T] = js.native
  var onAdd: js.UndefOr[js.Function1[/* option */ T, Unit]] = js.native
  var selectHintOnEnter: js.UndefOr[Boolean] = js.native
}

object HintedInputContext {
  @scala.inline
  def apply[T](): HintedInputContext[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HintedInputContext[T]]
  }
  @scala.inline
  implicit class HintedInputContextOps[Self[t] <: HintedInputContext[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withHintText(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hintText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHintText: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hintText")(js.undefined)
        ret
    }
    @scala.inline
    def withInitialItem(value: T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialItem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitialItem: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialItem")(js.undefined)
        ret
    }
    @scala.inline
    def withOnAdd(value: /* option */ T => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAdd")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnAdd: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAdd")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectHintOnEnter(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectHintOnEnter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectHintOnEnter: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectHintOnEnter")(js.undefined)
        ret
    }
  }
  
}

