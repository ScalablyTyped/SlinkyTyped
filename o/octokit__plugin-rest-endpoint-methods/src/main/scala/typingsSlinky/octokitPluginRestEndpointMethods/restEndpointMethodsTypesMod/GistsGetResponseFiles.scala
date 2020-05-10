package typingsSlinky.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GistsGetResponseFiles extends js.Object {
  @JSName("hello_world.py")
  var hello_worldDotpy: GistsGetResponseFilesHelloWorldPy = js.native
  @JSName("hello_world.rb")
  var hello_worldDotrb: GistsGetResponseFilesHelloWorldRb = js.native
  @JSName("hello_world_python.txt")
  var hello_world_pythonDottxt: GistsGetResponseFilesHelloWorldPythonTxt = js.native
  @JSName("hello_world_ruby.txt")
  var hello_world_rubyDottxt: GistsGetResponseFilesHelloWorldRubyTxt = js.native
}

object GistsGetResponseFiles {
  @scala.inline
  def apply(
    hello_worldDotpy: GistsGetResponseFilesHelloWorldPy,
    hello_worldDotrb: GistsGetResponseFilesHelloWorldRb,
    hello_world_pythonDottxt: GistsGetResponseFilesHelloWorldPythonTxt,
    hello_world_rubyDottxt: GistsGetResponseFilesHelloWorldRubyTxt
  ): GistsGetResponseFiles = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("hello_world.py")(hello_worldDotpy.asInstanceOf[js.Any])
    __obj.updateDynamic("hello_world.rb")(hello_worldDotrb.asInstanceOf[js.Any])
    __obj.updateDynamic("hello_world_python.txt")(hello_world_pythonDottxt.asInstanceOf[js.Any])
    __obj.updateDynamic("hello_world_ruby.txt")(hello_world_rubyDottxt.asInstanceOf[js.Any])
    __obj.asInstanceOf[GistsGetResponseFiles]
  }
  @scala.inline
  implicit class GistsGetResponseFilesOps[Self <: GistsGetResponseFiles] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHello_worldDotpy(value: GistsGetResponseFilesHelloWorldPy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hello_world.py")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHello_worldDotrb(value: GistsGetResponseFilesHelloWorldRb): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hello_world.rb")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHello_world_pythonDottxt(value: GistsGetResponseFilesHelloWorldPythonTxt): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hello_world_python.txt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHello_world_rubyDottxt(value: GistsGetResponseFilesHelloWorldRubyTxt): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hello_world_ruby.txt")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

