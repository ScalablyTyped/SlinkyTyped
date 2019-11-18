package typingsSlinky.reactDashNavigation

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.reactDashNavigation.reactDashNavigationMod.NavigationDescriptor
import typingsSlinky.reactDashNavigation.reactDashNavigationMod.NavigationParams
import typingsSlinky.reactDashNavigation.reactDashNavigationMod.NavigationRoute
import typingsSlinky.reactDashNavigation.reactDashNavigationMod.NavigationScreenProp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Descriptors[Options, ScreenProps] extends js.Object {
  var descriptors: StringDictionary[
    NavigationDescriptor[
      NavigationParams, 
      js.Object, 
      NavigationScreenProp[NavigationRoute[NavigationParams], NavigationParams]
    ]
  ]
  var navigationConfig: Options
  var screenProps: js.UndefOr[ScreenProps] = js.undefined
}

object Anon_Descriptors {
  @scala.inline
  def apply[Options, ScreenProps](
    descriptors: StringDictionary[
      NavigationDescriptor[
        NavigationParams, 
        js.Object, 
        NavigationScreenProp[NavigationRoute[NavigationParams], NavigationParams]
      ]
    ],
    navigationConfig: Options,
    screenProps: ScreenProps = null
  ): Anon_Descriptors[Options, ScreenProps] = {
    val __obj = js.Dynamic.literal(descriptors = descriptors.asInstanceOf[js.Any], navigationConfig = navigationConfig.asInstanceOf[js.Any])
    if (screenProps != null) __obj.updateDynamic("screenProps")(screenProps.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Descriptors[Options, ScreenProps]]
  }
}

