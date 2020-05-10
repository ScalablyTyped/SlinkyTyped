package typingsSlinky.expoConstants.constantsTypesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IOSManifest
  extends /* key */ StringDictionary[js.Any] {
  var buildNumber: String = js.native
  var model: String = js.native
  var platform: String = js.native
  var systemVersion: String = js.native
  var userInterfaceIdiom: UserInterfaceIdiom = js.native
}

object IOSManifest {
  @scala.inline
  def apply(
    buildNumber: String,
    model: String,
    platform: String,
    systemVersion: String,
    userInterfaceIdiom: UserInterfaceIdiom
  ): IOSManifest = {
    val __obj = js.Dynamic.literal(buildNumber = buildNumber.asInstanceOf[js.Any], model = model.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any], systemVersion = systemVersion.asInstanceOf[js.Any], userInterfaceIdiom = userInterfaceIdiom.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOSManifest]
  }
  @scala.inline
  implicit class IOSManifestOps[Self <: IOSManifest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBuildNumber(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buildNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withModel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("model")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlatform(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("platform")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSystemVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("systemVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUserInterfaceIdiom(value: UserInterfaceIdiom): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userInterfaceIdiom")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

