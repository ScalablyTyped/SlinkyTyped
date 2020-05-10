package typingsSlinky.kolite

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KnockoutUtils extends js.Object {
  def wrapAccessor(accessor: js.Any): js.Function = js.native
}

object KnockoutUtils {
  @scala.inline
  def apply(wrapAccessor: js.Any => js.Function): KnockoutUtils = {
    val __obj = js.Dynamic.literal(wrapAccessor = js.Any.fromFunction1(wrapAccessor))
    __obj.asInstanceOf[KnockoutUtils]
  }
  @scala.inline
  implicit class KnockoutUtilsOps[Self <: KnockoutUtils] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withWrapAccessor(value: js.Any => js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrapAccessor")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

