package typingsSlinky.mithril.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RouteResolver[Attrs, State] extends js.Object {
  /** The onmatch hook is called when the router needs to find a component to render. */
  var onmatch: js.UndefOr[
    js.ThisFunction2[
      /* this */ this.type, 
      /* args */ Attrs, 
      /* requestedPath */ String, 
      (ComponentTypes[_, _]) | js.Promise[_] | Unit
    ]
  ] = js.native
  /** The render method is called on every redraw for a matching route. */
  var render: js.UndefOr[
    js.ThisFunction1[/* this */ this.type, /* vnode */ Vnode[Attrs, State], Children]
  ] = js.native
}

object RouteResolver {
  @scala.inline
  def apply[Attrs, State](): RouteResolver[Attrs, State] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RouteResolver[Attrs, State]]
  }
  @scala.inline
  implicit class RouteResolverOps[Self[attrs, state] <: RouteResolver[attrs, state], Attrs, State] (val x: Self[Attrs, State]) extends AnyVal {
    @scala.inline
    def duplicate: Self[Attrs, State] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[Attrs, State]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[Attrs, State]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[Attrs, State]) with Other]
    @scala.inline
    def withOnmatch(
      value: js.ThisFunction2[
          RouteResolver[Attrs, State], 
          /* args */ Attrs, 
          /* requestedPath */ String, 
          (ComponentTypes[_, _]) | js.Promise[_] | Unit
        ]
    ): Self[Attrs, State] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onmatch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnmatch: Self[Attrs, State] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onmatch")(js.undefined)
        ret
    }
    @scala.inline
    def withRender(value: js.ThisFunction1[RouteResolver[Attrs, State], /* vnode */ Vnode[Attrs, State], Children]): Self[Attrs, State] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("render")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRender: Self[Attrs, State] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("render")(js.undefined)
        ret
    }
  }
  
}

