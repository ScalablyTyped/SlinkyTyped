package typingsSlinky.gatsby

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonComponentChunkName extends js.Object {
  var componentChunkName: String = js.native
  var matchPath: js.UndefOr[String] = js.native
  var path: String = js.native
  var webpackCompilationHash: String = js.native
}

object AnonComponentChunkName {
  @scala.inline
  def apply(componentChunkName: String, path: String, webpackCompilationHash: String): AnonComponentChunkName = {
    val __obj = js.Dynamic.literal(componentChunkName = componentChunkName.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], webpackCompilationHash = webpackCompilationHash.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonComponentChunkName]
  }
  @scala.inline
  implicit class AnonComponentChunkNameOps[Self <: AnonComponentChunkName] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComponentChunkName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentChunkName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWebpackCompilationHash(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webpackCompilationHash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMatchPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matchPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMatchPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matchPath")(js.undefined)
        ret
    }
  }
  
}

