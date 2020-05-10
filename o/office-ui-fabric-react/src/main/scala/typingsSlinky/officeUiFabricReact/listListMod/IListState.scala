package typingsSlinky.officeUiFabricReact.listListMod

import typingsSlinky.officeUiFabricReact.listTypesMod.IPage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IListState[T] extends js.Object {
  var isScrolling: js.UndefOr[Boolean] = js.native
  /** The last versionstamp for  */
  var measureVersion: js.UndefOr[Double] = js.native
  var pages: js.UndefOr[js.Array[IPage[T]]] = js.native
}

object IListState {
  @scala.inline
  def apply[T](): IListState[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IListState[T]]
  }
  @scala.inline
  implicit class IListStateOps[Self[t] <: IListState[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withIsScrolling(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isScrolling")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsScrolling: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isScrolling")(js.undefined)
        ret
    }
    @scala.inline
    def withMeasureVersion(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("measureVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMeasureVersion: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("measureVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withPages(value: js.Array[IPage[T]]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPages: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pages")(js.undefined)
        ret
    }
  }
  
}

