package typingsSlinky.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GistsListResponseItemFiles extends js.Object {
  @JSName("hello_world.rb")
  var hello_worldDotrb: GistsListResponseItemFilesHelloWorldRb = js.native
}

object GistsListResponseItemFiles {
  @scala.inline
  def apply(hello_worldDotrb: GistsListResponseItemFilesHelloWorldRb): GistsListResponseItemFiles = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("hello_world.rb")(hello_worldDotrb.asInstanceOf[js.Any])
    __obj.asInstanceOf[GistsListResponseItemFiles]
  }
  @scala.inline
  implicit class GistsListResponseItemFilesOps[Self <: GistsListResponseItemFiles] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHello_worldDotrb(value: GistsListResponseItemFilesHelloWorldRb): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hello_world.rb")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

