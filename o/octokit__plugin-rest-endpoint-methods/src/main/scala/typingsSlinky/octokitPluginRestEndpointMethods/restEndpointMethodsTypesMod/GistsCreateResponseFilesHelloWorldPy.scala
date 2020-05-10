package typingsSlinky.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GistsCreateResponseFilesHelloWorldPy extends js.Object {
  var content: String = js.native
  var filename: String = js.native
  var language: String = js.native
  var raw_url: String = js.native
  var size: Double = js.native
  var truncated: Boolean = js.native
  var `type`: String = js.native
}

object GistsCreateResponseFilesHelloWorldPy {
  @scala.inline
  def apply(
    content: String,
    filename: String,
    language: String,
    raw_url: String,
    size: Double,
    truncated: Boolean,
    `type`: String
  ): GistsCreateResponseFilesHelloWorldPy = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], raw_url = raw_url.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], truncated = truncated.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GistsCreateResponseFilesHelloWorldPy]
  }
  @scala.inline
  implicit class GistsCreateResponseFilesHelloWorldPyOps[Self <: GistsCreateResponseFilesHelloWorldPy] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFilename(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filename")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLanguage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRaw_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("raw_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTruncated(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("truncated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

