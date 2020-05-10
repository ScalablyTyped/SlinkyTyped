package typingsSlinky.gatsby.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Page[TContext] extends js.Object {
  var component: String = js.native
  var context: TContext = js.native
  var matchPath: js.UndefOr[String] = js.native
  var path: String = js.native
}

object Page {
  @scala.inline
  def apply[TContext](component: String, context: TContext, path: String): Page[TContext] = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[Page[TContext]]
  }
  @scala.inline
  implicit class PageOps[Self[tcontext] <: Page[tcontext], TContext] (val x: Self[TContext]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TContext] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TContext]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TContext] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TContext] with Other]
    @scala.inline
    def withComponent(value: String): Self[TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("component")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContext(value: TContext): Self[TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPath(value: String): Self[TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMatchPath(value: String): Self[TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matchPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMatchPath: Self[TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matchPath")(js.undefined)
        ret
    }
  }
  
}

