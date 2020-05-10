package typingsSlinky.reactVirtualized.esInfiniteLoaderMod

import typingsSlinky.reactVirtualized.mod.IndexRange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InfiniteLoaderChildProps extends js.Object {
  def onRowsRendered(params: IndexRange): Unit = js.native
  def registerChild(registeredChild: js.Any): Unit = js.native
}

object InfiniteLoaderChildProps {
  @scala.inline
  def apply(onRowsRendered: IndexRange => Unit, registerChild: js.Any => Unit): InfiniteLoaderChildProps = {
    val __obj = js.Dynamic.literal(onRowsRendered = js.Any.fromFunction1(onRowsRendered), registerChild = js.Any.fromFunction1(registerChild))
    __obj.asInstanceOf[InfiniteLoaderChildProps]
  }
  @scala.inline
  implicit class InfiniteLoaderChildPropsOps[Self <: InfiniteLoaderChildProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnRowsRendered(value: IndexRange => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRowsRendered")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRegisterChild(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registerChild")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

