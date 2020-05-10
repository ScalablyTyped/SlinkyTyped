package typingsSlinky.octokitRest.mod.Octokit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GistsCreateResponseFiles extends js.Object {
  @JSName("hello_world.py")
  var hello_worldDotpy: GistsCreateResponseFilesHelloWorldPy = js.native
  @JSName("hello_world.rb")
  var hello_worldDotrb: GistsCreateResponseFilesHelloWorldRb = js.native
  @JSName("hello_world_python.txt")
  var hello_world_pythonDottxt: GistsCreateResponseFilesHelloWorldPythonTxt = js.native
  @JSName("hello_world_ruby.txt")
  var hello_world_rubyDottxt: GistsCreateResponseFilesHelloWorldRubyTxt = js.native
}

object GistsCreateResponseFiles {
  @scala.inline
  def apply(
    hello_worldDotpy: GistsCreateResponseFilesHelloWorldPy,
    hello_worldDotrb: GistsCreateResponseFilesHelloWorldRb,
    hello_world_pythonDottxt: GistsCreateResponseFilesHelloWorldPythonTxt,
    hello_world_rubyDottxt: GistsCreateResponseFilesHelloWorldRubyTxt
  ): GistsCreateResponseFiles = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("hello_world.py")(hello_worldDotpy.asInstanceOf[js.Any])
    __obj.updateDynamic("hello_world.rb")(hello_worldDotrb.asInstanceOf[js.Any])
    __obj.updateDynamic("hello_world_python.txt")(hello_world_pythonDottxt.asInstanceOf[js.Any])
    __obj.updateDynamic("hello_world_ruby.txt")(hello_world_rubyDottxt.asInstanceOf[js.Any])
    __obj.asInstanceOf[GistsCreateResponseFiles]
  }
  @scala.inline
  implicit class GistsCreateResponseFilesOps[Self <: GistsCreateResponseFiles] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHello_worldDotpy(value: GistsCreateResponseFilesHelloWorldPy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hello_world.py")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHello_worldDotrb(value: GistsCreateResponseFilesHelloWorldRb): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hello_world.rb")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHello_world_pythonDottxt(value: GistsCreateResponseFilesHelloWorldPythonTxt): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hello_world_python.txt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHello_world_rubyDottxt(value: GistsCreateResponseFilesHelloWorldRubyTxt): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hello_world_ruby.txt")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

