package typingsSlinky.reactDnd.decorateHandlerMod

import slinky.core.facade.ReactRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Handler[Props] extends js.Object {
  var ref: ReactRef[_] = js.native
  def receiveProps(props: Props): Unit = js.native
}

object Handler {
  @scala.inline
  def apply[Props](receiveProps: Props => Unit, ref: ReactRef[_]): Handler[Props] = {
    val __obj = js.Dynamic.literal(receiveProps = js.Any.fromFunction1(receiveProps), ref = ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[Handler[Props]]
  }
  @scala.inline
  implicit class HandlerOps[Self[props] <: Handler[props], Props] (val x: Self[Props]) extends AnyVal {
    @scala.inline
    def duplicate: Self[Props] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[Props]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[Props] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[Props] with Other]
    @scala.inline
    def withReceiveProps(value: Props => Unit): Self[Props] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("receiveProps")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRef(value: ReactRef[_]): Self[Props] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ref")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

