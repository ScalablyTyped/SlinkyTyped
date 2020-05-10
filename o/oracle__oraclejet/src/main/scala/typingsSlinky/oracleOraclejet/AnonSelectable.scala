package typingsSlinky.oracleOraclejet

import typingsSlinky.oracleOraclejet.ojnavigationlistMod.ojNavigationList.ItemContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonSelectable[K, D] extends js.Object {
  var renderer: js.UndefOr[(js.Function1[/* context */ ItemContext[K, D], Unit]) | Null] = js.native
  var selectable: js.UndefOr[(js.Function1[/* context */ ItemContext[K, D], Boolean]) | Boolean] = js.native
}

object AnonSelectable {
  @scala.inline
  def apply[K, D](): AnonSelectable[K, D] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonSelectable[K, D]]
  }
  @scala.inline
  implicit class AnonSelectableOps[Self[k, d] <: AnonSelectable[k, d], K, D] (val x: Self[K, D]) extends AnyVal {
    @scala.inline
    def duplicate: Self[K, D] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[K, D]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[K, D]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[K, D]) with Other]
    @scala.inline
    def withRenderer(value: /* context */ ItemContext[K, D] => Unit): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderer")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRenderer: Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderer")(js.undefined)
        ret
    }
    @scala.inline
    def withRendererNull: Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderer")(null)
        ret
    }
    @scala.inline
    def withSelectableFunction1(value: /* context */ ItemContext[K, D] => Boolean): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectable")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSelectable(value: (js.Function1[/* context */ ItemContext[K, D], Boolean]) | Boolean): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectable: Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectable")(js.undefined)
        ret
    }
  }
  
}

