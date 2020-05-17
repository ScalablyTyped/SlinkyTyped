package typingsSlinky.antDesignReactNative.listViewMod

import slinky.core.TagMod
import slinky.core.facade.ReactElement
import typingsSlinky.antDesignReactNative.anon.Highlight
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListViewProps[T] extends UltimateListViewProps {
  var children: js.UndefOr[TagMod[Any]] = js.native
  var keyExtractor: js.UndefOr[js.Function2[/* item */ T, /* index */ Double, String]] = js.native
  @JSName("numColumns")
  var numColumns_ListViewProps: js.UndefOr[Double] = js.native
  def onFetch(currentPage: Double, startFetch: js.Function0[_], abortFetch: js.Function0[Unit]): Unit = js.native
  def renderItem(item: T, index: Double, separators: Highlight): ReactElement | Null = js.native
}

object ListViewProps {
  @scala.inline
  def apply[T](
    onFetch: (Double, js.Function0[_], js.Function0[Unit]) => Unit,
    renderItem: (T, Double, Highlight) => ReactElement | Null
  ): ListViewProps[T] = {
    val __obj = js.Dynamic.literal(onFetch = js.Any.fromFunction3(onFetch), renderItem = js.Any.fromFunction3(renderItem))
    __obj.asInstanceOf[ListViewProps[T]]
  }
  @scala.inline
  implicit class ListViewPropsOps[Self[t] <: ListViewProps[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withOnFetch(value: (Double, js.Function0[_], js.Function0[Unit]) => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFetch")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withRenderItem(value: (T, Double, Highlight) => ReactElement | Null): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderItem")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withChildrenReactElement(value: ReactElement): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChildren(value: TagMod[Any]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChildren: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyExtractor(value: (/* item */ T, /* index */ Double) => String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyExtractor")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutKeyExtractor: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyExtractor")(js.undefined)
        ret
    }
    @scala.inline
    def withNumColumns(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numColumns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumColumns: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numColumns")(js.undefined)
        ret
    }
  }
  
}

