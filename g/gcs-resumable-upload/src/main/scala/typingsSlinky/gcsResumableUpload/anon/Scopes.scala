package typingsSlinky.gcsResumableUpload.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Scopes extends js.Object {
  var scopes: js.UndefOr[js.Array[String]] = js.native
}

object Scopes {
  @scala.inline
  def apply(): Scopes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Scopes]
  }
  @scala.inline
  implicit class ScopesOps[Self <: Scopes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withScopes(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scopes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScopes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scopes")(js.undefined)
        ret
    }
  }
  
}

