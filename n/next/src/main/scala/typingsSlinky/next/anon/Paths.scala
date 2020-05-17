package typingsSlinky.next.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Paths extends js.Object {
  var fallback: Boolean = js.native
  var paths: js.Array[String | ParamsParsedUrlQuery] = js.native
}

object Paths {
  @scala.inline
  def apply(fallback: Boolean, paths: js.Array[String | ParamsParsedUrlQuery]): Paths = {
    val __obj = js.Dynamic.literal(fallback = fallback.asInstanceOf[js.Any], paths = paths.asInstanceOf[js.Any])
    __obj.asInstanceOf[Paths]
  }
  @scala.inline
  implicit class PathsOps[Self <: Paths] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFallback(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fallback")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPaths(value: js.Array[String | ParamsParsedUrlQuery]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paths")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

