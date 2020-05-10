package typingsSlinky.firebaseAppTypes.mod.firebaseComponentAugmentingMod

import typingsSlinky.firebaseAppTypes.mod.FirebaseApp
import typingsSlinky.firebaseAppTypes.mod.VersionService
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NameServiceMapping extends js.Object {
  var app: FirebaseApp = js.native
  var `app-version`: VersionService = js.native
  var `platform-identifier`: VersionService = js.native
}

object NameServiceMapping {
  @scala.inline
  def apply(app: FirebaseApp, `app-version`: VersionService, `platform-identifier`: VersionService): NameServiceMapping = {
    val __obj = js.Dynamic.literal(app = app.asInstanceOf[js.Any])
    __obj.updateDynamic("app-version")(`app-version`.asInstanceOf[js.Any])
    __obj.updateDynamic("platform-identifier")(`platform-identifier`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NameServiceMapping]
  }
  @scala.inline
  implicit class NameServiceMappingOps[Self <: NameServiceMapping] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApp(value: FirebaseApp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("app")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withApp-version`(value: VersionService): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("app-version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withPlatform-identifier`(value: VersionService): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("platform-identifier")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

