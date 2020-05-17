package typingsSlinky.jenkins.mod

import typingsSlinky.jenkins.anon.Add
import typingsSlinky.jenkins.anon.Build
import typingsSlinky.jenkins.anon.Cancel
import typingsSlinky.jenkins.anon.Config
import typingsSlinky.jenkins.anon.Get
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JenkinsAPI extends js.Object {
  var build: Get = js.native
  var job: Build = js.native
  var node: Config = js.native
  var queue: Cancel = js.native
  var view: Add = js.native
  def info(callback: js.Function2[/* err */ js.Error, /* data */ js.Any, Unit]): Unit = js.native
}

object JenkinsAPI {
  @scala.inline
  def apply(
    build: Get,
    info: js.Function2[/* err */ js.Error, /* data */ js.Any, Unit] => Unit,
    job: Build,
    node: Config,
    queue: Cancel,
    view: Add
  ): JenkinsAPI = {
    val __obj = js.Dynamic.literal(build = build.asInstanceOf[js.Any], info = js.Any.fromFunction1(info), job = job.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], queue = queue.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any])
    __obj.asInstanceOf[JenkinsAPI]
  }
  @scala.inline
  implicit class JenkinsAPIOps[Self <: JenkinsAPI] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBuild(value: Get): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("build")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInfo(value: js.Function2[/* err */ js.Error, /* data */ js.Any, Unit] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("info")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withJob(value: Build): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("job")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNode(value: Config): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("node")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQueue(value: Cancel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withView(value: Add): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("view")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

