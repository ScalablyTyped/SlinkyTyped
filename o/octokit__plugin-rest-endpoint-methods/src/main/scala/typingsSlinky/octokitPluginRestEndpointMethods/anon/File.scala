package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait File extends js.Object {
  var data: MapTo = js.native
  var file: Alias = js.native
  var headers: Required = js.native
  @JSName("headers.content-length")
  var `headersDotcontent-length`: Required = js.native
  @JSName("headers.content-type")
  var `headersDotcontent-type`: Required = js.native
  var label: Type = js.native
  var name: Required = js.native
  var url: Required = js.native
}

object File {
  @scala.inline
  def apply(
    data: MapTo,
    file: Alias,
    headers: Required,
    `headersDotcontent-length`: Required,
    `headersDotcontent-type`: Required,
    label: Type,
    name: Required,
    url: Required
  ): File = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("headers.content-length")(`headersDotcontent-length`.asInstanceOf[js.Any])
    __obj.updateDynamic("headers.content-type")(`headersDotcontent-type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[File]
  }
  @scala.inline
  implicit class FileOps[Self <: File] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withData(value: MapTo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFile(value: Alias): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("file")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeaders(value: Required): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withHeadersDotcontent-length`(value: Required): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers.content-length")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withHeadersDotcontent-type`(value: Required): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers.content-type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabel(value: Type): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: Required): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrl(value: Required): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

