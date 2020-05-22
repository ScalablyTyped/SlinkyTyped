package typingsSlinky.reactNativeCommunityCli.anon

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.reactNativeCommunityCli.mod.DependencyConfigAndroid
import typingsSlinky.reactNativeCommunityCli.mod.DependencyConfigIOS
import typingsSlinky.reactNativeCommunityCli.mod.DependencyParamsAndroid
import typingsSlinky.reactNativeCommunityCli.mod.PlatformConfig
import typingsSlinky.reactNativeCommunityCli.mod.ProjectConfigAndroid
import typingsSlinky.reactNativeCommunityCli.mod.ProjectConfigIOS
import typingsSlinky.reactNativeCommunityCli.mod.ProjectParamsAndroid
import typingsSlinky.reactNativeCommunityCli.mod.ProjectParamsIOS
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Dictname extends /* name */ StringDictionary[PlatformConfig[_, _, _, _]] {
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

object Dictname {
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
  ): Dictname = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (android != null) __obj.updateDynamic("android")(android.asInstanceOf[js.Any])
    if (ios != null) __obj.updateDynamic("ios")(ios.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dictname]
  }
}

