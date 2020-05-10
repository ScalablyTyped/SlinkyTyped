package typingsSlinky.firebaseRemoteConfigTypes.mod.firebaseComponentAugmentingMod

import typingsSlinky.firebaseRemoteConfigTypes.mod.RemoteConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NameServiceMapping extends js.Object {
  var remoteConfig: RemoteConfig = js.native
}

object NameServiceMapping {
  @scala.inline
  def apply(remoteConfig: RemoteConfig): NameServiceMapping = {
    val __obj = js.Dynamic.literal(remoteConfig = remoteConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[NameServiceMapping]
  }
  @scala.inline
  implicit class NameServiceMappingOps[Self <: NameServiceMapping] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRemoteConfig(value: RemoteConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remoteConfig")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

