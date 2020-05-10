package typingsSlinky.reactNativeNavigation.layoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Layout[P] extends js.Object {
  /**
    * Set the bottom tabs
    */
  var bottomTabs: js.UndefOr[LayoutBottomTabs] = js.native
  /**
    * Set the component
    */
  var component: js.UndefOr[LayoutComponent[P]] = js.native
  /**
    * Set the external component
    */
  var externalComponent: js.UndefOr[ExternalComponent] = js.native
  /**
    * Set the side menu
    */
  var sideMenu: js.UndefOr[LayoutSideMenu] = js.native
  /**
    * Set the split view
    */
  var splitView: js.UndefOr[LayoutSplitView] = js.native
  /**
    * Set the stack
    */
  var stack: js.UndefOr[LayoutStack] = js.native
  /**
    * Set the top tabs
    */
  var topTabs: js.UndefOr[TopTabs] = js.native
}

object Layout {
  @scala.inline
  def apply[P](): Layout[P] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Layout[P]]
  }
  @scala.inline
  implicit class LayoutOps[Self[p] <: Layout[p], P] (val x: Self[P]) extends AnyVal {
    @scala.inline
    def duplicate: Self[P] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[P]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[P] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[P] with Other]
    @scala.inline
    def withBottomTabs(value: LayoutBottomTabs): Self[P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bottomTabs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBottomTabs: Self[P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bottomTabs")(js.undefined)
        ret
    }
    @scala.inline
    def withComponent(value: LayoutComponent[P]): Self[P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("component")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComponent: Self[P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("component")(js.undefined)
        ret
    }
    @scala.inline
    def withExternalComponent(value: ExternalComponent): Self[P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("externalComponent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExternalComponent: Self[P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("externalComponent")(js.undefined)
        ret
    }
    @scala.inline
    def withSideMenu(value: LayoutSideMenu): Self[P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sideMenu")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSideMenu: Self[P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sideMenu")(js.undefined)
        ret
    }
    @scala.inline
    def withSplitView(value: LayoutSplitView): Self[P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("splitView")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSplitView: Self[P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("splitView")(js.undefined)
        ret
    }
    @scala.inline
    def withStack(value: LayoutStack): Self[P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stack")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStack: Self[P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stack")(js.undefined)
        ret
    }
    @scala.inline
    def withTopTabs(value: TopTabs): Self[P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topTabs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTopTabs: Self[P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topTabs")(js.undefined)
        ret
    }
  }
  
}

