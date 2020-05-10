package typingsSlinky.jsrender.JsViews

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TagCtxParams extends js.Object {
  /* tagCtx.params object */
  var args: js.Array[String] = js.native
  var ctx: Hash[String] = js.native
  var props: Hash[String] = js.native
}

object TagCtxParams {
  @scala.inline
  def apply(args: js.Array[String], ctx: Hash[String], props: Hash[String]): TagCtxParams = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], ctx = ctx.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagCtxParams]
  }
  @scala.inline
  implicit class TagCtxParamsOps[Self <: TagCtxParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArgs(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("args")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCtx(value: Hash[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ctx")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProps(value: Hash[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("props")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

