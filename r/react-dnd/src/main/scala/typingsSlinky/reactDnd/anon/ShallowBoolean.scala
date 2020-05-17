package typingsSlinky.reactDnd.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ShallowBoolean extends js.Object {
  var shallow: js.UndefOr[Boolean] = js.native
}

object ShallowBoolean {
  @scala.inline
  def apply(): ShallowBoolean = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShallowBoolean]
  }
  @scala.inline
  implicit class ShallowBooleanOps[Self <: ShallowBoolean] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withShallow(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shallow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShallow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shallow")(js.undefined)
        ret
    }
  }
  
}

