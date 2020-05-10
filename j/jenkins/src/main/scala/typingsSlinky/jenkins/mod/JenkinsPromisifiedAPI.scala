package typingsSlinky.jenkins.mod

import typingsSlinky.jenkins.AnonCopy
import typingsSlinky.jenkins.AnonCreate
import typingsSlinky.jenkins.AnonDestroy
import typingsSlinky.jenkins.AnonItem
import typingsSlinky.jenkins.AnonLog
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JenkinsPromisifiedAPI extends js.Object {
  var build: AnonLog = js.native
  var job: AnonCopy = js.native
  var node: AnonCreate = js.native
  var queue: AnonItem = js.native
  var view: AnonDestroy = js.native
  def info(): js.Promise[_] = js.native
}

object JenkinsPromisifiedAPI {
  @scala.inline
  def apply(
    build: AnonLog,
    info: () => js.Promise[_],
    job: AnonCopy,
    node: AnonCreate,
    queue: AnonItem,
    view: AnonDestroy
  ): JenkinsPromisifiedAPI = {
    val __obj = js.Dynamic.literal(build = build.asInstanceOf[js.Any], info = js.Any.fromFunction0(info), job = job.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], queue = queue.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any])
    __obj.asInstanceOf[JenkinsPromisifiedAPI]
  }
  @scala.inline
  implicit class JenkinsPromisifiedAPIOps[Self <: JenkinsPromisifiedAPI] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBuild(value: AnonLog): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("build")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInfo(value: () => js.Promise[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("info")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withJob(value: AnonCopy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("job")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNode(value: AnonCreate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("node")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQueue(value: AnonItem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withView(value: AnonDestroy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("view")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

