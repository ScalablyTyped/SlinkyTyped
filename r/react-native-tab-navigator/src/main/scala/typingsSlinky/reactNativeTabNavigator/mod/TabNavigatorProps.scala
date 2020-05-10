package typingsSlinky.reactNativeTabNavigator.mod

import typingsSlinky.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TabNavigatorProps extends js.Object {
  /**
    * Disable onPress opacity for Tab
    *
    * @default false
    */
  var hidesTabTouch: js.UndefOr[Boolean] = js.native
  /**
    * Define for rendered scene
    */
  var sceneStyle: js.UndefOr[ViewStyle] = js.native
  /**
    * Define shadow style for tabBar
    */
  var tabBarShadowStyle: js.UndefOr[ViewStyle] = js.native
  /**
    * Define style for TabBar
    */
  var tabBarStyle: js.UndefOr[ViewStyle] = js.native
}

object TabNavigatorProps {
  @scala.inline
  def apply(): TabNavigatorProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TabNavigatorProps]
  }
  @scala.inline
  implicit class TabNavigatorPropsOps[Self <: TabNavigatorProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHidesTabTouch(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hidesTabTouch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHidesTabTouch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hidesTabTouch")(js.undefined)
        ret
    }
    @scala.inline
    def withSceneStyle(value: ViewStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sceneStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSceneStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sceneStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withTabBarShadowStyle(value: ViewStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabBarShadowStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTabBarShadowStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabBarShadowStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withTabBarStyle(value: ViewStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabBarStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTabBarStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabBarStyle")(js.undefined)
        ret
    }
  }
  
}

