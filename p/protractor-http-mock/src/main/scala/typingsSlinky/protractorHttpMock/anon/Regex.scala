package typingsSlinky.protractorHttpMock.anon

import typingsSlinky.protractorHttpMock.protractorHttpMockStrings.HEAD
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Regex extends js.Object {
  var method: HEAD = js.native
  var path: String = js.native
  var regex: js.UndefOr[Boolean] = js.native
}

object Regex {
  @scala.inline
  def apply(method: HEAD, path: String): Regex = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[Regex]
  }
  @scala.inline
  implicit class RegexOps[Self <: Regex] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMethod(value: HEAD): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("method")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRegex(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regex")(js.undefined)
        ret
    }
  }
  
}

