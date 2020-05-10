package typingsSlinky.octokitRest.mod.Octokit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GistsForkResponseFiles extends js.Object {
  @JSName("hello_world.rb")
  var hello_worldDotrb: GistsForkResponseFilesHelloWorldRb = js.native
}

object GistsForkResponseFiles {
  @scala.inline
  def apply(hello_worldDotrb: GistsForkResponseFilesHelloWorldRb): GistsForkResponseFiles = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("hello_world.rb")(hello_worldDotrb.asInstanceOf[js.Any])
    __obj.asInstanceOf[GistsForkResponseFiles]
  }
  @scala.inline
  implicit class GistsForkResponseFilesOps[Self <: GistsForkResponseFiles] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHello_worldDotrb(value: GistsForkResponseFilesHelloWorldRb): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hello_world.rb")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

