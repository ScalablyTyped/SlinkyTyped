package typingsSlinky.reactNavigation.anon

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.reactNavigation.mod.NavigationParams
import typingsSlinky.reactNavigation.mod.NavigationRoute
import typingsSlinky.reactNavigation.mod.NavigationScreenConfig
import typingsSlinky.reactNavigation.mod.NavigationScreenConfigProps
import typingsSlinky.reactNavigation.mod.NavigationScreenProp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DefaultNavigationOptions[Options, NavigationScreenPropType] extends js.Object {
  var defaultNavigationOptions: js.UndefOr[NavigationScreenConfig[Options, NavigationScreenPropType, _]] = js.native
  var navigationOptions: js.UndefOr[
    NavigationScreenConfig[
      StringDictionary[_], 
      NavigationScreenProp[NavigationRoute[NavigationParams], NavigationParams], 
      _
    ]
  ] = js.native
}

object DefaultNavigationOptions {
  @scala.inline
  def apply[Options, NavigationScreenPropType](): DefaultNavigationOptions[Options, NavigationScreenPropType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DefaultNavigationOptions[Options, NavigationScreenPropType]]
  }
  @scala.inline
  implicit class DefaultNavigationOptionsOps[Self[options, navigationscreenproptype] <: DefaultNavigationOptions[options, navigationscreenproptype], Options, NavigationScreenPropType] (val x: Self[Options, NavigationScreenPropType]) extends AnyVal {
    @scala.inline
    def duplicate: Self[Options, NavigationScreenPropType] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[Options, NavigationScreenPropType]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[Options, NavigationScreenPropType]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[Options, NavigationScreenPropType]) with Other]
    @scala.inline
    def withDefaultNavigationOptionsFunction1(
      value: /* navigationOptionsContainer */ (NavigationScreenConfigProps[NavigationScreenPropType, _]) with NavigationOptionsOptions[Options] => Options
    ): Self[Options, NavigationScreenPropType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultNavigationOptions")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDefaultNavigationOptions(value: NavigationScreenConfig[Options, NavigationScreenPropType, _]): Self[Options, NavigationScreenPropType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultNavigationOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultNavigationOptions: Self[Options, NavigationScreenPropType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultNavigationOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withNavigationOptionsFunction1(
      value: /* navigationOptionsContainer */ (NavigationScreenConfigProps[NavigationScreenProp[NavigationRoute[NavigationParams], NavigationParams], _]) with NavigationOptionsOptions[StringDictionary[_]] => StringDictionary[_]
    ): Self[Options, NavigationScreenPropType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navigationOptions")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withNavigationOptions(
      value: NavigationScreenConfig[
          StringDictionary[_], 
          NavigationScreenProp[NavigationRoute[NavigationParams], NavigationParams], 
          _
        ]
    ): Self[Options, NavigationScreenPropType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navigationOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNavigationOptions: Self[Options, NavigationScreenPropType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navigationOptions")(js.undefined)
        ret
    }
  }
  
}

