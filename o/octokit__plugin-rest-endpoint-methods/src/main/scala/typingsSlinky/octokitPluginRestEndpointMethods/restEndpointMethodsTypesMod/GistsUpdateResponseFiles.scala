package typingsSlinky.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GistsUpdateResponseFiles extends js.Object {
  @JSName("hello_world.md")
  var hello_worldDotmd: GistsUpdateResponseFilesHelloWorldMd = js.native
  @JSName("hello_world.py")
  var hello_worldDotpy: GistsUpdateResponseFilesHelloWorldPy = js.native
  @JSName("hello_world.rb")
  var hello_worldDotrb: GistsUpdateResponseFilesHelloWorldRb = js.native
  @JSName("new_file.txt")
  var new_fileDottxt: GistsUpdateResponseFilesNewFileTxt = js.native
}

object GistsUpdateResponseFiles {
  @scala.inline
  def apply(
    hello_worldDotmd: GistsUpdateResponseFilesHelloWorldMd,
    hello_worldDotpy: GistsUpdateResponseFilesHelloWorldPy,
    hello_worldDotrb: GistsUpdateResponseFilesHelloWorldRb,
    new_fileDottxt: GistsUpdateResponseFilesNewFileTxt
  ): GistsUpdateResponseFiles = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("hello_world.md")(hello_worldDotmd.asInstanceOf[js.Any])
    __obj.updateDynamic("hello_world.py")(hello_worldDotpy.asInstanceOf[js.Any])
    __obj.updateDynamic("hello_world.rb")(hello_worldDotrb.asInstanceOf[js.Any])
    __obj.updateDynamic("new_file.txt")(new_fileDottxt.asInstanceOf[js.Any])
    __obj.asInstanceOf[GistsUpdateResponseFiles]
  }
  @scala.inline
  implicit class GistsUpdateResponseFilesOps[Self <: GistsUpdateResponseFiles] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHello_worldDotmd(value: GistsUpdateResponseFilesHelloWorldMd): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hello_world.md")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHello_worldDotpy(value: GistsUpdateResponseFilesHelloWorldPy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hello_world.py")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHello_worldDotrb(value: GistsUpdateResponseFilesHelloWorldRb): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hello_world.rb")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNew_fileDottxt(value: GistsUpdateResponseFilesNewFileTxt): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("new_file.txt")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

