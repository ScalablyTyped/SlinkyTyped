package typingsSlinky.phosphorWidgets.tabbarMod.TabBar

import typingsSlinky.phosphorWidgets.titleMod.Title
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The arguments object for the `tabCloseRequested` signal.
  */
@js.native
trait ITabCloseRequestedArgs[T] extends js.Object {
  /**
    * The index of the tab to close.
    */
  val index: Double = js.native
  /**
    * The title for the tab.
    */
  val title: Title[T] = js.native
}

object ITabCloseRequestedArgs {
  @scala.inline
  def apply[T](index: Double, title: Title[T]): ITabCloseRequestedArgs[T] = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITabCloseRequestedArgs[T]]
  }
  @scala.inline
  implicit class ITabCloseRequestedArgsOps[Self[t] <: ITabCloseRequestedArgs[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withIndex(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitle(value: Title[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

