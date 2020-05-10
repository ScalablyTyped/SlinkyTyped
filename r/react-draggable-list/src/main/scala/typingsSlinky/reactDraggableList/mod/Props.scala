package typingsSlinky.reactDraggableList.mod

import org.scalablytyped.runtime.Instantiable2
import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Props[I, C, T] extends js.Object {
  var autoScrollMaxSpeed: js.UndefOr[Double] = js.native
  var autoScrollRegionSize: js.UndefOr[Double] = js.native
  var commonProps: js.UndefOr[C] = js.native
  var constrainDrag: js.UndefOr[Boolean] = js.native
  var container: js.UndefOr[js.Function0[js.UndefOr[HTMLElement | Null]]] = js.native
  var itemKey: String | (js.Function1[/* item */ I, String]) = js.native
  var list: js.Array[I] = js.native
  var onMoveEnd: js.UndefOr[
    js.Function4[
      /* newList */ js.Array[I], 
      /* movedItem */ I, 
      /* oldIndex */ Double, 
      /* newIndex */ Double, 
      Unit
    ]
  ] = js.native
  var padding: js.UndefOr[Double] = js.native
  var springConfig: js.UndefOr[js.Object] = js.native
  var template: Instantiable2[/* props */ js.Any, js.UndefOr[/* context */ js.Any], T] = js.native
  var unsetZIndex: js.UndefOr[Boolean] = js.native
}

object Props {
  @scala.inline
  def apply[I, C, T](
    itemKey: String | (js.Function1[/* item */ I, String]),
    list: js.Array[I],
    template: Instantiable2[/* props */ js.Any, js.UndefOr[/* context */ js.Any], T]
  ): Props[I, C, T] = {
    val __obj = js.Dynamic.literal(itemKey = itemKey.asInstanceOf[js.Any], list = list.asInstanceOf[js.Any], template = template.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props[I, C, T]]
  }
  @scala.inline
  implicit class PropsOps[Self[i, c, t] <: Props[i, c, t], I, C, T] (val x: Self[I, C, T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[I, C, T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[I, C, T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[I, C, T]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[I, C, T]) with Other]
    @scala.inline
    def withItemKeyFunction1(value: /* item */ I => String): Self[I, C, T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemKey")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withItemKey(value: String | (js.Function1[/* item */ I, String])): Self[I, C, T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withList(value: js.Array[I]): Self[I, C, T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTemplate(value: Instantiable2[/* props */ js.Any, js.UndefOr[/* context */ js.Any], T]): Self[I, C, T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("template")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAutoScrollMaxSpeed(value: Double): Self[I, C, T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoScrollMaxSpeed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoScrollMaxSpeed: Self[I, C, T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoScrollMaxSpeed")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoScrollRegionSize(value: Double): Self[I, C, T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoScrollRegionSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoScrollRegionSize: Self[I, C, T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoScrollRegionSize")(js.undefined)
        ret
    }
    @scala.inline
    def withCommonProps(value: C): Self[I, C, T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commonProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCommonProps: Self[I, C, T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commonProps")(js.undefined)
        ret
    }
    @scala.inline
    def withConstrainDrag(value: Boolean): Self[I, C, T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("constrainDrag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConstrainDrag: Self[I, C, T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("constrainDrag")(js.undefined)
        ret
    }
    @scala.inline
    def withContainer(value: () => js.UndefOr[HTMLElement | Null]): Self[I, C, T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("container")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutContainer: Self[I, C, T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("container")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMoveEnd(
      value: (/* newList */ js.Array[I], /* movedItem */ I, /* oldIndex */ Double, /* newIndex */ Double) => Unit
    ): Self[I, C, T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMoveEnd")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutOnMoveEnd: Self[I, C, T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMoveEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withPadding(value: Double): Self[I, C, T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPadding: Self[I, C, T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padding")(js.undefined)
        ret
    }
    @scala.inline
    def withSpringConfig(value: js.Object): Self[I, C, T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("springConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpringConfig: Self[I, C, T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("springConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withUnsetZIndex(value: Boolean): Self[I, C, T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unsetZIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnsetZIndex: Self[I, C, T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unsetZIndex")(js.undefined)
        ret
    }
  }
  
}

