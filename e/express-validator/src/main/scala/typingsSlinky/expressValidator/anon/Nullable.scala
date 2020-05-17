package typingsSlinky.expressValidator.anon

import typingsSlinky.expressValidator.contextMod.Optional
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Nullable extends Optional {
  var checkFalsy: Boolean = js.native
  var nullable: Boolean = js.native
}

object Nullable {
  @scala.inline
  def apply(checkFalsy: Boolean, nullable: Boolean): Nullable = {
    val __obj = js.Dynamic.literal(checkFalsy = checkFalsy.asInstanceOf[js.Any], nullable = nullable.asInstanceOf[js.Any])
    __obj.asInstanceOf[Nullable]
  }
  @scala.inline
  implicit class NullableOps[Self <: Nullable] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCheckFalsy(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkFalsy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNullable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nullable")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

