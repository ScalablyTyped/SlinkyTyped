package typingsSlinky.acorn.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TokeTypeConfig extends js.Object {
  var beforeExpr: js.UndefOr[Boolean] = js.native
  var binop: js.UndefOr[Double] = js.native
  var isAssign: js.UndefOr[Boolean] = js.native
  var isLoop: js.UndefOr[Boolean] = js.native
  var keyword: String = js.native
  var postfix: js.UndefOr[Boolean] = js.native
  var prefix: js.UndefOr[Boolean] = js.native
  var startsExpr: js.UndefOr[Boolean] = js.native
}

object TokeTypeConfig {
  @scala.inline
  def apply(keyword: String): TokeTypeConfig = {
    val __obj = js.Dynamic.literal(keyword = keyword.asInstanceOf[js.Any])
    __obj.asInstanceOf[TokeTypeConfig]
  }
  @scala.inline
  implicit class TokeTypeConfigOps[Self <: TokeTypeConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKeyword(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyword")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBeforeExpr(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeExpr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBeforeExpr: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeExpr")(js.undefined)
        ret
    }
    @scala.inline
    def withBinop(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("binop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBinop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("binop")(js.undefined)
        ret
    }
    @scala.inline
    def withIsAssign(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isAssign")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsAssign: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isAssign")(js.undefined)
        ret
    }
    @scala.inline
    def withIsLoop(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isLoop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsLoop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isLoop")(js.undefined)
        ret
    }
    @scala.inline
    def withPostfix(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postfix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPostfix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postfix")(js.undefined)
        ret
    }
    @scala.inline
    def withPrefix(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefix")(js.undefined)
        ret
    }
    @scala.inline
    def withStartsExpr(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startsExpr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartsExpr: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startsExpr")(js.undefined)
        ret
    }
  }
  
}

