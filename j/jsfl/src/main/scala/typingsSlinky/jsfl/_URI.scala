package typingsSlinky.jsfl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait _URI extends js.Object {
  var extension: String = js.native
  var folder: String = js.native
  var name: String = js.native
  var path: String = js.native
  var `type`: String = js.native
  var uri: String = js.native
  def toURI(string: String): String = js.native
}

object _URI {
  @scala.inline
  def apply(
    extension: String,
    folder: String,
    name: String,
    path: String,
    toURI: String => String,
    `type`: String,
    uri: String
  ): _URI = {
    val __obj = js.Dynamic.literal(extension = extension.asInstanceOf[js.Any], folder = folder.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], toURI = js.Any.fromFunction1(toURI), uri = uri.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_URI]
  }
  @scala.inline
  implicit class _URIOps[Self <: _URI] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExtension(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extension")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFolder(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("folder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToURI(value: String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toURI")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUri(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uri")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

