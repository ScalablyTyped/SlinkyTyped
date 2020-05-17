package typingsSlinky.reactNativeCommunityCli.anon

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.reactNativeCommunityCli.mod.DependencyParamsAndroid
import typingsSlinky.reactNativeCommunityCli.mod.ProjectParamsIOS
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Android
  extends /* key */ StringDictionary[js.Any] {
  var android: js.UndefOr[DependencyParamsAndroid] = js.native
  var ios: js.UndefOr[ProjectParamsIOS] = js.native
}

object Android {
  @scala.inline
  def apply(): Android = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Android]
  }
  @scala.inline
  implicit class AndroidOps[Self <: Android] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAndroid(value: DependencyParamsAndroid): Self = {
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
    def withIos(value: ProjectParamsIOS): Self = {
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

