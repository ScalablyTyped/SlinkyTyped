package typingsSlinky.reactSortablePane.anon

import typingsSlinky.reactMotion.mod.SpringHelperConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Children extends js.Object {
  var children: js.Array[scala.Nothing] = js.native
  var className: String = js.native
  var direction: String = js.native
  var disableEffect: Boolean = js.native
  var isSortable: Boolean = js.native
  var margin: Double = js.native
  var springConfig: SpringHelperConfig = js.native
  def onClick(): Null = js.native
  def onDragStart(): Null = js.native
  def onDragStop(): Null = js.native
  def onOrderChange(): Null = js.native
  def onResize(): Null = js.native
  def onResizeStart(): Null = js.native
  def onResizeStop(): Null = js.native
  def onTouchStart(): Null = js.native
}

object Children {
  @scala.inline
  def apply(
    children: js.Array[scala.Nothing],
    className: String,
    direction: String,
    disableEffect: Boolean,
    isSortable: Boolean,
    margin: Double,
    onClick: () => Null,
    onDragStart: () => Null,
    onDragStop: () => Null,
    onOrderChange: () => Null,
    onResize: () => Null,
    onResizeStart: () => Null,
    onResizeStop: () => Null,
    onTouchStart: () => Null,
    springConfig: SpringHelperConfig
  ): Children = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any], disableEffect = disableEffect.asInstanceOf[js.Any], isSortable = isSortable.asInstanceOf[js.Any], margin = margin.asInstanceOf[js.Any], onClick = js.Any.fromFunction0(onClick), onDragStart = js.Any.fromFunction0(onDragStart), onDragStop = js.Any.fromFunction0(onDragStop), onOrderChange = js.Any.fromFunction0(onOrderChange), onResize = js.Any.fromFunction0(onResize), onResizeStart = js.Any.fromFunction0(onResizeStart), onResizeStop = js.Any.fromFunction0(onResizeStop), onTouchStart = js.Any.fromFunction0(onTouchStart), springConfig = springConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[Children]
  }
  @scala.inline
  implicit class ChildrenOps[Self <: Children] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChildren(value: js.Array[scala.Nothing]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDirection(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisableEffect(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableEffect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsSortable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSortable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMargin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("margin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnClick(value: () => Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClick")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnDragStart(value: () => Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragStart")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnDragStop(value: () => Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragStop")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnOrderChange(value: () => Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onOrderChange")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnResize(value: () => Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onResize")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnResizeStart(value: () => Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onResizeStart")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnResizeStop(value: () => Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onResizeStop")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnTouchStart(value: () => Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTouchStart")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSpringConfig(value: SpringHelperConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("springConfig")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

