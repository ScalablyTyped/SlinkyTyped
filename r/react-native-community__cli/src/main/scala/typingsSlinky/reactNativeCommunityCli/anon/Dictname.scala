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

@js.native
trait Dictname extends /* name */ StringDictionary[PlatformConfig[_, _, _, _]] {
  var android: js.UndefOr[
    PlatformConfig[
      ProjectParamsAndroid, 
      DependencyParamsAndroid, 
      ProjectConfigAndroid, 
      DependencyConfigAndroid
    ]
  ] = js.native
  var ios: js.UndefOr[
    PlatformConfig[ProjectParamsIOS, ProjectParamsIOS, ProjectConfigIOS, DependencyConfigIOS]
  ] = js.native
}

object Dictname {
  @scala.inline
  def apply(): Dictname = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Dictname]
  }
  @scala.inline
  implicit class DictnameOps[Self <: Dictname] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAndroid(
      value: PlatformConfig[
          ProjectParamsAndroid, 
          DependencyParamsAndroid, 
          ProjectConfigAndroid, 
          DependencyConfigAndroid
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("android")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAndroid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("android")(js.undefined)
        ret
    }
    @scala.inline
    def withIos(value: PlatformConfig[ProjectParamsIOS, ProjectParamsIOS, ProjectConfigIOS, DependencyConfigIOS]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ios")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIos: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ios")(js.undefined)
        ret
    }
  }
  
}

