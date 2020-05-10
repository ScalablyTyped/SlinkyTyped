package typingsSlinky.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonFile extends js.Object {
  var data: AnonMapTo = js.native
  var file: AnonAlias = js.native
  var headers: AnonRequired = js.native
  @JSName("headers.content-length")
  var `headersDotcontent-length`: AnonRequired = js.native
  @JSName("headers.content-type")
  var `headersDotcontent-type`: AnonRequired = js.native
  var label: AnonType = js.native
  var name: AnonRequired = js.native
  var url: AnonRequired = js.native
}

object AnonFile {
  @scala.inline
  def apply(
    data: AnonMapTo,
    file: AnonAlias,
    headers: AnonRequired,
    `headersDotcontent-length`: AnonRequired,
    `headersDotcontent-type`: AnonRequired,
    label: AnonType,
    name: AnonRequired,
    url: AnonRequired
  ): AnonFile = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("headers.content-length")(`headersDotcontent-length`.asInstanceOf[js.Any])
    __obj.updateDynamic("headers.content-type")(`headersDotcontent-type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFile]
  }
  @scala.inline
  implicit class AnonFileOps[Self <: AnonFile] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withData(value: AnonMapTo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFile(value: AnonAlias): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("file")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeaders(value: AnonRequired): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withHeadersDotcontent-length`(value: AnonRequired): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers.content-length")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withHeadersDotcontent-type`(value: AnonRequired): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers.content-type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabel(value: AnonType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: AnonRequired): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrl(value: AnonRequired): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

