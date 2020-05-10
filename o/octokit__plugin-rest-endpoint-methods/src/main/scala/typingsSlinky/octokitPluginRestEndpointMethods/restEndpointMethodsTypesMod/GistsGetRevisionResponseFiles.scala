package typingsSlinky.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GistsGetRevisionResponseFiles extends js.Object {
  @JSName("hello_world.py")
  var hello_worldDotpy: GistsGetRevisionResponseFilesHelloWorldPy = js.native
  @JSName("hello_world.rb")
  var hello_worldDotrb: GistsGetRevisionResponseFilesHelloWorldRb = js.native
  @JSName("hello_world_python.txt")
  var hello_world_pythonDottxt: GistsGetRevisionResponseFilesHelloWorldPythonTxt = js.native
  @JSName("hello_world_ruby.txt")
  var hello_world_rubyDottxt: GistsGetRevisionResponseFilesHelloWorldRubyTxt = js.native
}

object GistsGetRevisionResponseFiles {
  @scala.inline
  def apply(
    hello_worldDotpy: GistsGetRevisionResponseFilesHelloWorldPy,
    hello_worldDotrb: GistsGetRevisionResponseFilesHelloWorldRb,
    hello_world_pythonDottxt: GistsGetRevisionResponseFilesHelloWorldPythonTxt,
    hello_world_rubyDottxt: GistsGetRevisionResponseFilesHelloWorldRubyTxt
  ): GistsGetRevisionResponseFiles = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("hello_world.py")(hello_worldDotpy.asInstanceOf[js.Any])
    __obj.updateDynamic("hello_world.rb")(hello_worldDotrb.asInstanceOf[js.Any])
    __obj.updateDynamic("hello_world_python.txt")(hello_world_pythonDottxt.asInstanceOf[js.Any])
    __obj.updateDynamic("hello_world_ruby.txt")(hello_world_rubyDottxt.asInstanceOf[js.Any])
    __obj.asInstanceOf[GistsGetRevisionResponseFiles]
  }
  @scala.inline
  implicit class GistsGetRevisionResponseFilesOps[Self <: GistsGetRevisionResponseFiles] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHello_worldDotpy(value: GistsGetRevisionResponseFilesHelloWorldPy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hello_world.py")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHello_worldDotrb(value: GistsGetRevisionResponseFilesHelloWorldRb): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hello_world.rb")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHello_world_pythonDottxt(value: GistsGetRevisionResponseFilesHelloWorldPythonTxt): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hello_world_python.txt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHello_world_rubyDottxt(value: GistsGetRevisionResponseFilesHelloWorldRubyTxt): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hello_world_ruby.txt")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

