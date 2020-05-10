package typingsSlinky.reactNativeCommunityCli

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.reactNativeCommunityCli.mod.DependencyConfigAndroid
import typingsSlinky.reactNativeCommunityCli.mod.DependencyConfigIOS
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDictkey
  extends /* key */ StringDictionary[js.Any] {
  var android: js.UndefOr[DependencyConfigAndroid | Null] = js.native
  var ios: js.UndefOr[DependencyConfigIOS | Null] = js.native
}

object AnonDictkey {
  @scala.inline
  def apply(): AnonDictkey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonDictkey]
  }
  @scala.inline
  implicit class AnonDictkeyOps[Self <: AnonDictkey] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAndroid(value: DependencyConfigAndroid): Self = {
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
    def withAndroidNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("android")(null)
        ret
    }
    @scala.inline
    def withIos(value: DependencyConfigIOS): Self = {
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
    @scala.inline
    def withIosNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ios")(null)
        ret
    }
  }
  
}

