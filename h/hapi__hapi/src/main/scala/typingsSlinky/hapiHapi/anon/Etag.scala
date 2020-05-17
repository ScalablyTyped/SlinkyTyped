package typingsSlinky.hapiHapi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Etag extends js.Object {
  var etag: js.UndefOr[String] = js.native
  var modified: js.UndefOr[String] = js.native
  var vary: js.UndefOr[Boolean] = js.native
}

object Etag {
  @scala.inline
  def apply(): Etag = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Etag]
  }
  @scala.inline
  implicit class EtagOps[Self <: Etag] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEtag(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("etag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEtag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("etag")(js.undefined)
        ret
    }
    @scala.inline
    def withModified(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modified")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModified: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modified")(js.undefined)
        ret
    }
    @scala.inline
    def withVary(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVary: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vary")(js.undefined)
        ret
    }
  }
  
}

