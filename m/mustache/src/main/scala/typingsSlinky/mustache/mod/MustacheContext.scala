package typingsSlinky.mustache.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a rendering context by wrapping a view object and maintaining a reference to the parent context.
  */
@js.native
trait MustacheContext extends js.Object {
  var parentContext: js.UndefOr[MustacheContext] = js.native
  var view: js.Any = js.native
  /**
    * Returns the value of the given name in this context, traversing up the context hierarchy if the value is absent in this context's view.
    *
    * @param name
    * The name to look up.
    */
  def lookup(name: String): js.Any = js.native
  /**
    * Creates a new context using the given view with this context as the parent.
    *
    * @param view
    * The view to create the new context with.
    */
  def push(view: js.Any): MustacheContext = js.native
}

object MustacheContext {
  @scala.inline
  def apply(lookup: String => js.Any, push: js.Any => MustacheContext, view: js.Any): MustacheContext = {
    val __obj = js.Dynamic.literal(lookup = js.Any.fromFunction1(lookup), push = js.Any.fromFunction1(push), view = view.asInstanceOf[js.Any])
    __obj.asInstanceOf[MustacheContext]
  }
  @scala.inline
  implicit class MustacheContextOps[Self <: MustacheContext] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLookup(value: String => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lookup")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPush(value: js.Any => MustacheContext): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("push")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withView(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("view")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParentContext(value: MustacheContext): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentContext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParentContext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentContext")(js.undefined)
        ret
    }
  }
  
}

