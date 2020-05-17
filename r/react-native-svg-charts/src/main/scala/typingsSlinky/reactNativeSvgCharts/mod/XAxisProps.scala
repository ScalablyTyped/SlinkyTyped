package typingsSlinky.reactNativeSvgCharts.mod

import typingsSlinky.reactNativeSvgCharts.anon.Left
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XAxisProps[T] extends AxisProps[T] {
  var contentInset: js.UndefOr[Left] = js.native
  var xAccessor: js.UndefOr[AccessorFunction[T, _]] = js.native
}

object XAxisProps {
  @scala.inline
  def apply[T](data: js.Array[T]): XAxisProps[T] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[XAxisProps[T]]
  }
  @scala.inline
  implicit class XAxisPropsOps[Self[t] <: XAxisProps[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withContentInset(value: Left): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentInset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentInset: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentInset")(js.undefined)
        ret
    }
    @scala.inline
    def withXAccessor(value: /* props */ AccessorFunctionProps[T] => _): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xAccessor")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutXAccessor: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xAccessor")(js.undefined)
        ret
    }
  }
  
}

