package typingsSlinky.devextreme.mod.DevExpress.ui

import typingsSlinky.devextreme.mod.DevExpress.data.DataSource
import typingsSlinky.devextreme.mod.DevExpress.data.DataSourceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxMultiViewOptions[T] extends CollectionWidgetOptions[T] {
  /** Specifies whether or not to animate the displayed item change. */
  var animationEnabled: js.UndefOr[Boolean] = js.native
  /** Binds the widget to data. */
  @JSName("dataSource")
  var dataSource_dxMultiViewOptions: js.UndefOr[
    String | (js.Array[String | dxMultiViewItem | _]) | DataSource | DataSourceOptions
  ] = js.native
  /** Specifies whether to render the view's content when it is displayed. If false, the content is rendered immediately. */
  var deferRendering: js.UndefOr[Boolean] = js.native
  /** An array of items displayed by the widget. */
  @JSName("items")
  var items_dxMultiViewOptions: js.UndefOr[js.Array[String | dxMultiViewItem | _]] = js.native
  /** A Boolean value specifying whether or not to scroll back to the first item after the last item is swiped. */
  var loop: js.UndefOr[Boolean] = js.native
  /** A Boolean value specifying whether or not to allow users to change the selected index by swiping. */
  var swipeEnabled: js.UndefOr[Boolean] = js.native
}

object dxMultiViewOptions {
  @scala.inline
  def apply[T](): dxMultiViewOptions[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxMultiViewOptions[T]]
  }
  @scala.inline
  implicit class dxMultiViewOptionsOps[Self[t] <: dxMultiViewOptions[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withAnimationEnabled(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimationEnabled: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withDataSource(value: String | (js.Array[String | dxMultiViewItem | _]) | DataSource | DataSourceOptions): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataSource: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSource")(js.undefined)
        ret
    }
    @scala.inline
    def withDeferRendering(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deferRendering")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeferRendering: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deferRendering")(js.undefined)
        ret
    }
    @scala.inline
    def withItems(value: js.Array[String | dxMultiViewItem | _]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItems: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(js.undefined)
        ret
    }
    @scala.inline
    def withLoop(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoop: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loop")(js.undefined)
        ret
    }
    @scala.inline
    def withSwipeEnabled(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swipeEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSwipeEnabled: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swipeEnabled")(js.undefined)
        ret
    }
  }
  
}

