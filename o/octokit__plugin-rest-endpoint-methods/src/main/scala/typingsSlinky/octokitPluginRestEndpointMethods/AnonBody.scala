package typingsSlinky.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonBody extends js.Object {
  var body: AnonRequired = js.native
  var content_reference_id: AnonRequired = js.native
  var title: AnonRequired = js.native
}

object AnonBody {
  @scala.inline
  def apply(body: AnonRequired, content_reference_id: AnonRequired, title: AnonRequired): AnonBody = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], content_reference_id = content_reference_id.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBody]
  }
  @scala.inline
  implicit class AnonBodyOps[Self <: AnonBody] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBody(value: AnonRequired): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContent_reference_id(value: AnonRequired): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content_reference_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitle(value: AnonRequired): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

