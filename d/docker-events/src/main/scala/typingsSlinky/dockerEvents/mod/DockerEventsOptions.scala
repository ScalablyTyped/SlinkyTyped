package typingsSlinky.dockerEvents.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DockerEventsOptions extends js.Object {
  var docker: typingsSlinky.dockerode.mod.^ = js.native
}

object DockerEventsOptions {
  @scala.inline
  def apply(docker: typingsSlinky.dockerode.mod.^): DockerEventsOptions = {
    val __obj = js.Dynamic.literal(docker = docker.asInstanceOf[js.Any])
    __obj.asInstanceOf[DockerEventsOptions]
  }
  @scala.inline
  implicit class DockerEventsOptionsOps[Self <: DockerEventsOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDocker(value: typingsSlinky.dockerode.mod.^): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("docker")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

