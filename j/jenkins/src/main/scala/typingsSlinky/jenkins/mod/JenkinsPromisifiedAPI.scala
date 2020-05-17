package typingsSlinky.jenkins.mod

import typingsSlinky.jenkins.anon.Copy
import typingsSlinky.jenkins.anon.Create
import typingsSlinky.jenkins.anon.Destroy
import typingsSlinky.jenkins.anon.Item
import typingsSlinky.jenkins.anon.Log
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JenkinsPromisifiedAPI extends js.Object {
  var build: Log = js.native
  var job: Copy = js.native
  var node: Create = js.native
  var queue: Item = js.native
  var view: Destroy = js.native
  def info(): js.Promise[_] = js.native
}

object JenkinsPromisifiedAPI {
  @scala.inline
  def apply(build: Log, info: () => js.Promise[_], job: Copy, node: Create, queue: Item, view: Destroy): JenkinsPromisifiedAPI = {
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
    def withBuild(value: Log): Self = {
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
    def withJob(value: Copy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("job")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNode(value: Create): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("node")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQueue(value: Item): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withView(value: Destroy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("view")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

