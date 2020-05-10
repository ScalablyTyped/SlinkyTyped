package typingsSlinky.phosphorWidgets.tabbarMod.TabBar

import typingsSlinky.phosphorWidgets.titleMod.Title
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An object which holds the data to render a tab.
  */
@js.native
trait IRenderData[T] extends js.Object {
  /**
    * Whether the tab is the current tab.
    */
  val current: Boolean = js.native
  /**
    * The title associated with the tab.
    */
  val title: Title[T] = js.native
  /**
    * The z-index for the tab.
    */
  val zIndex: Double = js.native
}

object IRenderData {
  @scala.inline
  def apply[T](current: Boolean, title: Title[T], zIndex: Double): IRenderData[T] = {
    val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], zIndex = zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRenderData[T]]
  }
  @scala.inline
  implicit class IRenderDataOps[Self[t] <: IRenderData[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withCurrent(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("current")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitle(value: Title[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withZIndex(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zIndex")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

