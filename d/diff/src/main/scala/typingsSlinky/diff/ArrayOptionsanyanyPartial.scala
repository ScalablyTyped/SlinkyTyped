package typingsSlinky.diff

import typingsSlinky.diff.mod.Callback
import typingsSlinky.diff.mod.Change
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined diff.diff.ArrayOptions<any, any> & std.Partial<diff.diff.CallbackOptions> */
@js.native
trait ArrayOptionsanyanyPartial extends js.Object {
  var callback: js.UndefOr[Callback] = js.native
  /**
    * Comparator for custom equality checks.
    */
  var comparator: js.UndefOr[js.Function2[/* left */ js.Any, /* right */ js.Any, Boolean]] = js.native
  /**
    * `true` to ignore casing difference.
    * @default false
    */
  var ignoreCase: js.UndefOr[Boolean] = js.native
}

object ArrayOptionsanyanyPartial {
  @scala.inline
  def apply(): ArrayOptionsanyanyPartial = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ArrayOptionsanyanyPartial]
  }
  @scala.inline
  implicit class ArrayOptionsanyanyPartialOps[Self <: ArrayOptionsanyanyPartial] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCallback(value: (/* err */ js.UndefOr[scala.Nothing], /* value */ js.UndefOr[js.Array[Change]]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callback")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutCallback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callback")(js.undefined)
        ret
    }
    @scala.inline
    def withComparator(value: (/* left */ js.Any, /* right */ js.Any) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comparator")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutComparator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comparator")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnoreCase(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreCase")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreCase: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreCase")(js.undefined)
        ret
    }
  }
  
}

