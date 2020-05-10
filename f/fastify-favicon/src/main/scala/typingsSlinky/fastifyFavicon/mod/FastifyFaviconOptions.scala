package typingsSlinky.fastifyFavicon.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FastifyFaviconOptions extends js.Object {
  var path: js.UndefOr[String] = js.native
}

object FastifyFaviconOptions {
  @scala.inline
  def apply(): FastifyFaviconOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FastifyFaviconOptions]
  }
  @scala.inline
  implicit class FastifyFaviconOptionsOps[Self <: FastifyFaviconOptions] (val x: Self) extends AnyVal {
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
    def withoutPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(js.undefined)
        ret
    }
  }
  
}

