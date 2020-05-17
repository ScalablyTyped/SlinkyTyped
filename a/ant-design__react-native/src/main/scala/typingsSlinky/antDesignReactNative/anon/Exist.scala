package typingsSlinky.antDesignReactNative.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Exist extends js.Object {
  var exist: Boolean = js.native
}

object Exist {
  @scala.inline
  def apply(exist: Boolean): Exist = {
    val __obj = js.Dynamic.literal(exist = exist.asInstanceOf[js.Any])
    __obj.asInstanceOf[Exist]
  }
  @scala.inline
  implicit class ExistOps[Self <: Exist] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExist(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exist")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

