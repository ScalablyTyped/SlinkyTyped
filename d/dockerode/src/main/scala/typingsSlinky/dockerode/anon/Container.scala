package typingsSlinky.dockerode.anon

import typingsSlinky.dockerode.dockerodeStrings.config
import typingsSlinky.dockerode.dockerodeStrings.container
import typingsSlinky.dockerode.dockerodeStrings.daemon
import typingsSlinky.dockerode.dockerodeStrings.image
import typingsSlinky.dockerode.dockerodeStrings.local
import typingsSlinky.dockerode.dockerodeStrings.network
import typingsSlinky.dockerode.dockerodeStrings.node
import typingsSlinky.dockerode.dockerodeStrings.plugin
import typingsSlinky.dockerode.dockerodeStrings.secret
import typingsSlinky.dockerode.dockerodeStrings.service
import typingsSlinky.dockerode.dockerodeStrings.swarm
import typingsSlinky.dockerode.dockerodeStrings.volume
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Container extends js.Object {
  var config: js.UndefOr[String] = js.native
  var container: js.UndefOr[js.Array[String]] = js.native
  var daemon: js.UndefOr[js.Array[String]] = js.native
  var event: js.UndefOr[js.Array[String]] = js.native
  var image: js.UndefOr[js.Array[String]] = js.native
  var label: js.UndefOr[js.Array[String]] = js.native
  var network: js.UndefOr[js.Array[String]] = js.native
  var node: js.UndefOr[js.Array[String]] = js.native
  var plugin: js.UndefOr[js.Array[String]] = js.native
  var scope: js.UndefOr[js.Array[local | swarm]] = js.native
  var secret: js.UndefOr[js.Array[String]] = js.native
  var service: js.UndefOr[js.Array[String]] = js.native
  var `type`: js.UndefOr[
    js.Array[
      container | image | volume | network | daemon | plugin | service | node | secret | config
    ]
  ] = js.native
  var volume: js.UndefOr[js.Array[String]] = js.native
}

object Container {
  @scala.inline
  def apply(): Container = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Container]
  }
  @scala.inline
  implicit class ContainerOps[Self <: Container] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConfig(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("config")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("config")(js.undefined)
        ret
    }
    @scala.inline
    def withContainer(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("container")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContainer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("container")(js.undefined)
        ret
    }
    @scala.inline
    def withDaemon(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("daemon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDaemon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("daemon")(js.undefined)
        ret
    }
    @scala.inline
    def withEvent(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("event")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEvent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("event")(js.undefined)
        ret
    }
    @scala.inline
    def withImage(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("image")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("image")(js.undefined)
        ret
    }
    @scala.inline
    def withLabel(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(js.undefined)
        ret
    }
    @scala.inline
    def withNetwork(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("network")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNetwork: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("network")(js.undefined)
        ret
    }
    @scala.inline
    def withNode(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("node")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("node")(js.undefined)
        ret
    }
    @scala.inline
    def withPlugin(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plugin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlugin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plugin")(js.undefined)
        ret
    }
    @scala.inline
    def withScope(value: js.Array[local | swarm]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scope")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScope: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scope")(js.undefined)
        ret
    }
    @scala.inline
    def withSecret(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secret")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecret: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secret")(js.undefined)
        ret
    }
    @scala.inline
    def withService(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("service")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutService: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("service")(js.undefined)
        ret
    }
    @scala.inline
    def withType(
      value: js.Array[
          container | image | volume | network | daemon | plugin | service | node | secret | config
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
    @scala.inline
    def withVolume(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("volume")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVolume: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("volume")(js.undefined)
        ret
    }
  }
  
}

