package typingsSlinky.blueprintjsCore.htmlMod

import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IElementRefProps[E /* <: HTMLElement */] extends js.Object {
  /** Ref handler to access the instance of the internal HTML element. */
  var elementRef: js.UndefOr[js.Function1[/* ref */ E | Null, Unit]] = js.native
}

object IElementRefProps {
  @scala.inline
  def apply[E](): IElementRefProps[E] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IElementRefProps[E]]
  }
  @scala.inline
  implicit class IElementRefPropsOps[Self[e] <: IElementRefProps[e], E] (val x: Self[E]) extends AnyVal {
    @scala.inline
    def duplicate: Self[E] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[E]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[E] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[E] with Other]
    @scala.inline
    def withElementRef(value: /* ref */ E | Null => Unit): Self[E] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elementRef")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutElementRef: Self[E] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elementRef")(js.undefined)
        ret
    }
  }
  
}

