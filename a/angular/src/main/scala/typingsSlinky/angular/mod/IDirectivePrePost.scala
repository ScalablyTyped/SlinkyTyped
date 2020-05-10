package typingsSlinky.angular.mod

import typingsSlinky.angular.JQLite
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDirectivePrePost[TScope /* <: IScope */, TElement /* <: JQLite */, TAttributes /* <: IAttributes */, TController /* <: IDirectiveController */] extends js.Object {
  var post: js.UndefOr[IDirectiveLinkFn[TScope, TElement, TAttributes, TController]] = js.native
  var pre: js.UndefOr[IDirectiveLinkFn[TScope, TElement, TAttributes, TController]] = js.native
}

object IDirectivePrePost {
  @scala.inline
  def apply[TScope, TElement, TAttributes, TController](): IDirectivePrePost[TScope, TElement, TAttributes, TController] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDirectivePrePost[TScope, TElement, TAttributes, TController]]
  }
  @scala.inline
  implicit class IDirectivePrePostOps[Self[tscope, telement, tattributes, tcontroller] <: IDirectivePrePost[tscope, telement, tattributes, tcontroller], TScope, TElement, TAttributes, TController] (val x: Self[TScope, TElement, TAttributes, TController]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TScope, TElement, TAttributes, TController] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TScope, TElement, TAttributes, TController]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[TScope, TElement, TAttributes, TController]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[TScope, TElement, TAttributes, TController]) with Other]
    @scala.inline
    def withPost(
      value: (TScope, TElement, TAttributes, /* controller */ js.UndefOr[TController], /* transclude */ js.UndefOr[ITranscludeFunction]) => Unit
    ): Self[TScope, TElement, TAttributes, TController] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("post")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withoutPost: Self[TScope, TElement, TAttributes, TController] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("post")(js.undefined)
        ret
    }
    @scala.inline
    def withPre(
      value: (TScope, TElement, TAttributes, /* controller */ js.UndefOr[TController], /* transclude */ js.UndefOr[ITranscludeFunction]) => Unit
    ): Self[TScope, TElement, TAttributes, TController] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pre")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withoutPre: Self[TScope, TElement, TAttributes, TController] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pre")(js.undefined)
        ret
    }
  }
  
}

