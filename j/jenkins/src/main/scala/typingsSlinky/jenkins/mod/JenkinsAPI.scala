package typingsSlinky.jenkins.mod

import typingsSlinky.jenkins.anon.Add
import typingsSlinky.jenkins.anon.Build
import typingsSlinky.jenkins.anon.Cancel
import typingsSlinky.jenkins.anon.Config
import typingsSlinky.jenkins.anon.Get
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JenkinsAPI extends js.Object {
  var build: Get
  var job: Build
  var node: Config
  var queue: Cancel
  var view: Add
  def info(callback: js.Function2[/* err */ js.Error, /* data */ js.Any, Unit]): Unit
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
}

