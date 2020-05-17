package typingsSlinky.reactNavigation.anon

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.reactNavigation.mod.NavigationScreenConfig
import typingsSlinky.reactNavigation.mod.NavigationScreenConfigProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Path[Options, NavigationScreenPropType, ScreenProps] extends js.Object {
  var navigationOptions: js.UndefOr[NavigationScreenConfig[Options, NavigationScreenPropType, ScreenProps]] = js.native
  var params: js.UndefOr[StringDictionary[js.Any]] = js.native
  var path: js.UndefOr[String] = js.native
}

object Path {
  @scala.inline
  def apply[Options, NavigationScreenPropType, ScreenProps](): Path[Options, NavigationScreenPropType, ScreenProps] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Path[Options, NavigationScreenPropType, ScreenProps]]
  }
  @scala.inline
  implicit class PathOps[Self[options, navigationscreenproptype, screenprops] <: Path[options, navigationscreenproptype, screenprops], Options, NavigationScreenPropType, ScreenProps] (val x: Self[Options, NavigationScreenPropType, ScreenProps]) extends AnyVal {
    @scala.inline
    def duplicate: Self[Options, NavigationScreenPropType, ScreenProps] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[Options, NavigationScreenPropType, ScreenProps]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[Options, NavigationScreenPropType, ScreenProps]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[Options, NavigationScreenPropType, ScreenProps]) with Other]
    @scala.inline
    def withNavigationOptionsFunction1(
      value: /* navigationOptionsContainer */ (NavigationScreenConfigProps[NavigationScreenPropType, ScreenProps]) with NavigationOptionsOptions[Options] => Options
    ): Self[Options, NavigationScreenPropType, ScreenProps] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navigationOptions")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withNavigationOptions(value: NavigationScreenConfig[Options, NavigationScreenPropType, ScreenProps]): Self[Options, NavigationScreenPropType, ScreenProps] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navigationOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNavigationOptions: Self[Options, NavigationScreenPropType, ScreenProps] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navigationOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withParams(value: StringDictionary[js.Any]): Self[Options, NavigationScreenPropType, ScreenProps] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("params")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParams: Self[Options, NavigationScreenPropType, ScreenProps] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("params")(js.undefined)
        ret
    }
    @scala.inline
    def withPath(value: String): Self[Options, NavigationScreenPropType, ScreenProps] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPath: Self[Options, NavigationScreenPropType, ScreenProps] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(js.undefined)
        ret
    }
  }
  
}

