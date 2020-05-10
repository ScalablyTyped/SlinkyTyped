package typingsSlinky.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDescription extends js.Object {
  var description: AnonType = js.native
  var files: AnonRequired = js.native
  @JSName("files.content")
  var filesDotcontent: AnonType = js.native
  var public: AnonType = js.native
}

object AnonDescription {
  @scala.inline
  def apply(description: AnonType, files: AnonRequired, filesDotcontent: AnonType, public: AnonType): AnonDescription = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], files = files.asInstanceOf[js.Any], public = public.asInstanceOf[js.Any])
    __obj.updateDynamic("files.content")(filesDotcontent.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDescription]
  }
  @scala.inline
  implicit class AnonDescriptionOps[Self <: AnonDescription] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDescription(value: AnonType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFiles(value: AnonRequired): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("files")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFilesDotcontent(value: AnonType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("files.content")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPublic(value: AnonType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("public")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

