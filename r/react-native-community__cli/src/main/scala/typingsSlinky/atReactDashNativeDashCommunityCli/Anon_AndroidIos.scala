package typingsSlinky.atReactDashNativeDashCommunityCli

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.atReactDashNativeDashCommunityCli.atReactDashNativeDashCommunityCliMod.DependencyConfigAndroid
import typingsSlinky.atReactDashNativeDashCommunityCli.atReactDashNativeDashCommunityCliMod.DependencyConfigIOS
import typingsSlinky.atReactDashNativeDashCommunityCli.atReactDashNativeDashCommunityCliMod.DependencyParamsAndroid
import typingsSlinky.atReactDashNativeDashCommunityCli.atReactDashNativeDashCommunityCliMod.PlatformConfig
import typingsSlinky.atReactDashNativeDashCommunityCli.atReactDashNativeDashCommunityCliMod.ProjectConfigAndroid
import typingsSlinky.atReactDashNativeDashCommunityCli.atReactDashNativeDashCommunityCliMod.ProjectConfigIOS
import typingsSlinky.atReactDashNativeDashCommunityCli.atReactDashNativeDashCommunityCliMod.ProjectParamsAndroid
import typingsSlinky.atReactDashNativeDashCommunityCli.atReactDashNativeDashCommunityCliMod.ProjectParamsIOS
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AndroidIos extends /* name */ StringDictionary[PlatformConfig[_, _, _, _]] {
  var android: js.UndefOr[
    PlatformConfig[
      ProjectParamsAndroid, 
      DependencyParamsAndroid, 
      ProjectConfigAndroid, 
      DependencyConfigAndroid
    ]
  ] = js.undefined
  var ios: js.UndefOr[
    PlatformConfig[ProjectParamsIOS, ProjectParamsIOS, ProjectConfigIOS, DependencyConfigIOS]
  ] = js.undefined
}

object Anon_AndroidIos {
  @scala.inline
  def apply(
    StringDictionary: /* name */ StringDictionary[PlatformConfig[_, _, _, _]] = null,
    android: PlatformConfig[
      ProjectParamsAndroid, 
      DependencyParamsAndroid, 
      ProjectConfigAndroid, 
      DependencyConfigAndroid
    ] = null,
    ios: PlatformConfig[ProjectParamsIOS, ProjectParamsIOS, ProjectConfigIOS, DependencyConfigIOS] = null
  ): Anon_AndroidIos = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (android != null) __obj.updateDynamic("android")(android.asInstanceOf[js.Any])
    if (ios != null) __obj.updateDynamic("ios")(ios.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AndroidIos]
  }
}

