package typingsSlinky.reactJsonschemaForm.anon

import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Children extends js.Object {
  var children: ReactElement = js.native
  var className: String = js.native
  var disabled: Boolean = js.native
  var hasMoveDown: Boolean = js.native
  var hasMoveUp: Boolean = js.native
  var hasRemove: Boolean = js.native
  var hasToolbar: Boolean = js.native
  var index: Double = js.native
  var key: String = js.native
  var readonly: Boolean = js.native
  def onDropIndexClick(index: Double): js.Function1[/* event */ js.Any, Unit] = js.native
  def onReorderClick(index: Double, newIndex: Double): js.Function1[/* event */ js.Any, Unit] = js.native
}

object Children {
  @scala.inline
  def apply(
    children: ReactElement,
    className: String,
    disabled: Boolean,
    hasMoveDown: Boolean,
    hasMoveUp: Boolean,
    hasRemove: Boolean,
    hasToolbar: Boolean,
    index: Double,
    key: String,
    onDropIndexClick: Double => js.Function1[/* event */ js.Any, Unit],
    onReorderClick: (Double, Double) => js.Function1[/* event */ js.Any, Unit],
    readonly: Boolean
  ): Children = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], hasMoveDown = hasMoveDown.asInstanceOf[js.Any], hasMoveUp = hasMoveUp.asInstanceOf[js.Any], hasRemove = hasRemove.asInstanceOf[js.Any], hasToolbar = hasToolbar.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], onDropIndexClick = js.Any.fromFunction1(onDropIndexClick), onReorderClick = js.Any.fromFunction2(onReorderClick), readonly = readonly.asInstanceOf[js.Any])
    __obj.asInstanceOf[Children]
  }
  @scala.inline
  implicit class ChildrenOps[Self <: Children] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChildren(value: ReactElement): Self = {
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
    def withDisabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHasMoveDown(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasMoveDown")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHasMoveUp(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasMoveUp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHasRemove(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasRemove")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHasToolbar(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasToolbar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnDropIndexClick(value: Double => js.Function1[/* event */ js.Any, Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDropIndexClick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnReorderClick(value: (Double, Double) => js.Function1[/* event */ js.Any, Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onReorderClick")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withReadonly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readonly")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

