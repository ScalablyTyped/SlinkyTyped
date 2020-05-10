package typingsSlinky.openfin.eventsApplicationMod

import typingsSlinky.openfin.applicationMod.ManifestInfo
import typingsSlinky.openfin.eventsBaseMod.ApplicationEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RunRequestedEvent[Topic, Type] extends ApplicationEvent[Topic, Type] {
  var manifest: ManifestInfo = js.native
  var userAppConfigArgs: js.Any = js.native
}

object RunRequestedEvent {
  @scala.inline
  def apply[Topic, Type](manifest: ManifestInfo, topic: Topic, `type`: Type, userAppConfigArgs: js.Any, uuid: String): RunRequestedEvent[Topic, Type] = {
    val __obj = js.Dynamic.literal(manifest = manifest.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any], userAppConfigArgs = userAppConfigArgs.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RunRequestedEvent[Topic, Type]]
  }
  @scala.inline
  implicit class RunRequestedEventOps[Self[topic, `type`] <: RunRequestedEvent[topic, `type`], Topic, Type] (val x: Self[Topic, Type]) extends AnyVal {
    @scala.inline
    def duplicate: Self[Topic, Type] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[Topic, Type]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[Topic, Type]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[Topic, Type]) with Other]
    @scala.inline
    def withManifest(value: ManifestInfo): Self[Topic, Type] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("manifest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUserAppConfigArgs(value: js.Any): Self[Topic, Type] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userAppConfigArgs")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

