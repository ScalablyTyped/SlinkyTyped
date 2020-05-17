package typingsSlinky.oracleOraclejet.anon

import typingsSlinky.oracleOraclejet.ojdatagridMod.ojDataGrid.HeaderContext
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.disable
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.enable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Height[K, D] extends js.Object {
  var height: enable | disable = js.native
  var width: js.UndefOr[(js.Function1[/* context */ HeaderContext[K, D], String]) | String | Null] = js.native
}

object Height {
  @scala.inline
  def apply[K, D](height: enable | disable): Height[K, D] = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any])
    __obj.asInstanceOf[Height[K, D]]
  }
  @scala.inline
  implicit class HeightOps[Self[k, d] <: Height[k, d], K, D] (val x: Self[K, D]) extends AnyVal {
    @scala.inline
    def duplicate: Self[K, D] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[K, D]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[K, D]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[K, D]) with Other]
    @scala.inline
    def withHeight(value: enable | disable): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWidthFunction1(value: /* context */ HeaderContext[K, D] => String): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withWidth(value: (js.Function1[/* context */ HeaderContext[K, D], String]) | String): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
    @scala.inline
    def withWidthNull: Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(null)
        ret
    }
  }
  
}

