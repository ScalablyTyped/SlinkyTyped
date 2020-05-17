package typingsSlinky.reactNavigation.mod

import typingsSlinky.reactNavigation.anon.NavigationOptionsOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - Options
  - js.Function1[
/ * navigationOptionsContainer * / (typingsSlinky.reactNavigation.mod.NavigationScreenConfigProps[NavigationScreenPropType, ScreenProps]) with typingsSlinky.reactNavigation.anon.NavigationOptionsOptions[Options], 
Options]
*/
trait NavigationScreenConfig[Options, NavigationScreenPropType, ScreenProps] extends js.Object

object NavigationScreenConfig {
  @scala.inline
  implicit def apply[Options, NavigationScreenPropType, ScreenProps](
    value: js.Function1[
      /* navigationOptionsContainer */ (NavigationScreenConfigProps[NavigationScreenPropType, ScreenProps]) with NavigationOptionsOptions[Options], 
      Options
    ]
  ): NavigationScreenConfig[Options, NavigationScreenPropType, ScreenProps] = value.asInstanceOf[NavigationScreenConfig[Options, NavigationScreenPropType, ScreenProps]]
  @scala.inline
  implicit def apply[Options, NavigationScreenPropType, ScreenProps](value: Options): NavigationScreenConfig[Options, NavigationScreenPropType, ScreenProps] = value.asInstanceOf[NavigationScreenConfig[Options, NavigationScreenPropType, ScreenProps]]
}

