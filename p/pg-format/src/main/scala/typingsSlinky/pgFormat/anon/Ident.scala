package typingsSlinky.pgFormat.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Ident extends js.Object {
  var ident: js.UndefOr[String] = js.native
  var literal: js.UndefOr[String] = js.native
  var string: js.UndefOr[String] = js.native
}

object Ident {
  @scala.inline
  def apply(): Ident = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Ident]
  }
  @scala.inline
  implicit class IdentOps[Self <: Ident] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIdent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ident")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIdent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ident")(js.undefined)
        ret
    }
    @scala.inline
    def withLiteral(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("literal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLiteral: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("literal")(js.undefined)
        ret
    }
    @scala.inline
    def withString(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("string")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutString: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("string")(js.undefined)
        ret
    }
  }
  
}

