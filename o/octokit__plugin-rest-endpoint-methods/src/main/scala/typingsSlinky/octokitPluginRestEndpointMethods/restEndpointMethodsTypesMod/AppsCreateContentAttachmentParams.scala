package typingsSlinky.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AppsCreateContentAttachmentParams extends js.Object {
  /**
    * The body text of the content attachment displayed in the body or comment of an issue or pull request. This parameter supports markdown.
    */
  var body: String = js.native
  var content_reference_id: Double = js.native
  /**
    * The title of the content attachment displayed in the body or comment of an issue or pull request.
    */
  var title: String = js.native
}

object AppsCreateContentAttachmentParams {
  @scala.inline
  def apply(body: String, content_reference_id: Double, title: String): AppsCreateContentAttachmentParams = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], content_reference_id = content_reference_id.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppsCreateContentAttachmentParams]
  }
  @scala.inline
  implicit class AppsCreateContentAttachmentParamsOps[Self <: AppsCreateContentAttachmentParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBody(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContent_reference_id(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content_reference_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

