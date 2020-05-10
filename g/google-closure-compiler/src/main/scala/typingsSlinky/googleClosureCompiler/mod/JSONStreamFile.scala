package typingsSlinky.googleClosureCompiler.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// The "json_streams" compiler flag lets the compiler accept/produce
// arrays of JSON objects in this shape for input/output.
@js.native
trait JSONStreamFile extends js.Object {
  var path: String = js.native
  var src: String = js.native
  var srcmap: js.UndefOr[String] = js.native
}

object JSONStreamFile {
  @scala.inline
  def apply(path: String, src: String): JSONStreamFile = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSONStreamFile]
  }
  @scala.inline
  implicit class JSONStreamFileOps[Self <: JSONStreamFile] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSrc(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("src")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSrcmap(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("srcmap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSrcmap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("srcmap")(js.undefined)
        ret
    }
  }
  
}

