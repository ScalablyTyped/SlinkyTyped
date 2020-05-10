package typingsSlinky.phosphorWidgets.tabbarMod.TabBar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An options object for creating a tab bar.
  */
@js.native
trait IOptions[T] extends js.Object {
  /**
    * Whether a tab can be deselected by the user.
    *
    * The default is `false`.
    */
  var allowDeselect: js.UndefOr[Boolean] = js.native
  /**
    * The selection behavior when inserting a tab.
    *
    * The default is `'select-tab-if-needed'`.
    */
  var insertBehavior: js.UndefOr[InsertBehavior] = js.native
  /**
    * The layout orientation of the tab bar.
    *
    * The default is `horizontal`.
    */
  var orientation: js.UndefOr[Orientation] = js.native
  /**
    * The selection behavior when removing a tab.
    *
    * The default is `'select-tab-after'`.
    */
  var removeBehavior: js.UndefOr[RemoveBehavior] = js.native
  /**
    * A renderer to use with the tab bar.
    *
    * The default is a shared renderer instance.
    */
  var renderer: js.UndefOr[IRenderer[T]] = js.native
  /**
    * Whether the tabs are movable by the user.
    *
    * The default is `false`.
    */
  var tabsMovable: js.UndefOr[Boolean] = js.native
}

object IOptions {
  @scala.inline
  def apply[T](): IOptions[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IOptions[T]]
  }
  @scala.inline
  implicit class IOptionsOps[Self[t] <: IOptions[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withAllowDeselect(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowDeselect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowDeselect: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowDeselect")(js.undefined)
        ret
    }
    @scala.inline
    def withInsertBehavior(value: InsertBehavior): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertBehavior")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInsertBehavior: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertBehavior")(js.undefined)
        ret
    }
    @scala.inline
    def withOrientation(value: Orientation): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orientation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrientation: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orientation")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoveBehavior(value: RemoveBehavior): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeBehavior")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemoveBehavior: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeBehavior")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderer(value: IRenderer[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRenderer: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderer")(js.undefined)
        ret
    }
    @scala.inline
    def withTabsMovable(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabsMovable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTabsMovable: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabsMovable")(js.undefined)
        ret
    }
  }
  
}

