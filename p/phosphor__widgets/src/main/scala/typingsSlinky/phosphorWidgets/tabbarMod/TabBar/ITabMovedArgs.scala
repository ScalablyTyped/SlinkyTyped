package typingsSlinky.phosphorWidgets.tabbarMod.TabBar

import typingsSlinky.phosphorWidgets.titleMod.Title
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The arguments object for the `tabMoved` signal.
  */
@js.native
trait ITabMovedArgs[T] extends js.Object {
  /**
    * The previous index of the tab.
    */
  val fromIndex: Double = js.native
  /**
    * The title for the tab.
    */
  val title: Title[T] = js.native
  /**
    * The current index of the tab.
    */
  val toIndex: Double = js.native
}

object ITabMovedArgs {
  @scala.inline
  def apply[T](fromIndex: Double, title: Title[T], toIndex: Double): ITabMovedArgs[T] = {
    val __obj = js.Dynamic.literal(fromIndex = fromIndex.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], toIndex = toIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITabMovedArgs[T]]
  }
  @scala.inline
  implicit class ITabMovedArgsOps[Self[t] <: ITabMovedArgs[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withFromIndex(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitle(value: Title[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToIndex(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toIndex")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

