package typingsSlinky.babelCore.mod

import typingsSlinky.babelTraverse.mod.Visitor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PluginObj[S] extends js.Object {
  var inherits: js.UndefOr[js.Any] = js.native
  var manipulateOptions: js.UndefOr[js.Function2[/* opts */ js.Any, /* parserOpts */ js.Any, Unit]] = js.native
  var name: js.UndefOr[String] = js.native
  var post: js.UndefOr[js.ThisFunction1[/* this */ S, /* state */ js.Any, Unit]] = js.native
  var pre: js.UndefOr[js.ThisFunction1[/* this */ S, /* state */ js.Any, Unit]] = js.native
  var visitor: Visitor[S] = js.native
}

object PluginObj {
  @scala.inline
  def apply[S](visitor: Visitor[S]): PluginObj[S] = {
    val __obj = js.Dynamic.literal(visitor = visitor.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginObj[S]]
  }
  @scala.inline
  implicit class PluginObjOps[Self[s] <: PluginObj[s], S] (val x: Self[S]) extends AnyVal {
    @scala.inline
    def duplicate: Self[S] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[S]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[S] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[S] with Other]
    @scala.inline
    def withVisitor(value: Visitor[S]): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInherits(value: js.Any): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inherits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInherits: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inherits")(js.undefined)
        ret
    }
    @scala.inline
    def withManipulateOptions(value: (/* opts */ js.Any, /* parserOpts */ js.Any) => Unit): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("manipulateOptions")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutManipulateOptions: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("manipulateOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withPost(value: js.ThisFunction1[/* this */ S, /* state */ js.Any, Unit]): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("post")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPost: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("post")(js.undefined)
        ret
    }
    @scala.inline
    def withPre(value: js.ThisFunction1[/* this */ S, /* state */ js.Any, Unit]): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pre")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPre: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pre")(js.undefined)
        ret
    }
  }
  
}

