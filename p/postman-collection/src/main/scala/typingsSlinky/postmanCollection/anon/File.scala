package typingsSlinky.postmanCollection.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait File extends js.Object {
  var file: String = js.native
  var formdata: String = js.native
  var raw: String = js.native
  var urlencoded: String = js.native
}

object File {
  @scala.inline
  def apply(file: String, formdata: String, raw: String, urlencoded: String): File = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], formdata = formdata.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], urlencoded = urlencoded.asInstanceOf[js.Any])
    __obj.asInstanceOf[File]
  }
  @scala.inline
  implicit class FileOps[Self <: File] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFile(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("file")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFormdata(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formdata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRaw(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("raw")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrlencoded(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("urlencoded")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

