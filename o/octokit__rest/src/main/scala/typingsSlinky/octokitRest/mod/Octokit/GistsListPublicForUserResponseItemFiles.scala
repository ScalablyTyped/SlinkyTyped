package typingsSlinky.octokitRest.mod.Octokit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GistsListPublicForUserResponseItemFiles extends js.Object {
  @JSName("hello_world.rb")
  var hello_worldDotrb: GistsListPublicForUserResponseItemFilesHelloWorldRb = js.native
}

object GistsListPublicForUserResponseItemFiles {
  @scala.inline
  def apply(hello_worldDotrb: GistsListPublicForUserResponseItemFilesHelloWorldRb): GistsListPublicForUserResponseItemFiles = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("hello_world.rb")(hello_worldDotrb.asInstanceOf[js.Any])
    __obj.asInstanceOf[GistsListPublicForUserResponseItemFiles]
  }
  @scala.inline
  implicit class GistsListPublicForUserResponseItemFilesOps[Self <: GistsListPublicForUserResponseItemFiles] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHello_worldDotrb(value: GistsListPublicForUserResponseItemFilesHelloWorldRb): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hello_world.rb")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

