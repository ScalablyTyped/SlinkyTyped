package typingsSlinky.oracleOraclejet

import typingsSlinky.oracleOraclejet.ojdatagridMod.ojDataGrid.CellContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonClassName[K, D] extends js.Object {
  var className: js.UndefOr[
    (js.Function1[/* context */ CellContext[K, D], String | Unit | Null]) | String | Null
  ] = js.native
  var renderer: js.UndefOr[(js.Function1[/* context */ CellContext[K, D], Anon1 | Unit | Null]) | Null] = js.native
  var style: js.UndefOr[
    (js.Function1[/* context */ CellContext[K, D], String | Unit | Null]) | String | Null
  ] = js.native
}

object AnonClassName {
  @scala.inline
  def apply[K, D](): AnonClassName[K, D] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonClassName[K, D]]
  }
  @scala.inline
  implicit class AnonClassNameOps[Self[k, d] <: AnonClassName[k, d], K, D] (val x: Self[K, D]) extends AnyVal {
    @scala.inline
    def duplicate: Self[K, D] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[K, D]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[K, D]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[K, D]) with Other]
    @scala.inline
    def withClassNameFunction1(value: /* context */ CellContext[K, D] => String | Unit | Null): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withClassName(value: (js.Function1[/* context */ CellContext[K, D], String | Unit | Null]) | String): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassName: Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(js.undefined)
        ret
    }
    @scala.inline
    def withClassNameNull: Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(null)
        ret
    }
    @scala.inline
    def withRenderer(value: /* context */ CellContext[K, D] => Anon1 | Unit | Null): Self[K, D] = {
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
    def withStyleFunction1(value: /* context */ CellContext[K, D] => String | Unit | Null): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withStyle(value: (js.Function1[/* context */ CellContext[K, D], String | Unit | Null]) | String): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyle: Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(js.undefined)
        ret
    }
    @scala.inline
    def withStyleNull: Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(null)
        ret
    }
  }
  
}

