package typingsSlinky.firebaseRemoteConfig.mod.firebaseAppTypesAugmentingMod

import typingsSlinky.firebaseRemoteConfigTypes.mod.RemoteConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FirebaseApp extends js.Object {
  def remoteConfig(): RemoteConfig = js.native
}

object FirebaseApp {
  @scala.inline
  def apply(remoteConfig: () => RemoteConfig): FirebaseApp = {
    val __obj = js.Dynamic.literal(remoteConfig = js.Any.fromFunction0(remoteConfig))
    __obj.asInstanceOf[FirebaseApp]
  }
  @scala.inline
  implicit class FirebaseAppOps[Self <: FirebaseApp] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRemoteConfig(value: () => RemoteConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remoteConfig")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

