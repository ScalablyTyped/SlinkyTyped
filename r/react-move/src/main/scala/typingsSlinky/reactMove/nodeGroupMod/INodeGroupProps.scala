package typingsSlinky.reactMove.nodeGroupMod

import slinky.core.facade.ReactElement
import typingsSlinky.reactMove.mod.GetInterpolator
import typingsSlinky.reactMove.mod.HashMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait INodeGroupProps extends js.Object {
  var data: js.Array[_] = js.native
  var enter: js.UndefOr[js.Function2[/* data */ js.Any, /* index */ Double, HashMap | js.Array[HashMap]]] = js.native
  var interpolation: js.UndefOr[GetInterpolator] = js.native
  var leave: js.UndefOr[js.Function2[/* data */ js.Any, /* index */ Double, HashMap | js.Array[HashMap]]] = js.native
  var update: js.UndefOr[js.Function2[/* data */ js.Any, /* index */ Double, HashMap | js.Array[HashMap]]] = js.native
  def children(nodes: js.Array[_]): ReactElement = js.native
  def keyAccessor(data: js.Any, index: Double): String | Double = js.native
  def start(data: js.Any, index: Double): HashMap = js.native
}

object INodeGroupProps {
  @scala.inline
  def apply(
    children: js.Array[_] => ReactElement,
    data: js.Array[_],
    keyAccessor: (js.Any, Double) => String | Double,
    start: (js.Any, Double) => HashMap
  ): INodeGroupProps = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children), data = data.asInstanceOf[js.Any], keyAccessor = js.Any.fromFunction2(keyAccessor), start = js.Any.fromFunction2(start))
    __obj.asInstanceOf[INodeGroupProps]
  }
  @scala.inline
  implicit class INodeGroupPropsOps[Self <: INodeGroupProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChildren(value: js.Array[_] => ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withData(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKeyAccessor(value: (js.Any, Double) => String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyAccessor")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withStart(value: (js.Any, Double) => HashMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withEnter(value: (/* data */ js.Any, /* index */ Double) => HashMap | js.Array[HashMap]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enter")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutEnter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enter")(js.undefined)
        ret
    }
    @scala.inline
    def withInterpolation(
      value: (/* begValue */ js.UndefOr[js.Any], /* endValue */ js.UndefOr[js.Any], /* attr */ js.UndefOr[String], /* namespace */ js.UndefOr[String]) => js.Function1[/* t */ Double, js.Any]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interpolation")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutInterpolation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interpolation")(js.undefined)
        ret
    }
    @scala.inline
    def withLeave(value: (/* data */ js.Any, /* index */ Double) => HashMap | js.Array[HashMap]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leave")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutLeave: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leave")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdate(value: (/* data */ js.Any, /* index */ Double) => HashMap | js.Array[HashMap]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.undefined)
        ret
    }
  }
  
}

