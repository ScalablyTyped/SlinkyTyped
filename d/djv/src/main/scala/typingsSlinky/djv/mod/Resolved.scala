package typingsSlinky.djv.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Resolved extends js.Object {
  var schema: js.Object = js.native
  def fn(args: js.Any*): js.Any = js.native
}

object Resolved {
  @scala.inline
  def apply(fn: /* repeated */ js.Any => js.Any, schema: js.Object): Resolved = {
    val __obj = js.Dynamic.literal(fn = js.Any.fromFunction1(fn), schema = schema.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resolved]
  }
  @scala.inline
  implicit class ResolvedOps[Self <: Resolved] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFn(value: /* repeated */ js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fn")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSchema(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schema")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

