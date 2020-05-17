package typingsSlinky.gun.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Alias extends js.Object {
  var alias: String = js.native
  var auth: js.Any = js.native
  var epub: String = js.native
  var pub: String = js.native
}

object Alias {
  @scala.inline
  def apply(alias: String, auth: js.Any, epub: String, pub: String): Alias = {
    val __obj = js.Dynamic.literal(alias = alias.asInstanceOf[js.Any], auth = auth.asInstanceOf[js.Any], epub = epub.asInstanceOf[js.Any], pub = pub.asInstanceOf[js.Any])
    __obj.asInstanceOf[Alias]
  }
  @scala.inline
  implicit class AliasOps[Self <: Alias] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlias(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alias")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAuth(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEpub(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("epub")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPub(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pub")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

