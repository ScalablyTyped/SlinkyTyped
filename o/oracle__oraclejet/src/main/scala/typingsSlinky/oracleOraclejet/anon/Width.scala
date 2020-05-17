package typingsSlinky.oracleOraclejet.anon

import typingsSlinky.oracleOraclejet.ojdatagridMod.ojDataGrid.HeaderContext
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.disable
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.enable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Width[K, D] extends js.Object {
  var height: js.UndefOr[(js.Function1[/* context */ HeaderContext[K, D], String]) | String | Null] = js.native
  var width: enable | disable = js.native
}

object Width {
  @scala.inline
  def apply[K, D](width: enable | disable): Width[K, D] = {
    val __obj = js.Dynamic.literal(width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Width[K, D]]
  }
  @scala.inline
  implicit class WidthOps[Self[k, d] <: Width[k, d], K, D] (val x: Self[K, D]) extends AnyVal {
    @scala.inline
    def duplicate: Self[K, D] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[K, D]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[K, D]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[K, D]) with Other]
    @scala.inline
    def withWidth(value: enable | disable): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeightFunction1(value: /* context */ HeaderContext[K, D] => String): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withHeight(value: (js.Function1[/* context */ HeaderContext[K, D], String]) | String): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeight: Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(js.undefined)
        ret
    }
    @scala.inline
    def withHeightNull: Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(null)
        ret
    }
  }
  
}

