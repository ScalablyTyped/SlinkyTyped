package typingsSlinky.cwise.mod

import typingsSlinky.cwiseCompiler.mod.ArgType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserArgs extends js.Object {
  var args: js.Array[ArgType] = js.native
  var blockSize: js.UndefOr[Double] = js.native
  var funcName: js.UndefOr[String] = js.native
  var post: js.UndefOr[js.Function2[/* a */ Double, /* repeated */ js.Any, Unit]] = js.native
  var pre: js.UndefOr[js.Function2[/* a */ Double, /* repeated */ js.Any, Unit]] = js.native
  var printCode: js.UndefOr[Boolean] = js.native
  def body(a: Double, args: js.Any*): Unit = js.native
}

object UserArgs {
  @scala.inline
  def apply(args: js.Array[ArgType], body: (Double, /* repeated */ js.Any) => Unit): UserArgs = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], body = js.Any.fromFunction2(body))
    __obj.asInstanceOf[UserArgs]
  }
  @scala.inline
  implicit class UserArgsOps[Self <: UserArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArgs(value: js.Array[ArgType]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("args")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBody(value: (Double, /* repeated */ js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withBlockSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blockSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBlockSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blockSize")(js.undefined)
        ret
    }
    @scala.inline
    def withFuncName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("funcName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFuncName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("funcName")(js.undefined)
        ret
    }
    @scala.inline
    def withPost(value: (/* a */ Double, /* repeated */ js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("post")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutPost: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("post")(js.undefined)
        ret
    }
    @scala.inline
    def withPre(value: (/* a */ Double, /* repeated */ js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pre")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutPre: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pre")(js.undefined)
        ret
    }
    @scala.inline
    def withPrintCode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("printCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrintCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("printCode")(js.undefined)
        ret
    }
  }
  
}

