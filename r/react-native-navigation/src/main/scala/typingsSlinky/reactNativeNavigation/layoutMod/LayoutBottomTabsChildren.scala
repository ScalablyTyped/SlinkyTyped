package typingsSlinky.reactNativeNavigation.layoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LayoutBottomTabsChildren extends js.Object {
  /**
    * Set component
    */
  var component: js.UndefOr[LayoutComponent[js.Object]] = js.native
  /**
    * Set the external component
    */
  var externalComponent: js.UndefOr[ExternalComponent] = js.native
  /**
    * Set stack
    */
  var stack: js.UndefOr[LayoutStack] = js.native
}

object LayoutBottomTabsChildren {
  @scala.inline
  def apply(): LayoutBottomTabsChildren = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LayoutBottomTabsChildren]
  }
  @scala.inline
  implicit class LayoutBottomTabsChildrenOps[Self <: LayoutBottomTabsChildren] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComponent(value: LayoutComponent[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("component")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComponent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("component")(js.undefined)
        ret
    }
    @scala.inline
    def withExternalComponent(value: ExternalComponent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("externalComponent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExternalComponent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("externalComponent")(js.undefined)
        ret
    }
    @scala.inline
    def withStack(value: LayoutStack): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stack")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStack: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stack")(js.undefined)
        ret
    }
  }
  
}

