package typingsSlinky.hapiInert.mod

import typingsSlinky.hapiHapi.mod.Request
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FileHandlerRouteObject extends ReplyFileHandlerOptions {
  /**
    * path - a path string or function as described above (required).
    */
  var path: String | RequestHandler[String] = js.native
}

object FileHandlerRouteObject {
  @scala.inline
  def apply(path: String | RequestHandler[String]): FileHandlerRouteObject = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileHandlerRouteObject]
  }
  @scala.inline
  implicit class FileHandlerRouteObjectOps[Self <: FileHandlerRouteObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPathFunction1(value: /* request */ Request => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPath(value: String | RequestHandler[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

