package typingsSlinky.phosphorWidgets.tabbarMod.TabBar

import typingsSlinky.phosphorWidgets.titleMod.Title
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The arguments object for the `currentChanged` signal.
  */
@js.native
trait ICurrentChangedArgs[T] extends js.Object {
  /**
    * The currently selected index.
    */
  val currentIndex: Double = js.native
  /**
    * The currently selected title.
    */
  val currentTitle: Title[T] | Null = js.native
  /**
    * The previously selected index.
    */
  val previousIndex: Double = js.native
  /**
    * The previously selected title.
    */
  val previousTitle: Title[T] | Null = js.native
}

object ICurrentChangedArgs {
  @scala.inline
  def apply[T](currentIndex: Double, previousIndex: Double): ICurrentChangedArgs[T] = {
    val __obj = js.Dynamic.literal(currentIndex = currentIndex.asInstanceOf[js.Any], previousIndex = previousIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICurrentChangedArgs[T]]
  }
  @scala.inline
  implicit class ICurrentChangedArgsOps[Self[t] <: ICurrentChangedArgs[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withCurrentIndex(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPreviousIndex(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previousIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurrentTitle(value: Title[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurrentTitleNull: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentTitle")(null)
        ret
    }
    @scala.inline
    def withPreviousTitle(value: Title[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previousTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPreviousTitleNull: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previousTitle")(null)
        ret
    }
  }
  
}

